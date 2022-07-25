package com.logicommerce.sdk.models;

/**
 * <p>CartItemCodes interface. To get codes values of the cart item.</p>
 *
 * @see	 com.logicommerce.sdk.models.CartItem CartItem
 * @author Logicommerce
 * @since 1.0.16
 */
public interface CartItemCodes {

	/**
	 * <p>Get the PID value.</p>
	 *
	 * @since 	1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getPId();

	/**
	 * <p>Get the SKU code value.</p>
	 *
	 * @since 	1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getSku();

	/**
	 * <p>Get the EAN code value.</p>
	 *
	 * @since 	1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getEan();

	/**
	 * <p>Get the ISBN code value.</p>
	 *
	 * @since 	1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getIsbn();

	/**
	 * <p>Get the JAN code value.</p>
	 *
	 * @since 	1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getJan();

	/**
	 * <p>Get the UPC code value.</p>
	 *
	 * @since 	1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getUpc();

}
