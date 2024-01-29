package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.order.Order;
import com.logicommerce.sdk.models.order.ReturnDocument;

/**
 * ReturnService.
 * Allow to create a return in the plugin.
 * 
 * @author LogiCommerce
 * @since 1.3.1
 * 
 */
public interface ReturnService extends PluginService {

	/**
	 * Recieves an order and a credit note when a return is created.
	 * 
	 * @param originalOrder {@link Order} object
	 * @param returnDocument {@link ReturnDocument} object
	 * @throws PluginServiceException if any.
	 */
	void create(Order originalOrder, ReturnDocument returnDocument) throws PluginServiceException;

}

