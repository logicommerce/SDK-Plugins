package com.logicommerce.sdk.models.order;

/**
 * <p>OrderShipmentItem interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderShipmentItem {

	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * <p>getQuantity.</p>
	 *
	 * @return a int
	 */
	int getQuantity();

	/**
	 * <p>getOrderItemId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getOrderItemId();

	/**
	 * <p>getWeight.</p>
	 *
	 * @return a double
	 */
	double getWeight();

	/**
	 * Returns the name of the shipped item, as stored in the shipment.
	 *
	 * <p>Implementations written before 2.8.5 do not override this method and return null.</p>
	 *
	 * @return the item name, or null when not available
	 * @since 2.8.5
	 */
	default String getName() {
		return null;
	}

	/**
	 * Returns the hash of the order row this shipment item ships: the {@link OrderItem#getHash()} of a row of the order,
	 * or of an item of a bundle row ({@link OrderItem#getBundleItems()}). Use it to find that row when
	 * {@link #getOrderItemId()} is null or matches no row.
	 *
	 * <p>Filled only by {@link com.logicommerce.sdk.resources.OrderResource#getOrder(int)} and
	 * {@link com.logicommerce.sdk.resources.OrderResource#getOrder(String)}: null in the orders hooks receive and in the
	 * orders a plugin builds.</p>
	 *
	 * @return the row hash, or null when the platform stored none or when not available
	 * @since 2.8.5
	 */
	default String getHash() {
		return null;
	}

}
