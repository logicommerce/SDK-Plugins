package com.logicommerce.sdk.services;

import com.logicommerce.sdk.enums.OrderStatusType;
import com.logicommerce.sdk.models.order.Order;

public interface OrderStatusService extends PluginService {

	void changeStatus(Order order, OrderStatusType previousStatusType, String action) throws PluginServiceException;

}
