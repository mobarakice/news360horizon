import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
plugins {
	alias(libs.plugins.spring.framework)
	alias(libs.plugins.spring.dependency.management)
	alias(libs.plugins.kotlin.jvm)
	alias(libs.plugins.kotlin.spring)
	alias(libs.plugins.kotlin.jpa)
}

group = "com.news360horizon"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
