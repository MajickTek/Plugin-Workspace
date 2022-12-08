package com.mt.minicraft;

import com.mt.pluginloader.IPlugin;

public interface BaseAPI extends IPlugin {
	
	void preInit(Object gameClass);
	void postInit(Object gameClass);
}
