package com.logicommerce.sdk.definition;

public class PropertyDefinitionValueImpl implements PropertyDefinitionValue {

	private String value;
	private DefinitionLanguages languages;

	@Override
	public String getValue() {
		return value;
	}

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

}
