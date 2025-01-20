//buildscript {
//    dependencies {
//        classpath("com.google.gms:google-services:4.4.2")
//    }
//}
//// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
//    id("com.android.application") version "8.1.1" apply false
//}


buildscript {
    dependencies {
        // Use the latest compatible version of the Google Services plugin
        classpath("com.android.tools.build:gradle:8.1.1")
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("com.android.library") version "8.1.1" apply false
    id("com.google.gms.google-services") version "4.3.15" apply false
}
