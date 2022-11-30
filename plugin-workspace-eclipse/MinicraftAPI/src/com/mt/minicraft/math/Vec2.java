package com.mt.minicraft.math;

import java.util.Objects;
import java.util.Scanner;

public class Vec2 {
	public final static Vec2 ZERO = new Vec2(0, 0);
    public final int x, y;

    Vec2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Create
     */
    public static Vec2 xyz(int x, int y) {
        return new Vec2(x, y);
    }

    /**
     * Add
     */
    public Vec2 add(Vec2 v) {
        return xyz(x + v.x, y + v.y);
    }

    /**
     * Add
     */
    public Vec2 add(int x, int y) {
        return xyz(this.x + x, this.y + y);
    }

    /**
     * Subtract
     */
    public Vec2 sub(Vec2 v) {
        return xyz(x - v.x, y - v.y);
    }

    /**
     * Multiply with integer (scale)
     */
    public Vec2 mul(int s) {
        return xyz(s * x, s * y);
    }

    /**
     * Negate (multiply with -1)
     */
    public Vec2 neg() {
        return xyz(-x, -y);
    }

    /**
     * Scalar product
     */
    public int dot(Vec2 v) {
        return x * v.x + y * v.y;
    }

    @Override
    public int hashCode() {
    	
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Vec2)) {
            return false;
        }
        return hashCode() == ((Vec2) obj).hashCode();
    }

    @Override
    public final String toString() {
        return x + "," + y + ",";
    }

    static Vec2 decode(String encoded) {
        Scanner s = new Scanner(encoded).useDelimiter("\\,");
        return xyz(s.nextInt(), s.nextInt());
    }

    /**
     * A Vec2tor with length=1
     */
    public static class Unit extends Vec2 {

        public final static Unit X = new Unit(1, 0);
        public final static Unit Y = new Unit(0, 1);

        Unit(int x, int y) {
            super(x, y);
        }

        @Override
        public Unit neg() {
            return new Unit(-x, -y);
        }
    }
}
