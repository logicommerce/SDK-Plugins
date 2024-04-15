package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>PluginActionDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.3.4
 */
public interface PluginActionDefinition {
	
	/**
	 * <p>getCode.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getCode();	
	
	/**
	 * <p>getName.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.definition.DefinitionLanguages} object
	 */
	DefinitionLanguages getName();
	
	/**
	 * <p>getDescription.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.definition.DefinitionLanguages} object
	 */
	DefinitionLanguages getDescription();
	
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
	
	/**
	 * <p>getConnectorType.</p>
	 *
	 * @since 1.3.6
	 * @return a {@link com.logicommerce.sdk.enums.ConnectorType} object
	 */
	ConnectorType getConnectorType();

	/**
	 * <p>setConnectorType.</p>
	 *
	 * @since 1.3.6
	 * @param connectorType a {@link com.logicommerce.sdk.enums.ConnectorType} object
	 */
	void setConnectorType(ConnectorType connectorType);
}
