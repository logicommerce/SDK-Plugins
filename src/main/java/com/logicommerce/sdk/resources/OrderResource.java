package com.logicommerce.sdk.resources;

import java.util.List;

import com.logicommerce.sdk.models.order.Order;
import com.logicommerce.sdk.models.order.list.OrderList;
import com.logicommerce.sdk.models.order.list.OrderListParam;

/**
 * <p>Resource to read the orders of the commerce.</p>
 *
 * <p>{@link #getOrder(int)} and {@link #getOrder(String)} read the order from the database, whatever its status, and
 * return a new {@link Order} on every call, never an instance a hook received. On top of the data a hook receives,
 * that order carries the properties only this resource fills: {@link Order#isTaxesIncluded()},
 * {@link Order#getPurchaseCurrencyAmounts()}, {@link Order#getRMAs()}, {@link Order#getCreditNotes()},
 * {@link Order#getPermalinkUrl()}, {@link com.logicommerce.sdk.models.order.OrderItem#getType()},
 * {@link com.logicommerce.sdk.models.order.OrderItem#getBundleItems()},
 * {@link com.logicommerce.sdk.models.order.OrderBaseStatus#getFromStatus()} and
 * {@link com.logicommerce.sdk.models.order.OrderShipmentItem#getHash()}.</p>
 *
 * <p>The properties stored on the order ({@link com.logicommerce.sdk.models.order.Document#getAdditionalInformation()})
 * are those of every plugin, unfiltered: the plugin that added each one is not exposed, so a plugin must not assume that
 * a value stored under one of its property names was added by itself. Adding a property to the returned order
 * ({@link com.logicommerce.sdk.models.order.Document#addProperty(String, String)}) stores nothing.</p>
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
	 * @return a {@link com.logicommerce.sdk.models.order.Order} object, or null only when the commerce has no order with
	 *         that id (it does not exist, or it belongs to another commerce)
	 * @throws PluginResourceException when the order cannot be read or converted, so that a failure is never mistaken for
	 *         a missing order
	 */
	Order getOrder(int orderId) throws PluginResourceException;

	/**
	 * Returns the order with the given document number, whatever its status.
	 *
	 * @param documentNumber a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.order.Order} object, or null only when the commerce has no order with
	 *         that document number (it does not exist, or it belongs to another commerce)
	 * @throws PluginResourceException when the order cannot be read or converted, so that a failure is never mistaken for
	 *         a missing order
	 */
	Order getOrder(String documentNumber) throws PluginResourceException;

}
