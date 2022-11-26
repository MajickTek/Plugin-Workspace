package com.mt.testplugin;

import java.util.ArrayList;
import java.util.List;

import com.mt.minicraft.BaseAPI;
import com.mt.minicraft.TextParticle;


public class TestPlugin implements BaseAPI {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TextParticle> particles() {
		ArrayList<TextParticle> tests = new ArrayList<>();
		tests.add(new TestTextParticle());
		return tests;
	}

}
