package com.logicommerce.sdk.resources;

import java.net.URL;

/**
 * <p>Navigator interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface Navigator {

	/**
	 * <p>getUserAgent.</p>
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
	String getCookie(String name);

	/**
	 * <p>setCookie.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 */
	void setCookie(String name, String value);
	
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
