package com.logicommerce.sdk;

/**
 * <p>LanguageValue interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface LanguageValue<T> {

	/**
	 * <p>getValue.</p>
	 *
	 * @param language a {@link java.lang.String} object
	 * @return a T object
	 */
	T getValue(String language);

	/**
	 * <p>setValue.</p>
	 *
	 * @param language a {@link java.lang.String} object
	 * @param value a T object
	 */
	void setValue(String language, T value);

}
