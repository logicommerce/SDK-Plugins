package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.definition.ConnectorDefinition;
import com.logicommerce.sdk.definition.PluginDefinition;
import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>DefinitionService interface. To implement service of configuration properties.<br>
 * These properties are the ones that can be filled from the administrator of each store.</p>
 * <pre>
 * There are two types of configuration properties:
 * 	- the <strong>static</strong> ones defined in the JSON config file.
 * 	- The <strong>dynamic</strong> ones implemented through this interface.
 * </pre>
 * <pre>
 * There are two types of definitions:
 * 	- the <strong>plugin definition</strong>, this is for a plugin settings properties.
 * 	- The <strong>connector definition</strong>, this is for a connector plugin settings properties.
 * </pre>
 *
 * @see com.logicommerce.sdk.definition.PluginDefinition PluginDefinition
 * @see com.logicommerce.sdk.definition.ConnectorDefinition ConnectorDefinition
 * @see com.logicommerce.sdk.enums.ConnectorType ConnectorType
 * @author Logicommerce
 * @since 1.0.16
 */
public interface DefinitionService extends PluginService {

	/**
	 * <p>Get plugin definition data. This method return plugin properties settings defined in the JSON config file and
	 * defined in this method.</p>
	 *
	 * @see com.logicommerce.sdk.definition.PluginDefinition PluginDefinition
	 * @return a {@link com.logicommerce.sdk.definition.PluginDefinition PluginDefinition} object
	 * @since 1.0.16
	 * @throws com.logicommerce.sdk.services.PluginServiceException PluginServiceException if any.
	 */
	PluginDefinition getPluginDefinition() throws PluginServiceException;

	/**
	 * <p>Get connector definition property by a connector type. This method return plugin connector properties
	 * settings defined in the json file and defined in this method.</p>
	 *
	 * @see com.logicommerce.sdk.enums.ConnectorType ConnectorType
	 * @param connectorType a {@link com.logicommerce.sdk.enums.ConnectorType ConnectorType} object
	 * @return a {@link com.logicommerce.sdk.definition.ConnectorDefinition ConnectorDefinition} object
	 * @since 1.0.16
	 * @throws com.logicommerce.sdk.services.PluginServiceException PluginServiceException if any.
	 */
	ConnectorDefinition getConnectorDefinition(ConnectorType connectorType) throws PluginServiceException;

	/**
	 * <p>Get all connector definitions properties.</p>
	 *
	 * @see com.logicommerce.sdk.definition.ConnectorDefinition ConnectorDefinition
	 * @return a {@link java.util.List List}<{@link com.logicommerce.sdk.definition.ConnectorDefinition ConnectorDefinition}> object
	 * @since 1.0.16
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	List<ConnectorDefinition> getConnectorDefinitions() throws PluginServiceException;

}
