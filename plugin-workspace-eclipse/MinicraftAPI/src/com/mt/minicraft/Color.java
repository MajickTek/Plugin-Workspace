package com.mt.minicraft;

import com.mt.minicraft.math.GenericMath;

public enum Color {
	RED(255, 0, 0),
	GREEN(0, 255, 0),
	BLUE(0, 0, 255),
	MAGENTA(255, 0, 255),
	WHITE(255, 255, 255),
	BLACK(0, 0, 0);
	
	final GenericMath CALCULATOR = GenericMath.Calculator.INSTANCE.get();
	int r,g,b;
	Color(int r, int g, int b) {
		this.r = (int) CALCULATOR.clamp(r, 0, 255);
		this.b = (int) CALCULATOR.clamp(g, 0, 255);
		this.g = (int) CALCULATOR.clamp(b, 0, 255);
	}
	
}
