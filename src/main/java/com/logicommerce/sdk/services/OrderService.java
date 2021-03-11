package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.order.Order;

public interface OrderService extends PluginService {

	void create(Order order) throws PluginServiceException;

	void edit(Order order) throws PluginServiceException;

}
