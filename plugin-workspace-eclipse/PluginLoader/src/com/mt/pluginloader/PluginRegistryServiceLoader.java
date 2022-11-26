package com.mt.pluginloader;

import java.io.File;
import java.io.FilenameFilter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ServiceLoader;


public class PluginRegistryServiceLoader implements PluginRegistry {

	public static final String PLUGIN_LOOKUP_PATH_PROPERTY_NAME = "com.mt.pluginloader.lookupPath";
	public static final String PLUGIN_FILE_EXTENSION_PROPERTY_NAME="com.mt.pluginloader.fileExtension";
	public static final String PLUGIN_LOOKUP_PATH_DEFAULT="./plugins/";
	public static final String PLUGIN_FILE_EXTENSION_DEFAULT=".jar";
	
	
	@Override
	public <TPlugin extends Plugin> HashMap<String, TPlugin> getPlugins(Class<TPlugin> pluginClass) {
		ServiceLoader<TPlugin> pluginLoader = ServiceLoader.load(pluginClass, createPluginClassLoader(lookupPluginURLs()));
		HashMap<String, TPlugin> plugins = new HashMap<>();
		pluginLoader.forEach(plugin -> {
			System.out.println(String.format("Found plugin of type %s at: %s", pluginClass.getName(), plugin.getClass().getProtectionDomain().getCodeSource().getLocation()));
			plugins.put(plugin.getClass().getSimpleName(), plugin);
		});
		
		if(plugins.isEmpty()) {
			System.out.println(String.format("No implementations of type %s found", pluginClass.getName()));
		}
		
		return plugins;
	}
	
	private ClassLoader createPluginClassLoader(List<URL> pluginJars) {
		return new URLClassLoader(pluginJars.toArray(new URL[pluginJars.size()]));
	}

	private List<URL> lookupPluginURLs() {
		File pluginFolder = new File(getPluginLookupPath());
		System.out.println(String.format("Plugin folder: %s", pluginFolder.getAbsolutePath()));
		List<URL> pluginURLList = new ArrayList<>();
		File[] pluginJars = pluginFolder.listFiles(getPluginJarFilter());
		if(pluginJars == null || pluginJars.length == 0) {
			System.out.println("No plugin jars found");
		} else {
			System.out.println(String.format("Found %s plugin package(s)", pluginJars.length));
			for (File extensionJar: pluginJars) {
				try {
					URL pluginJarURL = extensionJar.toURI().toURL();
					pluginURLList.add(pluginJarURL);
					System.out.println(String.format("Added plugin package: %s", pluginJarURL));
				} catch (MalformedURLException ex) {
					ex.printStackTrace();
				}
			}
		}
		return pluginURLList;
	}

	private FilenameFilter getPluginJarFilter() {
		return (File dir, String name) -> name.endsWith(getPluginFileExtension());
	}

	private String getPluginFileExtension() {
		return System.getProperty(PLUGIN_FILE_EXTENSION_PROPERTY_NAME, PLUGIN_FILE_EXTENSION_DEFAULT);
	}

	private String getPluginLookupPath() {
		return System.getProperty(PLUGIN_LOOKUP_PATH_PROPERTY_NAME, PLUGIN_LOOKUP_PATH_DEFAULT);
	}

}
