package com.logicommerce.sdk;

import java.util.List;

/**
 * <p>LanguageMultivalue interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface LanguageMultivalue<T> extends LanguageValue<List<T>> {

	/**
	 * <p>addLanguageValue.</p>
	 *
	 * @param language a {@link java.lang.String} object
	 * @param value a T object
	 */
	void addLanguageValue(String language, T value);

}
