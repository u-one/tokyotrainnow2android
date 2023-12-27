package net.uoneweb.android.tokyotrainnow.entity

import androidx.compose.runtime.Stable

@Stable
class RailwayStatus {
    val color: Int
    val sections: Sections
    val railwayTitle: Map<String, String>

    constructor(railway: Railway) {
        this.color = railway.color
        this.sections = Sections.Factory.create(railway)
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