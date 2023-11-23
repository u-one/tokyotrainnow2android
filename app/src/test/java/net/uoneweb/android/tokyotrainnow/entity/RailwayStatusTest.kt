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
            ascendingDirection = ascending,
            descendingDirection = descending,
            railwayTitle = mapOf("ja" to "title")
        )

        val actual = RailwayStatus(railway)

        assertThat(actual.color).isEqualTo(1)
        assertThat(actual.sections).isEqualTo(Sections(
            ascending,
            descending,
            listOf(
            Section.Station("station1", mapOf(), ascending, descending, mapOf()),
            Section.InterStation(ascending, descending, mapOf()),
            Section.Station("station2", mapOf(), ascending, descending, mapOf())
        )))
        assertThat(actual.railwayTitle).isEqualTo(mapOf("ja" to "title"))
    }

    @Test
    fun add() {
        val railwayStatus = RailwayStatus(sections = Sections(
            ascending,
            descending,
            listOf(
            Section.Station("station1", mapOf(), ascending, descending, mapOf()),
            Section.InterStation(ascending, descending, mapOf()),
            Section.Station("station2", mapOf(), ascending, descending, mapOf())
        )))

        val actual = railwayStatus.add(
                Train(
                    railDirection = ascending,
                    fromStation = Station("station1"),
                    toStation = Station("station2")
                )
        )

        assertThat(actual).isNotEqualTo(railwayStatus)
        assertThat(actual.sections.sections[1].tracks.size).isEqualTo(1)
        assertThat(actual.sections.sections[1].getAscendingTrains().size).isEqualTo(1)
    }

    private val ascending = RailDirection("odpt.RailDirection:OuterLoop", mapOf("ja" to "外回り"))
    private val descending = RailDirection("odpt.RailDirection:InnerLoop", mapOf("ja" to "内回り"))
}