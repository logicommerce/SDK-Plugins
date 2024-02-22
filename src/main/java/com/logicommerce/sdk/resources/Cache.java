package com.logicommerce.sdk.resources;

/**
 * Cache Resource
 *
 * @author Logicommerce
 * @since 1.1.7
 */
public interface Cache {

	/**
	 * Get cached value
	 *
	 * @param key Cache key
	 * @return String
	 */
	String get(String key);

	/**
	 * Put value to cache
	 * @param key Cache key
	 * @param value Cache value object
	 */
	void put(String key, String value);

	/**
	 * Remove value from cache
	 * @param key Cache key
	 * @since 1.3.2
	 */
	void remove(String key);

	/**
	 * Purge cache
	 */
	void purge();

}
