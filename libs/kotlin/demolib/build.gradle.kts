println("Configuring '${name}' library...")

group = "com.pvdhoef"
version = "0.0.1-SNAPSHOT"

plugins {
    id("com.pvdhoef.kotlin-conventions")
    id("io.spring.dependency-management")
}

dependencies {
    implementation(kotlin("stdlib"))
    // Build fails when the version is not explicitly specified. TODO: Solve version management in a consistent way.
    // implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter:3.5.3")
}
