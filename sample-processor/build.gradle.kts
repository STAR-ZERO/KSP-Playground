import org.gradle.kotlin.dsl.support.kotlinCompilerOptions
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    kotlin("jvm")
}

group = "com.star_zero.sample"
version = "1.0-SNAPSHOT"

dependencies {
    implementation("com.google.devtools.ksp:symbol-processing-api:2.0.0-Beta1-1.0.15")
}

sourceSets.main {
    java.srcDirs("src/main/kotlin")
}
