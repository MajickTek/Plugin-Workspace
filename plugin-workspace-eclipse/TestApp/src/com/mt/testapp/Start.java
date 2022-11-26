package com.mt.testapp;

import java.util.HashMap;

import com.mt.pluginloader.PluginRegistryServiceLoader;
import com.mt.testapp.api.TestAPI;

public class Start {
	public static void main(String[] args) {
		PluginRegistryServiceLoader prsl = new PluginRegistryServiceLoader();
		HashMap<String, TestAPI> plugins = prsl.getPlugins(TestAPI.class);
		plugins.forEach((name, plugin) -> {
			System.out.println(String.format("running test() method for plugin %s", name));
			plugin.test();
		});
		
		
		
		
	}
}
