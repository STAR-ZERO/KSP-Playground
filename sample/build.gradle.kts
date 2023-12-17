import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

plugins {
    application
    id("com.google.devtools.ksp") version "2.0.0-Beta1-1.0.15"
    kotlin("jvm")
}

application {
    mainClass = "com.star_zero.sample.MainKt"
}

dependencies {
    implementation(project(":sample-processor"))
    ksp(project(":sample-processor"))
}
