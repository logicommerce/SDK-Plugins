package com.logicommerce.sdk.models.queues;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Queue message builder
 * 
 * @author LogiCommerce
 * @since 1.2.0
 */
public abstract class QueueMessageBuilder<T extends QueueMessageBuilder<T>> {
	
	private String action;
	private Set<Attribute> attributes;
	private Settings settings;
	private Settings.Builder<T> settingsBuilder;
	private List<Attribute.Builder<T>> attributeBuilders = new ArrayList<>();

	/**
	 * Sets the action of the message
	 * @param action a {@link String} object
	 * @return a {@link QueueMessageBuilder} object
	 */
	public T action(String action) {
		this.action = action;
		return returnThis();
	}

	/**
	 * Sets the attributes of the message
	 * @param attributes a {@link Set}&lt;{@link Attribute}&gt; object
	 * @return a {@link QueueMessageBuilder} object
	 */
	public T attributes(Set<Attribute> attributes) {
		this.attributes = attributes;
		return returnThis();
	}

	/**
	 * Adds an attribute to the message
	 * @return a {@link Attribute.Builder}
	 */
	public Attribute.Builder<T> attribute() {
		Attribute.Builder<T> attributeBuilder = new Attribute.Builder<>(returnThis());
		attributeBuilders.add(attributeBuilder);
		return attributeBuilder;
	}

	/**
	 * Sets the settings of the message
	 * @param settings a {@link Settings} object
	 * @return a {@link QueueMessageBuilder} object
	 */
	public T settings(Settings settings) {
		this.settings = settings;
		return returnThis();
	}

	/**
	 * Sets the settings of the message
	 * @return a {@link Settings.Builder}
	 */
	public Settings.Builder<T> settings() {
		this.settingsBuilder = new Settings.Builder<>(returnThis());
		return this.settingsBuilder;
	}

	/**
	 * Returns this object
	 * @return a {@link QueueMessageBuilder} object
	 */
	protected abstract T returnThis();

	/**
	 * Builds the QueueMessage
	 * @return a {@link QueueMessage} object
	 */
	public QueueMessage build() {
		if (settingsBuilder != null) {
			this.settings = settingsBuilder.build();
		} else if (settings == null) {
			this.settings = Settings.builder().build();
		}
		if (attributeBuilders != null && !attributeBuilders.isEmpty()) {
			this.attributes = attributeBuilders.stream()
				.map(Attribute.Builder::build)
				.collect(java.util.stream.Collectors.toSet());
		}
		return build(action, attributes, settings);
	}

	protected abstract QueueMessage build(String action, Set<Attribute> attributes, Settings settings);

}
