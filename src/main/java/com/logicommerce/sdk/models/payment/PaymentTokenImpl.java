package com.logicommerce.sdk.models.payment;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>PaymentTokenImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PaymentTokenImpl implements PaymentToken {

	private String token;
	private Map<String, String> data;

	/**
	 * <p>Constructor for PaymentTokenImpl.</p>
	 */
	public PaymentTokenImpl() {

	}

	/**
	 * <p>Constructor for PaymentTokenImpl.</p>
	 *
	 * @param token a {@link java.lang.String} object
	 * @param data a {@link java.util.Map} object
	 */
	public PaymentTokenImpl(String token, Map<String, String> data) {
		setToken(token);
		setData(data);
	}

	/** {@inheritDoc} */
	@Override
	public String getToken() {
		return token;
	}

	/** {@inheritDoc} */
	@Override
	public void setToken(String token) {
		this.token = token;
	}

	/** {@inheritDoc} */
	@Override
	public Map<String, String> getData() {
		return data;
	}

	/** {@inheritDoc} */
	@Override
	public void setData(Map<String, String> data) {
		this.data = data;
	}

	/** {@inheritDoc} */
	@Override
	public void addItem(String key, String value) {
		if (data == null) {
			data = new HashMap<>();
		}
		data.put(key, value);
	}

}
