# Minimal Gradle Multi Module Project

This is a minimal Gradle based multi-module Spring Boot project written in Kotlin
modeled after [Creating a Multi Module Project](https://spring.io/guides/gs/multi-module)
on the [Spring.io](https://spring.io/) site.

Other resources:
- Gradle's [Multi-Project Builds](https://docs.gradle.org/current/userguide/multi_project_builds.html)
- [Kotlin Multiplatform Wizard](kmp.jetbrains.com)
- [Create your Compose Multiplatform app](
    https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-create-first-app.html)

## Centralized build configuration

The build configuration is
[centrally managed](
https://docs.gradle.org/current/userguide/sharing_build_logic_between_subprojects.html#using_a_composite_build_named_build_logic)
with a `build-logic` project
and a central [version catalog](https://docs.gradle.org/current/userguide/version_catalogs.html).

This is a modern approach and [avoids cross-project configuration](
https://docs.gradle.org/current/userguide/sharing_build_logic_between_subprojects.html#sec:convention_plugins_vs_cross_configuration)
using `subprojects` and `allprojects`.
In the long run, cross-project configuration usually grows in complexity and becomes a burden.

