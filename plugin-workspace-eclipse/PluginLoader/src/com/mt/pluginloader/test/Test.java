package com.mt.pluginloader.test;

import java.util.HashMap;
import com.mt.pluginloader.PluginRegistryServiceLoader;

public class Test {

	public static void main(String[] args) {
		PluginRegistryServiceLoader prsl = new PluginRegistryServiceLoader();
		
		//uses current classloader instead of external jars
		HashMap<String, TestPluginAPI> testList = prsl.getPluginsInternal(TestPluginAPI.class);
		
		testList.forEach((name, plugin) -> {
			//by default, name is set to the class name (file name). plugin is the actual class
			System.out.println(String.format("running test() method for plugin %s", name));
			plugin.test();
		});
		
	}

}
