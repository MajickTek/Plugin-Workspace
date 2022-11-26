package com.mt.pluginloader.test;

import java.util.HashMap;
import java.util.List;

import com.mt.pluginloader.PluginRegistryServiceLoader;

public class TestExternal {

	public static void main(String[] args) {
		//Testing external jars
		PluginRegistryServiceLoader prsl = new PluginRegistryServiceLoader();
		HashMap<String, TestPluginAPI> plugins = prsl.getPlugins(TestPluginAPI.class);
		plugins.forEach((name, plugin) -> {
			System.out.println(String.format("running test() method for plugin %s", name));
			plugin.test();
		});
	}

}
