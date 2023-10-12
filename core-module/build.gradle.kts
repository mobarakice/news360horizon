plugins {
    alias(libs.plugins.spring.framework)
    alias(libs.plugins.spring.dependency.management)
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.spring)
    alias(libs.plugins.kotlin.jpa)
}
group = "com.news360horizon.news360horizon.core"
version = "0.0.1-SNAPSHOT"

dependencies {
    implementation(libs.starter.data.jdbc)
    implementation(libs.starter.data.jpa)
    implementation(libs.starter.data.rest)
    implementation(libs.starter.jdbc)
    implementation(libs.starter.security)
    implementation(libs.starter.thymeleaf)
    implementation(libs.starter.validation)
    implementation(libs.starter.web)
    implementation(libs.starter.web.services)
    implementation(libs.jackson.module.kotlin)
    implementation(libs.kotlin.reflect)
    implementation(libs.thymeleaf.extras)
    developmentOnly(libs.boot.devtools)
    runtimeOnly(libs.mysql.connector)
    testImplementation(libs.starter.test)
    testImplementation(libs.security.test)
    implementation(libs.coroutines.core)

    implementation(projects.databaseModule)
}

