package net.uoneweb.android.odpt

import com.google.gson.annotations.SerializedName

data class TrainType(
    @SerializedName("@context") val context: String,
    @SerializedName("@id") val id: String,
    @SerializedName("@type") val type: String,
    @SerializedName("dc:date") val date: String,
    @SerializedName("owl:sameAs") val sameAs: String,
    @SerializedName("odpt:operator") val operator: String,
    @SerializedName("dc:title") val title: String,
    @SerializedName("odpt:trainTypeTitle") val trainTypeTitle: Map<String, String>
)
