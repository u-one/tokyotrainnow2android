package net.uoneweb.android.tokyotrainnow

import net.uoneweb.android.odpt.Railway
import net.uoneweb.android.odpt.RailwayDataSource
import javax.inject.Inject

class RailwayRepository @Inject constructor(
    private val railwayDataSource: RailwayDataSource
) {

    suspend fun getRailway(): List<Railway> {
        return railwayDataSource.getRailwayData()
    }
}