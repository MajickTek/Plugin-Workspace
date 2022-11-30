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
	Number add(Number n1, Number n2) {
		assert Objects.nonNull(n1) && Objects.nonNull(n2) : "n1/n2 must NOT be null.";
		if ((n1 instanceof Double && n2 instanceof Double)) {
            return (Number) Double.valueOf((n1.doubleValue() + n2.doubleValue()));
        } else if ((n1 instanceof Float && n2 instanceof Float)) {
            return (Number) Float.valueOf(((n1.floatValue() + n2.floatValue())));
        } else if ((n1 instanceof Integer && n2 instanceof Integer)) {
            return (Number) Integer.valueOf(((n1.intValue() + n2.intValue())));
        }
		
		throw new IllegalArgumentException();
	}
	
	/**
	 * Subtracts two numbers
	 * @param n1
	 * @param n2
	 * @see #add(Number, Number)
	 * @return n1 - n2
	 * @throws IllegalArgumentException n1 and n2 are not one of {@code (Double, Float, Integer)}
	 */
	Number sub(Number n1, Number n2) {
		assert Objects.nonNull(n1) && Objects.nonNull(n2) : "n1/n2 must NOT be null.";
		if ((n1 instanceof Double && n2 instanceof Double)) {
            return (Number) Double.valueOf((n1.doubleValue() - n2.doubleValue()));
        } else if ((n1 instanceof Float && n2 instanceof Float)) {
            return (Number) Float.valueOf(((n1.floatValue() - n2.floatValue())));
        } else if ((n1 instanceof Integer && n2 instanceof Integer)) {
            return (Number) Integer.valueOf(((n1.intValue() - n2.intValue())));
        }
		
		throw new IllegalArgumentException();
	}
	
	/**
	 * Multiplies two numbers
	 * @param n1
	 * @param n2
	 * @see #add(Number, Number)
	 * @return n1 * n2
	 * @throws IllegalArgumentException n1 and n2 are not one of {@code (Double, Float, Integer)}
	 */
	Number mul(Number n1, Number n2) {
		assert Objects.nonNull(n1) && Objects.nonNull(n2) : "n1/n2 must NOT be null.";
		if ((n1 instanceof Double && n2 instanceof Double)) {
            return (Number) Double.valueOf((n1.doubleValue() * n2.doubleValue()));
        } else if ((n1 instanceof Float && n2 instanceof Float)) {
            return (Number) Float.valueOf(((n1.floatValue() * n2.floatValue())));
        } else if ((n1 instanceof Integer && n2 instanceof Integer)) {
            return (Number) Integer.valueOf(((n1.intValue() * n2.intValue())));
        }
		
		throw new IllegalArgumentException();
	}
	
	/**
	 * Divides two numbers.
	 * @param n1
	 * @param n2
	 * @see #add(Number, Number)
	 * @return n1 / n2
	 * @throws IllegalArgumentException n1 and n2 are not one of {@code (Double, Float, Integer)}
	 */
	Number div(Number n1, Number n2) {
		assert Objects.nonNull(n1) && Objects.nonNull(n2) : "n1/n2 must NOT be null.";
		if ((n1 instanceof Double && n2 instanceof Double)) {
            return (Number) Double.valueOf((n1.doubleValue() / n2.doubleValue()));
        } else if ((n1 instanceof Float && n2 instanceof Float)) {
            return (Number) Float.valueOf(((n1.floatValue() / n2.floatValue())));
        } else if ((n1 instanceof Integer && n2 instanceof Integer)) {
            return (Number) Integer.valueOf(((n1.intValue() / n2.intValue())));
        }
		
		throw new IllegalArgumentException();
	}
}
