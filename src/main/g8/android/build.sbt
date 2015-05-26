import android.Keys._

android.Plugin.androidBuild

scalaVersion := "2.11.6"

platformTarget in Android := "android-$android_api_level$"

libraryDependencies ++= Seq(
    "com.badlogicgames.gdx" % "gdx-backend-android" % "$libgdx_version$"
)
