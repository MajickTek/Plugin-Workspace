package com.mt.minicraft;

import com.mt.minicraft.util.Callback;

public interface IMenu {
	void tick();
	String getOptionMessage();
	Callback getOptionMethod();
}
