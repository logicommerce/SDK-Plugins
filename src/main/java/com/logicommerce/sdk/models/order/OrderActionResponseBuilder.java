package com.logicommerce.sdk.models.order;

import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.definition.OrderStatusDefinition;
import com.logicommerce.sdk.definition.implementations.OrderStatusDefinitionImpl;
import com.logicommerce.sdk.definition.implementations.OrderStatusDefinitionImpl.Builder;
import com.logicommerce.sdk.enums.OrderActionStatusType;
import com.logicommerce.sdk.enums.OrderStatusType;
import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;

/**
 * <p>PaymentValidateResponseBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.3.1
 */
public class OrderActionResponseBuilder  {

	private boolean paid;
	private OrderStatusDefinition orderStatus;
	private OrderStatusDefinitionImpl.Builder<OrderActionResponseBuilder> orderStatusBuilder;
	private OrderActionStatusType status;
	private List<ElementProperty> properties;

	/**
	 * <p>
	 * Use for validate response success,<br>
	 * Set status to OK.
	 * </p>
	 *
	 * @return a PaymentValidateResponseBuilder object
	 */
	public OrderActionResponseBuilder ok() {
		this.status = OrderActionStatusType.OK;
		return returnThis();
	}
	
	/**
	 * <p>
	 * Use for validate response success, but not paid,<br>
	 * orderStatus is pending_confirm,<br> 
	 * Set status to OK.
	 * </p>
	 *
	 * @return a PaymentValidateResponseBuilder object
	 */
	public OrderActionResponseBuilder authorized() {
		this.status = OrderActionStatusType.OK;
		Builder<OrderActionResponseBuilder> statusBuilder = new OrderStatusDefinitionImpl.Builder<>();
		statusBuilder.status(OrderStatusType.PENDING_CONFIRM);
		this.orderStatus = statusBuilder.build();
		return returnThis();
	}

	/**
	 * <p>
	 * Use for action response unsuccess,<br>
	 * Set status to KO.
	 * </p>
	 *
	 * @return a PaymentValidateResponseBuilder object
	 */
	public OrderActionResponseBuilder ko() {
		this.status = OrderActionStatusType.KO;
		return returnThis();
	}


	/**
	 * <p>For set is order is paid.</p>
	 *
	 * @param paid a boolean
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 */
	public OrderActionResponseBuilder paid(boolean paid) {
		this.paid = paid;
		return returnThis();
	}

	/**
	 * <p>For set the order status and substatus from OrderStatusDefiniton.</p>
	 *
	 * @param orderStatus a {@link com.logicommerce.sdk.definition.OrderStatusDefinition} object
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentValidateResponseBuilder} object
	 */
	public OrderActionResponseBuilder orderStatus(OrderStatusDefinition orderStatus) {
		this.orderStatus = orderStatus;
		return returnThis();
	}

	/**
	 * <p>Order status builder.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.definition.implementations.OrderStatusDefinitionImpl.Builder} object
	 */
	public OrderStatusDefinitionImpl.Builder<OrderActionResponseBuilder> orderStatus() {
		if (orderStatusBuilder == null) {
			orderStatusBuilder = new OrderStatusDefinitionImpl.Builder<>(returnThis());
		}
		return orderStatusBuilder;
	}

	public OrderActionResponse build() {
		OrderActionResponseImpl orderAction = new OrderActionResponseImpl();
		setValues(orderAction);
		return orderAction;
	}
	
	/**
	 * <p>Getter for the field <code>properties</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	
	public List<ElementProperty> getProperties() {
		return properties;
	}

	public void addProperty(ElementProperty property) {
		if (properties == null) {
			properties = new ArrayList<>();
		}
		properties.add(property);
	}
	
	public void addProperty(String name, String value) {
		if (name == null || value == null) {
			return;
		}
		addProperty(new ElementProperyImpl(name, value));
	}

	/**
	 * <p>Set all the values from orderAction.</p>
	 *
	 * @param orderAction a {@link com.logicommerce.sdk.models.order.OrderActionResponseImpl} object
	 */
	protected void setValues(OrderActionResponseImpl orderAction) {
		orderAction.setPaid(paid);
		if (orderStatus != null) {
			orderAction.setOrderStatus(orderStatus);
		} else if (orderStatusBuilder != null) {
			orderAction.setOrderStatus(orderStatusBuilder.build());
		}
		orderAction.setStatus(status);
		for (ElementProperty property : this.getProperties()) {
			orderAction.addProperty(property);
		}
	}

	public OrderActionResponseBuilder returnThis() {
		return this;
	}

}