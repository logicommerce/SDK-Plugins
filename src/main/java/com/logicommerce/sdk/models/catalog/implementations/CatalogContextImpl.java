package com.logicommerce.sdk.models.catalog.implementations;

import com.logicommerce.sdk.models.basket.ClientInfo;
import com.logicommerce.sdk.models.catalog.CatalogContext;

/**
 * <p>Implementation of {@link CatalogContext}.</p>
 *
 * @see com.logicommerce.sdk.builders.catalog.CatalogContextBuilder
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public class CatalogContextImpl implements CatalogContext {

	private String countryCode;

	private String languageCode;

	private String currencyHint;

	private ClientInfo client;

	/**
	 * <p>Constructor for CatalogContextImpl.</p>
	 */
	public CatalogContextImpl() {
		// fields are set with the setters
	}

	/** {@inheritDoc} */
	@Override
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * <p>Setter for the field <code>countryCode</code>.</p>
	 *
	 * @param countryCode the country (ISO 3166-1 alpha-2), or null for the commerce's default
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/** {@inheritDoc} */
	@Override
	public String getLanguageCode() {
		return languageCode;
	}

	/**
	 * <p>Setter for the field <code>languageCode</code>.</p>
	 *
	 * @param languageCode the language code (ISO 639-1, lower case), or null for the default
	 */
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	/** {@inheritDoc} */
	@Override
	public String getCurrencyHint() {
		return currencyHint;
	}

	/**
	 * <p>Setter for the field <code>currencyHint</code>.</p>
	 *
	 * @param currencyHint the preferred currency (ISO 4217), or null
	 */
	public void setCurrencyHint(String currencyHint) {
		this.currencyHint = currencyHint;
	}

	/** {@inheritDoc} */
	@Override
	public ClientInfo getClient() {
		return client;
	}

	/**
	 * <p>Setter for the field <code>client</code>.</p>
	 *
	 * @param client the buyer's client, or null when unknown
	 */
	public void setClient(ClientInfo client) {
		this.client = client;
	}

}
