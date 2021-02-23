package com.logicommerce.sdk.definition;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.logicommerce.sdk.definition.implementations.PaymentSystemDefinitionImpl;
import com.logicommerce.sdk.definition.implementations.ShipperDefinitionImpl;
import com.logicommerce.sdk.enums.ConnectorType;

public class PluginDefinitionTest {

	@Test
	public void test() {
		PluginDefinition pluginDefinition = getPluginDefinition();
		try {
			pluginDefinition.addConnectorDefinition(new PaymentSystemDefinitionImpl.Builder().build());
			pluginDefinition.addConnectorDefinition(new ShipperDefinitionImpl.Builder().build());
		} catch (PluginDefinitionException e) {
			fail(e.getMessage());
		}
		assertTrue(true);
	}

	private PluginDefinition getPluginDefinition() {
		return new PluginDefinition() {

			private List<PropertyDefinition> properties = new ArrayList<>();
			private List<PropertyDefinition> additionalProperties = new ArrayList<>();
			private List<ConnectorDefinition> connectorDefinitions = new ArrayList<>();

			@Override
			public boolean hasAdditionalProperties() {
				return false;
			}

			@Override
			public List<PropertyDefinition> getProperties() {
				return properties;
			}

			@Override
			public List<MappedFieldDefinition> getMappedFields() {
				return new ArrayList<>();
			}

			@Override
			public List<PropertyDefinition> getAdditionalProperties() {
				return additionalProperties;
			}

			@Override
			public void addProperty(PropertyDefinition property) {
				properties.add(property);
			}

			@Override
			public void addAdditionalProperty(PropertyDefinition property) {
				additionalProperties.add(property);
			}

			@Override
			public String getVersion() {
				return null;
			}

			@Override
			public String getName() {
				return null;
			}

			@Override
			public String getDescription() {
				return null;
			}

			@Override
			public List<ConnectorDefinition> getConnectorDefinitions() {
				return connectorDefinitions;
			}

			@SuppressWarnings("unchecked")
			@Override
			public <T extends ConnectorDefinition> T getConnectorDefinition(ConnectorType connectorType) {
				for (ConnectorDefinition connectorDefinition : connectorDefinitions) {
					if (connectorDefinition.getType().equals(connectorType)) {
						return (T) connectorDefinition;
					}
				}
				return null;
			}

			@Override
			public String getAuthor() {
				return null;
			}

			@Override
			public <T extends ConnectorDefinition> void addConnectorDefinition(T connectorDefinition) throws PluginDefinitionException {
				if (getConnectorDefinition(connectorDefinition.getType()) != null) {
					throw new PluginDefinitionException(getClass(), "Connector is already defined");
				}
				getConnectorDefinitions().add(connectorDefinition);
			}
		};
	}

}
