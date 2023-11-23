package net.uoneweb.android.tokyotrainnow.entity

data class Railway(
    val color: Int = 0,
    val stations: List<Station> = listOf(),
    val ascendingDirection: RailDirection = RailDirection.Empty,
    val descendingDirection: RailDirection = RailDirection.Empty,
    val railwayTitle: Map<String, String> = mapOf()) {

    data class Station(
        val stationId: String,
        val stationTitle: Map<String, String>,
    )
}
