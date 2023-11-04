package net.uoneweb.android.tokyotrainnow

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import net.uoneweb.android.odpt.RailwayRepositoryImpl
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RailwayRepositoryModule {
    @Singleton
    @Provides
    fun provideRailwayRepository(railwayRepository: RailwayRepositoryImpl): RailwayRepository {
        return railwayRepository
    }
}