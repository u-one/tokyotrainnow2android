package net.uoneweb.android.tokyotrainnow.ui

import net.uoneweb.android.tokyotrainnow.entity.RailDirection
import net.uoneweb.android.tokyotrainnow.entity.Section
import net.uoneweb.android.tokyotrainnow.entity.Tracks
import net.uoneweb.android.tokyotrainnow.entity.Train
import net.uoneweb.android.tokyotrainnow.entity.TrainType

object Samples {
    val ascending = RailDirection("odpt.RailDirection:OuterLoop", mapOf("ja" to "外回り"))
    val descending = RailDirection("odpt.RailDirection:InnerLoop", mapOf("ja" to "内回り"))
    fun createTrain(direction: RailDirection, trainNumber: String) =
        Train(
            railDirection = direction,
            trainType = TrainType("odpt.TrainType:Toei.Local", mapOf("ja" to "各駅停車")),
            trainNumber = trainNumber,
            fromStation = net.uoneweb.android.tokyotrainnow.entity.Station("odpt.Station:Toei.Oedo.Tsukishima", mapOf("ja" to "月島")),
            toStation = net.uoneweb.android.tokyotrainnow.entity.Station("odpt.Station:Toei.Oedo.Kachidoki", mapOf("ja" to "勝どき")),
            destinationStation = listOf(net.uoneweb.android.tokyotrainnow.entity.Station("odpt.Station:Toei.Oedo.Hikarigaoka", mapOf("ja" to "光が丘"))),
            delay = 0,
            carComposition = 0
        )

    fun interStation(tracks : Map<RailDirection, List<Train>> = mapOf()) : Section.InterStation {
        return Section.InterStation(
            Tracks(
                ascendingDirection = ascending,
                descendingDirection = descending,
                tracks = tracks
            )
        )
    }

    fun tochomaeStation(tracks : Map<RailDirection, List<Train>> = mapOf()) : Section.Station{
        return Section.Station(
            stationId = "odpt.Station:Toei.Oedo.Tochomae",
            title = mapOf("ja" to "都庁前", "en" to "Tochomae"),
            tracks = Tracks(
                tracks = tracks,
                ascendingDirection = ascending,
                descendingDirection = descending,
            )
        )
    }

    fun shinjukuNishiguchiStation(tracks : Map<RailDirection, List<Train>> = mapOf()) : Section.Station{
        return Section.Station(
            stationId = "odpt.Station:Toei.Oedo.ShinjukuNishiguchi",
            title = mapOf("ja" to "新宿西口", "en" to "ShinjukuNishiguchi"),
            tracks = Tracks(
                tracks = tracks,
                ascendingDirection = ascending,
                descendingDirection = descending,
            )
        )
    }

    fun higashiShinjukuStation(tracks : Map<RailDirection, List<Train>> = mapOf()) : Section.Station{
        return Section.Station(
            stationId = "odpt.Station:Toei.Oedo.HigashiShinjuku",
            title = mapOf("ja" to "東新宿", "en" to "Higashi-shinjuku"),
            tracks = Tracks(
                tracks = tracks,
                ascendingDirection = ascending,
                descendingDirection = descending,
            )
        )
    }
}