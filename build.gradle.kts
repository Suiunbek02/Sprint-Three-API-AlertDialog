// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.0" apply false
    id ("com.android.library") version "7.4.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false

    //navigation
    id ("androidx.navigation.safeargs.kotlin") version "2.5.2" apply false
    //hilt
    id ("com.google.dagger.hilt.android") version "2.45" apply false

}