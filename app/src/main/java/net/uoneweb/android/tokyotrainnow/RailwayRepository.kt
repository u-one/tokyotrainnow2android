package net.uoneweb.android.tokyotrainnow

import net.uoneweb.android.tokyotrainnow.entity.Railway


interface RailwayRepository {
    suspend fun getRailway(railway: String): Railway
}