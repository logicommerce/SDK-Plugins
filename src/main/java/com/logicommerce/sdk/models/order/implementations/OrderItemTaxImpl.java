package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.enums.TaxType;
import com.logicommerce.sdk.models.order.OrderItemTax;
import com.logicommerce.sdk.models.order.OrderItemTaxDefinition;

/**
 * <p>OrderItemTaxImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderItemTaxImpl implements OrderItemTax {

	private double base;

	private double taxValue;
	
	private double taxRate;

	private TaxType type;

	private String code;

	private OrderItemTaxDefinition taxDefinition;

	/**
	 * <p>Getter for the field <code>base</code>.</p>
	 *
	 * @return a double
	 */
	public double getBase() {
		return base;
	}

	/**
	 * <p>Getter for the field <code>taxValue</code>.</p>
	 *
	 * @return a double
	 */
	public double getTaxValue() {
		return taxValue;
	}

	/**
	 * <p>Setter for the field <code>base</code>.</p>
	 *
	 * @param base a double
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * <p>Setter for the field <code>taxValue</code>.</p>
	 *
	 * @param taxValue a double
	 */
	public void setTaxValue(double taxValue) {
		this.taxValue = taxValue;
	}

	/**
	 * <p>Getter for the field <code>taxRate</code>.</p>
	 *
	 * @return a double
	 */
	@Override
	public double getTaxRate() {
		return taxRate;
	}

	/**
	 * <p>Setter for the field <code>taxRate</code>.</p>
	 *
	 * @param taxRate a double
	 */
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link TaxType} object
	 */
	@Override
	public TaxType getType() {
		return type;
	}

	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 * 
	 * @param type a {@link TaxType} object
	 */
	public void setType(TaxType type) {
		this.type = type;
	}

	/**
	 * <p>Getter for the field <code>code</code>.</p>
	 * 
	 * return a String object
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <p>Setter for the field <code>code</code>.</p>
	 * 
	 * @param code a String object
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * <p>Getter for the field <code>taxDefinition</code>.</p>
	 * 
	 * @since 2.4.0
	 * @return a {@link OrderItemTaxDefinition} object
     */
	@Override
	public OrderItemTaxDefinition getTaxDefinition() {
		return taxDefinition;
	}

	/**
	 * <p>
	 * Setter for the field <code>taxDefinition</code>.
	 * </p>
	 * 
	 * @since 2.4.0
	 * @param taxDefinition a {@link OrderItemTaxDefinition} object
	 */
	public void setTaxDefinition(OrderItemTaxDefinition taxDefinition) {
		this.taxDefinition = taxDefinition;
	}
	
}
