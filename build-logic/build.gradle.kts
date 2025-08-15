plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin")
    implementation("org.jetbrains.kotlin:kotlin-allopen")
}

gradlePlugin {
    plugins {
        register("KotlinConventionPlugin") {
            id = "com.pvdhoef.kotlin-conventions"
            implementationClass = "KotlinConventionPlugin"
        }
    }
}
