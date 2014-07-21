import sbt.Keys._

scalaVersion := "$scala_version$"

libraryDependencies ++= Seq(
    "com.badlogicgames.gdx" % "gdx" % "$libgdx_version$"
)

exportJars := true
