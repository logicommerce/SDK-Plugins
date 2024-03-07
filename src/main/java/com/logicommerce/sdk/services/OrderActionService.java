package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.definition.PluginActionDefinition;
import com.logicommerce.sdk.enums.ConnectorType;
import com.logicommerce.sdk.models.order.Order;
import com.logicommerce.sdk.models.order.OrderActionResponse;

/**
 * <p>OrderActionService interface.</p>
 *
 * @author Logicommerce
 * @since 1.3.4
 */
public interface OrderActionService extends ActionService {
	
	/**
	 * <p>This method is for define some order action to execute in the plugin.</p>
	 * <p>Action parameter is to know what action should be performed.</p>
	 * <p>Order for the action.</p>
	 *
	 * @param order a {@link com.logicommerce.sdk.models.order.Order} object 
	 * @param action a {@link java.lang.String String} object
	 * @return a {@link com.logicommerce.sdk.models.order.OrderActionResponse OrderActionResponse} object
	 * @since 1.3.4
	 * @throws com.logicommerce.sdk.services.PluginServiceException PluginServiceException if any.
	 */

	OrderActionResponse executeAction(Order order, String action) throws PluginServiceException;
	
	/**
	 * <p>This method is for get all plugin action definitions.</p>
	 * 
	 * @param order a {@link com.logicommerce.sdk.models.order.Order} object 
	 * @param connectorType a{@link java.util.List List} of {@link com.logicommerce.sdk.enums.ConnectorType ConnectorType}
	 * @since 1.3.4
	 * @return a List{@link com.logicommerce.sdk.definition.PluginActionDefinition} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException PluginServiceException if any.
	 */
	
	List<PluginActionDefinition> getActionDefinitons(Order order, List<ConnectorType> connectorType) throws PluginServiceException;
	
}
