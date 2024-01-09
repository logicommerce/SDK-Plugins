package com.logicommerce.sdk.models;

/**
 * CartPaymentSystem interface. To obtain data related to the payment system.
 * 
 * @author 	Logicommerce
 * @since 1.3.0
 */
public interface CartPaymentSystem {

	/**
	 * Get the payment system price.
	 * 
	 * @since 1.3.0
	 * @return a double
	 */
	double getPrice();

	/**
	 * Get the payment system taxCode if exists. Otherwise, return null.
	 * 
	 * @since 1.3.0
	 * @return a {@link String} object
	 */
	String getTaxCode();

}
