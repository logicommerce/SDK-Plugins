package com.logicommerce.sdk.models;

/**
 * CartDiscount model
 * 
 * @see Cart
 * @since 1.3.0
 * @author LogiCommerce
 */
public interface CartDiscount {

	/**
	 * Get the identifier of this discount.
	 * 
	 * @since 	1.3.0
	 * @return an int
	 */
	int getDiscountId();

	/**
	 * Get the name of this discount.
	 * 
	 * @since 	1.3.0
	 * @return a {@link String} object
	 */
	String getName();

	/**
	 * Get the description of this discount.
	 * 
	 * @since 	1.3.0
	 * @return a {@link String} object
	 */
	String getDescription();

	/**
	 * Get the type of this discount.
	 * 
	 * @since 	1.3.0
	 * @return a {@link String} object
	 */
	Integer getMultiplier();

	/**
	 * Get the value of this discount.
	 * 
	 * @since 	1.3.0
	 * @return a {@link Double} object
	 */
	double getDiscountValue();

	/**
	 * Get the value with taxes of this discount.
	 * 
	 * @since 	1.3.0
	 * @return a {@link Double} object
	 */
	double getValueWithTaxes();
}
