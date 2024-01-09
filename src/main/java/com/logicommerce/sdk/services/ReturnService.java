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
	 * Recieves an order and a credit note when a return is created.
	 * 
	 * @param originalOrder {@link Order} object
	 * @param creditNote {@link CreditNote} object
	 * @throws PluginServiceException if any.
	 */
	void create(Order originalOrder, CreditNote creditNote) throws PluginServiceException;

}

