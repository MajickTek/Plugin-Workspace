package com.mt.minicraft.math;

public class Vec2 {
	public static final GenericMath CALCULATOR = GenericMath.Calculator.INSTANCE.get();
	
	public static final Vec2 ZERO = new Vec2(0, 0);
	
	public final Number x, y;
	
	private Vec2(Number x, Number y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Create a new vector object; can take any Number type
	 * @param x x coordinate
	 * @param y y coordinate
	 * @return a new Vec2 object
	 */
	public static Vec2 xy(Number x, Number y) {
		return new Vec2(x, y);
	}
	
	/**
	 * add two vectors together
	 * @param v vector to add to
	 * @return {@code xy(this.x + v.x, this.y + v.y);} <br>see {@link #xy(Number, Number)}
	 */
	public Vec2 add(Vec2 v) {
		return xy(CALCULATOR.add(x, v.x), CALCULATOR.add(y, v.y));
	}
	
	/**
	 * see {@link #add(Vec2)}.
	 * @param v vector to subtract from
	 * @return {@code xy(this.x - v.x, this.y - v.y);} <br>see {@link #xy(Number, Number)}
	 */
	public Vec2 sub(Vec2 v) {
		return xy(CALCULATOR.sub(x, v.x), CALCULATOR.sub(y, v.y));
	}
	
	/**
	 * see {@link #add(Vec2)}.
	 * @param v vector to multiply by
	 * @return {@code xy(this.x * v.x, this.y * v.y);} <br>see {@link #xy(Number, Number)}
	 */
	public Vec2 mul(Vec2 v) {
		return xy(CALCULATOR.mul(x, v.x), CALCULATOR.mul(y, v.y));
	}
	
	/**
	 * Multiplies this vector by a scale
	 * @param scale any valid number
	 * @return {@code xy(scale * this.x, scale * this.y);} <br>see {@link #xy(Number, Number)}
	 */
	public Vec2 mul(Number scale) {
		return xy(CALCULATOR.mul(scale, x), CALCULATOR.mul(scale, y));
	}
	
	/**
	 * Negate this vector.
	 * @return {@code mul(-1);}<br>see {@link #mul(Number)}
	 */
	public Vec2 neg() {
		return mul(-1);
	}
	
	/**
	 * see {@link #add(Vec2)}
	 * @param v vector to divide by
	 * @return {@code xy(this.x / v.x, this.y / v.y);}<br>see {@link #xy(Number, Number)}
	 */
	public Vec2 div(Vec2 v) {
		return xy(CALCULATOR.div(x, v.x), CALCULATOR.div(y, v.y));
	}
	
	/**
	 * Calculates the dot product of this vector and the parameter
	 * @param v second vector
	 * @return {@code (this.x * v.x) + (this.y * v.y))}
	 */
	public Number dot(Vec2 v) {
		return CALCULATOR.add(CALCULATOR.mul(x, v.x), CALCULATOR.mul(y, v.y));
	}
	
	/**
	 * @deprecated this method is not implemented currently.
	 * @param v second vector
	 * @throws UnsupportedOperationException always
	 * @return
	 */
	Vec2 cross(Vec2 v) {
		throw new UnsupportedOperationException("not implemented yet");
	}
	
	/**
	 * Creates a normalized version of this vector.
	 * @return {@code mul(1f / length());}<br>see {@link #mul(Number)}<br>see {@link #length()}
	 */
	public Vec2 normalized() {
		return mul(CALCULATOR.div(1f, length()));
	}
	
	/**
	 * Calculates the length of this vector by taking the square root the dot product.
	 * @return {@code Math.sqrt((double) dot(this));}<br>see {@link #dot(Vec2)}
	 */
	public Number length() {
		return (Number) Math.sqrt((double) dot(this));
	}

	@Override
	public String toString() {
		return "Vec2 [x=" + x + ", y=" + y + "]";
	}

	
}
