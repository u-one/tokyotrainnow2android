package net.uoneweb.android.tokyotrainnow.entity

data class Tracks(val ascendingDirection: RailDirection,
                  val descendingDirection: RailDirection,
                  private val tracks: Map<RailDirection, List<Train>> = mapOf()
) {
    val ascendingTrains: List<Train> get() = tracks[ascendingDirection] ?: listOf()

    val descendingTrains: List<Train> get() = tracks[descendingDirection] ?: listOf()

    fun add(train: Train): Tracks {
        val newTracks = tracks.toMutableMap()
        val trains = newTracks[train.railDirection] ?: mutableListOf()
        val newTrains = trains.toMutableList()
        newTrains.add(train)
        newTracks[train.railDirection] = newTrains
        return copy(tracks = newTracks)
    }
}