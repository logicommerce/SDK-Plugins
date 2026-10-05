package com.logicommerce.sdk.resources;

import com.logicommerce.sdk.models.order.OrderView;

/**
 * <p>Order resource interface: reads orders of the commerce by id, from any plugin request, the queue consumer
 * included.</p>
 *
 * <pre>
 * &#64;Resource
 * private OrderResource orderResource;
 * </pre>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface OrderResource {

	/**
	 * Reads an order, whatever its status.
	 *
	 * @param orderId the order id
	 * @return the order, or null only when the commerce has no order with this id (a deleted order row included)
	 * @throws PluginResourceException on any other failure (the order cannot be read or mapped), so that a caller never
	 *         takes a failure for a missing order
	 */
	OrderView getOrder(int orderId) throws PluginResourceException;

}
