package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.order.Order;

/**
 * OrderService interface.<br><br>
 * This service can't inject the resources Cart and Storage.
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderService extends PluginService {

	/**
	 * Create order
	 * @deprecated Use CheckoutService.createOrder instead for Order creation
	 * or use validate method for Order with validateCallback payment.
	 * @param order a {@link com.logicommerce.sdk.models.order.Order} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	@Deprecated
	void create(Order order) throws PluginServiceException;

	/**
	 * Validate callback order<br>
	 * Method called when an Order payment is validated.
	 *
	 * @param order a {@link com.logicommerce.sdk.models.order.Order} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void validateCallback(Order order) throws PluginServiceException;

	/**
	 * Edit order callback
	 *
	 * @param order a {@link com.logicommerce.sdk.models.order.Order} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void edit(Order order) throws PluginServiceException;

}
