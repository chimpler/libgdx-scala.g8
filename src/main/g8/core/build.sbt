import sbt.Keys._

scalaVersion := "$scala_version$"

val libGdxVersion = "$libgdx_version$"

libraryDependencies ++= Seq(
    "com.badlogicgames.gdx" % "gdx" % libGdxVersion
)

exportJars := true
