package com.mt.pluginloader;

import java.util.HashMap;

public interface PluginRegistry {
	
	<TPlugin extends IPlugin> HashMap<String, TPlugin> getPlugins(Class<TPlugin> pluginClass);
	
}
