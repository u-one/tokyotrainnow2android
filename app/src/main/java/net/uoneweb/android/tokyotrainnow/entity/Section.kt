package net.uoneweb.android.tokyotrainnow.entity


sealed class Section() {
    abstract val ascendingDirection: RailDirection
    abstract val descendingDirection: RailDirection
    abstract val tracks: Map<RailDirection, List<Train>>

    abstract fun add(train: Train): Section

    val ascendingTrains: List<Train> get() = tracks[ascendingDirection] ?: listOf()

    val descendingTrains: List<Train> get() = tracks[descendingDirection] ?: listOf()

    data class Station(
        val stationId: String,
        val title: Map<String, String>,
        override val ascendingDirection: RailDirection,
        override val descendingDirection: RailDirection,
        override val tracks: Map<RailDirection, List<Train>> = mapOf(),
    ) : Section() {
        override fun add(train: Train): Station {
            val newTracks = tracks.toMutableMap()
            val trains = newTracks[train.railDirection] ?: mutableListOf()
            val newTrains = trains.toMutableList()
            newTrains.add(train)
            newTracks[train.railDirection] = newTrains

            return copy(tracks = newTracks)
        }
    }

    data class InterStation(
        override val ascendingDirection: RailDirection,
        override val descendingDirection: RailDirection,
        override val tracks: Map<RailDirection, List<Train>> = mapOf()
    ): Section() {
        override fun add(train: Train): InterStation {
            val newTracks = tracks.toMutableMap()
            val trains = newTracks[train.railDirection] ?: mutableListOf()
            val newTrains = trains.toMutableList()
            newTrains.add(train)
            newTracks[train.railDirection] = newTrains

            return copy(tracks = newTracks)
        }
    }
}
