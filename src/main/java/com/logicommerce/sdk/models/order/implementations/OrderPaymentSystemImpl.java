package com.logicommerce.sdk.models.order.implementations;

import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.enums.AmountType;
import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;
import com.logicommerce.sdk.models.order.OrderPaymentSystem;
import com.logicommerce.sdk.models.order.OrderTax;
import com.logicommerce.utilities.annotations.NoMappable;
import com.logicommerce.utilities.annotations.Uses;

/**
 * <p>OrderPaymentSystemImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderPaymentSystemImpl implements OrderPaymentSystem {

	private Integer id;

	private int paymentSystemId;

	private List<OrderTax> taxes;

	private String name;

	private AmountType increaseType;

	private double increaseValue;

	private double price;

	private double increaseMin;

	private boolean cashOnDelivery;

	private String property;
	
	@NoMappable
	@Uses(value = ElementProperyImpl.class)
	private List<ElementProperty> properties;

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/**
	 * <p>Getter for the field <code>paymentSystemId</code>.</p>
	 *
	 * @return a int
	 */
	@Override
	public int getPaymentSystemId() {
		return paymentSystemId;
	}

	/**
	 * <p>Getter for the field <code>taxes</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	@Override
	public List<OrderTax> getTaxes() {
		return taxes;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <p>Getter for the field <code>increaseType</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.AmountType} object
	 */
	public AmountType getIncreaseType() {
		return increaseType;
	}

	/**
	 * <p>Getter for the field <code>increaseValue</code>.</p>
	 *
	 * @return a double
	 */
	@Override
	public double getIncreaseValue() {
		return increaseValue;
	}

	/**
	 * <p>Getter for the field <code>price</code>.</p>
	 *
	 * @return a double
	 */
	@Override
	public double getPrice() {
		return price;
	}

	/**
	 * <p>Getter for the field <code>increaseMin</code>.</p>
	 *
	 * @return a double
	 */
	@Override
	public double getIncreaseMin() {
		return increaseMin;
	}

	/**
	 * <p>isCashOnDelivery.</p>
	 *
	 * @return a boolean
	 */
	@Override
	public boolean isCashOnDelivery() {
		return cashOnDelivery;
	}

	/**
	 * <p>Getter for the field <code>property</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@Override
	public String getProperty() {
		return property;
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
	 * <p>Setter for the field <code>paymentSystemId</code>.</p>
	 *
	 * @param paymentSystemId a int
	 */
	public void setPaymentSystemId(int paymentSystemId) {
		this.paymentSystemId = paymentSystemId;
	}

	/**
	 * <p>Setter for the field <code>taxes</code>.</p>
	 *
	 * @param taxes a {@link java.util.List} object
	 */
	public void setTaxes(List<OrderTax> taxes) {
		this.taxes = taxes;
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
	 * <p>Setter for the field <code>increaseType</code>.</p>
	 *
	 * @param increaseType a {@link com.logicommerce.sdk.enums.AmountType} object
	 */
	public void setIncreaseType(AmountType increaseType) {
		this.increaseType = increaseType;
	}

	/**
	 * <p>Setter for the field <code>increaseValue</code>.</p>
	 *
	 * @param increaseValue a double
	 */
	public void setIncreaseValue(double increaseValue) {
		this.increaseValue = increaseValue;
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
	 * <p>Setter for the field <code>increaseMin</code>.</p>
	 *
	 * @param increaseMin a double
	 */
	public void setIncreaseMin(double increaseMin) {
		this.increaseMin = increaseMin;
	}

	/**
	 * <p>Setter for the field <code>cashOnDelivery</code>.</p>
	 *
	 * @param cashOnDelivery a boolean
	 */
	public void setCashOnDelivery(boolean cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}

	/**
	 * <p>Setter for the field <code>property</code>.</p>
	 *
	 * @param property a {@link java.lang.String} object
	 */
	public void setProperty(String property) {
		this.property = property;
	}

	/**
	 * <p>Getter for the field <code>properties</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	public List<ElementProperty> getProperties() {
		return properties;
	}

	/** {@inheritDoc} */
	public void addProperty(ElementProperty property) {
		if (properties == null) {
			properties = new ArrayList<>();
		}
		properties.add(property);
	}

	/** {@inheritDoc} */
	public void addProperty(String name, String value) {
		addProperty(new ElementProperyImpl(name, value));
	}

}
