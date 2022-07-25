package com.logicommerce.sdk.models.payment;

/**
 * <p>PaymentDataNoPayImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PaymentDataNoPayImpl implements PaymentDataNoPay {

	private String token;

	/**
	 * <p>Constructor for PaymentDataNoPayImpl.</p>
	 *
	 * @param token a {@link java.lang.String} object
	 */
	public PaymentDataNoPayImpl(String token) {
		this.token = token;
	}

	/** {@inheritDoc} */
	@Override
	public String getToken() {
		return token;
	}

}
