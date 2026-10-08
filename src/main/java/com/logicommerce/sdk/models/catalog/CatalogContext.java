package com.logicommerce.sdk.models.catalog;

import com.logicommerce.sdk.models.basket.ClientInfo;

/**
 * <p>The context catalog reads are made in ({@link com.logicommerce.sdk.resources.CatalogResource}): the catalog is
 * priced and filtered as for a guest basket with the same country, language, currency and client. The caller's request
 * is never used. Build it with {@link com.logicommerce.sdk.builders.catalog.CatalogContextBuilder}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface CatalogContext {

	/**
	 * Returns the country, which selects visibility, prices and taxes. A country that is not a commerce country is
	 * replaced by the commerce's default country.
	 *
	 * @return the ISO 3166-1 alpha-2 code, or null for the commerce's default country
	 */
	String getCountryCode();

	/**
	 * Returns the language of names, descriptions and URLs. A language that is not a commerce language is replaced by
	 * the default one.
	 *
	 * @return the ISO 639-1 code, lower case (for instance {@code es}), or null for the default language
	 */
	String getLanguageCode();

	/**
	 * Returns the preferred currency: prices are in it when it is available for the country, else in the country's
	 * default currency.
	 *
	 * @return the ISO 4217 code, or null for the country's default currency
	 */
	String getCurrencyHint();

	/**
	 * Returns the buyer's client, used as {@link com.logicommerce.sdk.resources.BasketResource} uses it, so the catalog
	 * prices as the buyer's basket would.
	 *
	 * @return the client, or null when unknown
	 */
	ClientInfo getClient();

}
