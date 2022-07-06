package com.logicommerce.sdk.definition.implementations;

import java.util.LinkedHashMap;
import java.util.Map;
import com.logicommerce.sdk.definition.DefinitionLanguages;

public class DefinitionLanguagesImpl implements DefinitionLanguages {

	private static final String DEFAULT_LANGUAGE = "en";
	private Map<String, String> names;

	DefinitionLanguagesImpl(Map<String, String> names) {
		this.names = names;
	}

	@Override
	public Map<String, String> getNames() {
		return names;
	}

	@Override
	public String getName(String language) {
		if (names.containsKey(language)) {
			return names.get(language);
		}
		if (names.containsKey(DEFAULT_LANGUAGE)) {
			return names.get(DEFAULT_LANGUAGE);
		}
		return null;
	}

	public static class Builder<T> {

		private T parentBuilder;
		private Map<String, String> languages;

		Builder(T parentBuilder) {
			languages = new LinkedHashMap<>();
			this.parentBuilder = parentBuilder;
		}

		public Builder<T> language(String language, String value) {
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

}
