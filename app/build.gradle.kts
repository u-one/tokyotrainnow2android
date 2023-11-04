import java.util.*

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "net.uoneweb.android.tokyotrainnow"
    compileSdk = 34

    defaultConfig {
        applicationId = "net.uoneweb.android.tokyotrainnow"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }

        val credentialProperties = Properties()
        val localPropertiesFile = rootProject.file("credential.properties")
        if (localPropertiesFile.exists()) {
            localPropertiesFile.inputStream().use { credentialProperties.load(it) }
        }
        val odptApiConsumerKey = credentialProperties.getProperty("ODPT_API_CONSUMER_KEY") ?: System.getenv("ODPT_API_CONSUMER_KEY") ?: ""
        buildConfigField("String", "ODPT_API_CONSUMER_KEY", "\"$odptApiConsumerKey\"")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3" // 1.3.2
    }
    /*
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
     */
}

kapt {
    correctErrorTypes = true
}

dependencies {
    val kotlin = "1.9.10" // 1.7.20
    implementation(platform("org.jetbrains.kotlin:kotlin-bom:$kotlin"))

    val androidxActivity = "1.8.0" // 1.6.1
    val androidxCore = "1.12.0"
    val androidxLifecycle = "2.6.2" //2.6.2
    val junit4 = "4.13.2"
    val androidxTestExt = "1.1.5"
    val androidxEspresso = "3.5.1"
    val androidxComposeBom = "2023.10.01" //2023.01.00
    val retrofit = "2.9.0"
    val hilt = "2.48.1" // 2.44
    val androidxHiltNavigationCompose = "1.0.0"

    implementation(platform("androidx.compose:compose-bom:$androidxComposeBom"))
    implementation("androidx.activity:activity-compose: $androidxActivity")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")

    implementation("androidx.core:core-ktx:$androidxCore")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$androidxLifecycle")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:$androidxLifecycle")

    testImplementation("junit:junit:$junit4")
    androidTestImplementation("androidx.test.ext:junit:$androidxTestExt")
    androidTestImplementation("androidx.test.espresso:espresso-core:$androidxEspresso")
    androidTestImplementation(platform("androidx.compose:compose-bom:$androidxComposeBom"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    implementation("com.squareup.retrofit2:retrofit:$retrofit")
    implementation("com.squareup.retrofit2:converter-gson:$retrofit")
    implementation("com.google.dagger:hilt-android:$hilt")
    kapt("com.google.dagger:hilt-android-compiler:$hilt")
    implementation("androidx.hilt:hilt-navigation-compose:$androidxHiltNavigationCompose")

}



