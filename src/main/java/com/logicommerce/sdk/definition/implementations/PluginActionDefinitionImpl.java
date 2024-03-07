package com.logicommerce.sdk.definition.implementations;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.logicommerce.sdk.definition.DefinitionLanguages;
import com.logicommerce.sdk.definition.PluginActionDefinition;

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

	
	@Override
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}

	public static class Builder<T> {
		
		private T parentBuilder;
		private String code;
		private DefinitionLanguagesImpl.Builder<Builder<T>> name;
		private DefinitionLanguagesImpl.Builder<Builder<T>> description;
		private boolean active;

		public Builder() {
			code = "string";
			name = new DefinitionLanguagesImpl.Builder<>(this);
			description = new DefinitionLanguagesImpl.Builder<>(this);
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

		public PluginActionDefinition build() {
			PluginActionDefinitionImpl pluginActionDefinition = new PluginActionDefinitionImpl();
			pluginActionDefinition.setName(name.build());
			pluginActionDefinition.setDescription(description.build());
			pluginActionDefinition.setCode(code);
			pluginActionDefinition.setActive(active);
			return pluginActionDefinition;
		}

		public T done() {
			return parentBuilder;
		}
	}
}
