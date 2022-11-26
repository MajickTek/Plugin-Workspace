package com.mt.pluginloader.test;

import java.util.List;

import com.mt.pluginloader.PluginRegistryServiceLoader;

public class Test {

	public static void main(String[] args) {
		PluginRegistryServiceLoader prsl = new PluginRegistryServiceLoader();
		List<TestPlugin> testList = prsl.getPluginsInternal(TestPlugin.class);
		
		
	}

}
