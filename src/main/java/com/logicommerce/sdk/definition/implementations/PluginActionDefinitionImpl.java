package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.DefinitionLanguages;
import com.logicommerce.sdk.definition.PluginActionDefinition;

/**
 * <p>PluginActionDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.3.1
 */
public class PluginActionDefinitionImpl implements PluginActionDefinition {

	private String code;
	private DefinitionLanguages languages;

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

	public static class Builder<T> {
		
		private T parentBuilder;
		private String code;
		private DefinitionLanguagesImpl.Builder<Builder<T>> languages;

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

		public PluginActionDefinition build() {
			PluginActionDefinitionImpl pluginActionDefinition = new PluginActionDefinitionImpl();
			pluginActionDefinition.setLanguages(languages.build());
			pluginActionDefinition.setCode(code);
			return pluginActionDefinition;
		}

		public T done() {
			return parentBuilder;
		}
	}
}
