package com.logicommerce.sdk.models.basket;

/**
 * <p>The context a new basket is created in, used instead of the request's headers and cookies. Build it with
 * {@link com.logicommerce.sdk.builders.basket.BasketContextBuilder}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface BasketContext {

	/**
	 * Returns the navigation country. One that is not a commerce country is replaced by the default country and
	 * reported as a {@link ChangeRejection.Target#COUNTRY} rejection.
	 *
	 * @return the ISO 3166-1 alpha-2 code, or null for the commerce's default country
	 */
	String getCountryCode();

	/**
	 * Returns the language: the ISO 639-1 code in lower case (for instance {@code es}). One that is not a commerce
	 * language is replaced by the default one.
	 *
	 * @return the language code, or null for the default language
	 */
	String getLanguageCode();

	/**
	 * Returns the preferred currency. It is only a hint: it is used when it is available for the country, otherwise it
	 * is reported as a {@link ChangeRejection.Target#CURRENCY} rejection.
	 *
	 * @return the ISO 4217 code, or null for no preference
	 */
	String getCurrencyHint();

	/**
	 * Returns the buyer's client.
	 *
	 * @return the client, or null when unknown
	 */
	ClientInfo getClient();

}
