package com.mt.minicraft.math;

import java.util.Objects;

public class GenericMath {
	
	Number add(Number n1, Number n2) {
		assert Objects.nonNull(n1) && Objects.nonNull(n2) : "n1/n2 must NOT be null.";
		if (n1 instanceof Double) {
            return (Number) Double.valueOf((n1.doubleValue() + n2.doubleValue()));
        } else if (n1 instanceof Float) {
            return (Number) Float.valueOf(((n1.floatValue() + n2.floatValue())));
        } else if (n1 instanceof Integer) {
            return (Number) Integer.valueOf(((n1.intValue() + n2.intValue())));
        }
		
		throw new IllegalArgumentException();
	}
	
	Number sub(Number n1, Number n2) {
		assert Objects.nonNull(n1) && Objects.nonNull(n2) : "n1/n2 must NOT be null.";
		if (n1 instanceof Double) {
            return (Number) Double.valueOf((n1.doubleValue() - n2.doubleValue()));
        } else if (n1 instanceof Float) {
            return (Number) Float.valueOf(((n1.floatValue() - n2.floatValue())));
        } else if (n1 instanceof Integer) {
            return (Number) Integer.valueOf(((n1.intValue() - n2.intValue())));
        }
		
		throw new IllegalArgumentException();
	}
	
	Number mul(Number n1, Number n2) {
		assert Objects.nonNull(n1) && Objects.nonNull(n2) : "n1/n2 must NOT be null.";
		if (n1 instanceof Double) {
            return (Number) Double.valueOf((n1.doubleValue() * n2.doubleValue()));
        } else if (n1 instanceof Float) {
            return (Number) Float.valueOf(((n1.floatValue() * n2.floatValue())));
        } else if (n1 instanceof Integer) {
            return (Number) Integer.valueOf(((n1.intValue() * n2.intValue())));
        }
		
		throw new IllegalArgumentException();
	}
	
	Number div(Number n1, Number n2) {
		assert Objects.nonNull(n1) && Objects.nonNull(n2) : "n1/n2 must NOT be null.";
		if (n1 instanceof Double) {
            return (Number) Double.valueOf((n1.doubleValue() / n2.doubleValue()));
        } else if (n1 instanceof Float) {
            return (Number) Float.valueOf(((n1.floatValue() / n2.floatValue())));
        } else if (n1 instanceof Integer) {
            return (Number) Integer.valueOf(((n1.intValue() / n2.intValue())));
        }
		
		throw new IllegalArgumentException();
	}
}
