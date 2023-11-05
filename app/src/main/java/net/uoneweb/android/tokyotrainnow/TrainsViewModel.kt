package net.uoneweb.android.tokyotrainnow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import net.uoneweb.android.tokyotrainnow.entity.Train
import javax.inject.Inject

@HiltViewModel
class TrainsViewModel @Inject constructor(
    private val railwayRepository: RailwayRepository
): ViewModel() {

    private val _trains = MutableSharedFlow<List<Train>>()
    val trains: SharedFlow<List<Train>> = _trains.asSharedFlow()

    init {
        fetchTrains()
    }

    private fun fetchTrains() {
        viewModelScope.launch {
            railwayRepository.getTrains("odpt.Railway:Toei.Oedo").let {
                _trains.emit(it)
            }
        }
    }
}
