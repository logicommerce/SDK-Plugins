package com.logicommerce.sdk.definition;

import java.util.LinkedHashMap;
import java.util.Map;

public class DefinitionLanguagesBuilder<T> {
	
	private T parentBuilder;
	private Map<String, String> languages;

	DefinitionLanguagesBuilder(T parentBuilder) {
		languages = new LinkedHashMap<>();
		this.parentBuilder = parentBuilder;
	}

	public DefinitionLanguagesBuilder<T> language(String language, String value) {
		languages.put(language, value);
		return this;
	}

	DefinitionLanguages build() {
		return new DefinitionLanguagesImpl(languages);
	}
	
	public T done() {
		return parentBuilder;
	}
	
}
