import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    application
}

group = "com.frogobox"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("MainKt")
}