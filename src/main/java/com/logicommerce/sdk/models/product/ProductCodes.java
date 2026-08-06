package com.logicommerce.sdk.models.product;

import com.logicommerce.sdk.models.CartItem;

/**
 * <p>RowCodes interface. To get codes values of the cart / order item.</p>
 *
 * @see     CartItem CartItem
 * @see	 com.logicommerce.sdk.models.order.OrderItem OrderItem
 * @author Logicommerce
 * @since 1.1.10
 */
public interface ProductCodes {

	/**
	 * <p>Get the PID value.</p>
	 *
	 * @return a {@link String String} object
	 */
	String getPId();

	/**
	 * <p>getSku.</p>
	 *
	 * @return a {@link String} object
	 */
	String getSku();

	/**
	 * <p>getJan.</p>
	 *
	 * @return a {@link String} object
	 */
	String getJan();

	/**
	 * <p>getIsbn.</p>
	 *
	 * @return a {@link String} object
	 */
	String getIsbn();

	/**
	 * <p>getEan.</p>
	 *
	 * @return a {@link String} object
	 */
	String getEan();

	/**
	 * <p>getUpc.</p>
	 *
	 * @return a {@link String} object
	 */
	String getUpc();

	/**
	 * <p>getManufacturerSku.</p>
	 *
	 * @return a {@link String} object
	 */
	String getManufacturerSku();
	
}
