package net.uoneweb.android.tokyotrainnow.entity

class Station(
    val sameAs: String = "",
    val titles: Map<String, String> = mapOf(),
    val longitude: Double = 0.0,
    val latitude: Double = 0.0) {
    companion object {
        val Empty = Station()
    }
}