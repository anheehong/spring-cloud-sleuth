import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.0.6"
    id("io.spring.dependency-management") version "1.1.0"
    kotlin("jvm") version "1.7.22"
    kotlin("plugin.spring") version "1.7.22"
}

group = "com.cloud-sleuth"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    implementation("org.springframework.boot:spring-boot-starter-web")

    //spring-boot 3.0 이하
    //implementation("org.springframework.cloud:spring-cloud-starter-sleuth:3.1.7")
    //implementation("org.springframework.cloud:spring-cloud-sleuth-zipkin:3.1.7")

    //spring-boot 3.0 이상
    implementation("io.micrometer:micrometer-observation")
    implementation("io.micrometer:micrometer-tracing-bridge-brave")
    implementation( "io.zipkin.reporter2:zipkin-reporter-brave" )


    implementation("org.springframework.boot:spring-boot-starter-actuator:3.0.6")

    implementation("org.slf4j:slf4j-api:2.0.5")

}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
