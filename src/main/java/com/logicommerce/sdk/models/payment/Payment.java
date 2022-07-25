package com.logicommerce.sdk.models.payment;

import com.logicommerce.sdk.enums.PaymentType;

/**
 * <p>Payment interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface Payment {

	/**
	 * <p>isSuccess.</p>
	 *
	 * @return a boolean
	 */
	boolean isSuccess();

	/**
	 * <p>getMessage.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getMessage();
	
	/**
	 * <p>getRedirectUri.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getRedirectUri();

	/**
	 * <p>getTransactionId.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getTransactionId();

	/**
	 * <p>getType.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.PaymentType} object
	 */
	PaymentType getType();

	/**
	 * <p>getData.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentData} object
	 */
	PaymentData getData();

}
