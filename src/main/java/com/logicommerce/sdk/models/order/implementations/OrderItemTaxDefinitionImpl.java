package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.OrderItemTaxDefinition;

/**
 * <p>OrderItemTaxDefinitionImpl class.</p>
 *
 * @author Logicommerce
 * @since 2.5.2
 */
public class OrderItemTaxDefinitionImpl implements OrderItemTaxDefinition {

	private String name;

	private Integer taxId;

	/**
	 * <p>
	 * Getter for the field <code>name</code>.
	 * </p>
	 * 
	 * return a String object
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <p>
	 * Setter for the field <code>name</code>.
	 * </p>
	 * 
	 * @param name a String object
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>
	 * Getter for the field <code>taxId</code>.
	 * </p>
	 * 
	 * return a Integer object
	 */
	@Override
	public Integer getTaxId() {
		return taxId;
	}

	/**
	 * <p>
	 * Setter for the field <code>taxId</code>.
	 * </p>
	 * 
	 * @param taxId a Integer object
	 */
	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
	}
}
