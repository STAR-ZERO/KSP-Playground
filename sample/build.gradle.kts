plugins {
    application
    id("kotlin-ksp") version "1.4-M1-dev-experimental-20200610"
    kotlin("jvm")
}

application {
    mainClassName = "com.star_zero.sample.MainKt"
}

repositories {
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    google()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(project(":sample-processor"))
    ksp(project(":sample-processor"))
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
