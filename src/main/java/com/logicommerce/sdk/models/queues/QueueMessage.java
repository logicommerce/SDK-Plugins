package com.logicommerce.sdk.models.queues;

import java.util.Set;

/**
 * Interface for queue messages
 * 
 * @Author LogiCommerce
 * @since 1.2.0
 */
public abstract class QueueMessage {

	private final String action;
	private final Set<Attribute> attributes;
	private final Settings settings;

	/**
	 * QueueMessage constructor
	 *
	 * @param action a {@link String} object
	 * @param attributes a {@link Set} object
	 * @param settings a {@link Settings} object
	 */
	public QueueMessage(String action, Set<Attribute> attributes, Settings settings) {
		validateArguments(action, attributes, settings);
		this.action = action;
		this.attributes = attributes;
		this.settings = settings;
	}

	private void validateArguments(String action, Set<Attribute> attributes, Settings settings) {
		if (action == null) {
			throw new IllegalArgumentException("action cannot be null");
		} else if (action.isEmpty()) {
			throw new IllegalArgumentException("action cannot be empty");
		} else if (action.length() > 100) {
			throw new IllegalArgumentException("action cannot be longer than 100 characters");
		} else if (!action.matches("^[a-zA-Z0-9_]+$")) {
			throw new IllegalArgumentException("action can only contain alphanumeric characters and underscores");
		}
		if (settings == null) {
			throw new IllegalArgumentException("settings cannot be null");
		}
		if (attributes != null) {
			if (attributes.size() > 10) {
				throw new IllegalArgumentException("attributes cannot contain more than 10 elements");
			} else if (attributes.stream().anyMatch(attribute -> attribute == null)) {
				throw new IllegalArgumentException("attributes cannot contain null values");
			}
		} 
	}

	/**
	 * Returns the type of the message
	 * @return a {@link QueueMessageType} object
	 */
	public abstract QueueMessageType getType();

	/**
	 * Returns the action of the message that will be used on the plugin service
	 * like OrderQueueService, FreeQueueService, etc.
	 * 
	 * @return a {@link String} object
	 */
	public String getAction() {
		return action;
	}

	/**
	 * Returns the attributes of the message
	 * @return a {@link Set}&lt;{@link Attribute}&gt; object
	 */
	public Set<Attribute> getAttributes() {
		return attributes;
	}

	/**
	 * Returns the settings of the message
	 * @return a {@link Settings} object
	 */
	public Settings getSettings() {
		return settings;
	}

}
