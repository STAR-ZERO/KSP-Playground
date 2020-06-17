plugins {
    kotlin("jvm")
}

group = "com.star_zero.sample"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    mavenCentral()
    google()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.squareup:javapoet:1.12.1")
    implementation("org.jetbrains.kotlin:kotlin-symbol-processing-api:1.4-M1-dev-experimental-20200610")
}

sourceSets.main {
    java.srcDirs("src/main/kotlin")
}

