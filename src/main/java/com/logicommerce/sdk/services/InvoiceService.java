package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.order.Order;

/**
 * InvoiceService interface.<br><br>
 * This service can't inject the resources Cart and Storage.
 *
 * @author LogiCommerce
 * @since 2.4.0
 */
public interface InvoiceService extends PluginService {

	/**
	 * Process invoice from order<br>
	 * Method called when an Order is processed to generate the invoice.
	 * 
	 * @param order a {@link com.logicommerce.sdk.models.order.Order} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	Order createInvoice(Order order) throws PluginServiceException;

	/**
	 * Validate invoice<br>
	 * Method called when an Invoice is validated.
	 *
	 * @param order a {@link com.logicommerce.sdk.models.order.Order} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	Order creditNote(Order order) throws PluginServiceException;
}
