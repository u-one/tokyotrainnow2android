package net.uoneweb.android.tokyotrainnow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import net.uoneweb.android.tokyotrainnow.entity.Railway
import net.uoneweb.android.tokyotrainnow.entity.RailwayStatus
import net.uoneweb.android.tokyotrainnow.entity.Section
import javax.inject.Inject

@HiltViewModel
class RailwayViewModel @Inject constructor(
    private val railwayRepository: RailwayRepository
) : ViewModel() {

    private val _railwayStatus = MutableSharedFlow<RailwayStatus>()
    val railwayStatus: SharedFlow<RailwayStatus> = _railwayStatus.asSharedFlow()

    init {
        fetchRailway()
    }
    private fun fetchRailway() {
        viewModelScope.launch {
            railwayRepository.getRailway("odpt.Railway:Toei.Oedo").let {
                _railwayStatus.emit(toRailwayStatus(it))
            }
        }
    }

    private fun toRailwayStatus(railway: Railway) : RailwayStatus {
        val sections = mutableListOf<Section>()
        val lastIndex = railway.stations.lastIndex
        railway.stations
            .forEachIndexed { index, station ->
                sections.add(Section.Station(station.stationTitle))
                if (index != lastIndex) {
                    sections.add(Section.InterStation())
                }
            }
        return RailwayStatus(
            color = railway.color,
            sections = sections,
            railwayTitle = railway.railwayTitle
        )
    }
}