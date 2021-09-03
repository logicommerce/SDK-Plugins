package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderItemOptionValue;
import com.logicommerce.sdk.models.order.implementations.OrderItemOptionValueImpl;

public class OrderItemOptionValueBuilder<T> {

	private T parentBuilder;
	
	protected Integer id;

	protected Integer productOptionValueId;

	protected String sku;

	protected double weight;

	protected double price;

	protected double previousPrice;

	protected String value;

	protected String optionValuePId;

	protected boolean noReturn;

	public OrderItemOptionValueBuilder() {

	}

	public OrderItemOptionValueBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	public OrderItemOptionValueBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	public OrderItemOptionValueBuilder<T> productOptionValueId(Integer productOptionValueId) {
		this.productOptionValueId = productOptionValueId;
		return this;
	}

	public OrderItemOptionValueBuilder<T> sku(String sku) {
		this.sku = sku;
		return this;
	}

	public OrderItemOptionValueBuilder<T> weight(double weight) {
		this.weight = weight;
		return this;
	}

	public OrderItemOptionValueBuilder<T> price(double price) {
		this.price = price;
		return this;
	}

	public OrderItemOptionValueBuilder<T> previousPrice(double previousPrice) {
		this.previousPrice = previousPrice;
		return this;
	}

	public OrderItemOptionValueBuilder<T> value(String value) {
		this.value = value;
		return this;
	}

	public OrderItemOptionValueBuilder<T> optionValuePId(String optionValuePId) {
		this.optionValuePId = optionValuePId;
		return this;
	}

	public OrderItemOptionValueBuilder<T> noReturn(boolean noReturn) {
		this.noReturn = noReturn;
		return this;
	}

	public OrderItemOptionValue build() {
		OrderItemOptionValueImpl optionValue = new OrderItemOptionValueImpl();
		optionValue.setId(null);
		optionValue.setProductOptionValueId(productOptionValueId);
		optionValue.setSku(sku);
		optionValue.setWeight(weight);
		optionValue.setPrice(price);
		optionValue.setPreviousPrice(previousPrice);
		optionValue.setValue(value);
		optionValue.setOptionValuePId(optionValuePId);
		optionValue.setNoReturn(noReturn);
		return optionValue;
	}

	public T done() {
		return parentBuilder;
	}
}