package net.uoneweb.android.tokyotrainnow

import net.uoneweb.android.tokyotrainnow.entity.Railway
import net.uoneweb.android.tokyotrainnow.entity.Train


interface RailwayRepository {
    suspend fun getRailway(railway: String): Railway
    suspend fun getTrains(railway: String): List<Train>
}