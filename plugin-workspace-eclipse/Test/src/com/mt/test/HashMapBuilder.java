package com.mt.test;

import java.util.HashMap;

class HashMapBuilder<T, V> {
	private HashMap<T, V> internalMap;

	public HashMapBuilder(HashMap<T, V> internalMap) {
		this.internalMap = internalMap;
	}

	HashMapBuilder<T, V> put(T t, V v) {
		internalMap.put(t, v);
		return this;
	}
	
	HashMap<T, V> build() {
		return internalMap;
	}
}

