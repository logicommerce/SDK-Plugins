package com.logicommerce.sdk.resources;

import java.util.Set;
import java.util.Map.Entry;

public interface BaseStorage<T> {

	int size();

	boolean isEmpty();

	boolean containsKey(String key);

	T get(String key);

	T put(String key, T value);

	T remove(String key);

	void clear();

	Set<Entry<String, T>> entrySet();

}
