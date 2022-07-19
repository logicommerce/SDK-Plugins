package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.order.Order;

/**
 * <p>OrderService interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderService extends PluginService {

	/**
	 * <p>create.</p>
	 *
	 * @param order a {@link com.logicommerce.sdk.models.order.Order} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void create(Order order) throws PluginServiceException;

	/**
	 * <p>edit.</p>
	 *
	 * @param order a {@link com.logicommerce.sdk.models.order.Order} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void edit(Order order) throws PluginServiceException;

}
