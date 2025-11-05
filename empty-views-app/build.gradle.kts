plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.emptyviewsapp"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.7.10")
    implementation("com.google.android.exoplayer:exoplayer:2.16.1")
    implementation("com.google.mlkit:object-detection:16.0.0")
    implementation("com.github.hisvibe:ffmpeg-kit-full:4.5.LTS")
    implementation("org.tensorflow:tensorflow-lite:2.10.0")
}