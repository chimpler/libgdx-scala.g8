import com.starkengine.TexturePackerPlugin

name := "$name$"

version := "0.1"

lazy val core = project.in(file("core")) settings (
  TexturePackerPlugin.texturePackerSettings ++ Seq(
    TexturePackerPlugin.unmanagedAssets := file("core/src/main/assets/unmanaged"),
    TexturePackerPlugin.managedAssets := file("core/src/main/assets/managed"),
    TexturePackerPlugin.assets := file("android/assets")
  )
)

lazy val desktop = project.in(file("desktop")).dependsOn(core)

lazy val android = project.in(file("android")).dependsOn(core)
