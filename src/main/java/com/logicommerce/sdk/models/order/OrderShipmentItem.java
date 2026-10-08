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
	 * Returns the {@link OrderItem#getHash()} of the order row (or bundle item) this shipment item ships.
	 *
	 * <p>Only filled by {@link com.logicommerce.sdk.resources.OrderResource}; null otherwise.</p>
	 *
	 * @return the row hash, or null when not available
	 * @since 2.8.5
	 */
	default String getHash() {
		return null;
	}

}
