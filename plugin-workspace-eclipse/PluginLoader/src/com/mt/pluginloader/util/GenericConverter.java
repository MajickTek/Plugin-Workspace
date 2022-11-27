package com.mt.pluginloader.util;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public interface GenericConverter<T, U> {
	T createFromU(U other);
	U createFromT(T other);
	
	//E updateEntity(E entity, D dto);
	
	default List<T> createFromUs(Collection<U> collection) {
		return collection.stream().map(this::createFromU).collect(Collectors.toList());
		
	}
	
	default List<U> createFromTs(Collection<T> collection) {
		return collection.stream().map(this::createFromT).collect(Collectors.toList());
		
	}
}
