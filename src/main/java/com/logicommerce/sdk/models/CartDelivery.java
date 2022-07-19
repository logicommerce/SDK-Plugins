package com.logicommerce.sdk.models;

import java.util.List;

/**
 * <p>CartDelivery interface. To obtain data related to the delivery</p>
 * 
 * @see		com.logicommerce.sdk.models.Cart Cart
 * @see		com.logicommerce.sdk.models.CartItem CartItem
 * @see		com.logicommerce.sdk.models.CartShipment CartShipment
 * @author 	Logicommerce
 * @since 	1.0.16
 */
public interface CartDelivery {
	
	/**
	 * <p>Get list of shipments related to the cart.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.util.List List}<{@link com.logicommerce.sdk.models.CartDelivery CartDelivery > object
	 */
	List<CartShipment> getShipments();

}
