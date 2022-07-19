package com.logicommerce.sdk.builders.order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.enums.OptionValueType;
import com.logicommerce.sdk.models.order.OrderItemOption;
import com.logicommerce.sdk.models.order.implementations.OrderItemOptionImpl;

/**
 * <p>OrderItemOptionBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderItemOptionBuilder<T> {

	private T parentBuilder;
	
	protected Integer id;

	protected List<OrderItemOptionValueBuilder<OrderItemOptionBuilder<T>>> values;

	protected Integer optionId;

	protected Integer optionValueId;

	protected String sku;

	protected String name;

	protected String prompt;

	protected String value;

	protected Double price;

	protected double weight;

	protected boolean uniquePrice;

	protected OptionValueType valueType;

	protected double previousPrice;

	protected String productOptionPId;

	protected boolean combinable;

	/**
	 * <p>Constructor for OrderItemOptionBuilder.</p>
	 */
	public OrderItemOptionBuilder() {
		values = new ArrayList<>();
	}

	/**
	 * <p>Constructor for OrderItemOptionBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderItemOptionBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionBuilder} object
	 */
	public OrderItemOptionBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * <p>optionValue.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionValueBuilder} object
	 */
	public OrderItemOptionValueBuilder<OrderItemOptionBuilder<T>> optionValue() {
		OrderItemOptionValueBuilder<OrderItemOptionBuilder<T>> optionValue = new OrderItemOptionValueBuilder<>(this);
		values.add(optionValue);
		return optionValue;
	}

	/**
	 * <p>optionId.</p>
	 *
	 * @param optionId a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionBuilder} object
	 */
	public OrderItemOptionBuilder<T> optionId(Integer optionId) {
		this.optionId = optionId;
		return this;
	}

	/**
	 * <p>optionValueId.</p>
	 *
	 * @param optionValueId a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionBuilder} object
	 */
	public OrderItemOptionBuilder<T> optionValueId(Integer optionValueId) {
		this.optionValueId = optionValueId;
		return this;
	}

	/**
	 * <p>sku.</p>
	 *
	 * @param sku a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionBuilder} object
	 */
	public OrderItemOptionBuilder<T> sku(String sku) {
		this.sku = sku;
		return this;
	}

	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionBuilder} object
	 */
	public OrderItemOptionBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * <p>prompt.</p>
	 *
	 * @param prompt a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionBuilder} object
	 */
	public OrderItemOptionBuilder<T> prompt(String prompt) {
		this.prompt = prompt;
		return this;
	}

	/**
	 * <p>value.</p>
	 *
	 * @param value a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionBuilder} object
	 */
	public OrderItemOptionBuilder<T> value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * <p>price.</p>
	 *
	 * @param price a {@link java.lang.Double} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionBuilder} object
	 */
	public OrderItemOptionBuilder<T> price(Double price) {
		this.price = price;
		return this;
	}

	/**
	 * <p>weight.</p>
	 *
	 * @param weight a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionBuilder} object
	 */
	public OrderItemOptionBuilder<T> weight(double weight) {
		this.weight = weight;
		return this;
	}

	/**
	 * <p>uniquePrice.</p>
	 *
	 * @param uniquePrice a boolean
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionBuilder} object
	 */
	public OrderItemOptionBuilder<T> uniquePrice(boolean uniquePrice) {
		this.uniquePrice = uniquePrice;
		return this;
	}

	/**
	 * <p>valueType.</p>
	 *
	 * @param valueType a {@link com.logicommerce.sdk.enums.OptionValueType} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionBuilder} object
	 */
	public OrderItemOptionBuilder<T> valueType(OptionValueType valueType) {
		this.valueType = valueType;
		return this;
	}

	/**
	 * <p>previousPrice.</p>
	 *
	 * @param previousPrice a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionBuilder} object
	 */
	public OrderItemOptionBuilder<T> previousPrice(double previousPrice) {
		this.previousPrice = previousPrice;
		return this;
	}

	/**
	 * <p>productOptionPId.</p>
	 *
	 * @param productOptionPId a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionBuilder} object
	 */
	public OrderItemOptionBuilder<T> productOptionPId(String productOptionPId) {
		this.productOptionPId = productOptionPId;
		return this;
	}

	/**
	 * <p>combinable.</p>
	 *
	 * @param combinable a boolean
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionBuilder} object
	 */
	public OrderItemOptionBuilder<T> combinable(boolean combinable) {
		this.combinable = combinable;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderItemOption} object
	 */
	public OrderItemOption build() {
		OrderItemOptionImpl option = new OrderItemOptionImpl();
		option.setId(null);
		option.setValues(values.stream().map(OrderItemOptionValueBuilder::build).collect(Collectors.toList()));
		option.setOptionId(optionId);
		option.setOptionValueId(optionValueId);
		option.setSku(sku);
		option.setName(name);
		option.setPrompt(prompt);
		option.setValue(value);
		option.setPrice(price);
		option.setWeight(weight);
		option.setUniquePrice(uniquePrice);
		option.setValueType(valueType);
		option.setPreviousPrice(previousPrice);
		option.setProductOptionPId(productOptionPId);
		option.setCombinable(combinable);
		return option;
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
