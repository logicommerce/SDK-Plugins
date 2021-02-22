package com.logicommerce.sdk.definition;


public class StatusCodeDefinitionBuilder {

	private String code;

	private DefinitionLanguagesBuilder<StatusCodeDefinitionBuilder> languages;

	public StatusCodeDefinitionBuilder code(String code) {
		this.code = code;
		return this;
	}

	public DefinitionLanguagesBuilder<StatusCodeDefinitionBuilder> languages() {
		this.languages = new DefinitionLanguagesBuilder<>(this);
		return languages;
	}

	public StatusCodeDefinition build() {
		return new StatusCodeDefinitionImpl(code, languages.build());
	}

}
