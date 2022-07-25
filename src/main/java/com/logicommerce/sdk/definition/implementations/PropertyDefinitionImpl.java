package com.logicommerce.sdk.definition.implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.definition.DefinitionLanguages;
import com.logicommerce.sdk.definition.PropertyDefinition;
import com.logicommerce.sdk.definition.PropertyDefinitionValue;

/**
 * <p>PropertyDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PropertyDefinitionImpl implements PropertyDefinition {

	private String identifier;
	private String type;
	private boolean required;
	private String defaultValue;
	private boolean languageValue;
	private boolean multipleValue;
	private List<PropertyDefinitionValue> values;
	private DefinitionLanguages languages;
	private String entryValueMode = "single";
	private String reference;

	/** {@inheritDoc} */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/** {@inheritDoc} */
	@Override
	public String getType() {
		return type;
	}

	/** {@inheritDoc} */
	@Override
	public boolean isRequired() {
		return required;
	}

	/** {@inheritDoc} */
	@Override
	public String getDefaultValue() {
		return defaultValue;
	}

	/** {@inheritDoc} */
	@Override
	public boolean isLanguageValue() {
		return languageValue;
	}

	/** {@inheritDoc} */
	@Override
	public boolean isMultipleValue() {
		return multipleValue;
	}

	/** {@inheritDoc} */
	@Override
	public String getEntryValueMode() {
		return entryValueMode;
	}

	/** {@inheritDoc} */
	@Override
	public List<PropertyDefinitionValue> getValues() {
		return values;
	}

	/** {@inheritDoc} */
	@Override
	public DefinitionLanguages getLanguages() {
		return languages;
	}
	
	/** {@inheritDoc} */
	@Override
	public String getReference() {
		return reference;
	}

	/**
	 * <p>Setter for the field <code>identifier</code>.</p>
	 *
	 * @param identifier a {@link java.lang.String} object
	 */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link java.lang.String} object
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * <p>Setter for the field <code>required</code>.</p>
	 *
	 * @param required a boolean
	 */
	public void setRequired(boolean required) {
		this.required = required;
	}

	/**
	 * <p>Setter for the field <code>defaultValue</code>.</p>
	 *
	 * @param defaultValue a {@link java.lang.String} object
	 */
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	/**
	 * <p>Setter for the field <code>languageValue</code>.</p>
	 *
	 * @param languageValue a boolean
	 */
	public void setLanguageValue(boolean languageValue) {
		this.languageValue = languageValue;
	}

	/**
	 * <p>Setter for the field <code>multipleValue</code>.</p>
	 *
	 * @param multipleValue a boolean
	 */
	public void setMultipleValue(boolean multipleValue) {
		this.multipleValue = multipleValue;
	}

	/**
	 * <p>Setter for the field <code>entryValueMode</code>.</p>
	 *
	 * @param entryValueMode a {@link java.lang.String} object
	 */
	public void setEntryValueMode(String entryValueMode) {
		this.entryValueMode = entryValueMode;
	}

	/**
	 * <p>Setter for the field <code>values</code>.</p>
	 *
	 * @param values a {@link java.util.List} object
	 */
	public void setValues(List<PropertyDefinitionValue> values) {
		this.values = values;
	}

	/**
	 * <p>Setter for the field <code>languages</code>.</p>
	 *
	 * @param languages a {@link com.logicommerce.sdk.definition.DefinitionLanguages} object
	 */
	public void setLanguages(DefinitionLanguages languages) {
		this.languages = languages;
	}
	
	/**
	 * <p>Setter for the field <code>reference</code>.</p>
	 *
	 * @param reference a {@link java.lang.String} object
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}

	public static class Builder<T> {

		private T parentBuilder;
		private String identifier;
		private String type;
		private boolean required;
		private String defaultValue;
		private boolean languageValue;
		private boolean multipleValue;
		private String entryValueMode;
		private List<PropertyDefinitionValueImpl.Builder> values;
		private DefinitionLanguagesImpl.Builder<Builder<T>> languages;
		private String reference;

		public Builder() {
			type = "string";
			values = new ArrayList<>();
			languages = new DefinitionLanguagesImpl.Builder<>(this);
		}

		public Builder(T parentBuilder) {
			this();
			this.parentBuilder = parentBuilder;
		}

		public Builder<T> identifier(String identifier) {
			this.identifier = identifier;
			return this;
		}

		public Builder<T> type(String type) {
			this.type = type;
			return this;
		}

		public Builder<T> required(boolean required) {
			this.required = required;
			return this;
		}

		public Builder<T> defaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
			return this;
		}

		public Builder<T> languageValue(boolean languageValue) {
			this.languageValue = languageValue;
			return this;
		}

		public Builder<T> multipleValue(boolean multipleValue) {
			this.multipleValue = multipleValue;
			return this;
		}

		public Builder<T> entryValueMode(String entryValueMode) {
			this.entryValueMode = entryValueMode;
			return this;
		}

		public PropertyDefinitionValueImpl.Builder value() {
			PropertyDefinitionValueImpl.Builder value = new PropertyDefinitionValueImpl.Builder(this);
			this.values.add(value);
			return value;
		}

		public DefinitionLanguagesImpl.Builder<Builder<T>> languages() {
			return languages;
		}

		public Builder<T> reference(String reference) {
			this.reference = reference;
			return this;
		}

		public PropertyDefinition build() {
			PropertyDefinitionImpl propertyDefinition = new PropertyDefinitionImpl();
			propertyDefinition.setIdentifier(identifier);
			propertyDefinition.setType(type);
			propertyDefinition.setRequired(required);
			propertyDefinition.setDefaultValue(defaultValue);
			propertyDefinition.setLanguageValue(languageValue);
			propertyDefinition.setMultipleValue(multipleValue);
			propertyDefinition.setEntryValueMode(entryValueMode);
			propertyDefinition.setValues(values.stream().map(PropertyDefinitionValueImpl.Builder::build).collect(Collectors.toList()));
			propertyDefinition.setLanguages(languages.build());
			propertyDefinition.setReference(reference);
			return propertyDefinition;
		}

		public T done() {
			return parentBuilder;
		}
	}

}
