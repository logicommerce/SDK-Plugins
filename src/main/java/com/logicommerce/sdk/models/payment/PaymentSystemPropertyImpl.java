package com.logicommerce.sdk.models.payment;

import java.util.Map;

/**
 * <p>PaymentSystemPropertyImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PaymentSystemPropertyImpl implements PaymentSystemProperty {

	private String name;

	private Map<String, String> values;
	
	/**
	 * <p>Constructor for PaymentSystemPropertyImpl.</p>
	 */
	public PaymentSystemPropertyImpl() {

	}

	/**
	 * <p>Constructor for PaymentSystemPropertyImpl.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @param values a {@link java.util.Map} object
	 */
	public PaymentSystemPropertyImpl(String name, Map<String, String> values) {
		setName(name);
		setValues(values);
	}

	/** {@inheritDoc} */
	@Override
	public String getName() {
		return name;
	}

	/** {@inheritDoc} */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/** {@inheritDoc} */
	@Override
	public Map<String, String> getValues() {
		return values;
	}

	/** {@inheritDoc} */
	@Override
	public void setValues(Map<String, String> values) {
		this.values = values;
	}

}
