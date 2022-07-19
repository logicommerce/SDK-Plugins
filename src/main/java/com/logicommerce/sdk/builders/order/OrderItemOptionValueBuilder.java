package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderItemOptionValue;
import com.logicommerce.sdk.models.order.implementations.OrderItemOptionValueImpl;

/**
 * <p>OrderItemOptionValueBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
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

	/**
	 * <p>Constructor for OrderItemOptionValueBuilder.</p>
	 */
	public OrderItemOptionValueBuilder() {

	}

	/**
	 * <p>Constructor for OrderItemOptionValueBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderItemOptionValueBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionValueBuilder} object
	 */
	public OrderItemOptionValueBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * <p>productOptionValueId.</p>
	 *
	 * @param productOptionValueId a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionValueBuilder} object
	 */
	public OrderItemOptionValueBuilder<T> productOptionValueId(Integer productOptionValueId) {
		this.productOptionValueId = productOptionValueId;
		return this;
	}

	/**
	 * <p>sku.</p>
	 *
	 * @param sku a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionValueBuilder} object
	 */
	public OrderItemOptionValueBuilder<T> sku(String sku) {
		this.sku = sku;
		return this;
	}

	/**
	 * <p>weight.</p>
	 *
	 * @param weight a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionValueBuilder} object
	 */
	public OrderItemOptionValueBuilder<T> weight(double weight) {
		this.weight = weight;
		return this;
	}

	/**
	 * <p>price.</p>
	 *
	 * @param price a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionValueBuilder} object
	 */
	public OrderItemOptionValueBuilder<T> price(double price) {
		this.price = price;
		return this;
	}

	/**
	 * <p>previousPrice.</p>
	 *
	 * @param previousPrice a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionValueBuilder} object
	 */
	public OrderItemOptionValueBuilder<T> previousPrice(double previousPrice) {
		this.previousPrice = previousPrice;
		return this;
	}

	/**
	 * <p>value.</p>
	 *
	 * @param value a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionValueBuilder} object
	 */
	public OrderItemOptionValueBuilder<T> value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * <p>optionValuePId.</p>
	 *
	 * @param optionValuePId a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionValueBuilder} object
	 */
	public OrderItemOptionValueBuilder<T> optionValuePId(String optionValuePId) {
		this.optionValuePId = optionValuePId;
		return this;
	}

	/**
	 * <p>noReturn.</p>
	 *
	 * @param noReturn a boolean
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionValueBuilder} object
	 */
	public OrderItemOptionValueBuilder<T> noReturn(boolean noReturn) {
		this.noReturn = noReturn;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderItemOptionValue} object
	 */
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

	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
