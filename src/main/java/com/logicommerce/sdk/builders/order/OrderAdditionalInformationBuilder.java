package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderAdditionalInformation;
import com.logicommerce.sdk.models.order.implementations.OrderAdditionalInformationImpl;

/**
 * <p>OrderAdditionalInformationBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderAdditionalInformationBuilder<T> {

	protected T parentBuilder;

	protected String name;

	protected String value;

	/**
	 * <p>Constructor for OrderAdditionalInformationBuilder.</p>
	 */
	public OrderAdditionalInformationBuilder() {
	}

	/**
	 * <p>Constructor for OrderAdditionalInformationBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderAdditionalInformationBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderAdditionalInformationBuilder} object
	 */
	public OrderAdditionalInformationBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * <p>value.</p>
	 *
	 * @param value a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderAdditionalInformationBuilder} object
	 */
	public OrderAdditionalInformationBuilder<T> value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderAdditionalInformation} object
	 */
	public OrderAdditionalInformation build() {
		OrderAdditionalInformationImpl information = new OrderAdditionalInformationImpl();
		information.setName(name);
		information.setValue(value);
		return information;
	}

	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
