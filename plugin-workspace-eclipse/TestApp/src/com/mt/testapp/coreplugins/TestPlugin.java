package com.mt.testapp.coreplugins;

import java.lang.reflect.Method;

import com.mt.testapp.api.TestAPI;

public class TestPlugin implements TestAPI{

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
