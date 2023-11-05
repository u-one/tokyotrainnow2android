package net.uoneweb.android.tokyotrainnow.entity

sealed class Section() {
    abstract val trains: List<Train>

    abstract fun add(train: Train): Section
    data class Station(val stationId: String, val title: Map<String, String>, override val trains: List<Train> = listOf()) : Section() {
        override fun add(train: Train): Station {
            return Station(
                stationId = stationId,
                title = title,
                trains = trains.toMutableList().apply {add(train)}
            )
        }
    }
    data class InterStation(override val trains: List<Train> = listOf()): Section() {
        override fun add(train: Train): InterStation {
            return InterStation(
                trains = trains.toMutableList().apply {add(train)}
            )
        }
    }
}
