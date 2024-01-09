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
	 * Validate callback order<br>
	 * Method called when an Order payment is validated.
	 *
	 * @param order a {@link com.logicommerce.sdk.models.order.Order} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void validateCallback(Order order) throws PluginServiceException;

	/**
	 * Start edit order<br>
	 * Method called when an Order is started to be edited.
	 * 
	 * @since 1.3.0
	 * 
	 * @param order a {@link com.logicommerce.sdk.models.order.Order} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void startEdit(Order order) throws PluginServiceException;

	/**
	 * Edit order callback<br>
	 * Method called when an Order is edited and saved.
	 *
	 * @param order a {@link com.logicommerce.sdk.models.order.Order} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void edit(Order order) throws PluginServiceException;

}
