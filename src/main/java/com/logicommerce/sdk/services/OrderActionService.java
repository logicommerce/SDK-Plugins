package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.order.Order;
import com.logicommerce.sdk.models.order.OrderActionResponse;

public interface OrderActionService extends ActionService {

	OrderActionResponse processAction(Order order, String action) throws PluginServiceException;
	
}
