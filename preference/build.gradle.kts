plugins {
    alias(libs.plugins.spring.framework)
    alias(libs.plugins.spring.dependency.management)
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.spring)
    alias(libs.plugins.kotlin.jpa)
}
group = "com.news360horizon.news360horizon.preference"
version = "0.0.1-SNAPSHOT"

dependencies {
    implementation(libs.starter.data.rest)
    implementation(libs.jackson.module.kotlin)
    implementation(libs.starter.data.jpa)
    implementation(libs.kotlin.reflect)
    developmentOnly(libs.boot.devtools)
    testImplementation(libs.starter.test)
    testImplementation(libs.security.test)
    implementation(libs.coroutines.core)

    implementation(projects.database)
}

