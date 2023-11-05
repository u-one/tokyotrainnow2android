package net.uoneweb.android.tokyotrainnow.entity

data class TrainType(
    val sameAs: String = "",
    val titles: Map<String, String> = mapOf()
) {
    companion object {
        val Empty = TrainType()
    }
}
