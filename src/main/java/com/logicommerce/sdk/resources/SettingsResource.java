package com.logicommerce.sdk.resources;

/**
 * Settings resource interface
 * 
 * @author LogiCommerce
 * @since 2.7.3
 */
public interface SettingsResource {

	/**
	 * Returns the commerce id.
	 *
	 * @return the commerce id
	 */
	Integer getCommerceId();

	/**
	 * Returns the API back URL.
	 *
	 * @return the API back URL
	 */
	String getApiBackUrl();

	/**
	 * Returns the API front URL.
	 *
	 * @return the API front URL
	 */
	String getApiFrontUrl();

	/**
	 * Returns the API plugins URL.
	 *
	 * @return the API plugins URL
	 * @since 2.8.5
	 */
	String getApiPluginsUrl();

	/**
	 * Returns the environment id.
	 *
	 * @return the environment id
	 */
	Integer getEnvironmentId();

	/**
	 * Returns the commerce's default store URL, independent of the caller's request (unlike
	 * {@link Navigator#getStoreUrl()}).
	 *
	 * @return an absolute URL (scheme, host and an optional path) without a trailing slash, or null when the platform
	 *         does not provide it
	 * @since 2.8.5
	 */
	default String getDefaultStoreUrl() {
		return null;
	}
}
