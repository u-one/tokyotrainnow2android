package net.uoneweb.android.tokyotrainnow

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import net.uoneweb.android.odpt.RailwayRepositoryImpl
import okhttp3.Cache
import okhttp3.OkHttpClient
import java.io.File
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RailwayRepositoryModule {
    @Singleton
    @Provides
    fun provideRailwayRepository(railwayRepository: RailwayRepositoryImpl): RailwayRepository {
        return railwayRepository
    }

    @Singleton
    @Provides
    fun provideOkhttpClient(@ApplicationContext context: Context) : OkHttpClient {
        val cacheSize = 10 * 1024 * 1024 // 10 MB
        val cacheDirectory = File(context.cacheDir, "httpCache")
        val cache = Cache(cacheDirectory, cacheSize.toLong())
        return OkHttpClientFactory.cachedClient(context, cache)
    }
}