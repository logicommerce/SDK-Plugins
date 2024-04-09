package com.logicommerce.sdk.definition.implementations;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.logicommerce.sdk.definition.DefinitionLanguages;
import com.logicommerce.sdk.definition.PluginActionDefinition;
import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>PluginActionDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.3.4
 */
public class PluginActionDefinitionImpl implements PluginActionDefinition {

	private String code;
	private DefinitionLanguages name;
	private DefinitionLanguages description;
	private boolean active;
	private ConnectorType connectorType;

	/** {@inheritDoc} */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 *
	 * @param code a {@link java.lang.String} object
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/** {@inheritDoc} */
	@Override
	public DefinitionLanguages getName() {
		return name;
	}

	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link com.logicommerce.sdk.definition.DefinitionLanguages} object
	 */
	public void setName(DefinitionLanguages name) {
		this.name = name;
	}
	
	@JsonProperty("name")
	public void setLanguageName(Map<String, String> name) {
		this.name = new DefinitionLanguagesImpl(name);
	}
	
	/** {@inheritDoc} */
	@Override
	public DefinitionLanguages getDescription() {
		return description;
	}

	/**
	 * <p>Setter for the field <code>description</code>.</p>
	 *
	 * @param description a {@link com.logicommerce.sdk.definition.DefinitionLanguages} object
	 */
	public void setDescription(DefinitionLanguages description) {
		this.description = description;
	}


	@JsonProperty("description")
	public void setLanguageDescription(Map<String, String> description) {
		this.description = new DefinitionLanguagesImpl(description);
	}

	/** {@inheritDoc} */
	@Override
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}

	/** {@inheritDoc} */
	@Override
	public ConnectorType getConnectorType() {
		return connectorType;
	}

	/** {@inheritDoc} */
	@Override
	public void setConnectorType(ConnectorType connectorType) {
		this.connectorType = connectorType;
	}

	public static class Builder<T> {
		
		private T parentBuilder;
		private String code;
		private DefinitionLanguagesImpl.Builder<Builder<T>> name;
		private DefinitionLanguagesImpl.Builder<Builder<T>> description;
		private boolean active;
		private ConnectorType connectorType;

		public Builder() {
			code = "string";
			name = new DefinitionLanguagesImpl.Builder<>(this);
			description = new DefinitionLanguagesImpl.Builder<>(this);
			active = false;
			connectorType = ConnectorType.NONE;
		}

		public Builder(T parentBuilder) {
			this();
			this.parentBuilder = parentBuilder;
		}

		public Builder<T> code(String code) {
			this.code = code;
			return this;
		}

		public DefinitionLanguagesImpl.Builder<Builder<T>> name() {
			return name;
		}

		public DefinitionLanguagesImpl.Builder<Builder<T>> description() {
			return description;
		}
		
		public Builder<T> active(boolean active) {
			this.active = active;
			return this;
		}
		
		public Builder<T> connectorType(ConnectorType connectorType) {
			this.connectorType = connectorType;
			return this;
		}

		public PluginActionDefinition build() {
			PluginActionDefinitionImpl pluginActionDefinition = new PluginActionDefinitionImpl();
			pluginActionDefinition.setName(name.build());
			pluginActionDefinition.setDescription(description.build());
			pluginActionDefinition.setCode(code);
			pluginActionDefinition.setActive(active);
			pluginActionDefinition.setConnectorType(connectorType);
			return pluginActionDefinition;
		}

		public T done() {
			return parentBuilder;
		}
	}
}
