package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.definition.PluginActionDefinition;
import com.logicommerce.sdk.enums.ConnectorType;
import com.logicommerce.sdk.models.order.Order;
import com.logicommerce.sdk.models.order.OrderActionResponse;

public interface OrderActionService extends ActionService {

	OrderActionResponse executeAction(Order order, String action) throws PluginServiceException;
	
	List<PluginActionDefinition> getActionDefinitons(Order order, List<ConnectorType> connectorType) throws PluginServiceException;
	
}
