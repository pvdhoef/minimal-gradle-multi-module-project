rootProject.name = "minimal-gradle-multi-module-project"

pluginManagement {

    repositories {
        gradlePluginPortal()
        mavenCentral()
    }

    plugins {
        kotlin("jvm") version "2.0.0"
        kotlin("plugin.spring") version "2.0.0"
        id("io.spring.dependency-management") version "1.1.7"
        id("org.springframework.boot") version "3.5.3"
        id("io.spring.dependency-management") version "1.1.7"
        kotlin("plugin.jpa") version "2.2.0"
        kotlin("plugin.allopen") version "2.2.0"
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

includeBuild("build-logic")

include(":demoapp-server")
project(":demoapp-server").projectDir = file("apps/demoapp/server")

include(":kotlin-demolib")
project(":kotlin-demolib").projectDir = file("libs/kotlin/demolib")

