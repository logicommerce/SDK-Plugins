package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.CalculatedTaxes;
import com.logicommerce.sdk.models.Cart;

/**
 * TaxCalculatorService for Sales Tax Systems
 *
 * @author Logicommerce
 * @since 1.3.0
 */
public interface TaxCalculatorService extends PluginService {

	/**
	 * Calculate the tax for a given cart.
	 *
	 * @param cart a {@link Cart} object
	 * @return a {@link CalculatedTaxes} object
	 * @throws PluginServiceException if any.
	 */
	CalculatedTaxes calculateTax(Cart cart) throws PluginServiceException;

}
