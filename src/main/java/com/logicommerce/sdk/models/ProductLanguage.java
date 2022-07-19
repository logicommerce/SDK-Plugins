package com.logicommerce.sdk.models;

import java.util.Map;

/**
 * <p>ProductLanguage interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface ProductLanguage {
	
	/**
	 * <p>getName.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getName();
	
	/**
	 * <p>setName.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 */
	void setName(String name);
	
	/**
	 * <p>getUrlSeo.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getUrlSeo();
	
	/**
	 * <p>setUrlSeo.</p>
	 *
	 * @param urlSeo a {@link java.lang.String} object
	 */
	void setUrlSeo(String urlSeo);
	
	/**
	 * <p>getLinkAttributes.</p>
	 *
	 * @return a {@link java.util.Map} object
	 */
	Map<String, String> getLinkAttributes();
	
	/**
	 * <p>setLinkAttributes.</p>
	 *
	 * @param linkAttributes a {@link java.util.Map} object
	 */
	void setLinkAttributes(Map<String, String> linkAttributes);
	
	/**
	 * <p>addLinkAttribute.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 */
	void addLinkAttribute(String name, String value);

}
