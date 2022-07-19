package com.logicommerce.sdk.models.payment;

/**
 * <p>PaymentDataSimpleBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PaymentDataSimpleBuilder<S, T> extends PaymentDataBuilder<S, T> {

	/**
	 * <p>Constructor for PaymentDataSimpleBuilder.</p>
	 *
	 * @param parentBuilder a S object
	 */
	public PaymentDataSimpleBuilder(S parentBuilder) {
		super(parentBuilder);
	}

	/** {@inheritDoc} */
	@Override
	protected T build() {
		return null;
	}

}
