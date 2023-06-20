package com.logicommerce.sdk.models.queues;

import java.util.Set;
import com.logicommerce.sdk.models.User;

/**
 * Message to be sent to the queue for user message type
 * 
 * @author LogiCommerce
 * @since 1.2.0
 */
public class UserQueueMessage extends QueueMessage {

	private final User user;

	/**
	 * OrderQueueMessage constructor
	 * 
	 * @param action a {@link String} object
	 * @param attributes a {@link Set} object
	 * @param settings a {@link Settings} object
	 * @param user a {@link User} object
	 */
	public UserQueueMessage(String action, Set<Attribute> attributes, Settings settings, User user) {
		super(action, attributes, settings);
		Validator.validateNotNull("User", user);
		this.user = user;
	}

	/**
	 * Returns the type of the message
	 * @return a {@link QueueMessageType} object
	 */
	@Override
	public QueueMessageType getType() {
		return QueueMessageType.USER;
	}

	/**
	 * Returns the user
	 * @return a {@link User} object
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Returns a {@link QueueMessageBuilder} object
	 * @return a {@link QueueMessageBuilder} object
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder for the UserQueueMessage
	 */
	public static final class Builder extends QueueMessageBuilder<Builder> {

		private User user;

		/**
		 * Sets the user
		 * @param user a {@link User} object
		 * @return a {@link Builder} object
		 */
		public Builder user(User user) {
			this.user = user;
			return this;
		}

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		protected QueueMessage build(String action, Set<Attribute> attributes, Settings settings) {
			return new UserQueueMessage(action, attributes, settings, user);
		}
		
	}
}
