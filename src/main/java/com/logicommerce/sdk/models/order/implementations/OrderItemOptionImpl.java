package com.logicommerce.sdk.models.order.implementations;

import java.util.List;
import com.logicommerce.sdk.enums.OptionValueType;
import com.logicommerce.sdk.models.order.OrderItemOption;
import com.logicommerce.sdk.models.order.OrderItemOptionValue;
import com.logicommerce.utilities.annotations.Uses;

/**
 * <p>OrderItemOptionImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
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

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <p>Getter for the field <code>values</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	public List<OrderItemOptionValue> getValues() {
		return values;
	}

	/**
	 * <p>Getter for the field <code>optionId</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getOptionId() {
		return optionId;
	}

	/**
	 * <p>Getter for the field <code>optionValueId</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getOptionValueId() {
		return optionValueId;
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
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getName() {
		return name;
	}

	/**
	 * <p>Getter for the field <code>prompt</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getPrompt() {
		return prompt;
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
	 * <p>Getter for the field <code>price</code>.</p>
	 *
	 * @return a {@link java.lang.Double} object
	 */
	public Double getPrice() {
		return price;
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
	 * <p>isUniquePrice.</p>
	 *
	 * @return a boolean
	 */
	public boolean isUniquePrice() {
		return uniquePrice;
	}

	/**
	 * <p>Getter for the field <code>valueType</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.OptionValueType} object
	 */
	public OptionValueType getValueType() {
		return valueType;
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
	 * <p>Getter for the field <code>productOptionPId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getProductOptionPId() {
		return productOptionPId;
	}

	/**
	 * <p>isCombinable.</p>
	 *
	 * @return a boolean
	 */
	public boolean isCombinable() {
		return combinable;
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
	 * <p>Setter for the field <code>values</code>.</p>
	 *
	 * @param values a {@link java.util.List} object
	 */
	public void setValues(List<OrderItemOptionValue> values) {
		this.values = values;
	}

	/**
	 * <p>Setter for the field <code>optionId</code>.</p>
	 *
	 * @param optionId a {@link java.lang.Integer} object
	 */
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

	/**
	 * <p>Setter for the field <code>optionValueId</code>.</p>
	 *
	 * @param optionValueId a {@link java.lang.Integer} object
	 */
	public void setOptionValueId(Integer optionValueId) {
		this.optionValueId = optionValueId;
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
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Setter for the field <code>prompt</code>.</p>
	 *
	 * @param prompt a {@link java.lang.String} object
	 */
	public void setPrompt(String prompt) {
		this.prompt = prompt;
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
	 * <p>Setter for the field <code>price</code>.</p>
	 *
	 * @param price a {@link java.lang.Double} object
	 */
	public void setPrice(Double price) {
		this.price = price;
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
	 * <p>Setter for the field <code>uniquePrice</code>.</p>
	 *
	 * @param uniquePrice a boolean
	 */
	public void setUniquePrice(boolean uniquePrice) {
		this.uniquePrice = uniquePrice;
	}

	/**
	 * <p>Setter for the field <code>valueType</code>.</p>
	 *
	 * @param valueType a {@link com.logicommerce.sdk.enums.OptionValueType} object
	 */
	public void setValueType(OptionValueType valueType) {
		this.valueType = valueType;
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
	 * <p>Setter for the field <code>productOptionPId</code>.</p>
	 *
	 * @param productOptionPId a {@link java.lang.String} object
	 */
	public void setProductOptionPId(String productOptionPId) {
		this.productOptionPId = productOptionPId;
	}

	/**
	 * <p>Setter for the field <code>combinable</code>.</p>
	 *
	 * @param combinable a boolean
	 */
	public void setCombinable(boolean combinable) {
		this.combinable = combinable;
	}

}
