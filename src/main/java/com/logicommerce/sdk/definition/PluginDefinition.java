package com.logicommerce.sdk.definition;

import java.util.List;
import com.logicommerce.sdk.enums.ConnectorType;

public interface PluginDefinition extends ConfigDefinition {

	String getName();

	String getDescription();

	String getAuthor();

	String getVersion();

	List<ConnectorDefinition> getConnectorDefinitions();

	<T extends ConnectorDefinition> T getConnectorDefinition(ConnectorType connectorType);

}
