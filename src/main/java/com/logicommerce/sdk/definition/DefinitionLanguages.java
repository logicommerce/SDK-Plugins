package com.logicommerce.sdk.definition;

import java.util.Map;

/**
 * <p>DefinitionLanguages interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface DefinitionLanguages {

	/**
	 * <p>getNames.</p>
	 *
	 * @return a {@link java.util.Map} object
	 */
	Map<String, String> getNames();

	/**
	 * <p>getName.</p>
	 *
	 * @param language a {@link java.lang.String} object
	 * @return a {@link java.lang.String} object
	 */
	String getName(String language);

}
