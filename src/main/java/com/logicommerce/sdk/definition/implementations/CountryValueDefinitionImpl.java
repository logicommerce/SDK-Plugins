package com.logicommerce.sdk.definition.implementations;

import com.logicommerce.sdk.definition.CountryValueDefinition;

/**
 * <p>CountryValueDefinitionImpl class.</p>
 *
 * @author LogiCommerce
 * @since 2.7.5
 */
public class CountryValueDefinitionImpl implements CountryValueDefinition {

	private Integer countryId;

	/**
	 * <p>Constructor for CountryValueDefinitionImpl.</p>
	 *
	 * @param countryId a {@link Integer} object
	 */
	public CountryValueDefinitionImpl(Integer countryId) {
		this.countryId = countryId;
	}

	/** {@inheritDoc} */
	@Override
	public Integer getCountryId() {
		return countryId;
	}

	public static class Builder<T> {

		private T parentBuilder;
		private Integer countryId;

		public Builder() {

		}

		public Builder(T parentBuilder) {
			this();
			this.parentBuilder = parentBuilder;
		}

		public Builder<T> countryId(Integer countryId) {
			this.countryId = countryId;
			return this;
		}

		public CountryValueDefinition build() {
			return new CountryValueDefinitionImpl(countryId);
		}

		public T done() {
			return parentBuilder;
		}

	}

}
