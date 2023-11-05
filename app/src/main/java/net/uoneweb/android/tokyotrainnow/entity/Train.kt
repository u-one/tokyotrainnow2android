package net.uoneweb.android.tokyotrainnow.entity

data class Train(
    val railDirection: RailDirection = RailDirection.Empty,
    val trainType: TrainType = TrainType.Empty,
    val trainNumber: String = "",
    val fromStation: Station = Station.Empty,
    val toStation: Station = Station.Empty,
    val destinationStation: List<Station> = listOf(),
    val delay: Int = 0,
    val carComposition: Int = 0
)

