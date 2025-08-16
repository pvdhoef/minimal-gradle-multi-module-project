rootProject.name = "minimal-gradle-multi-module-project"

dependencyResolutionManagement {

    repositories {
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            from(files("build.versions.catalog.toml"))
        }
    }
}

pluginManagement {

    repositories {
        gradlePluginPortal()
        mavenCentral()
    }

    includeBuild("build-logic")
}

include(":demoapp-server")
project(":demoapp-server").projectDir = file("apps/demoapp/server")

include(":kotlin-demolib")
project(":kotlin-demolib").projectDir = file("libs/kotlin/demolib")
