package com.logicommerce.sdk.models.order;

import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.definition.DefinitionLanguages;
import com.logicommerce.sdk.definition.OrderStatusDefinition;
import com.logicommerce.sdk.definition.implementations.DefinitionLanguagesImpl;
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
 * @since 1.3.4
 */
public class OrderActionResponseBuilder  {

	private boolean paid;
	private OrderStatusDefinition orderStatus;
	private OrderStatusDefinitionImpl.Builder<OrderActionResponseBuilder> orderStatusBuilder;
	private OrderActionStatusType status;
	private List<ElementProperty> properties;
	private DefinitionLanguages message;
	private DefinitionLanguagesImpl.Builder<OrderActionResponseBuilder> messageBuilder;

	public OrderActionResponseBuilder() {
		super();
		this.properties = new ArrayList<>();
	}

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
	 * orderStatus is incoming,<br> 
	 * Set status to OK.
	 * </p>
	 *
	 * @return a PaymentValidateResponseBuilder object
	 */
	public OrderActionResponseBuilder authorized() {
		this.status = OrderActionStatusType.OK;
		Builder<OrderActionResponseBuilder> statusBuilder = new OrderStatusDefinitionImpl.Builder<>();
		statusBuilder.status(OrderStatusType.INCOMING);
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
	
	public DefinitionLanguagesImpl.Builder<OrderActionResponseBuilder> message() {
		if (messageBuilder == null) {
			messageBuilder = new DefinitionLanguagesImpl.Builder<>(returnThis());
		}
		return messageBuilder;
	}
	
	public OrderActionResponseBuilder message(DefinitionLanguages message) {
		this.message = message;		
		return returnThis();
	}

	public OrderActionResponse build() {
		OrderActionResponseImpl orderAction = new OrderActionResponseImpl();
		this.setValues(orderAction);
		return orderAction;
	}
	

	public OrderActionResponseBuilder addProperty(ElementProperty property) {
		if (this.properties == null) {
			this.properties = new ArrayList<>();
		}
		this.properties.add(property);
		return this;
	}
	
	public OrderActionResponseBuilder addProperty(String name, String value) {
		if (name == null || value == null) {
			return this;
		}
		return addProperty(new ElementProperyImpl(name, value));
	}


	/**
	 * <p>Set all the values from orderAction.</p>
	 *
	 * @param orderAction a {@link com.logicommerce.sdk.models.order.OrderActionResponseImpl} object
	 */
	private void setValues(OrderActionResponseImpl orderAction) {
		orderAction.setPaid(paid);
		if (orderStatus != null) {
			orderAction.setOrderStatus(orderStatus);
		} else if (orderStatusBuilder != null) {
			orderAction.setOrderStatus(orderStatusBuilder.build());
		}
		if (message != null) {
			orderAction.setMessage(message);
		} else if (messageBuilder != null) {
			orderAction.setMessage(messageBuilder.build());
		}
		orderAction.setStatus(status);
		orderAction.setProperties(properties);
	}

	public OrderActionResponseBuilder returnThis() {
		return this;
	}

}