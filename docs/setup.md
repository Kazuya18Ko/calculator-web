### ⚙ Overview of environment construction
For this project, I built the following development environment by myself

- Build Tool        : Gradle (with wrapper)
- JDK               : Temurin 17 (install via Scoop)
- Framework         : Spring Boot 3.2.5
- Template Engine   : Thymeleaf
- Development Tools : VSCode + GitHub CLI


### 🪜 environment Setup steps (summary)
1. Project initialization and Git setup
- `git init` → First push to Github
- Add `build/`, `.gradle` to `.gitignore`
2. Gradle environment construction
- Add `spring-boot-starter-web`, `spring-boot-starter-thymeleaf` to `build.gradle`
- Generate `./gradlew` with `gradle wrapper`
3. JDK install (Scoop)
- Added java bucket: `scoop bucket add java`
- Install JDK: `scoop install temurin17-jdk`
- Manually set `JAVA_HOME` and verified with `gradle -v`


### 🔍 Issues and Resolutions

| Problem                                | Resolution / Learning                                                                 |
|----------------------------------------|----------------------------------------------------------------------------------------|
| `gradle -v` showed a strange error     | `JAVA_HOME` was not set → learned I needed to set it manually after installing JDK via Scoop |
| `bootJar` build failed                 | No `main` class defined → learned that Spring Boot requires a class with `@SpringBootApplication` |
| `scoop install temurin17` didn't work  | Learned that the `java` bucket must be added first → solved by running `scoop bucket add java` |


### ✨ Knowledge and skills gained
- How Gradle works (build definitions, wrappers, dependency management)
- Install to JDK and the importance of JAVA_HOME
- Spring Boot boot structure (main class, relationship with bootJar)
- Troubleshooting skills in environment setting

