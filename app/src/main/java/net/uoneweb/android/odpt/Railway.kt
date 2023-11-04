package net.uoneweb.android.odpt

import com.google.gson.annotations.SerializedName

data class Railway(
    @SerializedName("@context") val context: String,
    @SerializedName("@id") val id: String,
    @SerializedName("@type") val type: String,
    @SerializedName("dc:date") val date: String,
    @SerializedName("owl:sameAs") val sameAs: String,
    @SerializedName("dc:title") val title: String,
    @SerializedName("odpt:railwayTitle") val railwayTitle: Map<String, String>,
    @SerializedName("odpt:operator") val operator: String,
    @SerializedName("odpt:ascendingRailDirection") val ascendingRailDirection: String,
    @SerializedName("odpt:descendingRailDirection") val descendingRailDirection: String,
    @SerializedName("odpt:stationOrder") val stationOrder: List<StationOrder>
)

data class StationOrder(
    @SerializedName("odpt:index") val index: Int,
    @SerializedName("odpt:station") val station: String,
    @SerializedName("odpt:stationTitle") val stationTitle: Map<String, String>
)