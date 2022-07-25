package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.OrderItemOptionValue;

/**
 * <p>OrderItemOptionValueImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
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

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <p>Getter for the field <code>productOptionValueId</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getProductOptionValueId() {
		return productOptionValueId;
	}

	/**
	 * <p>Getter for the field <code>sku</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * <p>Getter for the field <code>weight</code>.</p>
	 *
	 * @return a double
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * <p>Getter for the field <code>price</code>.</p>
	 *
	 * @return a double
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <p>Getter for the field <code>previousPrice</code>.</p>
	 *
	 * @return a double
	 */
	public double getPreviousPrice() {
		return previousPrice;
	}

	/**
	 * <p>Getter for the field <code>value</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <p>Getter for the field <code>optionValuePId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getOptionValuePId() {
		return optionValuePId;
	}

	/**
	 * <p>isNoReturn.</p>
	 *
	 * @return a boolean
	 */
	public boolean isNoReturn() {
		return noReturn;
	}

	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * <p>Setter for the field <code>productOptionValueId</code>.</p>
	 *
	 * @param productOptionValueId a {@link java.lang.Integer} object
	 */
	public void setProductOptionValueId(Integer productOptionValueId) {
		this.productOptionValueId = productOptionValueId;
	}

	/**
	 * <p>Setter for the field <code>sku</code>.</p>
	 *
	 * @param sku a {@link java.lang.String} object
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}

	/**
	 * <p>Setter for the field <code>weight</code>.</p>
	 *
	 * @param weight a double
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * <p>Setter for the field <code>price</code>.</p>
	 *
	 * @param price a double
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * <p>Setter for the field <code>previousPrice</code>.</p>
	 *
	 * @param previousPrice a double
	 */
	public void setPreviousPrice(double previousPrice) {
		this.previousPrice = previousPrice;
	}

	/**
	 * <p>Setter for the field <code>value</code>.</p>
	 *
	 * @param value a {@link java.lang.String} object
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * <p>Setter for the field <code>optionValuePId</code>.</p>
	 *
	 * @param optionValuePId a {@link java.lang.String} object
	 */
	public void setOptionValuePId(String optionValuePId) {
		this.optionValuePId = optionValuePId;
	}

	/**
	 * <p>Setter for the field <code>noReturn</code>.</p>
	 *
	 * @param noReturn a boolean
	 */
	public void setNoReturn(boolean noReturn) {
		this.noReturn = noReturn;
	}
}
