package com.logicommerce.sdk.builders.order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.enums.OptionValueType;
import com.logicommerce.sdk.models.order.OrderItemOption;
import com.logicommerce.sdk.models.order.implementations.OrderItemOptionImpl;

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

	public OrderItemOptionBuilder() {
		values = new ArrayList<>();
	}

	public OrderItemOptionBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderItemOptionBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	public OrderItemOptionValueBuilder<OrderItemOptionBuilder<T>> optionValue() {
		OrderItemOptionValueBuilder<OrderItemOptionBuilder<T>> optionValue = new OrderItemOptionValueBuilder<>(this);
		values.add(optionValue);
		return optionValue;
	}

	public OrderItemOptionBuilder<T> optionId(Integer optionId) {
		this.optionId = optionId;
		return this;
	}

	public OrderItemOptionBuilder<T> optionValueId(Integer optionValueId) {
		this.optionValueId = optionValueId;
		return this;
	}

	public OrderItemOptionBuilder<T> sku(String sku) {
		this.sku = sku;
		return this;
	}

	public OrderItemOptionBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	public OrderItemOptionBuilder<T> prompt(String prompt) {
		this.prompt = prompt;
		return this;
	}

	public OrderItemOptionBuilder<T> value(String value) {
		this.value = value;
		return this;
	}

	public OrderItemOptionBuilder<T> price(Double price) {
		this.price = price;
		return this;
	}

	public OrderItemOptionBuilder<T> weight(double weight) {
		this.weight = weight;
		return this;
	}

	public OrderItemOptionBuilder<T> uniquePrice(boolean uniquePrice) {
		this.uniquePrice = uniquePrice;
		return this;
	}

	public OrderItemOptionBuilder<T> valueType(OptionValueType valueType) {
		this.valueType = valueType;
		return this;
	}

	public OrderItemOptionBuilder<T> previousPrice(double previousPrice) {
		this.previousPrice = previousPrice;
		return this;
	}

	public OrderItemOptionBuilder<T> productOptionPId(String productOptionPId) {
		this.productOptionPId = productOptionPId;
		return this;
	}

	public OrderItemOptionBuilder<T> combinable(boolean combinable) {
		this.combinable = combinable;
		return this;
	}

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

	public T done() {
		return parentBuilder;
	}
}