group = "com.rookie"
version = "0.0.1-SNAPSHOT"

plugins {
    kotlin("jvm") version "1.9.25"
    kotlin("plugin.jpa") version "2.0.21"
    kotlin("plugin.noarg") version "2.0.21"
    kotlin("plugin.spring") version "1.9.25"
    id("war")
    id("org.springframework.boot") version "3.3.5"
    id("com.github.ben-manes.versions") version "0.51.0"
    id("io.spring.dependency-management") version "1.1.6"    
}

java { 
    toolchain { 
        languageVersion = JavaLanguageVersion.of(21) 
    } 
}

repositories { 
    mavenCentral() 
}

dependencies {
    implementation("com.h2database:h2")
    implementation("org.hibernate.orm:hibernate-core")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("jakarta.persistence:jakarta.persistence-api")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
}

kotlin { 
    compilerOptions { 
        freeCompilerArgs.addAll("-Xjsr305=strict") 
    } 
}

tasks.withType<Test> { useJUnitPlatform() }