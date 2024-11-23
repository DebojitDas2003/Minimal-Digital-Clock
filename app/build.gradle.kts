plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.ddas.digitalclock"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ddas.digitalclock"
        minSdk = 14
        targetSdk = 34
        versionCode = 3
        versionName = "1.2"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation ("androidx.appcompat:appcompat:1.2.0")
    implementation ("com.google.android.material:material:1.4.0")
    implementation(libs.filament.android)


}