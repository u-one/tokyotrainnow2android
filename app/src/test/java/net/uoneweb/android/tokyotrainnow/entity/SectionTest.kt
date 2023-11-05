package net.uoneweb.android.tokyotrainnow.entity

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class SectionTest {

    @Test
    fun station_add() {
        val section = Section.Station(
            "station_id",
            mapOf("ja" to "ja_title"),
            listOf())

        val actual = section.add(Train())

        assertThat(actual.trains.size).isEqualTo(1)
        assertThat(section.trains).isEmpty()
    }

    @Test
    fun interStation_add() {
        val section = Section.InterStation(
            listOf())

        val actual = section.add(Train())

        assertThat(actual.trains.size).isEqualTo(1)
        assertThat(section.trains).isEmpty()
    }
}