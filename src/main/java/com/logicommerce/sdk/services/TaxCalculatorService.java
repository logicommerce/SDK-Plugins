package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.Cart;
import com.logicommerce.sdk.models.taxes.CalculatedTaxes;

/**
 * TaxCalculatorService for Sales Tax Systems
 *
 * @author Logicommerce
 * @since 1.3.0
 */
public interface TaxCalculatorService extends PluginService {

	/**
	 * Calculate the taxes for a given cart.
	 *
	 * @param cart a {@link Cart} object
	 * @return a {@link CalculatedTaxes} object
	 * @throws PluginServiceException if any.
	 */
	CalculatedTaxes calculateTaxes(Cart cart) throws PluginServiceException;

}
