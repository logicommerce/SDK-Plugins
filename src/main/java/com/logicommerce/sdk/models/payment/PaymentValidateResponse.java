package com.logicommerce.sdk.models.payment;

import java.time.LocalDateTime;
import com.logicommerce.sdk.definition.OrderStatusDefinition;
import com.logicommerce.sdk.enums.PaymentValidateResponseType;
import com.logicommerce.sdk.enums.PaymentValidateStatusType;

/**
 * <p>PaymentValidateResponse interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface PaymentValidateResponse {

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
	 * <p>Get payment validate response type.<br>
	 * 	NO_DATA,<br>
	 *	FORM,<br>
	 *	XML,<br>
	 *	REDIRECT: for a redirect to confirm or denied order.<br>
	 *	WEBHOOK_MESSAGE: for a webhooks requests, print message on screen.</p>
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
	 * <p>
	 * 	Get payment validate response type.<br>
	 * 	SKIP: skip actions,<br>
	 *	VALIDATED: for a order already validated ,<br>
	 *	OK: for validate new order,<br>
	 *	KO: for denied order.<br>
	 *	</p>
	 *
	 * @since 	1.0.22
	 * @return a {@link com.logicommerce.sdk.enums.PaymentValidateStatusType} object
	 */
	PaymentValidateStatusType getStatus();

}
