package com.logicommerce.sdk.definition;

import java.util.List;

public class PropertyDefinitionImpl implements PropertyDefinition {

	private String identifier;
	private String type;
	private boolean required;
	private String defaultValue;
	private boolean languageValue;
	private String entryValueMode;
	private List<PropertyDefinitionValue> values;
	private DefinitionLanguages languages;

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

	void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	void setType(String type) {
		this.type = type;
	}

	void setRequired(boolean required) {
		this.required = required;
	}

	void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	void setLanguageValue(boolean languageValue) {
		this.languageValue = languageValue;
	}

	void setEntryValueMode(String entryValueMode) {
		this.entryValueMode = entryValueMode;
	}

	void setValues(List<PropertyDefinitionValue> values) {
		this.values = values;
	}

	void setLanguages(DefinitionLanguages languages) {
		this.languages = languages;
	}

}
