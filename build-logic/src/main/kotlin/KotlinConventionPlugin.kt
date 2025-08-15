import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.JavaVersion
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.repositories
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

class KotlinConventionPlugin : Plugin<Project> {
    override fun apply(project: Project) {

        println("Applying Kotlin conventions to project: '${project.name}'")

        project.pluginManager.apply("org.jetbrains.kotlin.jvm") // Aka `kotlin("jvm")`.
        project.pluginManager.apply("org.jetbrains.kotlin.plugin.spring") // Aka `kotlin("plugin.spring")`.

        // This is similar to the `java { toolchain { ... } ... etc. }` DSL in `build.gradle.kts`.
        project.extensions.configure<JavaPluginExtension> {
            toolchain.languageVersion.set(JavaLanguageVersion.of(21))
            sourceCompatibility = JavaVersion.VERSION_21
            targetCompatibility = JavaVersion.VERSION_21
        }

        // This is similar to the `kotlin { jvmToolchain(21) ... etc. }` DSL in `build.gradle.kts`.
        project.extensions.configure<KotlinJvmProjectExtension> {
            jvmToolchain(21)
            compilerOptions {
                freeCompilerArgs.add("-Xjsr305=strict")
            }
        }

        // project.repositories {
        //     mavenCentral()
        // }
    }
}
