plugins {
    id("com.android.application")
    kotlin("android")
    id ("com.google.gms.google-services")
}

android {
    compileSdk = 32
    defaultConfig {
        applicationId = "com.example.photo_upload.android"
        minSdk = 22
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
        buildFeatures{
            dataBinding = true
            viewBinding = true
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.0")
    implementation("com.google.firebase:firebase-bom:30.1.0")
}