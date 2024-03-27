package com.logicommerce.sdk.definition.implementations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.logicommerce.sdk.definition.ConnectorDefinition;
import com.logicommerce.sdk.definition.MappedFieldDefinition;
import com.logicommerce.sdk.definition.PluginActionDefinition;
import com.logicommerce.sdk.definition.PropertyDefinition;

/**
 * <p>Abstract ConnectorDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public abstract class ConnectorDefinitionImpl implements ConnectorDefinition {

	private List<PropertyDefinition> properties;
	private boolean hasAdditionalProperties;
	private List<PropertyDefinition> additionalProperties;
	private List<MappedFieldDefinition> mappedFields;
	private List<PluginActionDefinition> pluginActions;
	private Map<String, Object> additionalData;

	/** {@inheritDoc} */
	@Override
	public List<PropertyDefinition> getProperties() {
		if (properties == null) {
			properties = new ArrayList<>();
		}
		return properties;
	}

	/** {@inheritDoc} */
	@Override
	public void addProperty(PropertyDefinition property) {
		getProperties().add(property);
	}

	/** {@inheritDoc} */
	@Override
	public boolean hasAdditionalProperties() {
		return hasAdditionalProperties;
	}

	/** {@inheritDoc} */
	@Override
	public List<PropertyDefinition> getAdditionalProperties() {
		if (additionalProperties == null) {
			additionalProperties = new ArrayList<>();
		}
		return additionalProperties;
	}

	/** {@inheritDoc} */
	@Override
	public void addAdditionalProperty(PropertyDefinition property) {
		getAdditionalProperties().add(property);
	}

	/** {@inheritDoc} */
	@Override
	public List<MappedFieldDefinition> getMappedFields() {
		if (mappedFields == null) {
			mappedFields = new ArrayList<>();
		}
		return mappedFields;
	}

	/** {@inheritDoc} */
	@Override
	public void addMappedField(MappedFieldDefinition mappedField) {
		getMappedFields().add(mappedField);
	}

	/** {@inheritDoc} */
	@Override
	public List<PluginActionDefinition> getPluginActions() {
		if (pluginActions == null) {
			pluginActions = new ArrayList<>();
		}
		return pluginActions;
	}

	/** {@inheritDoc} */
	@Override
	public void addPluginAction(PluginActionDefinition pluginActions) {
		getPluginActions().add(pluginActions);
	}

	/** {@inheritDoc} */
	@Override
	public Map<String, Object> getAdditionalData() {
		return additionalData;
	}
	
	/**
	 * <p>Setter for the field <code>properties</code>.</p>
	 *
	 * @param properties a {@link java.util.List} object
	 */
	public void setProperties(List<PropertyDefinition> properties) {
		this.properties = properties;
	}

	/**
	 * <p>Setter for the field <code>hasAdditionalProperties</code>.</p>
	 *
	 * @param hasAdditionalProperties a boolean
	 */
	public void setHasAdditionalProperties(boolean hasAdditionalProperties) {
		this.hasAdditionalProperties = hasAdditionalProperties;
	}

	/**
	 * <p>Setter for the field <code>additionalProperties</code>.</p>
	 *
	 * @param additionalProperties a {@link java.util.List} object
	 */
	public void setAdditionalProperties(List<PropertyDefinition> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

	/**
	 * <p>Setter for the field <code>mappedFields</code>.</p>
	 *
	 * @param mappedFields a {@link java.util.List} object
	 */
	public void setMappedFields(List<MappedFieldDefinition> mappedFields) {
		this.mappedFields = mappedFields;
	}

	/**
	 * <p>Setter for the field <code>additionalData</code>.</p>
	 *
	 * @param additionalData a {@link java.util.Map} object
	 */
	public void setAdditionalData(Map<String, Object> additionalData) {
		this.additionalData = additionalData;
	}
	
	public void setPluginActions(List<PluginActionDefinition> pluginActions) {
		this.pluginActions = pluginActions;
	}

	protected abstract static class Builder<T, S extends ConnectorDefinition, R extends ConnectorDefinitionImpl> {

		private List<PropertyDefinitionImpl.Builder<T>> properties;
		private boolean hasAdditionalProperties;
		private List<PropertyDefinitionImpl.Builder<T>> additionalProperties;
		private List<MappedFieldDefinitionImpl.Builder<T>> mappedFields;
		private Map<String, Object> additionalData;
		private List<PluginActionDefinitionImpl.Builder<T>> pluginActions;

		protected Builder() {
			properties = new ArrayList<>();
			additionalProperties = new ArrayList<>();
			mappedFields = new ArrayList<>();
			additionalData = new HashMap<>();
			pluginActions = new ArrayList<>();
		}

		public PropertyDefinitionImpl.Builder<T> property() {
			PropertyDefinitionImpl.Builder<T> property = new PropertyDefinitionImpl.Builder<>(returnThis());
			properties.add(property);
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
		
		public PluginActionDefinitionImpl.Builder<T> pluginAction() {
			PluginActionDefinitionImpl.Builder<T> pluginAction = new PluginActionDefinitionImpl.Builder<>(returnThis());
			pluginActions.add(pluginAction);
			return pluginAction;
		}

		public T addAdditionalData(String name, Object value) {
			additionalData.putIfAbsent(name, value);
			return returnThis();
		}

		protected abstract T returnThis();

		public abstract S build();

		protected void setAttributes(R connector) {
			connector.setHasAdditionalProperties(hasAdditionalProperties);
			connector.setAdditionalData(additionalData);
			connector.setProperties(properties.stream()
				.map(PropertyDefinitionImpl.Builder::build)
				.collect(Collectors.toList()));
			connector.setAdditionalProperties(additionalProperties.stream()
				.map(PropertyDefinitionImpl.Builder::build)
				.collect(Collectors.toList()));
			connector.setMappedFields(mappedFields.stream()
				.map(MappedFieldDefinitionImpl.Builder::build)
				.collect(Collectors.toList()));
			connector.setPluginActions(pluginActions.stream()
				.map(PluginActionDefinitionImpl.Builder::build)
				.collect(Collectors.toList()));
		}

	}

}
