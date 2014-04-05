name := "$name$"

version := "0.1"

lazy val core = project.in(file("core"))

lazy val desktop = project.in(file("desktop")).dependsOn(core)

lazy val android = project.in(file("android")).dependsOn(core)
