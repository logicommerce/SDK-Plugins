package com.logicommerce.sdk.models.queues;

import java.util.Set;

/**
 * Interface for queue messages
 * 
 * @author LogiCommerce
 * @since 1.2.0
 */
public abstract class QueueMessage {

	private static final int MAX_ATTRIBUTES = 10;

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
		Validator.validateKey("Action", action);
		Validator.validateNotNull("Settings", settings);
		if (attributes != null) {
			if (attributes.size() > MAX_ATTRIBUTES) {
				Validator.raiseError("attributes cannot contain more than %s elements", MAX_ATTRIBUTES);
			} else if (attributes.stream().anyMatch(attribute -> attribute == null)) {
				Validator.raiseError("attributes cannot contain null values");
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
