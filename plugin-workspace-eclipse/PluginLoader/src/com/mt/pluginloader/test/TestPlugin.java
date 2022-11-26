package com.mt.pluginloader.test;

import java.lang.reflect.Method;

public class TestPlugin implements TestPluginAPI {
	@Override
	public void test() {
		System.out.println("====test====");
		System.out.println("Showing all defined methods in " + this.getClass().getSimpleName());
		for(Method m: this.getClass().getDeclaredMethods()) {
			System.out.println(String.format("%s", m.toGenericString()));
		}
		System.out.println("========");
	}
}
