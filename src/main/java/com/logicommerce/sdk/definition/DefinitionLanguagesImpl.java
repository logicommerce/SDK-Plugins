package com.logicommerce.sdk.definition;

import java.util.Map;

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
		if (names.containsKey(language))
			return names.get(language);
		if (names.containsKey(DEFAULT_LANGUAGE))
			return names.get(DEFAULT_LANGUAGE);
		return null;
	}

}
