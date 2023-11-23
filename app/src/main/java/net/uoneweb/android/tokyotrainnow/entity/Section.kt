package net.uoneweb.android.tokyotrainnow.entity


sealed class Section() {
    abstract val tracks: Map<RailDirection, List<Train>>

    abstract fun add(train: Train): Section
    data class Station(
        val stationId: String,
        val title: Map<String, String>,
        override val tracks: Map<RailDirection, List<Train>> = mapOf()
    ) : Section() {
        override fun add(train: Train): Station {
            val newTracks = tracks.toMutableMap()
            val trains = newTracks[train.railDirection] ?: mutableListOf()
            val newTrains = trains.toMutableList()
            newTrains.add(train)
            newTracks[train.railDirection] = newTrains

            return Station(
                stationId = stationId,
                title = title,
                tracks = newTracks
            )
        }
    }
    data class InterStation(override val tracks: Map<RailDirection, List<Train>> = mapOf()): Section() {
        override fun add(train: Train): InterStation {
            val newTracks = tracks.toMutableMap()
            val trains = newTracks[train.railDirection] ?: mutableListOf()
            val newTrains = trains.toMutableList()
            newTrains.add(train)
            newTracks[train.railDirection] = newTrains

            return InterStation(
                tracks = newTracks
            )
        }
    }
}
