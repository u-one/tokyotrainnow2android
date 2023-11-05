package net.uoneweb.android.odpt

import com.google.gson.annotations.SerializedName

data class Station(
    @SerializedName("@context") val context: String,
    @SerializedName("@id") val id: String,
    @SerializedName("@type") val type: String,
    @SerializedName("dc:date") val date: String,
    @SerializedName("owl:sameAs") val sameAs: String,
    @SerializedName("dc:title") val title: String,
    @SerializedName("odpt:stationTitle") val stationTitle: Map<String, String>,
    @SerializedName("odpt:operator") val operator: String,
    @SerializedName("odpt:railway") val railway: String,
    @SerializedName("geo:long") val longitude: Double,
    @SerializedName("geo:lat") val latitude: Double
)
