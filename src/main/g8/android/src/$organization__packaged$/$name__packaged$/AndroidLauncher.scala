package $organization$.$name$.android

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import $organization$.$name$.MainClass;

class AndroidLauncher extends AndroidApplication {

	override def onCreate(savedInstanceState: Bundle) {
		super.onCreate(savedInstanceState)
		val config = new AndroidApplicationConfiguration()
		initialize(MainClass, config)
	}
}
