package net.uoneweb.android.tokyotrainnow.entity

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RailwayStatusTest {

    @Test
    fun constructorTest() {
        val railway = Railway(
            color = 1,
            stations = listOf(
                Railway.Station(
                    stationId = "station1",
                    stationTitle = mapOf()
                ),
                Railway.Station(
                    stationId = "station2",
                    stationTitle = mapOf()
                )
            ),
            railwayTitle = mapOf("ja" to "title")
        )

        val actual = RailwayStatus(railway)

        assertThat(actual.color).isEqualTo(1)
        assertThat(actual.sections).isEqualTo(Sections(listOf(
            Section.Station("station1", mapOf(), mapOf()),
            Section.InterStation(mapOf()),
            Section.Station("station2", mapOf(), mapOf())
        )))
        assertThat(actual.railwayTitle).isEqualTo(mapOf("ja" to "title"))
    }

    @Test
    fun add() {
        val railDirection = RailDirection("odpt.RailDirection:OuterLoop")
        val railwayStatus = RailwayStatus(sections = Sections(listOf(
            Section.Station("station1", mapOf(), mapOf()),
            Section.InterStation(mapOf()),
            Section.Station("station2", mapOf(), mapOf())
        )))

        val actual = railwayStatus.add(
                Train(
                    railDirection = railDirection,
                    fromStation = Station("station1"),
                    toStation = Station("station2")
                )
        )

        assertThat(actual).isNotEqualTo(railwayStatus)
        assertThat(actual.sections.sections[1].tracks.size).isEqualTo(1)
        assertThat(actual.sections.sections[1].tracks[railDirection]?.size).isEqualTo(1)
    }
}