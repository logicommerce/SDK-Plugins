package com.logicommerce.sdk.resources;

import java.util.List;

import com.logicommerce.sdk.models.order.Order;
import com.logicommerce.sdk.models.order.list.OrderList;
import com.logicommerce.sdk.models.order.list.OrderListParam;

/**
 * Resource to read the orders of the commerce.
 *
 * @author LogiCommerce
 * @since 2.8.5
 */
public interface OrderResource {

	/**
	 * Returns a page of orders matching the given filters.
	 *
	 * @param param a {@link com.logicommerce.sdk.models.order.list.OrderListParam} object
	 * @return a {@link java.util.List} of {@link com.logicommerce.sdk.models.order.list.OrderList}
	 * @throws PluginResourceException if any.
	 */
	List<OrderList> getOrders(OrderListParam param) throws PluginResourceException;

	/**
	 * Returns the order with the given id.
	 *
	 * @param orderId an int
	 * @return a {@link com.logicommerce.sdk.models.order.Order} object, or null if it does not exist
	 */
	Order getOrder(int orderId);

	/**
	 * Returns the order with the given document number.
	 *
	 * @param documentNumber a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.order.Order} object, or null if it does not exist
	 */
	Order getOrder(String documentNumber);

}
