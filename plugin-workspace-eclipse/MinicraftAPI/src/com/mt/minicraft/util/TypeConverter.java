package com.mt.minicraft.util;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public interface TypeConverter<T, U> {
	T decode(U object);
	U encode(T object);
	
	default List<T> decodeList(Collection<U> collection) {
		return collection.stream().map(this::decode).collect(Collectors.toList());
	}
	
	default List<U> encodeList(Collection<T> collection) {
		return collection.stream().map(this::encode).collect(Collectors.toList());
	}
}
