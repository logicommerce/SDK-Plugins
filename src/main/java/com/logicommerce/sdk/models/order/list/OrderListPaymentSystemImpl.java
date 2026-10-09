package com.logicommerce.sdk.models.order.list;

import com.logicommerce.sdk.enums.AmountType;
import com.logicommerce.sdk.enums.PaymentType;

/**
 * OrderListPaymentSystem implementation.
 *
 * @author LogiCommerce
 * @see OrderListPaymentSystem
 * @since 2.8.5
 */
public class OrderListPaymentSystemImpl implements OrderListPaymentSystem {

	private String name;

	private Integer paymentSystemId;

	private Integer paymentSystemPluginId;

	private AmountType increaseType;

	private double increaseValue;

	private double price;

	private double increaseMin;

	private PaymentType paymentType;

	private String property;

	/** {@inheritDoc} */
	@Override
	public String getName() {
		return name;
	}

	/** {@inheritDoc} */
	@Override
	public Integer getPaymentSystemId() {
		return paymentSystemId;
	}

	/** {@inheritDoc} */
	@Override
	public Integer getPaymentSystemPluginId() {
		return paymentSystemPluginId;
	}

	/** {@inheritDoc} */
	@Override
	public AmountType getIncreaseType() {
		return increaseType;
	}

	/** {@inheritDoc} */
	@Override
	public double getIncreaseValue() {
		return increaseValue;
	}

	/** {@inheritDoc} */
	@Override
	public double getPrice() {
		return price;
	}

	/** {@inheritDoc} */
	@Override
	public double getIncreaseMin() {
		return increaseMin;
	}

	/** {@inheritDoc} */
	@Override
	public PaymentType getPaymentType() {
		return paymentType;
	}

	/** {@inheritDoc} */
	@Override
	public String getProperty() {
		return property;
	}

	/**
	 * Sets the name.
	 *
	 * @param name a String
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the paymentSystemId.
	 *
	 * @param paymentSystemId a Integer
	 */
	public void setPaymentSystemId(Integer paymentSystemId) {
		this.paymentSystemId = paymentSystemId;
	}

	/**
	 * Sets the paymentSystemPluginId.
	 *
	 * @param paymentSystemPluginId a Integer
	 */
	public void setPaymentSystemPluginId(Integer paymentSystemPluginId) {
		this.paymentSystemPluginId = paymentSystemPluginId;
	}

	/**
	 * Sets the increaseType.
	 *
	 * @param increaseType a AmountType
	 */
	public void setIncreaseType(AmountType increaseType) {
		this.increaseType = increaseType;
	}

	/**
	 * Sets the increaseValue.
	 *
	 * @param increaseValue a double
	 */
	public void setIncreaseValue(double increaseValue) {
		this.increaseValue = increaseValue;
	}

	/**
	 * Sets the price.
	 *
	 * @param price a double
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Sets the increaseMin.
	 *
	 * @param increaseMin a double
	 */
	public void setIncreaseMin(double increaseMin) {
		this.increaseMin = increaseMin;
	}

	/**
	 * Sets the paymentType.
	 *
	 * @param paymentType a PaymentType
	 */
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * Sets the property.
	 *
	 * @param property a String
	 */
	public void setProperty(String property) {
		this.property = property;
	}

}
