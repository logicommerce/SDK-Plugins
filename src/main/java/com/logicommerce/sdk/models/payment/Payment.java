package com.logicommerce.sdk.models.payment;

import com.logicommerce.sdk.enums.PaymentStatusType;
import com.logicommerce.sdk.enums.PaymentType;

/**
 * <p>Payment interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface Payment {

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
	
	/**
	 * <p>
	 * 	Get payment response type.<br>
	 *	OK: for validate new order,<br>
	 *	KO: for denied order.<br>
	 *	</p>
	 *
	 * @since 	1.1.0
	 * @return a {@link com.logicommerce.sdk.enums.PaymentStatusType} object
	 */
	PaymentStatusType getStatus();

}
