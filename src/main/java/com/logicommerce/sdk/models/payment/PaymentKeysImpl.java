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

}
