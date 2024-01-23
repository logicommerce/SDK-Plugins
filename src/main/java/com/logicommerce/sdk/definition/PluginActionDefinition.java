package com.logicommerce.sdk.definition;

/**
 * <p>MappedFieldDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface PluginActionDefinition {

	/**
	 * <p>getType.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.MappedItemType} object
	 */
	//MappedItemType getType();
	
	/**
	 * <p>getCode.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getCode();
	
	
	/**
	 * <p>getLanguages.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.definition.DefinitionLanguages} object
	 */
	DefinitionLanguages getLanguages();

}
