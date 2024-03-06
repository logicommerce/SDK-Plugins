package com.logicommerce.sdk.definition;

/**
 * <p>PluginActionDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.3.3
 */
public interface PluginActionDefinition {
	
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
	
	/**
	 * <p>isActive.</p>
	 *
	 * @return a boolean
	 */
	boolean isActive();
	
	/**
	 * <p>setActive.</p>
	 *
	 * @param active a boolean
	 */
	void setActive(boolean active);

}
