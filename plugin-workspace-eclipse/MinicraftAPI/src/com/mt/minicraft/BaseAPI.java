package com.mt.minicraft;

import java.util.List;

import com.mt.pluginloader.IPlugin;



public interface BaseAPI extends IPlugin {
	void start();
	void stop();
	List<TextParticle> particles();
}
