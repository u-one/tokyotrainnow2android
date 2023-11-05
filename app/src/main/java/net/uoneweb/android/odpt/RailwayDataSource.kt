package net.uoneweb.android.odpt

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class RailwayDataSource @Inject constructor(
    private val apiConfig: ApiConfig,
    okHttpClient: OkHttpClient
) {

    private val service: RailwayService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(apiConfig.baseUri)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(RailwayService::class.java)
    }

    suspend fun getRailwayData(): List<Railway> {
        return service.getRailwayData(apiConfig.consumerKey)
    }
}