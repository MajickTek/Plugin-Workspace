package com.mt.test;

import java.util.HashMap;

enum RegistryCreator {
	INSTANCE;

	<T> HashMapBuilder<String, T> get() {
		HashMap<String, T> map = new HashMap<>();
		return new HashMapBuilder<String, T>(map);
	}
}