package com.logicommerce.sdk.definition;

import java.util.List;
import com.logicommerce.sdk.enums.ConnectorType;

/**
 * PluginDefinition interface. To implement a plugin definition data and properties.<br>
 * Extends {@link com.logicommerce.sdk.definition.ConfigDefinition ConfigDefinition} interface.
 *
 * @see com.logicommerce.sdk.definition.ConfigDefinition ConfigDefinition
 * @author Logicommerce
 * @since 1.0.16
 */
public interface PluginDefinition extends ConfigDefinition {

	/**
	 * Get name of the plugin.
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getName();

	/**
	 * Get description of the plugin.
	 *
	 * @since 1.0.16
	 * @deprecated since 2.1.0 use {@link #getPluginDescription()} instead
	 * @return a {@link java.lang.String String} object
	 */
	@Deprecated(since = "2.1.0", forRemoval = true)
	String getDescription();

	/**
	 * Get description in multiple languages
	 * 
	 * @since 2.1.0
	 * @return DefinitionLanguages
	 */
	DefinitionLanguages getPluginDescription();

	/**
	 * Get author of the plugin.
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getAuthor();

	/**
	 * Get version of the plugin.
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getVersion();
	
	/**
	 * Get true if the plugin is multiple account.
	 *
	 * @since 1.2.1
	 * @return a {@link java.lang.String String} object
	 */
	boolean getMultipleAccount();
	
	/**
	 * Get true if the plugin active User/groups filter.
	 *
	 * @since 1.2.2
	 * @return a {@link java.lang.String String} object
	 */
	boolean getUserGroupsFilter();

	/**
	 * Get true if the plugin active Country/zones filter.
	 *
	 * @since 1.2.2
	 * @return a {@link java.lang.String String} object
	 */
	boolean getCountryZonesFilter();

	/**
	 * Get all connector definitions of the plugin.
	 *
	 * @since 1.0.16
	 * @return a {@link java.util.List List}&lt;{@link com.logicommerce.sdk.definition.ConnectorDefinition ConnectorDefinition}&gt; object
	 */
	List<ConnectorDefinition> getConnectorDefinitions();

	/**
	 * Add connector definition.
	 *
	 * @see com.logicommerce.sdk.definition.ConnectorDefinition ConnectorDefinition
	 * @param connectorDefinition a T object
	 * @param <T> a T class
	 * @since 1.0.16
	 * @throws com.logicommerce.sdk.definition.PluginDefinitionException if any.
	 */
	<T extends ConnectorDefinition> void addConnectorDefinition(T connectorDefinition) throws PluginDefinitionException;

	/**
	 * Get connector definition by connectorType.
	 *
	 * @see com.logicommerce.sdk.enums.ConnectorType ConnectorType
	 * @param connectorType a {@link com.logicommerce.sdk.enums.ConnectorType} object
	 * @param <T> a T class
	 * @since 1.0.16
	 * @return a T object
	 */
	<T extends ConnectorDefinition> T getConnectorDefinition(ConnectorType connectorType);

}
