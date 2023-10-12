plugins {
    alias(libs.plugins.spring.framework)
    alias(libs.plugins.spring.dependency.management)
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.spring)
    alias(libs.plugins.kotlin.jpa)
}
group = "com.news360horizon.news360horizon.db"
version = "0.0.1-SNAPSHOT"

dependencies {
    implementation(libs.starter.data.jdbc)
    implementation(libs.starter.data.jpa)
    implementation(libs.starter.jdbc)
    implementation(libs.starter.validation)
    runtimeOnly(libs.mysql.connector)
}

