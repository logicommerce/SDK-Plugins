package com.logicommerce.sdk.models.basket;

/**
 * <p>The context a new basket is created in ({@link com.logicommerce.sdk.resources.BasketResource#create create}). It
 * replaces what core would otherwise take from the request's headers and cookies. Build it with
 * {@link com.logicommerce.sdk.builders.basket.BasketContextBuilder}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface BasketContext {

	/**
	 * Returns the navigation country. A country that is not a commerce country is replaced by the commerce's default
	 * country and reported as a {@link ChangeRejection.Target#COUNTRY} rejection.
	 *
	 * @return the ISO 3166-1 alpha-2 code, or null for the commerce's default country
	 */
	String getCountryCode();

	/**
	 * Returns the language, as a LogiCommerce language code: the ISO 639-1 code in lower case (for instance {@code es});
	 * a caller holding a BCP 47 tag passes its primary subtag. A language that is not a commerce language is replaced by
	 * the default one.
	 *
	 * @return the language code, or null for the default language
	 */
	String getLanguageCode();

	/**
	 * Returns the preferred currency. It is only a hint: the currency is chosen from the currencies available for the
	 * country that the headquarter accepts (the hint when it is one of them), and a hint that is not is reported as a
	 * {@link ChangeRejection.Target#CURRENCY} rejection.
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
