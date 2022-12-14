plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

val composeVersion = "1.2.0"

android {
    namespace = "io.github.satwanjyu.progresstracker"
    compileSdk = 33

    defaultConfig {
        applicationId = "io.github.satwanjyu.progresstracker"
        minSdk = 31
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
    }
    composeOptions {
        kotlinCompilerExtensionVersion = composeVersion
    }
    packagingOptions {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

val accompanistVersion = "0.26.4-beta"

dependencies {
    implementation ("androidx.core:core-ktx:1.9.0")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")
    implementation ("androidx.activity:activity-compose:1.6.0")
    implementation ( "androidx.compose.ui:ui:$composeVersion" )
    implementation ( "androidx.compose.ui:ui-tooling-preview:$composeVersion" )
    implementation ("androidx.compose.material3:material3:1.0.0-beta03")
    implementation("com.google.accompanist:accompanist-flowlayout:$accompanistVersion")
    testImplementation ( "junit:junit:4.13.2" )
    androidTestImplementation ( "androidx.test.ext:junit:1.1.3" )
    androidTestImplementation ( "androidx.test.espresso:espresso-core:3.4.0" )
    androidTestImplementation ( "androidx.compose.ui:ui-test-junit4:$composeVersion" )
    debugImplementation ( "androidx.compose.ui:ui-tooling:$composeVersion" )
    debugImplementation ( "androidx.compose.ui:ui-test-manifest:$composeVersion" )
}