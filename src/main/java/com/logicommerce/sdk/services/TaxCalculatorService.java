package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.Cart;

/**
 * TaxCalculatorService for Sales Tax Systems
 *
 * @author Logicommerce
 * @since 1.3.0
 */
public interface TaxCalculatorService {

	/**
	 * Calculate the tax for a given cart.
	 *
	 * @param cart a {@link Cart} object
	 * @return a {@link Object} object
	 * @throws PluginServiceException if any.
	 */
	Object calculateTax(Cart cart) throws PluginServiceException;

}
