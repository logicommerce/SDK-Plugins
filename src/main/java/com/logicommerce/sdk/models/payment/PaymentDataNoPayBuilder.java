package com.logicommerce.sdk.models.payment;

/**
 * <p>PaymentDataNoPayBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PaymentDataNoPayBuilder<T> extends PaymentDataBuilder<T, PaymentDataNoPay> {

	private String token;

	/**
	 * <p>Constructor for PaymentDataNoPayBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public PaymentDataNoPayBuilder(T parentBuilder) {
		super(parentBuilder);
	}

	/**
	 * <p>token.</p>
	 *
	 * @param token a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentDataNoPayBuilder} object
	 */
	public PaymentDataNoPayBuilder<T> token(String token) {
		this.token = token;
		return this;
	}

	/** {@inheritDoc} */
	@Override
	protected PaymentDataNoPay build() {
		return new PaymentDataNoPayImpl(token);
	}
}
