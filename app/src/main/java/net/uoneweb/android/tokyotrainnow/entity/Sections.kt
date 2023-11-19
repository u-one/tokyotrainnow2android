package net.uoneweb.android.tokyotrainnow.entity

import java.lang.IllegalStateException

data class Sections(
    val sections: List<Section>) {

    init {
        require(sections.size >= 3)
    }

    fun add(train: Train): Sections {
        // TODO: consider direction
        val from = train.fromStation
        val to = train.toStation
        val newSections = sections.toMutableList()
        val fromIndex = newSections.indexOfFirst {
            it is Section.Station && it.stationId == from.sameAs
        }

        if (to.isEmpty()) {
            newSections[fromIndex] = newSections[fromIndex].add(train)
            return Sections(newSections)
        }

        val toIndex = newSections.indexOfFirst {
            it is Section.Station && it.stationId == to.sameAs
        }
        if (fromIndex < 0 && toIndex < 1  && fromIndex + 1 != toIndex) {
            throw IllegalStateException("fromIndex: $fromIndex, toIndex: $toIndex")
        }
        val sectionIndex = fromIndex + 1
        newSections[sectionIndex] = newSections[sectionIndex].add(train)

        return Sections(newSections)
    }
}