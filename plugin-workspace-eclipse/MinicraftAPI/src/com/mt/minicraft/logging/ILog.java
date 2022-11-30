package com.mt.minicraft.logging;

public interface ILog {
	default void debug(String s) {
		System.out.println(s);
	}
	default void info(String s) {
		System.out.println(s);
	}
	default void error(String s) {
		System.out.println(s);
	}
	default void warning(String s) {info(s);};
}
