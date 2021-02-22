package com.logicommerce.sdk.definition;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PropertyDefinitionBuilder {

	private String identifier;
	private String type;
	private boolean required;
	private String defaultValue;
	private boolean languageValue;
	private String entryValueMode;
	private List<PropertyDefinitionValueBuilder> values;
	private DefinitionLanguagesBuilder<PropertyDefinitionBuilder> languages;

	public PropertyDefinitionBuilder() {
		type = "string";
		values = new ArrayList<>();
	}

	public PropertyDefinitionBuilder identifier(String identifier) {
		this.identifier = identifier;
		return this;
	}

	public PropertyDefinitionBuilder type(String type) {
		this.type = type;
		return this;
	}

	public PropertyDefinitionBuilder required(boolean required) {
		this.required = required;
		return this;
	}

	public PropertyDefinitionBuilder defaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
		return this;
	}

	public PropertyDefinitionBuilder languageValue(boolean languageValue) {
		this.languageValue = languageValue;
		return this;
	}

	public PropertyDefinitionBuilder entryValueMode(String entryValueMode) {
		this.entryValueMode = entryValueMode;
		return this;
	}

	public PropertyDefinitionValueBuilder value() {
		PropertyDefinitionValueBuilder value = new PropertyDefinitionValueBuilder(this);
		this.values.add(value);
		return value;
	}

	public DefinitionLanguagesBuilder<PropertyDefinitionBuilder> languages() {
		this.languages = new DefinitionLanguagesBuilder<>(this);
		return languages;
	}
	
	public PropertyDefinition build() {
		PropertyDefinitionImpl propertyDefinition = new PropertyDefinitionImpl();
		propertyDefinition.setIdentifier(identifier);
		propertyDefinition.setType(type);
		propertyDefinition.setRequired(required);
		propertyDefinition.setDefaultValue(defaultValue);
		propertyDefinition.setLanguageValue(languageValue);
		propertyDefinition.setEntryValueMode(entryValueMode);
		propertyDefinition.setValues(values.stream().map(PropertyDefinitionValueBuilder::build).collect(Collectors.toList()));
		propertyDefinition.setLanguages(languages.build());
		return propertyDefinition;
	}
}
