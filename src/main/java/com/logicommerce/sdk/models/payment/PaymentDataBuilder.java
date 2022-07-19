package com.logicommerce.sdk.models.payment;

/**
 * <p>Abstract PaymentDataBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public abstract class PaymentDataBuilder<S, T> {

	private S parentBuilder;

	/**
	 * <p>Constructor for PaymentDataBuilder.</p>
	 *
	 * @param parentBuilder a S object
	 */
	protected PaymentDataBuilder(S parentBuilder) {
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>done.</p>
	 *
	 * @return a S object
	 */
	public S done() {
		return parentBuilder;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a T object
	 */
	protected abstract T build();

}
