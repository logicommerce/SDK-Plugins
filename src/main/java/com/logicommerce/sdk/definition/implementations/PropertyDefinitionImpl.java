package com.logicommerce.sdk.definition.implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.definition.DefinitionLanguages;
import com.logicommerce.sdk.definition.PropertyDefinition;
import com.logicommerce.sdk.definition.PropertyDefinitionValue;

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
	private String parent;

	@Override
	public String getIdentifier() {
		return identifier;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public boolean isRequired() {
		return required;
	}

	@Override
	public String getDefaultValue() {
		return defaultValue;
	}

	@Override
	public boolean isLanguageValue() {
		return languageValue;
	}

	@Override
	public boolean isMultipleValue() {
		return multipleValue;
	}

	@Override
	public String getEntryValueMode() {
		return entryValueMode;
	}

	@Override
	public List<PropertyDefinitionValue> getValues() {
		return values;
	}

	@Override
	public DefinitionLanguages getLanguages() {
		return languages;
	}
	
	@Override
	public String getParent() {
		return parent;
	}	

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public void setLanguageValue(boolean languageValue) {
		this.languageValue = languageValue;
	}

	public void setMultipleValue(boolean multipleValue) {
		this.multipleValue = multipleValue;
	}

	public void setEntryValueMode(String entryValueMode) {
		this.entryValueMode = entryValueMode;
	}

	public void setValues(List<PropertyDefinitionValue> values) {
		this.values = values;
	}

	public void setLanguages(DefinitionLanguages languages) {
		this.languages = languages;
	}
	
	public void setParent(String parent) {
		this.parent = parent;
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
		private String parent;

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
		
		public Builder<T> parent(String parent) {
			this.parent = parent;
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
			propertyDefinition.setParent(parent);
			return propertyDefinition;
		}

		public T done() {
			return parentBuilder;
		}
	}

}
