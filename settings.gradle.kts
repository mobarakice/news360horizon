pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
    }
}


rootProject.name = "news360horizon"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(":core")
include(":data")
include(":database")
include(":user")
include(":admin")
include(":webadmin")
include(":category")
include(":preference")
include(":content")
include(":bookmark")
include(":notification")
include(":feedback")
include(":poll")
include(":nativeads")
