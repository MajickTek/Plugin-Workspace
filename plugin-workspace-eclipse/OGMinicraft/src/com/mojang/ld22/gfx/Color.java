package com.mojang.ld22.gfx;

public class Color {

	/**
	 * Every argument is for one of the grayscales. 
	 * <br> -1 means transparent.
	 * <br> any other numbers represent rgb. The first digit is red, the second digit is green, and the third is blue.
	 * <br> Each digit must be between 0 and 5 
	 * @param a black
	 * @param b dark grey
	 * @param c light grey
	 * @param d white
	 * @return
	 */
	public static int get(int a, int b, int c, int d) {
		return (get(d) << 24) + (get(c) << 16) + (get(b) << 8) + (get(a));
	}

	public static int get(int d) {
		if (d < 0) return 255;
		int r = d / 100 % 10;
		int g = d / 10 % 10;
		int b = d % 10;
		return r * 36 + g * 6 + b;
	}

}