package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderItemTaxDefinition;
import com.logicommerce.sdk.models.order.implementations.OrderItemTaxDefinitionImpl;

/**
 * <p>OrderItemTaxDefinitionBuilder class.</p>
 *
 * @author Logicommerce
 * @since 2.4.0
 */
public class OrderItemTaxDefinitionBuilder<T> {

	private T parentBuilder;

	private Integer taxId;

	private String name;

	/**
	 * <p>Constructor for OrderItemTaxDefinitionBuilder.</p>
	 */
	public OrderItemTaxDefinitionBuilder() {
	}

	/**
	 * <p>Constructor for OrderItemTaxDefinitionBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderItemTaxDefinitionBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>taxId.</p>
	 *
	 * @param taxId a Integer
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemTaxDefinitionBuilder} object
	 */
	public OrderItemTaxDefinitionBuilder<T> taxId(Integer taxId) {
		this.taxId = taxId;
		return this;
	}

	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemTaxDefinitionBuilder} object
	 */
	public OrderItemTaxDefinitionBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderItemTaxDefinition} object
	 */
	public OrderItemTaxDefinition build() {
		OrderItemTaxDefinitionImpl taxDefinition = new OrderItemTaxDefinitionImpl();
		taxDefinition.setTaxId(taxId);
		taxDefinition.setName(name);
		return taxDefinition;
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
