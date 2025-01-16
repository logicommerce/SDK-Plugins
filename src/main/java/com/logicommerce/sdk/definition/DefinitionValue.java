package com.logicommerce.sdk.definition;

/**
 * <p>MappedFieldDefinitionValue interface.</p>
 *
 * @author Logicommerce
 * @since 2.3.0
 */
public interface DefinitionValue {

	/**
	 * <p>getValue.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getValue();

	/**
	 * <p>getLanguages.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.definition.DefinitionLanguages} object
	 */
	DefinitionLanguages getLanguages();

}
