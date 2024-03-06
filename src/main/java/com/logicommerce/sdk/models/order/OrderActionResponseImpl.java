package com.logicommerce.sdk.models.order;

import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.definition.DefinitionLanguages;
import com.logicommerce.sdk.definition.OrderStatusDefinition;
import com.logicommerce.sdk.enums.OrderActionStatusType;
import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;

/**
 * <p>OrderActionResponseImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.3.4
 */
public class OrderActionResponseImpl implements OrderActionResponse {

	private boolean paid;
	private OrderActionStatusType status;
	private OrderStatusDefinition orderStatus;
	private List<ElementProperty> properties = new ArrayList<>();
	private DefinitionLanguages message;

	/** {@inheritDoc} */
	@Override
	public boolean isPaid() {
		return paid;
	}

	/** {@inheritDoc} */
	@Override
	public OrderStatusDefinition getOrderStatus() {
		return orderStatus;
	}

	/**
	 * <p>Setter for the field <code>paid</code>.</p>
	 *
	 * @param paid a boolean
	 */
	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	/**
	 * <p>Setter for the field <code>orderStatus</code>.</p>
	 *
	 * @param orderStatus a {@link com.logicommerce.sdk.definition.OrderStatusDefinition} object
	 */
	public void setOrderStatus(OrderStatusDefinition orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 * 
	 * @since 1.3.1
	 * @return a {@link com.logicommerce.sdk.enums.PaymentValidateStatusType} object
	 */
	public OrderActionStatusType getStatus() {
		return status;
	}

	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @since 1.3.1
	 * @param status a {@link com.logicommerce.sdk.enums.OrderActionStatusType} object
	 */
	public void setStatus(OrderActionStatusType status) {
		this.status = status;
	}

	/**
	 * <p>Getter for the field <code>properties</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	public List<ElementProperty> getProperties() {
		return properties;
	}

	/**
	 * <p>addProperty.</p>
	 *
	 * @param property a {@link com.logicommerce.sdk.models.ElementProperty} object
	 */
	public void addProperty(ElementProperty property) {
		if (properties == null) {
			properties = new ArrayList<>();
		}
		properties.add(property);
	}

	/**
	 * <p>addProperty.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 */
	public void addProperty(String name, String value) {
		if (name == null || value == null) {
			return;
		}
		addProperty(new ElementProperyImpl(name, value));
	}

	/**
	 * <p>Setter for the field <code>properties</code>.</p>
	 *
	 * @param properties a {@link java.util.List} object
	 */
	public void setProperties(List<ElementProperty> properties) {
		this.properties = properties;
	}

	/** {@inheritDoc} */
	@Override
	public DefinitionLanguages getMessage() {
		return message;
	}

	/**
	 * <p>Setter for the field <code>message</code>.</p>
	 *
	 * @param message a {@link java.lang.String} object
	 */
	public void setMessage(DefinitionLanguages message) {
		this.message = message;
	}

}
