package net.uoneweb.android.tokyotrainnow.entity

import java.lang.IllegalStateException

data class Sections(
    private val ascendingDirection: RailDirection,
    private val descendingDirection: RailDirection,
    val sections: List<Section> = listOf()) {

    init {
        require(sections.size >= 3)
    }

    class Factory {
        companion object {
            fun create(railway: Railway): Sections {
                val sections = mutableListOf<Section>()
                val lastIndex = railway.stations.lastIndex
                railway.stations
                    .forEachIndexed { index, station ->
                        sections.add(Section.Station(station.stationId, station.stationTitle, Tracks(railway.ascendingDirection, railway.descendingDirection)))
                        if (index != lastIndex) {
                            sections.add(Section.InterStation(Tracks(railway.ascendingDirection, railway.descendingDirection)))
                        }
                    }
                return Sections(railway.ascendingDirection, railway.descendingDirection, sections)
            }
        }
    }

    operator fun get(index: Int): Section {
        return sections[index]
    }

    fun add(train: Train): Sections {
        val from = train.fromStation
        val to = train.toStation
        val fromIndex = findIndex(from)
        val newSections = sections.toMutableList()

        if (to.isEmpty()) {
            newSections[fromIndex] = newSections[fromIndex].add(train)
            return copy(sections = newSections)
        }

        val toIndex = findIndex(to)
        val isAscending = train.railDirection == ascendingDirection

        if (isValidIndices(fromIndex, toIndex, isAscending)) {
            throw IllegalStateException("from: $from fromIndex: $fromIndex, to: $to toIndex: $toIndex")
        }

        val sectionIndex = if (isAscending) {
            fromIndex + 1
        } else {
            if (fromIndex < 1) {
                // TODO: Refactor, this is a workaround for the case where the train is on the other duplicated station on a loop.
                sections.indexOfLast { it ->
                    it is Section.Station && it.stationId == from.sameAs
                }
            } else {
                fromIndex - 1
            }
        }

        newSections[sectionIndex] = newSections[sectionIndex].add(train)
        return copy(sections = newSections)
    }

    private fun findIndex(station: Station) : Int {
        return sections.indexOfFirst {
            it is Section.Station && it.stationId == station.sameAs
        }
    }

    private fun isValidIndices(fromIndex: Int, toIndex: Int, isAscending: Boolean) : Boolean {
        return if (isAscending) {
            fromIndex >= 0 && toIndex >= 1 && fromIndex + 1 == toIndex
        } else {
            fromIndex < sections.size && toIndex < sections.size - 1 && fromIndex - 1 == toIndex
        }
    }
}