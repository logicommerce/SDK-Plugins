package com.logicommerce.sdk.definition;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.logicommerce.sdk.definition.implementations.MappedFieldDefinitionImpl;
import com.logicommerce.sdk.definition.implementations.MarketplaceDefinitionImpl;
import com.logicommerce.sdk.definition.implementations.MarketplaceDefinitionImpl.Builder;
import com.logicommerce.sdk.definition.implementations.PaymentSystemDefinitionImpl;
import com.logicommerce.sdk.definition.implementations.ShipperDefinitionImpl;
import com.logicommerce.sdk.enums.ConnectorType;
import com.logicommerce.sdk.enums.MappedItemType;

public class PluginDefinitionTest {

	@Test
	public void test() {
		PluginDefinition pluginDefinition = getPluginDefinition();
		try {
			pluginDefinition.addConnectorDefinition(new PaymentSystemDefinitionImpl.Builder().build());
			pluginDefinition.addConnectorDefinition(new ShipperDefinitionImpl.Builder().build());
			pluginDefinition.addConnectorDefinition(getMarketplaceBuilder().build());
		} catch (PluginDefinitionException e) {
			fail(e.getMessage());
		}

		MappedFieldDefinition mappedFieldDefinition = new MappedFieldDefinitionImpl.Builder<>()
			.addField("field1")
			.type(MappedItemType.USER)
			.build();

		pluginDefinition.getMappedFields().add(mappedFieldDefinition);

		ShipperDefinition shipperDefinition = new ShipperDefinitionImpl.Builder()
				.mappedField()
					.type(MappedItemType.USER)
					.addField("field2")
					.done()
				.build();
		assertThrows(PluginDefinitionException.class, () -> pluginDefinition.addConnectorDefinition(shipperDefinition));
		assertTrue(true);
	}

	private PluginDefinition getPluginDefinition() {
		return new PluginDefinition() {

			private List<PropertyDefinition> properties = new ArrayList<>();
			private List<PropertyDefinition> additionalProperties = new ArrayList<>();
			private List<ConnectorDefinition> connectorDefinitions = new ArrayList<>();
			private List<MappedFieldDefinition> mappedFields = new ArrayList<>();

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
				return mappedFields;
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

			@Override
			public void addMappedField(MappedFieldDefinition mappedField) {
				mappedFields.add(mappedField);
			}
		};
	}
	
	private Builder getMarketplaceBuilder() {
		Builder marketplace = new MarketplaceDefinitionImpl.Builder();
		marketplace.additionalProperty()
			.identifier("test")
			.required(false)
			.entryValueMode("select")
			.languages()
				.language("es", "test marketplace1")
				.language("en", "test marketplace2")
				.language("chi", "test marketplace3")		
				.done()
			.value()
				.languages()
					.language("es", "test1")
					.language("en", "test2")
					.language("chi", "test3")
				.done()
				.value("test")
			.done()
		.build();
		
		return marketplace; 
	}

}
