package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.OrderItemOptionValue;

public class OrderItemOptionValueImpl implements OrderItemOptionValue {

	private Integer id;

	private Integer productOptionValueId;

	private String sku;

	private double weight;

	private double price;

	private double previousPrice;

	private String value;

	private String optionValuePId;

	private boolean noReturn;

	public Integer getId() {
		return id;
	}

	public Integer getProductOptionValueId() {
		return productOptionValueId;
	}

	public String getSku() {
		return sku;
	}

	public double getWeight() {
		return weight;
	}

	public double getPrice() {
		return price;
	}

	public double getPreviousPrice() {
		return previousPrice;
	}

	public String getValue() {
		return value;
	}

	public String getOptionValuePId() {
		return optionValuePId;
	}

	public boolean isNoReturn() {
		return noReturn;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setProductOptionValueId(Integer productOptionValueId) {
		this.productOptionValueId = productOptionValueId;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setPreviousPrice(double previousPrice) {
		this.previousPrice = previousPrice;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setOptionValuePId(String optionValuePId) {
		this.optionValuePId = optionValuePId;
	}

	public void setNoReturn(boolean noReturn) {
		this.noReturn = noReturn;
	}
}