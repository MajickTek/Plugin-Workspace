package com.mojang.ld22;

import java.util.HashMap;
import com.mt.minicraft.BaseAPI;
import com.mt.pluginloader.PluginRegistryServiceLoader;

public class GameRunner {

	private static PluginRegistryServiceLoader prsl = new PluginRegistryServiceLoader();
	public static final HashMap<String, BaseAPI> plugins = prsl.getPlugins(BaseAPI.class);
	
	public static void main(String[] args) {
		
		Game.main(args);
		
	}

}
