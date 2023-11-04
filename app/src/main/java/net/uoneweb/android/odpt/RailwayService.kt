package net.uoneweb.android.odpt

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RailwayService {
    @GET("/api/v4/odpt:Railway")
    fun getRailwayData(@Query("acl:consumerKey") consumerKey: String): Call<List<Railway>>
}