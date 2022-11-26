package com.mt.testplugin;

import java.awt.Point;

import com.mt.minicraft.TextParticle;

public class TestTextParticle implements TextParticle {

	@Override
	public String text() {
		return "hi";
	}

	@Override
	public Point location(int x, int y) {
		return new Point(x, y);
	}

	@Override
	public int color() {
		return get(-1, 0, 0, 0);
	}

	private int get(int a, int b, int c, int d) {
		return (get(d) << 24) + (get(c) << 16) + (get(b) << 8) + (get(a));
	}
	
	private int get(int d) {
		if (d < 0) return 255;
		int r = d / 100 % 10;
		int g = d / 10 % 10;
		int b = d % 10;
		return r * 36 + g * 6 + b;
	}

}
