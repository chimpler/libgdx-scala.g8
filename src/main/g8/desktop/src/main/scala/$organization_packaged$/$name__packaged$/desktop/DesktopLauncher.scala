package $organization$.$name$.desktop;

import com.badlogic.gdx.backends.lwjgl.{LwjglApplication, LwjglApplicationConfiguration}
import $organization$.$name$.MainClass

object DesktopLauncher {
	def main (args: Array[String]) {
		val config = new LwjglApplicationConfiguration();
		new LwjglApplication(MainClass, config);
	}
}
