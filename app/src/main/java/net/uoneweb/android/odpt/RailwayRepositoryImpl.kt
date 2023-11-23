package net.uoneweb.android.odpt

import android.graphics.Color.parseColor
import net.uoneweb.android.tokyotrainnow.RailwayRepository
import net.uoneweb.android.tokyotrainnow.entity.RailDirection
import net.uoneweb.android.tokyotrainnow.entity.Train
import javax.inject.Inject
import net.uoneweb.android.tokyotrainnow.entity.Railway as RailwayEntity
import net.uoneweb.android.tokyotrainnow.entity.TrainType as TrainTypeEntity
import net.uoneweb.android.tokyotrainnow.entity.Station as StationEntity

class RailwayRepositoryImpl @Inject constructor(
    private val railwayDataSource: RailwayDataSource
) : RailwayRepository {

    override suspend fun getRailway(railway: String): RailwayEntity {
        return railwayDataSource.getRailwayData().firstOrNull {
            it.sameAs == railway
        }?.let {
            toRailwayEntity(it)
        } ?:  RailwayEntity()
    }

    override suspend fun getTrains(railway: String): List<Train> {
        return railwayDataSource.getTrains(railway).map { train ->
            val railDirection = getRailDirection(train.railDirection)
            val trainType = getTrainType(train.trainType)
            val fromStation = getStation(train.operator, train.fromStation)
            val toStation = train.toStation?.let {
                getStation(train.operator, it)
            } ?: StationEntity.Empty
            val destinations = train.destinationStation.map {
                getStation(train.operator, it)
            }
            Train(
                railDirection = railDirection,
                trainNumber = train.trainNumber,
                trainType = trainType,
                fromStation = fromStation,
                toStation = toStation,
                destinationStation = destinations,
                delay = train.delay,
                carComposition = train.carComposition
            )
        }
    }

    private suspend fun toRailwayEntity(railway: Railway): RailwayEntity {
        val stations = railway.stationOrder.sortedBy {
            it.index
        }.map {
            RailwayEntity.Station(
                stationId = it.station,
                stationTitle = it.stationTitle
            )
        }.toList()
        val asc = getRailDirection(railway.ascendingRailDirection)
        val dsc = getRailDirection(railway.descendingRailDirection)

        return RailwayEntity(
            railwayTitle = railway.railwayTitle,
            color = parseColor(railway.color),
            ascendingDirection = asc,
            descendingDirection = dsc,
            stations = stations
        )
    }

    private val railDirections = mutableMapOf<String, RailDirection>()
    private suspend fun getRailDirection(direction: String): RailDirection {
        if (railDirections.isEmpty()) {
            railwayDataSource.getRailDirections()
                .map { RailDirection(it.sameAs, it.railDirectionTitle) }
                .forEach {
                    railDirections[it.sameAs] = it
                }
        }
        return railDirections[direction] ?: RailDirection.Empty
    }

    private val trainTypes = mutableMapOf<String, TrainTypeEntity>()
    private suspend fun getTrainType(trainType: String) : TrainTypeEntity {
        if (trainTypes.isEmpty()) {
            railwayDataSource.getTrainTypes().map {
                TrainTypeEntity(it.sameAs, it.trainTypeTitle)
            }.forEach {
                trainTypes[it.sameAs] = it
            }
        }
        return trainTypes[trainType] ?: TrainTypeEntity.Empty

    }

    private val stations = mutableMapOf<String, StationEntity>()
    private suspend fun getStation(operator: String, station: String): StationEntity  {
        if (stations.isEmpty()) {
            railwayDataSource.getStations(operator)
                .map {
                    StationEntity(it.sameAs, it.stationTitle)
                }
                .forEach {
                    stations[it.sameAs] = it
                }
        }
        return stations[station] ?: StationEntity.Empty
    }
}