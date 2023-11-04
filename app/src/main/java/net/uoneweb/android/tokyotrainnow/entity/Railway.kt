package net.uoneweb.android.tokyotrainnow.entity

data class Railway(
    val color: Int,
    val stations: List<Station>,
    val railwayTitle: Map<String, String> = mapOf()) {

    data class Station(
        val stationTitle: Map<String, String>,
    )
}
