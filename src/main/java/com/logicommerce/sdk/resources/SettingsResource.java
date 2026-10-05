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
	 * Returns the commerce's default store URL: the storefront URL used when nothing selects a country, language or
	 * group, independent of the caller's request headers (unlike {@link Navigator#getStoreUrl()}). Storefront paths are
	 * appended to it. The default implementation returns null, for platform versions that do not provide it; the
	 * platform that ships this SDK version overrides it.
	 *
	 * @return an absolute URL (scheme, host and an optional path) without a trailing slash, or null when the platform
	 *         does not provide it
	 * @since 2.8.5
	 */
	default String getDefaultStoreUrl() {
		return null;
	}
}
