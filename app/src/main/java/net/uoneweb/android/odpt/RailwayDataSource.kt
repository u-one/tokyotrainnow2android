package net.uoneweb.android.odpt

import okhttp3.OkHttpClient
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

    suspend fun getTrains(railway: String): List<Train> {
        return service.getTrains(railway, apiConfig.consumerKey)
    }

    suspend fun getRailDirections(): List<RailDirection> {
        return service.getRailDirections(apiConfig.consumerKey)
    }

    suspend fun getTrainTypes(): List<TrainType> {
        return service.getTrainTypes(apiConfig.consumerKey)
    }

    suspend fun getStations(operator: String): List<Station> {
        return service.getStations(operator, apiConfig.consumerKey)
    }
}