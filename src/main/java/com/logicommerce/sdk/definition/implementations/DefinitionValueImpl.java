package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.DefinitionLanguages;
import com.logicommerce.sdk.definition.DefinitionValue;

/**
 * <p>DefinitionValueImpl class.</p>
 *
 * @author LogiCommerce
 * @since 2.3.0
 */
public abstract class DefinitionValueImpl implements DefinitionValue {

	private String value;
	private DefinitionLanguages languages;

	/** {@inheritDoc} */
	@Override
	public String getValue() {
		return value;
	}

	/** {@inheritDoc} */
	@Override
	public DefinitionLanguages getLanguages() {
		return languages;
	}

	void setValue(String value) {
		this.value = value;
	}

	void setLanguages(DefinitionLanguages languages) {
		this.languages = languages;
	}

	public abstract static class Builder<T, S, R extends DefinitionValueImpl> {

		protected T parentBuilder;
		private String value;
		private DefinitionLanguagesImpl.Builder<Builder<T, S, R>> languages;

		public Builder(T parentBuilder) {
			this.parentBuilder = parentBuilder;
		}
		
		public Builder<T, S, R> value(String value) {
			this.value = value;
			return this;
		}

		public DefinitionLanguagesImpl.Builder<Builder<T, S, R>> languages() {
			this.languages = new DefinitionLanguagesImpl.Builder<>(this);
			return languages;
		}

		public abstract S build();
		
		protected void setAttributes(R defintionValue) {
			defintionValue.setValue(value);
			if (languages != null) {
				defintionValue.setLanguages(languages.build());
			}
		}

		public T done() {
			return parentBuilder;
		}
	}
}
