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

}
