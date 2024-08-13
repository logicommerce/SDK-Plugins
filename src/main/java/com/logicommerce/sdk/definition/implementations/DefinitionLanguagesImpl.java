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
	private Map<String, String> values;

	DefinitionLanguagesImpl(Map<String, String> values) {
		this.values = values;
	}

	@Override
	public Map<String, String> getValues() {
		return values;
	}

	@Override
	public String getValue(String language) {
		if (values.containsKey(language)) {
			return values.get(language);
		}
		if (values.containsKey(DEFAULT_LANGUAGE)) {
			return values.get(DEFAULT_LANGUAGE);
		}
		return null;
	}

	public static class Builder<T> {

		private T parentBuilder;
		private Map<String, String> values;

		public Builder(T parentBuilder) {
			values = new LinkedHashMap<>();
			this.parentBuilder = parentBuilder;
		}

		public Builder<T> value(String language, String value) {
			values.put(language, value);
			return this;
		}

		public DefinitionLanguages build() {
			return new DefinitionLanguagesImpl(values);
		}

		public T done() {
			return parentBuilder;
		}

	}

}
