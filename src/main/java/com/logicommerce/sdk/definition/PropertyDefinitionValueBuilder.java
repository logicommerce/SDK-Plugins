package com.logicommerce.sdk.definition;

public class PropertyDefinitionValueBuilder {

	private PropertyDefinitionBuilder parentBuilder;
	private String value;
	private DefinitionLanguagesBuilder<PropertyDefinitionValueBuilder> languages;

	PropertyDefinitionValueBuilder(PropertyDefinitionBuilder parentBuilder) {
		this.parentBuilder = parentBuilder;
	}
	
	public PropertyDefinitionValueBuilder value(String value) {
		this.value = value;
		return this;
	}
	
	public DefinitionLanguagesBuilder<PropertyDefinitionValueBuilder> languages() {
		this.languages = new DefinitionLanguagesBuilder<>(this);
		return languages;
	}
	
	PropertyDefinitionValue build() {
		PropertyDefinitionValueImpl properyDefinitionValue = new PropertyDefinitionValueImpl();
		properyDefinitionValue.setValue(value);
		properyDefinitionValue.setLanguages(languages.build());
		return properyDefinitionValue;
	}

	public PropertyDefinitionBuilder done() {
		return parentBuilder;
	}
}
