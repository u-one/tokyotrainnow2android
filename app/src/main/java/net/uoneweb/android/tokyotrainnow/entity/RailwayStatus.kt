package net.uoneweb.android.tokyotrainnow.entity

class RailwayStatus {
    val color: Int
    val sections: Sections
    val railwayTitle: Map<String, String>

    constructor(railway: Railway) {
        val sections = mutableListOf<Section>()
        val lastIndex = railway.stations.lastIndex
        railway.stations
            .forEachIndexed { index, station ->
                sections.add(Section.Station(station.stationId, station.stationTitle, railway.ascendingDirection, railway.descendingDirection))
                if (index != lastIndex) {
                    sections.add(Section.InterStation(railway.ascendingDirection, railway.descendingDirection))
                }
            }
        this.color = railway.color
        this.sections = Sections(sections)
        this.railwayTitle = railway.railwayTitle
    }

    constructor(color : Int = 0,
                sections : Sections,
                railwayTitle: Map<String, String> = mapOf()
    ) {
        this.color = color
        this.sections = sections
        this.railwayTitle = railwayTitle
    }

    fun add(train: Train): RailwayStatus {
        val newSections = sections.add(train)
        return RailwayStatus(
            color,
            newSections,
            railwayTitle)
    }
}