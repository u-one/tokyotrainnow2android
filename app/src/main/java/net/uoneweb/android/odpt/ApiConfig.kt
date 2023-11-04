package net.uoneweb.android.odpt

import net.uoneweb.android.tokyotrainnow.BuildConfig
import javax.inject.Inject

class ApiConfig @Inject constructor() {
    val baseUri = "https://api.odpt.org"
    val consumerKey = BuildConfig.ODPT_API_CONSUMER_KEY
}