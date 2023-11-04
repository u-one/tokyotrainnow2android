package net.uoneweb.android.tokyotrainnow

import android.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import net.uoneweb.android.tokyotrainnow.entity.Railway
import net.uoneweb.android.tokyotrainnow.entity.Section
import javax.inject.Inject
import net.uoneweb.android.odpt.Railway as OdptRailway

@HiltViewModel
class RailwayViewModel @Inject constructor(
    private val railwayRepository: RailwayRepository
) : ViewModel() {

    private val _railway = MutableSharedFlow<Railway>()
    val railway: SharedFlow<Railway> = _railway.asSharedFlow()

    init {
        fetchRailway()
    }
    private fun fetchRailway() {
        viewModelScope.launch {
            railwayRepository.getRailway()
                .firstOrNull{ it.sameAs == "odpt.Railway:Toei.Oedo" }?.let{
                    _railway.emit(railway(it))
                }
        }
    }

    private fun railway(railway: OdptRailway) : Railway {
        val sections = mutableListOf<Section>()
        val lastIndex = railway.stationOrder.lastIndex
        railway.stationOrder
            .forEachIndexed { index, station ->
                sections.add(Section.Station(station.stationTitle))
                if (index != lastIndex) {
                    sections.add(Section.InterStation())
                }
            }
        return Railway(
            color = Color.parseColor(railway.color),
            sections = sections,
            railwayTitle = railway.railwayTitle
        )
    }
}