package net.uoneweb.android.tokyotrainnow.entity

import java.lang.IllegalStateException

data class Sections(
    val ascendingDirection: RailDirection,
    val descendingDirection: RailDirection,
    val sections: List<Section>) {

    init {
        require(sections.size >= 3)
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
            fromIndex - 1
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