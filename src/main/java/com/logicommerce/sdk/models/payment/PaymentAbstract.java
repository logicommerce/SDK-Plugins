package com.logicommerce.sdk.models.payment;

/**
 * <p>Abstract PaymentAbstract class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public abstract class PaymentAbstract {

	private String message;

	private boolean success;

	private String transactionId;

	private PaymentData data;

	/**
	 * <p>Getter for the field <code>data</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentData} object
	 */
	public PaymentData getData() {
		return data;
	}

	/**
	 * <p>Getter for the field <code>message</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <p>Getter for the field <code>transactionId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * <p>isSuccess.</p>
	 *
	 * @return a boolean
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * <p>Setter for the field <code>message</code>.</p>
	 *
	 * @param message a {@link java.lang.String} object
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * <p>Setter for the field <code>success</code>.</p>
	 *
	 * @param success a boolean
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * <p>Setter for the field <code>transactionId</code>.</p>
	 *
	 * @param transactionId a {@link java.lang.String} object
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * <p>Setter for the field <code>data</code>.</p>
	 *
	 * @param data a {@link com.logicommerce.sdk.models.payment.PaymentData} object
	 */
	public void setData(PaymentData data) {
		this.data = data;
	}

}
