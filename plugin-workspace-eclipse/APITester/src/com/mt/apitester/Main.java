package com.mt.apitester;

import java.util.HashMap;

import com.mt.minicraft.BaseAPI;
import com.mt.pluginloader.PluginRegistryServiceLoader;

public class Main {

	public static void main(String[] args) {
		PluginRegistryServiceLoader prsl = new PluginRegistryServiceLoader();
		HashMap<String, BaseAPI> plugins = prsl.getPlugins(BaseAPI.class);
		
		plugins.forEach((n, p) -> {
			p.onInit();
		});
	}

}
