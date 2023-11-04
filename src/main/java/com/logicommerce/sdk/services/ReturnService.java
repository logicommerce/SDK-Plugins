package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.order.CreditNote;
import com.logicommerce.sdk.models.order.Order;

/**
 * ReturnService.
 * Allow to create a return in the plugin.
 * 
 * @author LogiCommerce
 * @since 1.3.0
 * 
 */
public interface ReturnService extends PluginService {

	/**
	 * Create a return.
	 * 
	 * @param originalOrder {@link Order} object
	 * @param creditNote {@link CreditNote} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void create(Order originalOrder, CreditNote creditNote) throws PluginServiceException;

}

