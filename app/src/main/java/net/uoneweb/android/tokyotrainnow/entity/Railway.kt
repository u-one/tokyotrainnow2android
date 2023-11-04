package net.uoneweb.android.tokyotrainnow.entity

data class Railway(
    val color : Int = 0,
    val sections : List<Section> = listOf(),
    val railwayTitle: Map<String, String> = mapOf()
)