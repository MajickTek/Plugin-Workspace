package com.mt.minicraft.io;

import java.io.File;
import java.net.URISyntaxException;

public class InternalFileHandler {
	
	Class<?> clazz;
	
	public InternalFileHandler(Class<?> clazz) {
		this.clazz = clazz;
	}
	
	File getInternalFile(String path) throws URISyntaxException {
		return new File(clazz.getResource(path).toURI());
	}
}
