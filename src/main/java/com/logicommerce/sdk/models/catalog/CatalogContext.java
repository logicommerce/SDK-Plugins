package com.logicommerce.sdk.models.catalog;

import com.logicommerce.sdk.models.basket.ClientInfo;

/**
 * <p>The context catalog reads are made in ({@link com.logicommerce.sdk.resources.CatalogResource}). Core prices and
 * filters the catalog exactly as it would a guest basket created with the same country, language, currency and client,
 * and never reads the caller's request headers nor the request's basket for it. Build it with
 * {@link com.logicommerce.sdk.builders.catalog.CatalogContextBuilder}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface CatalogContext {

	/**
	 * Returns the country: it selects the visibility (category restrictions per country and zone), the prices and the
	 * taxes. A country that is not a commerce country is replaced by the commerce's default country.
	 *
	 * @return the ISO 3166-1 alpha-2 code, or null for the commerce's default country
	 */
	String getCountryCode();

	/**
	 * Returns the language of names, descriptions and URLs, as a LogiCommerce language code: the ISO 639-1 code in
	 * lower case (for instance {@code es}); a caller holding a BCP 47 tag passes its primary subtag. A language that is
	 * not a commerce language is replaced by the default one.
	 *
	 * @return the language code, or null for the default language
	 */
	String getLanguageCode();

	/**
	 * Returns the preferred currency: prices are in it when it is available for the country, else in the country's
	 * default currency. Every {@link PriceView} of one call is in that same currency, and carries it.
	 *
	 * @return the ISO 4217 code, or null for the country's default currency
	 */
	String getCurrencyHint();

	/**
	 * Returns the buyer's client, used as {@link com.logicommerce.sdk.resources.BasketResource} uses it (the user agent
	 * and IP that select the channel), so the catalog prices as the buyer's basket would. The client is never treated as
	 * a bot.
	 *
	 * @return the client, or null when unknown
	 */
	ClientInfo getClient();

}
