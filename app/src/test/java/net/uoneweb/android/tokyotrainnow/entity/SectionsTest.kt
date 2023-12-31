package net.uoneweb.android.tokyotrainnow.entity

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class SectionsTest {

    @Test
    fun add_on_station() {
        val sections = Sections(
            ascending,
            descending,
            listOf(
                Section.Station("station1", mapOf(), Tracks(ascending,descending)),
                Section.InterStation(Tracks(ascending,descending)),
                Section.Station("station2", mapOf(), Tracks(ascending,descending)),
            ))

        val train = Train(
            railDirection = ascending,
            fromStation = Station("station1", mapOf()),
            toStation = Station.Empty
        )

        val actual = sections.add(train)

        assertThat(actual.sections[0].tracks.ascendingTrains.size).isEqualTo(1)
        assertThat(sections.sections[0].tracks.ascendingTrains.size).isEqualTo(0)
    }

    @Test
    fun add_interStation_ascending() {
        val sections = Sections(
            ascending,
            descending,
            listOf(
                Section.Station("station1", mapOf(), Tracks(ascending,descending)),
                Section.InterStation(Tracks(ascending,descending)),
                Section.Station("station2", mapOf(), Tracks(ascending,descending)),
            ))

        val train = Train(
            railDirection = ascending,
            fromStation = Station("station1", mapOf()),
            toStation = Station("station2", mapOf())
        )

        val actual = sections.add(train)

        assertThat(actual.sections[1].ascendingTrains.size).isEqualTo(1)
        assertThat(sections.sections[1].ascendingTrains.size).isEqualTo(0)
    }

    @Test
    fun add_interStation_descending() {
        val sections = Sections(
            ascending,
            descending,
            listOf(
                Section.Station("station1", mapOf(), Tracks(ascending,descending)),
                Section.InterStation(Tracks(ascending,descending)),
                Section.Station("station2", mapOf(), Tracks(ascending,descending)),
            ))

        val train = Train(
            railDirection = descending,
            fromStation = Station("station2", mapOf()),
            toStation = Station("station1", mapOf())
        )

        val actual = sections.add(train)

        assertThat(actual.sections[1].descendingTrains.size).isEqualTo(1)
        assertThat(sections.sections[1].descendingTrains.size).isEqualTo(0)
    }

    @Test
    fun add_illegalState_same_from_to() {
        val sections = Sections(
            ascending,
            descending,
            listOf(
                Section.Station("station1", mapOf(), Tracks(ascending,descending)),
                Section.InterStation(Tracks(ascending,descending)),
                Section.Station("station2", mapOf(), Tracks(ascending,descending)),
            ))

        val train = Train(
            ascending,
            fromStation = Station("station1", mapOf()),
            toStation = Station("station1", mapOf())
        )

        try {
            sections.add(train)
        } catch(e: Exception) {
            assertThat(e).isInstanceOf(IllegalStateException::class.java)
        }
    }

    @Test
    fun add_illegalState_too_wide_from_to() {
        val sections = Sections(
            ascending,
            descending,
            listOf(
                Section.Station("station1", mapOf(), Tracks(ascending,descending)),
                Section.InterStation(Tracks(ascending,descending)),
                Section.Station("station2", mapOf(), Tracks(ascending,descending)),
                Section.InterStation(Tracks(ascending,descending)),
                Section.Station("station3", mapOf(), Tracks(ascending,descending)),
            ))

        val train = Train(
            ascending,
            fromStation = Station("station1", mapOf()),
            toStation = Station("station3", mapOf())
        )

        try {
            sections.add(train)
        } catch(e: Exception) {
            assertThat(e).isInstanceOf(IllegalStateException::class.java)
        }
    }

    private val ascending = RailDirection("odpt.RailDirection:OuterLoop", mapOf("ja" to "外回り"))
    private val descending = RailDirection("odpt.RailDirection:InnerLoop", mapOf("ja" to "内回り"))
}