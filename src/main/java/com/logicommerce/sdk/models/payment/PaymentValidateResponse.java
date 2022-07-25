package com.logicommerce.sdk.models.payment;

import java.time.LocalDateTime;
import com.logicommerce.sdk.definition.OrderStatusDefinition;
import com.logicommerce.sdk.enums.PaymentValidateResponseType;

/**
 * <p>PaymentValidateResponse interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface PaymentValidateResponse {

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
	 * <p>getMessageLog.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getMessageLog();

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
	 * <p>isPaid.</p>
	 *
	 * @return a boolean
	 */
	boolean isPaid();

	/**
	 * <p>getPaymentDate.</p>
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	LocalDateTime getPaymentDate();

	/**
	 * <p>getType.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.PaymentValidateResponseType} object
	 */
	PaymentValidateResponseType getType();

	/**
	 * <p>getData.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentData} object
	 */
	PaymentData getData();

	/**
	 * <p>getOrderStatus.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.definition.OrderStatusDefinition} object
	 */
	OrderStatusDefinition getOrderStatus();
		
	/**
	 * <p>simulateAbort.</p>
	 *
	 * @return a boolean
	 */
	boolean simulateAbort();
	
	/**
	 * <p>validated.</p>
	 *
	 * @return a boolean
	 */
	boolean validated();

}
