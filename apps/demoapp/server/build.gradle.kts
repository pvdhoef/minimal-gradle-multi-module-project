
println("Configuring '${name}' application...")

group = "com.pvdhoef"
version = "0.0.1-SNAPSHOT"

plugins {
    id("com.pvdhoef.kotlin-conventions")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("plugin.jpa")
    kotlin("plugin.allopen")
}

dependencies {

    implementation(project(":kotlin-demolib"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}

allOpen {
    annotation("jakarta.persistence.Entity")
    annotation("jakarta.persistence.Embeddable")
    annotation("jakarta.persistence.MappedSuperclass")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
