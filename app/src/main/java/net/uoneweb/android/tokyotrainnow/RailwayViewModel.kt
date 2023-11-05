package net.uoneweb.android.tokyotrainnow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import net.uoneweb.android.tokyotrainnow.entity.RailwayStatus
import javax.inject.Inject

@HiltViewModel
class RailwayViewModel @Inject constructor(
    private val railwayRepository: RailwayRepository
) : ViewModel() {

    private val _railwayStatus = MutableSharedFlow<RailwayStatus>(replay = 1)
    val railwayStatus: SharedFlow<RailwayStatus> = _railwayStatus.asSharedFlow()

    init {
        viewModelScope.launch {
            fetchRailway()
            fetchTrains()
        }
    }
    private suspend fun fetchRailway() {
        railwayRepository.getRailway("odpt.Railway:Toei.Oedo").let {
            _railwayStatus.emit(RailwayStatus(it))
        }
    }

    private suspend fun fetchTrains() {
        railwayRepository.getTrains("odpt.Railway:Toei.Oedo").let {trains ->
            var railway = railwayStatus.replayCache.first()
            trains.forEach {
                railway = railway.add(it)
            }
            _railwayStatus.emit(railway)
        }
    }
}