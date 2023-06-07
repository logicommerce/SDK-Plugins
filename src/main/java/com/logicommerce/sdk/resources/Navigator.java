package com.logicommerce.sdk.resources;

import java.net.URL;
import com.logicommerce.sdk.models.Cookie;

/**
 * <p>Navigator interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface Navigator {

	/**
	 * Gets the navigator user agent.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getUserAgent();
	
	/**
	 * <p>getUrl.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getUrl();

	/**
	 * <p>getReferer.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getReferer();

	/**
	 * <p>getLanguage.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getLanguage();
	
	/**
	 * <p>getCountry.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getCountry();
	
	/**
	 * <p>getCurrency.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getCurrency();
	
	/**
	 * <p>getDefaultCurrency.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getDefaultCurrency();
	
	/**
	 * <p>getPageType.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getPageType();

	/**
	 * <p>getCookie.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link java.lang.String} object
	 */
	Cookie getCookie(String name);

	/**
	 * <p>setCookie.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 * @param ttl a int
	 */
	void setCookie(String name, String value, int ttl);
	
	/**
	 * <p>setCookie.</p>
	 *
	 * @param cookie a {@link com.logicommerce.sdk.models.Cookie} object
	 */
	void setCookie(Cookie cookie);
	
	/**
	 * <p>removeCookie.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 */
	void removeCookie(String name);
	
	/**
	 * <p>getCookies.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getCookies();

	/**
	 * <p>getIp.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getIp();
	
	/**
	 * <p>getStoreUrl.</p>
	 *
	 * @return a {@link java.net.URL} object
	 */
	URL getStoreUrl();
	
	/**
	 * <p>getBaseUrl.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getBaseUrl();
	
	/**
	 * <p>getCdnAssets.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getCdnAssets();

	String getCdnImages();

}
