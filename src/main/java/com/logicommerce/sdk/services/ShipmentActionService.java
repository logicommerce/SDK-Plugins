package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.order.OrderActionResponse;
import com.logicommerce.sdk.models.order.OrderShipment;

/**
 * <p>ShipmentActionService interface.</p>
 *
 * @author Logicommerce
 * @since 1.3.4
 */
public interface ShipmentActionService extends ActionService {

	/**
	 * <p>This method is for define some order action to execute in the plugin.</p>
	 * <p>Action parameter is to know what action should be performed.</p>
	 * <p>Order for the action.</p>
	 *
	 * @param orderShipment a {@link com.logicommerce.sdk.models.order.OrderShipment} object 
	 * @param action a {@link java.lang.String String} object
	 * @return a {@link com.logicommerce.sdk.models.order.OrderActionResponse OrderActionResponse} object
	 * @since 1.3.4
	 * @throws com.logicommerce.sdk.services.PluginServiceException PluginServiceException if any.
	 */
	OrderActionResponse executeAction(OrderShipment orderShipment, String action);
	
}
