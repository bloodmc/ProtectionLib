/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("de.Ste3et_C0st.furniture.java-conventions")
}

repositories {
    mavenCentral()
    maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots/") }
    maven { url = uri("https://papermc.io/repo/repository/maven-public/") }
    maven { url = uri("https://repo.mikeprimm.com/") }
    maven { url = uri("https://maven.enginehub.org/repo/") }
    maven { url = uri("https://mvn.intellectualsites.com/content/groups/public/") }
    maven { url = uri("https://mvn.intellectualsites.com/content/repositories/releases/") }
    maven { url = uri("https://mvn.intellectualsites.com/content/repositories/snapshots/") }
}

dependencies {
    implementation(project(":Core"))
    compileOnly("com.plotsquared:PlotSquared-Core:6.1.2") // PlotSquared Core API
    compileOnly("com.plotsquared:PlotSquared-Bukkit:6.1.2") { isTransitive = false } // PlotSquared Bukkit API
}

description = "PlotSquaredV6"
