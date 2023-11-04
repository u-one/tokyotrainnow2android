package net.uoneweb.android.odpt

import android.graphics.Color.parseColor
import net.uoneweb.android.tokyotrainnow.RailwayRepository
import javax.inject.Inject
import net.uoneweb.android.tokyotrainnow.entity.Railway as RailwayEntity

class RailwayRepositoryImpl @Inject constructor(
    private val railwayDataSource: RailwayDataSource
) : RailwayRepository {

    override suspend fun getRailway(railway: String): RailwayEntity {
        return railwayDataSource.getRailwayData().firstOrNull {
            it.sameAs == railway
        }?.let {
            toRailwayEntity(it)
        } ?:  RailwayEntity(0, listOf())
    }

    private fun toRailwayEntity(railway: Railway): RailwayEntity {
        val stations = railway.stationOrder.sortedBy {
            it.index
        }.map {
            RailwayEntity.Station(
                stationTitle = it.stationTitle
            )
        }.toList()

        return RailwayEntity(
            railwayTitle = railway.railwayTitle,
            color = parseColor(railway.color),
            stations = stations
        )
    }
}