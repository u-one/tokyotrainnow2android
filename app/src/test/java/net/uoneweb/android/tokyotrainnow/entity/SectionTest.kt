package net.uoneweb.android.tokyotrainnow.entity

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class SectionTest {

    @Test
    fun station_add() {
        val railDirection = RailDirection("odpt.RailDirection:OuterLoop")
        val section = Section.Station(
            "station_id",
            mapOf("ja" to "ja_title"),
            RailDirection("odpt.RailDirection:OuterLoop"),
            RailDirection("odpt.RailDirection:InnerLoop"),
            mapOf())

        val actual = section.add(Train(railDirection = railDirection))

        assertThat(actual.tracks[railDirection]?.size).isEqualTo(1)
        assertThat(actual.tracks.size).isEqualTo(1)
        assertThat(section.tracks).isEmpty()
    }

    @Test
    fun interStation_add() {
        val railDirection = RailDirection("odpt.RailDirection:OuterLoop")
        val section = Section.InterStation(
            RailDirection("odpt.RailDirection:OuterLoop"),
            RailDirection("odpt.RailDirection:InnerLoop"),
            mapOf())

        val actual = section.add(Train(railDirection = railDirection))

        assertThat(actual.tracks[railDirection]?.size).isEqualTo(1)
        assertThat(section.tracks).isEmpty()
    }
}