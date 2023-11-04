package net.uoneweb.android.odpt

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RailwayRepository {

    private val service: RailwayService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.example.com") // 実際のベースURLに置き換えてください
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(RailwayService::class.java)
    }

    fun getRailwayData(consumerKey: String): Call<List<Railway>> {
        return service.getRailwayData(consumerKey)
    }
}