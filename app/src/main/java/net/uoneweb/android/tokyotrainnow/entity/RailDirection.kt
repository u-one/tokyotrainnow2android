package net.uoneweb.android.tokyotrainnow.entity

data class RailDirection(val sameAs: String, val titles: Map<String, String> = mapOf()) {

    companion object {
        val Empty = RailDirection("", mapOf())
    }
}


