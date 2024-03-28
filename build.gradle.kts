plugins {
    kotlin("jvm") version "1.9.23"
    id("org.springframework.boot") version "3.1.5"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.2.4")

    implementation("org.axonframework:axon-spring-boot-starter:4.9.3")
    implementation("org.axonframework.extensions.kotlin:axon-kotlin:4.9.0")
    testImplementation("org.axonframework.extensions.kotlin:axon-kotlin-test:4.9.0")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}