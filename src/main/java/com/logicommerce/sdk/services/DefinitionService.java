package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.definition.ConnectorDefinition;
import com.logicommerce.sdk.definition.PluginDefinition;
import com.logicommerce.sdk.enums.ConnectorType;

public interface DefinitionService extends PluginService {
	
	PluginDefinition getPluginDefinition() throws PluginServiceException;
	
	ConnectorDefinition getConnectorDefinition(ConnectorType connectorType) throws PluginServiceException;

	List<ConnectorDefinition> getConnectorDefinitions() throws PluginServiceException;

}
