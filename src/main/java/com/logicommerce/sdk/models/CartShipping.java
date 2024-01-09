package com.logicommerce.sdk.models;

import java.util.List;

/**
 * CartShipping interface. To obtain data related to the shipping.
 * 
 * @see com.logicommerce.sdk.models.Cart Cart
 * @see com.logicommerce.sdk.models.CartShipment CartShipment
 * @since 1.3.0
 * @author LogiCommerce
 */
public interface CartShipping {

	/**
	 * Get the shipping name.
	 * 	
	 * @since 1.3.0
	 * @return a {@link java.lang.String String} object
	 */
	String getName();

	/**
	 * Get the price value of shipping.
	 *
	 * @since 1.3.0
	 * @return a {@link java.lang.Double Double} object
	 */
	Double getPrice();

	/**
	 * Get the tax code for shipping if exists. Otherwise, return null.
	 * 
	 * @since 1.3.0
	 * @return a {@link String} object
	 */
	String getTaxCode();

	/**
	 * Get the applied discounts to shipping.
	 * 
	 * @since 1.3.0
	 * @return a {@link List}&lt;{@link CartDiscount}&gt; object
	 */
	List<CartDiscount> getDiscounts();

}
