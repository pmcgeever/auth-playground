/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    java
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter:2.3.11.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-web:2.3.11.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-security:2.3.11.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-actuator:2.3.11.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.3.11.RELEASE")
    implementation("org.mariadb.jdbc:mariadb-java-client:2.7.3")
    implementation("com.auth0:java-jwt:3.16.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.3.11.RELEASE")
    compileOnly("org.projectlombok:lombok:1.18.20")
}

group = "com.patrickmcgeever"
version = "0.0.1-SNAPSHOT"
description = "spring-jwt-demo"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}
