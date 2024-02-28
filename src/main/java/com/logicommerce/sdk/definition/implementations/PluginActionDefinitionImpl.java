package com.logicommerce.sdk.definition.implementations;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.logicommerce.sdk.definition.DefinitionLanguages;
import com.logicommerce.sdk.definition.PluginActionDefinition;

/**
 * <p>PluginActionDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.3.3
 */
public class PluginActionDefinitionImpl implements PluginActionDefinition {

	private String code;
	private DefinitionLanguages languages;
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
	public DefinitionLanguages getLanguages() {
		return languages;
	}

	/**
	 * <p>Setter for the field <code>languages</code>.</p>
	 *
	 * @param languages a {@link com.logicommerce.sdk.definition.DefinitionLanguages} object
	 */
	public void setLanguages(DefinitionLanguages languages) {
		this.languages = languages;
	}
	
	@JsonProperty("languages")
	public void setLanguageNames(Map<String, String> names, Map<String, String> descriptions) {
		this.languages = new DefinitionLanguagesImpl(names, descriptions);
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
		private DefinitionLanguagesImpl.Builder<Builder<T>> languages;
		private boolean active;

		public Builder() {
			code = "string";
			languages = new DefinitionLanguagesImpl.Builder<>(this);
		}

		public Builder(T parentBuilder) {
			this();
			this.parentBuilder = parentBuilder;
		}

		public Builder<T> code(String code) {
			this.code = code;
			return this;
		}

		public DefinitionLanguagesImpl.Builder<Builder<T>> languages() {
			return languages;
		}
		
		public Builder<T> active(boolean active) {
			this.active = active;
			return this;
		}

		public PluginActionDefinition build() {
			PluginActionDefinitionImpl pluginActionDefinition = new PluginActionDefinitionImpl();
			pluginActionDefinition.setLanguages(languages.build());
			pluginActionDefinition.setCode(code);
			pluginActionDefinition.setActive(active);
			return pluginActionDefinition;
		}

		public T done() {
			return parentBuilder;
		}
	}
}
