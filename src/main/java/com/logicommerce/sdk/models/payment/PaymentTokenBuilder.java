package com.logicommerce.sdk.models.payment;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>PaymentTokenBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PaymentTokenBuilder {

	private String token;
	private Map<String, String> data;

	/**
	 * <p>token.</p>
	 *
	 * @param token a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentTokenBuilder} object
	 */
	public PaymentTokenBuilder token(String token) {
		this.token = token;
		return this;
	}

	/**
	 * <p>addItem.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentTokenBuilder} object
	 */
	public PaymentTokenBuilder addItem(String name, String value) {
		if (data == null) {
			data = new HashMap<>();
		}
		data.put(name, value);
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentToken} object
	 */
	public PaymentToken build() {
		return new PaymentTokenImpl(token, data);
	}
}
