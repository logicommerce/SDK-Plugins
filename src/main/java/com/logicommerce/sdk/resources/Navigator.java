package com.logicommerce.sdk.resources;

import java.net.URL;
import com.logicommerce.sdk.models.Cookie;

/**
 * The Navigator interface represents a navigator object that provides information about the user's browsing context.
 * It includes methods to retrieve user agent, URL, referer, language, country, currency, default currency, page type,
 * cookies, IP address, store URL, base URL, and CDN assets and images.
 *
 * @version 1.0.16
 * @author LogiCommerce
 */
public interface Navigator {

	/**
	 * Returns the user agent string of the browser.
	 *
	 * @return the user agent string
	 */
	String getUserAgent();

	/**
	 * Returns the URL of the current page.
	 *
	 * @return the URL of the current page
	 */
	String getUrl();

	/**
	 * Returns the referer URL of the current page.
	 *
	 * @return the referer URL of the current page
	 */
	String getReferer();

	/**
	 * Returns the language code of the browser.
	 *
	 * @return the language of the browser
	 */
	String getLanguage();

	/**
	 * Returns the language ID of the browser.
	 *
	 * @return the language ID of the browser
	 */
	Integer getLanguageId();

	/**
	 * Returns the country code of the browser.
	 *
	 * @return the country of the browser
	 */
	String getCountry();

	/**
	 * Returns the currency of the browser.
	 *
	 * @return the currency of the browser
	 */
	String getCurrency();

	/**
	 * Returns the default currency of the browser.
	 *
	 * @return the default currency of the browser
	 */
	String getDefaultCurrency();

	/**
	 * Returns the type of the current page.
	 *
	 * @return the type of the current page
	 */
	String getPageType();

	/**
	 * Returns the cookie with the specified name.
	 *
	 * @param name the name of the cookie
	 * @return the cookie with the specified name, or null if the cookie does not exist
	 */
	Cookie getCookie(String name);

	/**
	 * Sets a cookie with the specified name, value, and time-to-live (TTL) in seconds.
	 *
	 * @param name the name of the cookie
	 * @param value the value of the cookie
	 * @param ttl the time-to-live (TTL) of the cookie in seconds
	 */
	void setCookie(String name, String value, int ttl);

	/**
	 * Sets a cookie.
	 *
	 * @param cookie the cookie to be set
	 */
	void setCookie(Cookie cookie);

	/**
	 * Removes the cookie with the specified name.
	 *
	 * @param name the name of the cookie to be removed
	 */
	void removeCookie(String name);

	/**
	 * Returns a string representation of all cookies.
	 *
	 * @return a string representation of all cookies
	 */
	String getCookies();

	/**
	 * Returns the IP address of the browser.
	 *
	 * @return the IP address of the browser
	 */
	String getIp();

	/**
	 * Returns the store URL.
	 *
	 * @return the store URL
	 */
	URL getStoreUrl();

	/**
	 * Returns the base URL.
	 *
	 * @return the base URL
	 */
	String getBaseUrl();

	/**
	 * Returns the CDN assets URL.
	 *
	 * @return the CDN assets URL
	 */
	String getCdnAssets();

	/**
	 * Returns the CDN images URL.
	 *
	 * @return the CDN images URL
	 */
	String getCdnImages();

}
