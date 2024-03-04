package com.logicommerce.sdk.models;

/**
 * <p>CartWarehouse interface. Get warehouse data related to the cart shipment</p>
 *
 * @see		com.logicommerce.sdk.models.Address Address
 * @see		com.logicommerce.sdk.models.Cart Cart
 * @see		com.logicommerce.sdk.models.CartDelivery CartDelivery
 * @see		com.logicommerce.sdk.models.CartShipment CartShipment
 * @author Logicommerce
 * @since 1.0.16
 */
public interface CartWarehouse extends Address {

	/**
	 * <p>Get country of warehouse.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getCountry();

	/**
	 * <p>get physicalLocationId of warehouse.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.Integer Integer} object
	 */
	Integer getPhysicalLocationId();

	/**
	 * <p>Get OffsetDays of warehouse, this value can alter the delivery date.</p>
	 *
	 * @since 1.0.16
	 * @return a int
	 */
	int getOffsetDays();

	/**
	 * <p>Get needsShipping values, this value indicates if the warehouse need shipping.</p>
	 *
	 * @since 1.0.16
	 * @return a boolean
	 */
	boolean needsShipping();

}
