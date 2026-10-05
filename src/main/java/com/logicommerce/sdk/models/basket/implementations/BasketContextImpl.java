package com.logicommerce.sdk.models.basket.implementations;

import com.logicommerce.sdk.models.basket.BasketContext;
import com.logicommerce.sdk.models.basket.ClientInfo;

/**
 * <p>Implementation of {@link BasketContext}.</p>
 *
 * @see com.logicommerce.sdk.builders.basket.BasketContextBuilder
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public class BasketContextImpl implements BasketContext {

	private String countryCode;

	private String languageCode;

	private String currencyHint;

	private ClientInfo client;

	/**
	 * <p>Constructor for BasketContextImpl.</p>
	 */
	public BasketContextImpl() {
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
	 * @param countryCode the navigation country (ISO 3166-1 alpha-2), or null for the commerce's default
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
	 * @param client the buyer's client, or null
	 */
	public void setClient(ClientInfo client) {
		this.client = client;
	}

}
