package com.mt.pluginloader.util.io;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class InternalFileHandler {
	
	Class<?> clazz;
	
	public InternalFileHandler(Class<?> clazz) {
		this.clazz = clazz;
	}
	
	public File getInternalFile(String path) throws URISyntaxException {
		return new File(clazz.getResource(path).toURI());
	}
	
	public ArrayList<File> getFiles(int depth) throws URISyntaxException, IOException {
		assert depth > 0 : "depth must be larger than zero";
		URL root = clazz.getResource("/");
		Path path = Paths.get(root.toURI());
		ArrayList<File> list = new ArrayList<>();
		Files.walk(path, depth).forEach(p -> {
			list.add(p.toFile());
		});
		
		return list;
	}
}
