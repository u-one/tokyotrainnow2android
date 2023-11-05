package net.uoneweb.android.odpt

import com.google.gson.annotations.SerializedName

data class RailDirection(
    @SerializedName("@context") val context: String,
    @SerializedName("@id") val id: String,
    @SerializedName("@type") val type: String,
    @SerializedName("dc:date") val date: String,
    @SerializedName("owl:sameAs") val sameAs: String,
    @SerializedName("dc:title") val title: String,
    @SerializedName("odpt:railDirectionTitle") val railDirectionTitle: Map<String, String>
)
