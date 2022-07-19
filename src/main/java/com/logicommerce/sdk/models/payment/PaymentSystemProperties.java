package com.logicommerce.sdk.models.payment;

import java.util.List;

/**
 * <p>PaymentSystemProperties interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface PaymentSystemProperties {

	/**
	 * <p>getProperties.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<PaymentSystemProperty> getProperties();

	/**
	 * <p>setProperties.</p>
	 *
	 * @param paymentProperties a {@link java.util.List} object
	 */
	void setProperties(List<PaymentSystemProperty> paymentProperties);

	/**
	 * <p>addProperty.</p>
	 *
	 * @param paymentProperty a {@link com.logicommerce.sdk.models.payment.PaymentSystemProperty} object
	 */
	void addProperty(PaymentSystemProperty paymentProperty);

	/**
	 * <p>clean.</p>
	 */
	void clean();

}
