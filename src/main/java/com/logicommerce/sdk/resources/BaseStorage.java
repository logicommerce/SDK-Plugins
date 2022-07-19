package com.logicommerce.sdk.resources;

import java.util.Set;
import java.util.Map.Entry;

/**
 * <p>BaseStorage interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface BaseStorage<T> {

	/**
	 * <p>size.</p>
	 *
	 * @return a int
	 */
	int size();

	/**
	 * <p>isEmpty.</p>
	 *
	 * @return a boolean
	 */
	boolean isEmpty();

	/**
	 * <p>containsKey.</p>
	 *
	 * @param key a {@link java.lang.String} object
	 * @return a boolean
	 */
	boolean containsKey(String key);

	/**
	 * <p>get.</p>
	 *
	 * @param key a {@link java.lang.String} object
	 * @return a T object
	 */
	T get(String key);

	/**
	 * <p>put.</p>
	 *
	 * @param key a {@link java.lang.String} object
	 * @param value a T object
	 * @return a T object
	 */
	T put(String key, T value);

	/**
	 * <p>remove.</p>
	 *
	 * @param key a {@link java.lang.String} object
	 * @return a T object
	 */
	T remove(String key);

	/**
	 * <p>clear.</p>
	 */
	void clear();

	/**
	 * <p>entrySet.</p>
	 *
	 * @return a {@link java.util.Set} object
	 */
	Set<Entry<String, T>> entrySet();

}
