package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.order.Order;

/**
 * <p>CheckoutService interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.20
 */
public interface CheckoutService {

	/**
	 * Create order callback<br>
	 * This method is called when an Order is created as an Incidence
	 * (before the payment action).
	 *
	 * @param order a {@link com.logicommerce.sdk.models.order.Order} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void createOrderCallback(Order order) throws PluginServiceException;

}
