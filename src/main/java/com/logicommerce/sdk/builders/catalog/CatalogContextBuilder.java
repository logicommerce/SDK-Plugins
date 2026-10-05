package com.logicommerce.sdk.builders.catalog;

import com.logicommerce.sdk.models.basket.ClientInfo;
import com.logicommerce.sdk.models.catalog.CatalogContext;
import com.logicommerce.sdk.models.catalog.implementations.CatalogContextImpl;

/**
 * <p>Builder of {@link CatalogContext}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public class CatalogContextBuilder {

	private String countryCode;

	private String languageCode;

	private String currencyHint;

	private ClientInfo client;

	/**
	 * <p>Constructor for CatalogContextBuilder.</p>
	 */
	public CatalogContextBuilder() {
		// defaults are set in the fields
	}

	/**
	 * <p>Sets <code>countryCode</code>.</p>
	 *
	 * @param countryCode the country (ISO 3166-1 alpha-2), or null for the commerce's default
	 * @return this builder
	 */
	public CatalogContextBuilder countryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	/**
	 * <p>Sets <code>languageCode</code>.</p>
	 *
	 * @param languageCode the language code (ISO 639-1, lower case), or null for the default
	 * @return this builder
	 */
	public CatalogContextBuilder languageCode(String languageCode) {
		this.languageCode = languageCode;
		return this;
	}

	/**
	 * <p>Sets <code>currencyHint</code>.</p>
	 *
	 * @param currencyHint the preferred currency (ISO 4217), or null
	 * @return this builder
	 */
	public CatalogContextBuilder currencyHint(String currencyHint) {
		this.currencyHint = currencyHint;
		return this;
	}

	/**
	 * <p>Sets <code>client</code>.</p>
	 *
	 * @param client the buyer's client, or null
	 * @return this builder
	 */
	public CatalogContextBuilder client(ClientInfo client) {
		this.client = client;
		return this;
	}

	/**
	 * <p>Builds the {@link CatalogContext}.</p>
	 *
	 * @return a {@link CatalogContext} object
	 */
	public CatalogContext build() {
		CatalogContextImpl result = new CatalogContextImpl();
		result.setCountryCode(countryCode);
		result.setLanguageCode(languageCode);
		result.setCurrencyHint(currencyHint);
		result.setClient(client);
		return result;
	}

}
