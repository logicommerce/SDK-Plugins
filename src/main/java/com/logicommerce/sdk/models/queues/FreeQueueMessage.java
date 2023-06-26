package com.logicommerce.sdk.models.queues;

import java.util.Set;

/**
 * Message to be sent to the queue for free message type
 * 
 * @author LogiCommerce
 * @since 1.2.0
 */
public final class FreeQueueMessage extends QueueMessage {

	/**
	 * FreeQueueMessage constructor
	 * 
	 * @param action a {@link String} object
	 * @param attributes a {@link Set} object
	 * @param settings a {@link Settings} object
	 */
	public FreeQueueMessage(String action, Set<Attribute> attributes, Settings settings) {
		super(action, attributes, settings);
	}

	/**
	 * Returns the type of the message
	 * @return a {@link QueueMessageType} object
	 */
	@Override
	public QueueMessageType getType() {
		return QueueMessageType.FREE;
	}

	/**
	 * Returns a {@link Builder} object
	 * @return a {@link Builder} object
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder for the FreeQueueMessage
	 */
	public static final class Builder extends QueueMessageBuilder<Builder> {

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		protected QueueMessage build(String action, Set<Attribute> attributes, Settings settings) {
			return new FreeQueueMessage(action, attributes, settings);
		}
		
	}
}
