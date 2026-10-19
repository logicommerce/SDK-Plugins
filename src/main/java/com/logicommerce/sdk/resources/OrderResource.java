package com.logicommerce.sdk.resources;

import java.util.List;
import com.logicommerce.sdk.models.order.Order;
import com.logicommerce.sdk.models.order.list.OrderList;
import com.logicommerce.sdk.models.order.list.OrderListParam;

/**
 * <p>Resource to read the orders of the commerce.</p>
 *
 * <p>{@link #getOrder(int)} and {@link #getOrder(String)} return a new {@link Order} on every call, which also fills
 * the properties that hooks do not receive (such as {@link Order#getPurchaseCurrencyAmounts()} or
 * {@link Order#getRMAs()}).</p>
 *
 * <p>The order's {@link com.logicommerce.sdk.models.order.Document#getAdditionalInformation() properties} include those
 * of every plugin, so a value under one of a plugin's property names may not have been added by that plugin. Adding a
 * property to the returned order stores nothing.</p>
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
	 * Returns the order with the given id, whatever its status.
	 *
	 * @param orderId an int
	 * @return a {@link com.logicommerce.sdk.models.order.Order} object, or null when the commerce has no order with
	 *         that id
	 * @throws PluginResourceException if the order cannot be read
	 */
	Order getOrder(int orderId) throws PluginResourceException;

	/**
	 * Returns the order with the given document number, whatever its status.
	 *
	 * @param documentNumber a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.order.Order} object, or null when the commerce has no order with
	 *         that document number
	 * @throws PluginResourceException if the order cannot be read
	 */
	Order getOrder(String documentNumber) throws PluginResourceException;

}
