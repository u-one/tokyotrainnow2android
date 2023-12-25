// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    val hilt = "2.48.1" // 2.44
    val androidGradlePlugin = "8.2.0"
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:$hilt")
        classpath("com.android.tools.build:gradle:$androidGradlePlugin")
    }
}

plugins {
    val androidGradlePlugin = "8.2.0" // 7.3.1
    val kotlin = "1.9.10" // 1.7.20
    val hilt = "2.48.1" // 2.44

    id("com.android.application") version androidGradlePlugin apply false
    id("org.jetbrains.kotlin.android") version kotlin apply false
    id("com.google.dagger.hilt.android") version hilt apply false
}

tasks.register(name = "clean", type = Delete::class) {
    delete(rootProject.layout.buildDirectory)
}