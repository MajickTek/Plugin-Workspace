package com.mt.minicraft.logging;

public interface Log {
	void debug(String s);
	void info(String s);
	void error(String s);
	default void warning(String s) {info(s);};
}
