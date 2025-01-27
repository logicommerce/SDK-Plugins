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

	public abstract static class Builder<T, S, R extends DefinitionValueImpl, Q extends Builder<T, S, R, Q>> {

		protected T parentBuilder;
		private String value;
		private DefinitionLanguagesImpl.Builder<Q> languages;

		public Builder(T parentBuilder) {
			this.parentBuilder = parentBuilder;
		}

		public Q value(String value) {
			this.value = value;
			return returnThis();
		}

		public DefinitionLanguagesImpl.Builder<Q> languages() {
			this.languages = new DefinitionLanguagesImpl.Builder<>(returnThis());
			return languages;
		}

		public abstract Q returnThis();

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
