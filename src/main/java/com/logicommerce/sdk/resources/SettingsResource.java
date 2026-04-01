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
	 * Returns the environment id.
	 *
	 * @return the environment id
	 */
	Integer getEnvironmentId();
}
