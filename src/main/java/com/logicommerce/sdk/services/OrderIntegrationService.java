package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.enums.DocumentType;
import com.logicommerce.sdk.models.order.Order;

public interface OrderIntegrationService extends PluginService {

	List<Order> importOrders(DocumentType documentType, String marketplaceId) throws PluginServiceException;

}
