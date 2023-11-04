package net.uoneweb.android.tokyotrainnow.entity

sealed class Section(val trains: List<Train>) {
    class Station(val title: Map<String, String>, trains: List<Train> = listOf()) : Section(trains)
    class InterStation(trains: List<Train> = listOf()): Section(trains)
}
