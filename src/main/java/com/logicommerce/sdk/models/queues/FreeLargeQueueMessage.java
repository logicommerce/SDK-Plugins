package com.logicommerce.sdk.models.queues;

import java.util.Set;

/**
 * Message to be sent to the queue for free large message type
 * 
 * @Author LogiCommerce
 * @since 1.2.0
 */
public class FreeLargeQueueMessage extends QueueMessage {

	private final String body;

	/**
	 * FreeLargeQueueMessage constructor
	 * 
	 * @param action a {@link String} object
	 * @param attributes a {@link Set} object
	 * @param settings a {@link Settings} object
	 */
	public FreeLargeQueueMessage(String action, Set<Attribute> attributes, Settings settings, String body) {
		super(action, attributes, settings);
		if (body == null) {
			throw new IllegalArgumentException("body cannot be null");
		} else if (body.isEmpty()) {
			throw new IllegalArgumentException("body cannot be empty");
		} else if (body.length() > 1024 * 1024) {
			throw new IllegalArgumentException("body cannot be larger than 1MB");
		}
		this.body = body;
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
	 * Returns the body of the message
	 * @return a {@link String} object
	 */
	public String getBody() {
		return body;
	}

	/**
	 * Returns a {@link QueueMessageBuilder} object
	 * @return a {@link QueueMessageBuilder} object
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	* Builder for the FreeLargeQueueMessage
	*/
	public static final class Builder extends QueueMessageBuilder<Builder> {

		private String body;

		/**
		 * Sets the body of the message
		 * @param body a {@link String} object representing the body of the message and cannot be 
		 * null or empty or larger than 1MB.
		 * @return a {@link Builder} object
		 */
		public Builder body(String body) {
			this.body = body;
			return this;
		}

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		protected QueueMessage build(String action, Set<Attribute> attributes, Settings settings) {
			return new FreeLargeQueueMessage(action, attributes, settings, body);
		}
		
	}

}
