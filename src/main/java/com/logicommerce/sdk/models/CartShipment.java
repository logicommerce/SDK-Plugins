package com.logicommerce.sdk.models;

import java.util.List;

/**
 * <p>CartShipment interface. Get data related to the shipment of the cart</p>
 *
 * @see		com.logicommerce.sdk.models.Cart Cart
 * @see		com.logicommerce.sdk.models.CartDelivery CartDelivery
 * @see		com.logicommerce.sdk.models.CartShipmentItem CartShipmentItem
 * @see		com.logicommerce.sdk.models.CartWarehouse CartWarehouse
 * @author 	Logicommerce
 * @since 	1.0.16
 */
public interface CartShipment {

	/**
	 * <p>Get Hash value of the shipment, this value identifies the shipment.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getHash();


	/**
	 * Return Shipping
	 * 
	 * @since 1.3.0
	 * @return a {@link com.logicommerce.sdk.models.CartShipping} object
	 */
	CartShipping getShipping();

	/**
	 * <p>Get Items of the shipment.</p>
	 *
	 * @see com.logicommerce.sdk.models.CartShipmentItem CartShipmentItem
	 * @since 1.0.16
	 * @return a {@link java.util.List List}&lt;{@link com.logicommerce.sdk.models.CartShipmentItem CartShipmentItem}&gt; object
	 */
	List<CartShipmentItem> getItems();

	/**
	 * <p>Get total amount of the shipment.</p>
	 *
	 * @since 1.0.16
	 * @return a double
	 */
	double getTotal();

	/**
	 * <p>Get weight of the shipment.</p>
	 *
	 * @since 1.0.16
	 * @return a double
	 */
	double getWeight();

	/**
	 * <p>Get warehouse related to the shipment.</p>
	 *
	 * @see	com.logicommerce.sdk.models.CartWarehouse CartWarehouse
	 * @since 1.0.16
	 * @return a {@link com.logicommerce.sdk.models.CartWarehouse CartWarehouse} object
	 */
	CartWarehouse getWarehouse();

}
