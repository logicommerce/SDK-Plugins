package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.models.order.Order;

public interface OrderIntegrationService extends PluginService {

	// Per QAShops o similars, importació de comandes
	List<Order> importOrders(String data) throws PluginServiceException;

}
