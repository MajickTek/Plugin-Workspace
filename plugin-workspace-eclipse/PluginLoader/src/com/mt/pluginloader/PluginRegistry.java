package com.mt.pluginloader;

import java.util.HashMap;
import java.util.ServiceLoader;

public interface PluginRegistry {
	
	<TPlugin extends Plugin> HashMap<String, TPlugin> getPlugins(Class<TPlugin> pluginClass);
	
	
	/**
	 * default implementation returns a list of plugins found in the current class loader
	 * @param <TPlugin> a class implementing a plugin interface
	 * @param pluginClass usually the same class as TPlugin
	 * @return a list of loaded plugin classes
	 */
	default <TPlugin extends Plugin> HashMap<String, TPlugin> getPluginsInternal(Class<TPlugin> pluginClass) {
		ServiceLoader<TPlugin> serviceLoader = ServiceLoader.load(pluginClass);
		HashMap<String, TPlugin> plugins = new HashMap<>();
		serviceLoader.forEach(plugin -> {
			System.out.println(String.format("Found plugin of type %s at: %s", pluginClass.getName(), plugin.getClass().getProtectionDomain().getCodeSource().getLocation()));
			plugins.put(plugin.getClass().getSimpleName(), plugin);
		});
		
		if(plugins.isEmpty()) {
			System.out.println(String.format("No implementations of type %s found", pluginClass.getName()));
		}
		
		System.out.println("Found " + plugins.size() + " plugins!");
		return plugins;
	}
}
