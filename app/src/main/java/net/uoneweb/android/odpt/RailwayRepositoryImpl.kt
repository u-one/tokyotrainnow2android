package net.uoneweb.android.odpt

import android.graphics.Color.parseColor
import net.uoneweb.android.tokyotrainnow.RailwayRepository
import net.uoneweb.android.tokyotrainnow.entity.RailDirection
import net.uoneweb.android.tokyotrainnow.entity.Train
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

    override suspend fun getTrains(railway: String): List<Train> {
        return railwayDataSource.getTrains(railway).map {
            Train(
                trainNumber = it.trainNumber,
                trainType = it.trainType,
                fromStation = it.fromStation,
                toStation = it.toStation ?: "",
                destinationStation = it.destinationStation,
                delay = it.delay,
                carComposition = it.carComposition
            )
        }
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

    private val railDirections = mutableMapOf<String, RailDirection>()
    suspend fun getRailDirection(direction: String): RailDirection {
        if (railDirections.isEmpty()) {
            railwayDataSource.getRailDirections()
                .map { RailDirection(it.sameAs, it.railDirectionTitle) }
                .forEach {
                    railDirections[it.sameAs] = it
                }
        }
        return railDirections[direction] ?: RailDirection.Empty
    }
}