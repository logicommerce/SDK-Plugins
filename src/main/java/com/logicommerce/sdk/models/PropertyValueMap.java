package com.logicommerce.sdk.models;

import java.util.Set;

/**
 * PropertyValueMap interface.
 * 
 * <p>It is used for validate property values from the LogiCommerce</p>
 * @author LogiCommerce
 * @since 1.1.16
 */
public interface PropertyValueMap {

	/**
	 * Get property value with its type.
	 * 
	 * @param <T> the generic type
	 * @param key a {@link java.lang.String String} object
	 * @param type a {@link java.lang.Class Class}&lt;T&gt; object
	 * @return the property value as T
	 */
	<T> T get(String key, Class<T> type);

	/**
	 * Get raw property value.
	 * 
	 * @param key a {@link java.lang.String String} object
	 * @return the property value as Object
	 */
	Object getRaw(String key);

	/**
	 * Check if the property value exists.
	 * 
	 * @param key a {@link java.lang.String String} object
	 * @return true, if successful
	 */
	boolean containsKey(String key);

	/**
	 * Check if the property value is empty.
	 * 
	 * @return true, if successful
	 */
	boolean isEmpty();

	/**
	 * Get all property keys.
	 * 
	 * @return a Set of property keys
	 */
	Set<String> keySet();

}
