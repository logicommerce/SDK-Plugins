package com.logicommerce.sdk.models.order.list;

import com.logicommerce.sdk.enums.AmountType;
import com.logicommerce.sdk.enums.PaymentType;

/**
 * Payment system of an order in order listings.
 *
 * @author LogiCommerce
 * @since 2.8.5
 */
public interface OrderListPaymentSystem {

	/**
	 * Returns the payment system name.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getName();

	/**
	 * Returns the payment system id.
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getPaymentSystemId();

	/**
	 * Returns the payment system plugin id.
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getPaymentSystemPluginId();

	/**
	 * Returns the increase type.
	 *
	 * @return a {@link com.logicommerce.sdk.enums.AmountType} object
	 */
	AmountType getIncreaseType();

	/**
	 * Returns the increase value.
	 *
	 * @return a double
	 */
	double getIncreaseValue();

	/**
	 * Returns the price.
	 *
	 * @return a double
	 */
	double getPrice();

	/**
	 * Returns the minimum increase.
	 *
	 * @return a double
	 */
	double getIncreaseMin();

	/**
	 * Returns the payment type.
	 *
	 * @return a {@link com.logicommerce.sdk.enums.PaymentType} object
	 */
	PaymentType getPaymentType();

	/**
	 * Returns the property.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getProperty();

}
