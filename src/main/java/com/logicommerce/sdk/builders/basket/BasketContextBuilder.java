package com.logicommerce.sdk.builders.basket;

import com.logicommerce.sdk.models.basket.BasketContext;
import com.logicommerce.sdk.models.basket.ClientInfo;
import com.logicommerce.sdk.models.basket.implementations.BasketContextImpl;

/**
 * <p>Builder of {@link BasketContext}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public class BasketContextBuilder {

	private String countryCode;

	private String languageCode;

	private String currencyHint;

	private ClientInfo client;

	/**
	 * <p>Constructor for BasketContextBuilder.</p>
	 */
	public BasketContextBuilder() {
		// defaults are set in the fields
	}

	/**
	 * <p>Sets <code>countryCode</code>.</p>
	 *
	 * @param countryCode the navigation country (ISO 3166-1 alpha-2), or null for the commerce's default
	 * @return this builder
	 */
	public BasketContextBuilder countryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	/**
	 * <p>Sets <code>languageCode</code>.</p>
	 *
	 * @param languageCode the language code (ISO 639-1, lower case), or null for the default
	 * @return this builder
	 */
	public BasketContextBuilder languageCode(String languageCode) {
		this.languageCode = languageCode;
		return this;
	}

	/**
	 * <p>Sets <code>currencyHint</code>.</p>
	 *
	 * @param currencyHint the preferred currency (ISO 4217), or null
	 * @return this builder
	 */
	public BasketContextBuilder currencyHint(String currencyHint) {
		this.currencyHint = currencyHint;
		return this;
	}

	/**
	 * <p>Sets <code>client</code>.</p>
	 *
	 * @param client the buyer's client, or null
	 * @return this builder
	 */
	public BasketContextBuilder client(ClientInfo client) {
		this.client = client;
		return this;
	}

	/**
	 * <p>Builds the {@link BasketContext}.</p>
	 *
	 * @return a {@link BasketContext} object
	 */
	public BasketContext build() {
		BasketContextImpl result = new BasketContextImpl();
		result.setCountryCode(countryCode);
		result.setLanguageCode(languageCode);
		result.setCurrencyHint(currencyHint);
		result.setClient(client);
		return result;
	}

}
