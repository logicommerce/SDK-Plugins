package com.logicommerce.sdk.models.queues;

import java.util.Set;

/**
 * Message to be sent to the queue for free large message type
 * 
 * @author LogiCommerce
 * @since 1.2.0
 */
public class FreeLargeQueueMessage extends QueueMessage {

	private final String body;

	private static final String BODY = "body";
	private static final int MAX_BODY_SIZE = 1024 * 1024;
	private static final String MAX_BODY_SIZE_MESSAGE = "body cannot be larger than 1MB";

	/**
	 * FreeLargeQueueMessage constructor
	 * 
	 * @param action a {@link String} object
	 * @param attributes a {@link Set} object
	 * @param settings a {@link Settings} object
	 * @param body a {@link String} object representing the body of the message and cannot be null, 
	 * empty or larger than 1MB
	 */
	public FreeLargeQueueMessage(String action, Set<Attribute> attributes, Settings settings, String body) {
		super(action, attributes, settings);
		validate(body);
		this.body = body;
	}

	private void validate(String body) {
		Validator.validateNotNull(BODY, body);
		Validator.validateNotEmpty(BODY, body);
		if (body.length() > MAX_BODY_SIZE) {
			Validator.raiseError(MAX_BODY_SIZE_MESSAGE);
		}
	}

	/**
	 * Returns the type of the message
	 * @return a {@link QueueMessageType} object
	 */
	@Override
	public QueueMessageType getType() {
		return QueueMessageType.FREE_LARGE;
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
		 * null, empty or larger than 1MB.
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
