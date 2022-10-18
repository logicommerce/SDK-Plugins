package com.logicommerce.sdk.models.payment;

/**
 * <p>PaymentKeys interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface PaymentKeys {

	/**
	 * <p>getTransactionId.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getTransactionId();

	/**
	 * <p>getAuthorizationCode.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getAuthorizationCode();

	
	/**
	 * <p>skip action from paymentkeys if order is missing</p>
	 *
	 * @return a {@link java.lang.String} object
	 * @since 1.1.2
	 */
	boolean skipIfOrderIsMissing();
	
	/**
	 * <p>getMessage for paymentkeys</p>
	 *
	 * @return a {@link java.lang.String} object
	 * @since 1.1.2
	 */
	String getMessage();

}
