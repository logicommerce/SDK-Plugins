package com.logicommerce.sdk.models.queues;

import java.util.Set;
import com.logicommerce.sdk.models.order.Order;

/**
 * Message to be sent to the queue for order message type
 * 
 * @author LogiCommerce
 * @since 1.2.0
 */
public final class OrderQueueMessage extends QueueMessage {

	private final Order order;

	/**
	 * OrderQueueMessage constructor
	 *
	 * @param action a {@link String} object
	 * @param attributes a {@link Set} object
	 * @param settings a {@link Settings} object
	 * @param order a {@link Order} object
	 */
	public OrderQueueMessage(String action, Set<Attribute> attributes, Settings settings, Order order) {
		super(action, attributes, settings);
		Validator.validateNotNull("Order", order);
		this.order = order;
	}

	/**
	 * Returns the type of the message
	 * @return a {@link QueueMessageType} object
	 */
	@Override
	public QueueMessageType getType() {
		return QueueMessageType.ORDER;
	}

	/**
	 * Returns the order
	 * @return a {@link Order} object
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * Creates a Builder for the OrderQueueMessage
	 * 
	 * @return a {@link Builder} object
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder for the OrderQueueMessage
	 */
	public static final class Builder extends QueueMessageBuilder<Builder> {

		private Order order;
		
		/**
		 * Sets the order
		 * 
		 * @param order a {@link Order} object
		 * @return a {@link Builder} object
		 */
		public Builder order(Order order) {
			this.order = order;
			return this;
		}

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		protected OrderQueueMessage build(String action, Set<Attribute> attributes, Settings settings) {
			return new OrderQueueMessage(action, attributes, settings, order);
		}
	}

}
