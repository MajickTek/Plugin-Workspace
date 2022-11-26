package com.mt.minicraft;

import java.awt.Point;

public interface TextParticle {
	String text();
	Point location(int x, int y);
	int color();
}
