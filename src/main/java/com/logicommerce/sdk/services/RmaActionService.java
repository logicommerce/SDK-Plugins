package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.order.OrderActionResponse;
import com.logicommerce.sdk.models.order.OrderShipment;

public interface RmaActionService extends ActionService {

	OrderActionResponse processAction(OrderShipment order, String action);
	
}
