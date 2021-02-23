package com.logicommerce.sdk.definition.implementations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.logicommerce.sdk.definition.ConnectorDefinition;
import com.logicommerce.sdk.definition.MappedFieldDefinition;
import com.logicommerce.sdk.definition.PropertyDefinition;

public abstract class ConnectorDefinitionImpl implements ConnectorDefinition {

	private List<PropertyDefinition> properties;
	private boolean hasAdditionalProperties;
	private List<PropertyDefinition> additionalProperties;
	private List<MappedFieldDefinition> mappedFields;
	private Map<String, Object> additionalData;

	@Override
	public List<PropertyDefinition> getProperties() {
		return properties;
	}

	@Override
	public void addProperty(PropertyDefinition property) {
		if (properties == null) {
			properties = new ArrayList<>();
		}
		properties.add(property);
	}

	@Override
	public boolean hasAdditionalProperties() {
		return hasAdditionalProperties;
	}

	@Override
	public List<PropertyDefinition> getAdditionalProperties() {
		return additionalProperties;
	}

	@Override
	public void addAdditionalProperty(PropertyDefinition property) {
		if (additionalProperties == null) {
			additionalProperties = new ArrayList<>();
		}
		additionalProperties.add(property);
	}

	@Override
	public List<MappedFieldDefinition> getMappedFields() {
		return mappedFields;
	}

	@Override
	public Map<String, Object> getAdditionalData() {
		return additionalData;
	}
	
	public void setProperties(List<PropertyDefinition> properties) {
		this.properties = properties;
	}

	public void setHasAdditionalProperties(boolean hasAdditionalProperties) {
		this.hasAdditionalProperties = hasAdditionalProperties;
	}

	public void setAdditionalProperties(List<PropertyDefinition> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

	public void setMappedFields(List<MappedFieldDefinition> mappedFields) {
		this.mappedFields = mappedFields;
	}

	public void setAdditionalData(Map<String, Object> additionalData) {
		this.additionalData = additionalData;
	}

	protected abstract static class Builder<T, S extends ConnectorDefinition, R extends ConnectorDefinitionImpl> {

		private List<PropertyDefinitionImpl.Builder<T>> properties;
		private boolean hasAdditionalProperties;
		private List<PropertyDefinitionImpl.Builder<T>> additionalProperties;
		private List<MappedFieldDefinitionImpl.Builder<T>> mappedFields;
		private Map<String, Object> additionalData;
		
		protected Builder() {
			properties = new ArrayList<>();
			additionalProperties = new ArrayList<>();
			mappedFields = new ArrayList<>();
			additionalData = new HashMap<>();
		}
		
		public PropertyDefinitionImpl.Builder<T> property() {
			PropertyDefinitionImpl.Builder<T> property = new PropertyDefinitionImpl.Builder<>(returnThis());
			properties.add(property );
			return property;
		}
		
		public T hasAdditionalProperties(boolean hasAdditionalProperties) {
			this.hasAdditionalProperties = hasAdditionalProperties;
			return returnThis();
		}
		
		public PropertyDefinitionImpl.Builder<T> additionalProperty() {
			PropertyDefinitionImpl.Builder<T> additionalProperty = new PropertyDefinitionImpl.Builder<>(returnThis());
			additionalProperties.add(additionalProperty);
			return additionalProperty;
		}
		
		public MappedFieldDefinitionImpl.Builder<T> mappedField() {
			MappedFieldDefinitionImpl.Builder<T> mappedField = new MappedFieldDefinitionImpl.Builder<>(returnThis());
			mappedFields.add(mappedField);
			return mappedField;
		}
		
		public T addAdditionalData(String name, Object value) {
			additionalData.putIfAbsent(name, value);
			return returnThis();
		}
		
		protected abstract T returnThis();
		
		public abstract S build();
		
		protected void setAttributes(R connector) {
			connector.setAdditionalProperties(properties.stream().map(PropertyDefinitionImpl.Builder::build).collect(Collectors.toList()));
			connector.setHasAdditionalProperties(hasAdditionalProperties);
			connector.setAdditionalProperties(additionalProperties.stream().map(PropertyDefinitionImpl.Builder::build).collect(Collectors.toList()));
			connector.setMappedFields(mappedFields.stream().map(MappedFieldDefinitionImpl.Builder::build).collect(Collectors.toList()));
			connector.setAdditionalData(additionalData);
		}
		
	}

}
