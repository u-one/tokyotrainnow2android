package net.uoneweb.android.odpt

import com.google.gson.annotations.SerializedName

data class Train(
    @SerializedName("@id") val id: String,
    @SerializedName("@type") val type: String,
    @SerializedName("dc:date") val date: String,
    @SerializedName("dct:valid") val valid: String,
    @SerializedName("odpt:delay") val delay: Int,
    @SerializedName("owl:sameAs") val sameAs: String,
    @SerializedName("odpt:operator") val operator: String,
    @SerializedName("odpt:railway") val railway: String,
    @SerializedName("odpt:railDirection") val railDirection: String,
    @SerializedName("odpt:trainType") val trainType: String,
    @SerializedName("odpt:trainNumber") val trainNumber: String,
    @SerializedName("odpt:fromStation") val fromStation: String,
    @SerializedName("odpt:toStation") val toStation: String?,
    @SerializedName("odpt:originStation") val originStation: List<String>,
    @SerializedName("odpt:destinationStation") val destinationStation: List<String>,
    @SerializedName("odpt:index") val index: Int,
    @SerializedName("odpt:carComposition") val carComposition: Int = 0
)
