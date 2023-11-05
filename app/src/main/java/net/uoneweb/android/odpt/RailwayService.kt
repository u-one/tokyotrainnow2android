package net.uoneweb.android.odpt

import retrofit2.http.GET
import retrofit2.http.Query

interface RailwayService {
    @GET("/api/v4/odpt:Railway")
    suspend fun getRailwayData(@Query("acl:consumerKey") consumerKey: String): List<Railway>

    @GET("/api/v4/odpt:Train")
    suspend fun getTrains(@Query("odpt:railway") railway: String, @Query("acl:consumerKey") consumerKey: String): List<Train>

    @GET("/api/v4/odpt:RailDirection")
    suspend fun getRailDirections(@Query("acl:consumerKey") consumerKey: String): List<RailDirection>
}