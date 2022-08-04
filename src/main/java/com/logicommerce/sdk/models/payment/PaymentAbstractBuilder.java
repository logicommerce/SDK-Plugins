package com.logicommerce.sdk.models.payment;

import com.logicommerce.sdk.enums.PaymentValidateStatusType;

/**
 * <p>Abstract PaymentAbstractBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public abstract class PaymentAbstractBuilder<S, T> {

	protected boolean success;

	protected String message;

	protected PaymentDataBuilder<S, ?> content;

	protected String transactionId;
	
	protected PaymentValidateStatusType status;

	/**
	 * <p>
	 * Use for validate response success,<br>
	 * Set status to OK.
	 * </p>
	 *
	 * @return a S object
	 */
	public S ok() {
		this.success = true;
		this.status = PaymentValidateStatusType.OK;
		return returnThis();
	}

	/**
	 * <p>
	 * Use for validate response unsuccess,<br>
	 * Set status to KO.
	 * </p>
	 *
	 * @return a S object
	 */
	public S ko() {
		this.success = false;
		this.status = PaymentValidateStatusType.KO;
		return returnThis();
	}

	/**
	 * <p>Use for set message.</p>
	 *
	 * @param message a {@link java.lang.String} object
	 * @return a S object
	 */
	public S message(String message) {
		this.message = message;
		return returnThis();
	}

	/**
	 * <p>Use for set transactionId.</p>
	 *
	 * @param transactionId a {@link java.lang.String} object
	 * @return a S object
	 */
	public S transactionId(String transactionId) {
		this.transactionId = transactionId;
		return returnThis();
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a T object
	 */
	public abstract T build();
	
	/**
	 * <p>returnThis.</p>
	 *
	 * @return a S object
	 */
	public abstract S returnThis();
	
	/**
	 * <p>setItems.</p>
	 *
	 * @param paymentResponse a {@link com.logicommerce.sdk.models.payment.PaymentAbstract} object
	 */
	protected void setItems(PaymentAbstract paymentResponse) {
		paymentResponse.setMessage(message);
		paymentResponse.setSuccess(success);
		paymentResponse.setTransactionId(transactionId);
		if (content != null) {
			paymentResponse.setData((PaymentData) content.build());
		}
	}

}
