package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.Product;

/**
 * Interface to be able to implement the contact service.<br>
 * The methods called when user contact send or product information contact send.
 *
 * @author	Logicommerce
 * @since	1.1.11
 */

public interface ContactService extends PluginService {

	/**
	 * <p>SendContact.<br>When user send contact message</p>
	 *
	 *
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void contactUser() throws PluginServiceException;

	/**
	 * <p>SendProduct.<br>When user send contact product information message</p>
	 *
	 * @param product a {@link com.logicommerce.sdk.models.Product} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void contactProduct(Product product) throws PluginServiceException;
	
	/**
	 * <p>RecommendProduct.<br>When user send recommend product to other contact</p>
	 *
	 * @param product a {@link com.logicommerce.sdk.models.Product} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void recommendProduct(Product product) throws PluginServiceException;

}