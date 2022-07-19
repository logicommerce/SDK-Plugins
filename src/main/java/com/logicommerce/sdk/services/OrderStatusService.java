package com.logicommerce.sdk.services;

import com.logicommerce.sdk.enums.OrderStatusType;
import com.logicommerce.sdk.models.order.Order;

/**
 * <p>OrderStatusService interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderStatusService extends PluginService {

	/**
	 * <p>changeStatus.</p>
	 *
	 * @param order a {@link com.logicommerce.sdk.models.order.Order} object
	 * @param previousStatusType a {@link com.logicommerce.sdk.enums.OrderStatusType} object
	 * @param action a {@link java.lang.String} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void changeStatus(Order order, OrderStatusType previousStatusType, String action) throws PluginServiceException;

}
