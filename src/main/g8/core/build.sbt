import sbt.Keys._

scalaVersion := "$scala_version$"

libraryDependencies ++= Seq(
    "com.badlogicgames.gdx" % "gdx" % "0.9.9"
)

exportJars := true
