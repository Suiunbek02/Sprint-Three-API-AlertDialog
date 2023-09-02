plugins {
    id("com.android.application")
    id ("kotlin-android")
    id("org.jetbrains.kotlin.android")

    //navigation
    id ("androidx.navigation.safeargs.kotlin")
    id ("kotlin-kapt")
    //hilt
    id ("dagger.hilt.android.plugin")
}

android {
    namespace = "com.example.sprint_three_api_alertdialog"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.sprint_three_api_alertdialog"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    //Core
    implementation("androidx.core:core-ktx:1.8.0")

    //AppCompat
    implementation("androidx.appcompat:appcompat:1.6.1")

    //Material
    implementation("com.google.android.material:material:1.8.0")

    //ConstraintLayout
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // ViewBinding Property Delegate
    val view_binding_property_delegate = "1.4.7"
    // To use only without reflection variants of viewBinding
    implementation("com.github.kirich1409:viewbindingpropertydelegate-noreflection:$view_binding_property_delegate")

    // Navigation
    val nav_version = "2.5.2"
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
    implementation("androidx.navigation:navigation-dynamic-features-fragment:$nav_version")

    //Retrofit 2
    val retrofit_version = "2.9.0"
    implementation ("com.squareup.retrofit2:retrofit:$retrofit_version")
    // Gson
    implementation ("com.squareup.retrofit2:converter-gson:$retrofit_version")

    //Glide
    val glide_version = "4.14.2"
    implementation ("com.github.bumptech.glide:glide:$glide_version")
    annotationProcessor ("com.github.bumptech.glide:compiler:$glide_version")

    //kotlin_activity
    val activity_version = "1.3.0"
    //noinspection GradleDependency
    implementation("androidx.activity:activity-ktx:$activity_version")

    //kotlin_fragment
    val fragment_version = "1.3.6"
    //noinspection GradleDependency
    implementation("androidx.fragment:fragment-ktx:$fragment_version")

    // OkHttp
    implementation("com.squareup.okhttp3:okhttp-bom:5.0.0-alpha.6")
    implementation("com.squareup.okhttp3:okhttp")
    implementation("com.squareup.okhttp3:logging-interceptor")

    //Paging
    implementation("androidx.paging:paging-runtime-ktx:3.1.1")

    //Hilt
    implementation("com.google.dagger:hilt-android:2.45")
    kapt("com.google.dagger:hilt-android-compiler:2.45")

    //Coil
    implementation("io.coil-kt:coil:2.2.2")
    //ViewPager2
    implementation("androidx.viewpager2:viewpager2:1.0.0")
}