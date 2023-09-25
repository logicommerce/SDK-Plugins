package com.logicommerce.sdk.definition;

import java.util.List;
import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>PluginDefinition interface. To implement a plugin definition data and properties.<br>
 * Extends {@link com.logicommerce.sdk.definition.ConfigDefinition ConfigDefinition}</p>
 *
 * @see com.logicommerce.sdk.definition.ConfigDefinition ConfigDefinition
 * @author Logicommerce
 * @since 1.0.16
 */
public interface PluginDefinition extends ConfigDefinition {

	/**
	 * <p>Get name of the plugin.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getName();

	/**
	 * <p>Get description of the plugin.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getDescription();

	/**
	 * <p>Get author of the plugin.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getAuthor();

	/**
	 * <p>Get version of the plugin.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getVersion();
	
	/**
	 * <p>Get true if the plugin is multiple account.</p>
	 *
	 * @since 1.2.1
	 * @return a {@link java.lang.String String} object
	 */
	boolean getMultipleAccount();
	
	/**
	 * <p>Get true if the plugin active User/groups filter.</p>
	 *
	 * @since 1.2.2
	 * @return a {@link java.lang.String String} object
	 */
	boolean getUserGroupsFilter();

	/**
	 * <p>Get true if the plugin active Country/zones filter.</p>
	 *
	 * @since 1.2.2
	 * @return a {@link java.lang.String String} object
	 */
	boolean getCountryZonesFilter();

	/**
	 * <p>Get all connector definitions of the plugin.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.util.List List}&lt;{@link com.logicommerce.sdk.definition.ConnectorDefinition ConnectorDefinition}&gt; object
	 */
	List<ConnectorDefinition> getConnectorDefinitions();

	/**
	 * <p>Add connector definition.</p>
	 *
	 * @see com.logicommerce.sdk.definition.ConnectorDefinition ConnectorDefinition
	 * @param connectorDefinition a T object
	 * @param <T> a T class
	 * @since 1.0.16
	 * @throws com.logicommerce.sdk.definition.PluginDefinitionException if any.
	 */
	<T extends ConnectorDefinition> void addConnectorDefinition(T connectorDefinition) throws PluginDefinitionException;

	/**
	 * <p>Get connector definition by connectorType.</p>
	 *
	 * @see com.logicommerce.sdk.enums.ConnectorType ConnectorType
	 * @param connectorType a {@link com.logicommerce.sdk.enums.ConnectorType} object
	 * @param <T> a T class
	 * @since 1.0.16
	 * @return a T object
	 */
	<T extends ConnectorDefinition> T getConnectorDefinition(ConnectorType connectorType);

}
