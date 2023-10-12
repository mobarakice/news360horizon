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

include(":core-module")
include(":data-module")
include(":database-module")
include(":user-module")
include(":admin-module")
include(":webadmin-module")
include(":category-module")
include(":preference-module")
include(":content-module")
include(":bookmark-module")
include(":notification-module")
include(":feedback-module")
include(":fcm-module")
include(":poll-module")
include(":nativeads-module")
