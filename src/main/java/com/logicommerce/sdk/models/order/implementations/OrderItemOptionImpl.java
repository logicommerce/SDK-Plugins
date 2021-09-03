package com.logicommerce.sdk.models.order.implementations;

import java.util.List;
import com.logicommerce.sdk.enums.OptionValueType;
import com.logicommerce.sdk.models.order.OrderItemOption;
import com.logicommerce.sdk.models.order.OrderItemOptionValue;
import com.logicommerce.utilities.annotations.Uses;

public class OrderItemOptionImpl implements OrderItemOption {

	private Integer id;

	@Uses(value = OrderItemOptionValueImpl.class)
	private List<OrderItemOptionValue> values;

	private Integer optionId;

	private Integer optionValueId;

	private String sku;

	private String name;

	private String prompt;

	private String value;

	private Double price;

	private double weight;

	private boolean uniquePrice;

	private OptionValueType valueType;

	private double previousPrice;

	private String productOptionPId;

	private boolean combinable;

	public Integer getId() {
		return id;
	}

	public List<OrderItemOptionValue> getValues() {
		return values;
	}

	public Integer getOptionId() {
		return optionId;
	}

	public Integer getOptionValueId() {
		return optionValueId;
	}

	public String getSku() {
		return sku;
	}

	public String getName() {
		return name;
	}

	public String getPrompt() {
		return prompt;
	}

	public String getValue() {
		return value;
	}

	public Double getPrice() {
		return price;
	}

	public double getWeight() {
		return weight;
	}

	public boolean isUniquePrice() {
		return uniquePrice;
	}

	public OptionValueType getValueType() {
		return valueType;
	}

	public double getPreviousPrice() {
		return previousPrice;
	}

	public String getProductOptionPId() {
		return productOptionPId;
	}

	public boolean isCombinable() {
		return combinable;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setValues(List<OrderItemOptionValue> values) {
		this.values = values;
	}

	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

	public void setOptionValueId(Integer optionValueId) {
		this.optionValueId = optionValueId;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setUniquePrice(boolean uniquePrice) {
		this.uniquePrice = uniquePrice;
	}

	public void setValueType(OptionValueType valueType) {
		this.valueType = valueType;
	}

	public void setPreviousPrice(double previousPrice) {
		this.previousPrice = previousPrice;
	}

	public void setProductOptionPId(String productOptionPId) {
		this.productOptionPId = productOptionPId;
	}

	public void setCombinable(boolean combinable) {
		this.combinable = combinable;
	}

}