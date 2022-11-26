package com.mt.pluginloader.test;

import java.util.HashMap;
import java.util.List;

import com.mt.pluginloader.PluginRegistryServiceLoader;

public class Test {

	public static void main(String[] args) {
		PluginRegistryServiceLoader prsl = new PluginRegistryServiceLoader();
		HashMap<String, TestPluginAPI> testList = prsl.getPluginsInternal(TestPluginAPI.class);
		
		testList.forEach((k, v) -> {
			System.out.println(String.format("%s, %s", k, v.getName()));
		});
		
	}

}
