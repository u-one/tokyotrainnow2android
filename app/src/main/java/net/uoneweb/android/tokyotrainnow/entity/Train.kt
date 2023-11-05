package net.uoneweb.android.tokyotrainnow.entity

data class Train(
    val railDirection: String = "",
    val trainNumber: String = "",
    val fromStation: String = "",
    val toStation: String = "",
    val destinationStation: List<String> = listOf(),
    val delay: Int = 0,
    val carComposition: Int = 0
)

