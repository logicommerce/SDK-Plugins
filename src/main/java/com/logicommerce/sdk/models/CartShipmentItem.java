package com.logicommerce.sdk.models;

/**
 * <p>CartShipmentItem interface.</p>
 *
 * @see		com.logicommerce.sdk.models.Cart Cart
 * @see		com.logicommerce.sdk.models.CartDelivery CartDelivery
 * @see		com.logicommerce.sdk.models.CartShipment CartShipment
 * @author Logicommerce
 * @since 1.0.16
 */
public interface CartShipmentItem {

	/**
	 * <p>Get Hash value.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getHash();

	/**
	 * <p>Get item Hash value.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getItemHash();

	/**
	 * <p>Get quantity value.</p>
	 *
	 * @since 1.0.16
	 * @return a int
	 */
	int getQuantity();

}
