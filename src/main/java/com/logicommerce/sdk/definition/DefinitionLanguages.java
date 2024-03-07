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
	 * @deprecated use {@link #getValues()} instead
	 * @return a {@link java.util.Map} object
	 */
	@Deprecated(forRemoval = true, since = "1.3.4")
	Map<String, String> getNames();

	/**
	 * <p>getNames.</p>
	 *
	 * @return a {@link java.util.Map} object
	 */
	Map<String, String> getValues();
	
	/**
	 * <p>getName.</p>
	 *
	 * @param language a {@link java.lang.String} object
	 * @deprecated use {@link #getValue(String language)} instead
	 * @return a {@link java.util.List} object
	 */
	@Deprecated(forRemoval = true, since = "1.3.4")
	String getName(String language);
	
	/**
	 * <p>getValue.</p>
	 *
	 * @param language a {@link java.lang.String} object
	 * @return a {@link java.lang.String} object
	 */
	String getValue(String language);

}
