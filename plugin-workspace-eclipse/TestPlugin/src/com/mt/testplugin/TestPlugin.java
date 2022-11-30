package com.mt.testplugin;

import com.mt.minicraft.BaseAPI;
import com.mt.minicraft.math.Vec2;

public class TestPlugin implements BaseAPI{

	@Override
	public void onInit() {
		Vec2 v = Vec2.xy(10, 10);
		System.out.println(v.neg().toString());
	}

}
