package com.logicommerce.sdk.definition.implementations;

import java.util.LinkedHashMap;
import java.util.Map;
import com.logicommerce.sdk.definition.DefinitionLanguages;

/**
 * <p>DefinitionLanguagesImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class DefinitionLanguagesImpl implements DefinitionLanguages {

	private static final String DEFAULT_LANGUAGE = "en";
	private Map<String, String> names;
	private Map<String, String> descriptions;
	
	DefinitionLanguagesImpl(Map<String, String> names) {
		this.names = names;
	}
	
	DefinitionLanguagesImpl(Map<String, String> names, Map<String, String> descriptions) {
		this.names = names;
		this.descriptions = descriptions;
	}

	/** {@inheritDoc} */
	@Override
	public Map<String, String> getNames() {
		return names;
	}
	
	/** {@inheritDoc} */
	@Override
	public Map<String, String> getDescriptions() {
		return descriptions;
	}

	/** {@inheritDoc} */
	@Override
	public String getName(String language) {
		if (names.containsKey(language)) {
			return names.get(language);
		}
		if (descriptions.containsKey(DEFAULT_LANGUAGE)) {
			return descriptions.get(DEFAULT_LANGUAGE);
		}
		return null;
	}
	

	/** {@inheritDoc} */
	@Override
	public String getDescription(String language) {
		if (descriptions.containsKey(language)) {
			return descriptions.get(language);
		}
		if (descriptions.containsKey(DEFAULT_LANGUAGE)) {
			return descriptions.get(DEFAULT_LANGUAGE);
		}
		return null;
	}

	public static class Builder<T> {

		private T parentBuilder;
		private Map<String, String> names;
		private Map<String, String> descriptions;

		Builder(T parentBuilder) {
			names = new LinkedHashMap<>();
			this.parentBuilder = parentBuilder;
		}

		public Builder<T> language(String language, String value) {
			names.put(language, value);
			return this;
		}
		
		public Builder<T> description(String language, String value) {
			descriptions.put(language, value);
			return this;
		}

		DefinitionLanguages build() {
			return new DefinitionLanguagesImpl(names, descriptions);
		}

		public T done() {
			return parentBuilder;
		}

	}

}
