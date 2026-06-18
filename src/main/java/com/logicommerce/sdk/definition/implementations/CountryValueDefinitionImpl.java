package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.CountryValueDefinition;

/**
 * <p>CountryValueDefinitionImpl class.</p>
 *
 * @author LogiCommerce
 * @since 2.7.6
 */
public class CountryValueDefinitionImpl implements CountryValueDefinition {

	private String countryCode;

	/**
	 * <p>Constructor for CountryValueDefinitionImpl.</p>
	 *
	 * @param countryCode a {@link String} object
	 */
	public CountryValueDefinitionImpl(String countryCode) {
		this.countryCode = countryCode;
	}

	/** {@inheritDoc} */
	@Override
	public String getCountryCode() {
		return countryCode;
	}

	public static class Builder<T> {

		private T parentBuilder;
		private String countryCode;

		public Builder() {

		}

		public Builder(T parentBuilder) {
			this();
			this.parentBuilder = parentBuilder;
		}

		public Builder<T> countryCode(String countryCode) {
			this.countryCode = countryCode;
			return this;
		}

		public CountryValueDefinition build() {
			return new CountryValueDefinitionImpl(countryCode);
		}

		public T done() {
			return parentBuilder;
		}

	}

}
