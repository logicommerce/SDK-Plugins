package com.logicommerce.sdk.models;

/**
 * <p>RowCodes interface. To get codes values of the cart / order item.</p>
 *
 * @see	 com.logicommerce.sdk.models.CartItem CartItem
 * @see	 com.logicommerce.sdk.models.order.OrderItem OrderItem
 * @author Logicommerce
 * @since 1.1.10
 */
public interface RowCodes {

	/**
	 * <p>Get the PID value.</p>
	 *
	 * @return a {@link java.lang.String String} object
	 */
	String getPId();

	/**
	 * <p>getSku.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getSku();

	/**
	 * <p>getJan.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getJan();

	/**
	 * <p>getIsbn.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getIsbn();

	/**
	 * <p>getEan.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getEan();

	/**
	 * <p>getUpc.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getUpc();

	/**
	 * <p>getManufacturerSku.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getManufacturerSku();
	
}
