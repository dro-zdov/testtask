val scala3Version = "3.1.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "test-task",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

  )
