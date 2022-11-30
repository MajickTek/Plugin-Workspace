package com.mt.minicraft.math;

import java.util.Objects;

public class GenericMath {
	
	/**
	 * By utilizing the Number wrapper, it is possible to make a "generic" math class.
	 * <br>
	 * First an assertion is made that n1 and n2 are not null.
	 * <br>
	 * Then, the primitive values are taken and the result of the math is converted back from a primitive to Number
	 * @param n1 any number
	 * @param n2 must be the same primitive type as n1
	 * @return n1 + n2  unless the underlying types are not the same. Casting is avoided.
	 * @throws IllegalArgumentException n1 and n2 are not one of {@code (Double, Float, Integer)}
	 */
	public Number add(Number n1, Number n2) {
		assert Objects.nonNull(n1) && Objects.nonNull(n2) : "n1/n2 must NOT be null.";
		if ((n1 instanceof Double && n2 instanceof Double)) {
            return (Number) Double.valueOf((n1.doubleValue() + n2.doubleValue()));
        } else if ((n1 instanceof Float && n2 instanceof Float)) {
            return (Number) Float.valueOf(((n1.floatValue() + n2.floatValue())));
        } else if ((n1 instanceof Integer && n2 instanceof Integer)) {
            return (Number) Integer.valueOf(((n1.intValue() + n2.intValue())));
        }
		
		throw new IllegalArgumentException("n1 and n2 must be the same primitive type and a Double, Float, or Integer!");
	}
	
	/**
	 * Subtracts two numbers
	 * @param n1
	 * @param n2
	 * @see #add(Number, Number)
	 * @return n1 - n2
	 * @throws IllegalArgumentException n1 and n2 are not one of {@code (Double, Float, Integer)}
	 */
	public Number sub(Number n1, Number n2) {
		assert Objects.nonNull(n1) && Objects.nonNull(n2) : "n1/n2 must NOT be null.";
		if ((n1 instanceof Double && n2 instanceof Double)) {
            return (Number) Double.valueOf((n1.doubleValue() - n2.doubleValue()));
        } else if ((n1 instanceof Float && n2 instanceof Float)) {
            return (Number) Float.valueOf(((n1.floatValue() - n2.floatValue())));
        } else if ((n1 instanceof Integer && n2 instanceof Integer)) {
            return (Number) Integer.valueOf(((n1.intValue() - n2.intValue())));
        }
		
		throw new IllegalArgumentException("n1 and n2 must be the same primitive type and a Double, Float, or Integer!");
	}
	
	/**
	 * Multiplies two numbers
	 * @param n1
	 * @param n2
	 * @see #add(Number, Number)
	 * @return n1 * n2
	 * @throws IllegalArgumentException n1 and n2 are not one of {@code (Double, Float, Integer)}
	 */
	public Number mul(Number n1, Number n2) {
		assert Objects.nonNull(n1) && Objects.nonNull(n2) : "n1/n2 must NOT be null.";
		if ((n1 instanceof Double && n2 instanceof Double)) {
            return (Number) Double.valueOf((n1.doubleValue() * n2.doubleValue()));
        } else if ((n1 instanceof Float && n2 instanceof Float)) {
            return (Number) Float.valueOf(((n1.floatValue() * n2.floatValue())));
        } else if ((n1 instanceof Integer && n2 instanceof Integer)) {
            return (Number) Integer.valueOf(((n1.intValue() * n2.intValue())));
        }
		
		throw new IllegalArgumentException("n1 and n2 must be the same primitive type and a Double, Float, or Integer!");
	}
	
	/**
	 * Divides two numbers.
	 * @param n1
	 * @param n2
	 * @see #add(Number, Number)
	 * @return n1 / n2
	 * @throws IllegalArgumentException n1 and n2 are not one of {@code (Double, Float, Integer)}
	 */
	public Number div(Number n1, Number n2) {
		assert Objects.nonNull(n1) && Objects.nonNull(n2) : "n1/n2 must NOT be null.";
		if ((n1 instanceof Double && n2 instanceof Double)) {
            return (Number) Double.valueOf((n1.doubleValue() / n2.doubleValue()));
        } else if ((n1 instanceof Float && n2 instanceof Float)) {
            return (Number) Float.valueOf(((n1.floatValue() / n2.floatValue())));
        } else if ((n1 instanceof Integer && n2 instanceof Integer)) {
            return (Number) Integer.valueOf(((n1.intValue() / n2.intValue())));
        }
		
		throw new IllegalArgumentException("n1 and n2 must be the same primitive type and a Double, Float, or Integer!");
	}
	
	/**
	 * Constrains {@code number} within a range
	 * @param number the number to constrain
	 * @param min the number that {@code number} cannot go under
	 * @param max the number that {@code number} cannot go over
	 * @throws IllegalArgumentEception if number is not one of {@code (Double, Float, Integer)}
	 * @return {@code min} if {@code number} is smaller than {@code min}, {@code max} if {@code number} is larger than {@code max}, and {@code number} otherwise
	 */
	public Number clamp(Number number, Number min, Number max) {
		assert (Objects.nonNull(number) && Objects.nonNull(min) && Objects.nonNull(max)) : "Values must NOT be null.";
		
		if(number instanceof Double) {
			if(number.doubleValue() < min.doubleValue()) {return min;}
			if(number.doubleValue() > max.doubleValue()) {return max;}
			return number;
			
		} else if(number instanceof Float) {
			if(number.floatValue() < min.floatValue()) {return min;}
			if(number.floatValue() > max.floatValue()) {return max;}
			return number;
		} else if(number instanceof Integer) {
			if(number.intValue() < min.intValue()) {return min;}
			if(number.intValue() > max.intValue()) {return max;}
			return number;
		} else {
			throw new IllegalArgumentException("number must be one of (Double, Float, Integer)");
		}
	}
	
	/**
	 * This enum represents a singleton to get an instance of the GenericMath class.
	 * <br>
	 * Usage: {@code GenericMath math = GenericMath.Calculator.INSTANCE.get()}
	 */
	public static enum Calculator {
		INSTANCE;
		GenericMath math;
		Calculator() {
			math = new GenericMath();
		}
		
		public GenericMath get() {
			return math;
		}
	}
}
