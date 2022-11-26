package com.mt.minicraft;

import java.util.List;

import com.mt.pluginloader.Plugin;

public interface BaseAPI extends Plugin {
	void start();
	void stop();
	List<TextParticle> particles();
}
