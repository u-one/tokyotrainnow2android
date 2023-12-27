package net.uoneweb.android.tokyotrainnow.entity

import androidx.compose.runtime.Stable

@Stable
sealed class Section() {
    abstract val tracks: Tracks

    abstract fun add(train: Train): Section

    val ascendingTrains: List<Train> by lazy { tracks.ascendingTrains }
    val descendingTrains: List<Train> by lazy { tracks.descendingTrains }

    @Stable
    data class Station(
        val stationId: String,
        val title: Map<String, String>,
        override val tracks: Tracks,
    ) : Section() {
        override fun add(train: Train): Station {
            return copy(tracks = tracks.add(train))
        }
    }

    @Stable
    data class InterStation(
        override val tracks: Tracks,
    ): Section() {
        override fun add(train: Train): InterStation {
            return copy(tracks = tracks.add(train))
        }
    }
}
