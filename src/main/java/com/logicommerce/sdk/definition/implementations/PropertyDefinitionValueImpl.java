package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.DefinitionLanguages;
import com.logicommerce.sdk.definition.PropertyDefinitionValue;

/**
 * <p>PropertyDefinitionValueImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PropertyDefinitionValueImpl implements PropertyDefinitionValue {

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

	public static class Builder {

		private PropertyDefinitionImpl.Builder<?> parentBuilder;
		private String value;
		private DefinitionLanguagesImpl.Builder<Builder> languages;

		Builder(PropertyDefinitionImpl.Builder<?> parentBuilder) {
			this.parentBuilder = parentBuilder;
		}
		
		public Builder value(String value) {
			this.value = value;
			return this;
		}
		
		public DefinitionLanguagesImpl.Builder<Builder> languages() {
			this.languages = new DefinitionLanguagesImpl.Builder<>(this);
			return languages;
		}
		
		PropertyDefinitionValue build() {
			PropertyDefinitionValueImpl properyDefinitionValue = new PropertyDefinitionValueImpl();
			properyDefinitionValue.setValue(value);
			properyDefinitionValue.setLanguages(languages.build());
			return properyDefinitionValue;
		}

		public PropertyDefinitionImpl.Builder<?> done() {
			return parentBuilder;
		}
	}
}
