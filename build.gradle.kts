plugins {
    kotlin("jvm") version "1.4-M1" apply false
}

buildscript {
    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.4-M1"))
    }

    repositories {
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
    }
}
