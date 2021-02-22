package com.logicommerce.sdk.definition;

public class StatusCodeDefinitionImpl implements StatusCodeDefinition {

	private String code;
	private DefinitionLanguages languages;

	public StatusCodeDefinitionImpl(String code, DefinitionLanguages languages) {
		this.code = code;
		this.languages = languages;
	}

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public DefinitionLanguages getLanguages() {
		return languages;
	}

}
