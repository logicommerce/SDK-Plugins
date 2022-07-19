package com.logicommerce.sdk.models.payment;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>PaymentSystemPropertiesImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PaymentSystemPropertiesImpl implements PaymentSystemProperties {
	
	private List<PaymentSystemProperty> properties;
	
	/**
	 * <p>Constructor for PaymentSystemPropertiesImpl.</p>
	 */
	public PaymentSystemPropertiesImpl() {

	}
	
	/**
	 * <p>Constructor for PaymentSystemPropertiesImpl.</p>
	 *
	 * @param properties a {@link java.util.List} object
	 */
	public PaymentSystemPropertiesImpl(List<PaymentSystemProperty> properties) {
		setProperties(properties);
	}
	
	/** {@inheritDoc} */
	@Override
	public List<PaymentSystemProperty> getProperties() {
		return properties;
	}

	/** {@inheritDoc} */
	@Override
	public void setProperties(List<PaymentSystemProperty> properties) {
		this.properties = properties;
	}

	/** {@inheritDoc} */
	@Override
	public void addProperty(PaymentSystemProperty property) {
		if (properties == null) {
			properties = new ArrayList<>();
		}
		properties.add(property);
	}

	/** {@inheritDoc} */
	@Override
	public void clean() {
		if (properties != null) {
			properties.clear();
		}
	}

}
