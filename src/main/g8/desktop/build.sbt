import sbt.Keys._

libraryDependencies ++= Seq(
  "com.badlogicgames.gdx" % "gdx-backend-lwjgl" % "$libgdx_version$",
  "com.badlogicgames.gdx" % "gdx-platform" % "$libgdx_version$" classifier "natives-desktop"
)

unmanagedResourceDirectories in Compile += baseDirectory.value / "../android/assets"
