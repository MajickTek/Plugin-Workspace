package com.mt.pluginloader;

import java.util.HashMap;
import java.util.ServiceLoader;

public interface PluginRegistry {
	
	<TPlugin extends Plugin> HashMap<String, TPlugin> getPlugins(Class<TPlugin> pluginClass);
	
}
