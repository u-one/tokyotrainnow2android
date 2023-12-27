package net.uoneweb.android.tokyotrainnow.entity

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class SectionTest {

    @Test
    fun station_add() {
        val section = Section.Station(
            "station_id",
            mapOf("ja" to "ja_title"),
            Tracks(
                ascending,
                descending,
                mapOf()
            )
        )

        val actual = section.add(Train(railDirection = ascending))

        assertThat(actual.tracks.ascendingTrains.size).isEqualTo(1)
        assertThat(actual.tracks.descendingTrains).isEmpty()
    }

    @Test
    fun interStation_add() {
        val section = Section.InterStation(
            Tracks(
                ascending,
                descending,
                mapOf()
            )
        )

        val actual = section.add(Train(railDirection = ascending))

        assertThat(actual.tracks.ascendingTrains.size).isEqualTo(1)
        assertThat(actual.tracks.descendingTrains).isEmpty()
    }

    private val ascending = RailDirection("odpt.RailDirection:OuterLoop", mapOf("ja" to "外回り"))
    private val descending = RailDirection("odpt.RailDirection:InnerLoop", mapOf("ja" to "内回り"))
}