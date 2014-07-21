import android.Keys._

android.Plugin.androidBuild

platformTarget in Android := "android-$android_api_level$"

libraryDependencies ++= Seq(
    "com.badlogicgames.gdx" % "gdx-backend-android" % "$libgdx_version$"
)
