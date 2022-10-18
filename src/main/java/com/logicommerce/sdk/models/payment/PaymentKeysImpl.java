package com.logicommerce.sdk.models.payment;

/**
 * <p>PaymentKeysImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PaymentKeysImpl implements PaymentKeys {

	private String transactionId;

	private String authorizationCode;

	private boolean skipIfOrderIsMissing = false;

	private String message;

	/**
	 * <p>Constructor for PaymentKeysImpl.</p>
	 */
	public PaymentKeysImpl() {

	}

	/**
	 * <p>Constructor for PaymentKeysImpl.</p>
	 *
	 * @param transactionId a {@link java.lang.String} object
	 * @param authorizationCode a {@link java.lang.String} object
	 */
	public PaymentKeysImpl(String transactionId, String authorizationCode) {
		setTransactionId(transactionId);
		setAuthorizationCode(authorizationCode);
		setSkipIfOrderIsMissing(false);
		setMessage("");
	}


	/**
	 * <p>Constructor for PaymentKeysImpl skip case.</p>
	 *
	 * @param transactionId a {@link java.lang.String} object
	 * @param authorizationCode a {@link java.lang.String} object
	 * @param skipIfOrderIsMissing a boolean
	 * @param message a {@link java.lang.String} object
	 * @since 1.1.2
	 */
	public PaymentKeysImpl(String transactionId, String authorizationCode, boolean skipIfOrderIsMissing, String message) {
		setTransactionId(transactionId);
		setAuthorizationCode(authorizationCode);
		setSkipIfOrderIsMissing(skipIfOrderIsMissing);
		setMessage(message);
	}

	/** {@inheritDoc} */
	@Override
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * <p>Setter for the field <code>transactionId</code>.</p>
	 *
	 * @param transactionId a {@link java.lang.String} object
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/** {@inheritDoc} */
	@Override
	public String getAuthorizationCode() {
		return authorizationCode;
	}

	/**
	 * <p>Setter for the field <code>authorizationCode</code>.</p>
	 *
	 * @param authorizationCode a {@link java.lang.String} object
	 */
	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	/** {@inheritDoc} */
	@Override
	public boolean skipIfOrderIsMissing() {
		return skipIfOrderIsMissing;
	}

	/** {@inheritDoc} */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <p>Setter for the field <code>skipIfOrderIsMissing</code>.</p>
	 *
	 * @param skipIfOrderIsMissing a boolean
	 * @since 1.1.2
	 */
	public void setSkipIfOrderIsMissing(boolean skipIfOrderIsMissing) {
		this.skipIfOrderIsMissing = skipIfOrderIsMissing;
	}

	/**
	 * <p>Setter for the field <code>message</code>.</p>
	 *
	 * @param message a {@link java.lang.String} object
	 * @since 1.1.2
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
