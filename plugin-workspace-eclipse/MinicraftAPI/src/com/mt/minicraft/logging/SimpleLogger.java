package com.mt.minicraft.logging;

import java.util.logging.Level;
import java.util.logging.Logger;
public class SimpleLogger implements ILog{
	private static final Logger LOGGER = Logger.getGlobal();
	
	boolean debug = false;
	
	@Override
	public void debug(String s) {
		if(debug) {
			LOGGER.log(Level.INFO, s);
		}
	}

	@Override
	public void info(String s) {
		LOGGER.log(Level.INFO, s);
	}

	@Override
	public void error(String s) {
		LOGGER.log(Level.SEVERE, s);
	}

	@Override
	public void warning(String s) {
		LOGGER.log(Level.WARNING, s);
	}
	
	
}
