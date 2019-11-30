plugins {
  `java-library`
  id("nebula.kotlin")
  id("published")
  id("info.solidsoft.pitest")
}

dependencies {
  api("org.opentest4j:opentest4j:1.2.0")

  implementation("org.jetbrains.kotlin:kotlin-reflect")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")
  implementation("com.christophsturm:filepeek:0.1.1")

  testImplementation("dev.minutest:minutest:1.10.0")
}
