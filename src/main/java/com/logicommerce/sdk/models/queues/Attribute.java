package com.logicommerce.sdk.models.queues;

/**
 * Attribute for the message
 * 
 * @see FreeQueueMessage
 * @see AttributeType
 * 
 * @author LogiCommerce	
 * @since 1.2.0
 */
public class Attribute {

	private final String name;
	private final AttributeType type;
	private final Object value;

	/**
	 * Attribute constructor
	 *
	 * @param name a {@link String} object
	 * @param type a {@link AttributeType} object
	 * @param value a {@link Object} object
	 */
	public Attribute(String name, AttributeType type, Object value) {
		validateArguments(name, type, value);
		this.name = name;
		this.type = type;
		this.value = prepareValue(value);

	}

	private void validateArguments(String name, AttributeType type, Object value) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be null or empty");
		} else if (name.length() > 100) {
			throw new IllegalArgumentException("Name cannot be longer than 100 characters");
		} else if (!name.matches("^[a-zA-Z0-9_]+$")) {
			throw new IllegalArgumentException("Name can only contain alphanumeric characters and underscores");
		}
		if (type == null) {
			throw new IllegalArgumentException("Type cannot be null");
		}
		if (value == null) {
			throw new IllegalArgumentException("Value cannot be null");
		}
	}

	private Object prepareValue(Object value) {
		switch (this.type) {
		case BOOLEAN:
			return Boolean.valueOf(value.toString());
		case DOUBLE:
			return Double.valueOf(value.toString());
		case INTEGER:
			return Integer.valueOf(value.toString());
		default:
			return value.toString();
		}
	}

	/**
	 * Returns the name of the attribute
	 * @return a {@link String} object
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the type of the attribute
	 * @return a {@link AttributeType} object
	 */
	public AttributeType getType() {
		return type;
	}

	/**
	 * Returns the value of the attribute
	 * @return a {@link Object} object
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * Returns a {@link Builder} object
	 * @return a {@link Builder} object
	 */
	public static Builder<?> builder() {
		return new Builder<>();
	}

	/**
	 * Builder for the attribute
	 */
	public static final class Builder<T extends QueueMessageBuilder<T>> {

		private T parent;
		private String name;
		private AttributeType type;
		private Object value;

		/**
		 * Builder constructor
		 */
		public Builder() {}

		/**
		 * Builder constructor
		 * @param parent a &lt;T&gt; object
		 */
		public Builder(T parent) {
			this.parent = parent;
		}

		/**
		 * Sets the name of the attribute
		 * @param name a {@link String} object
		 * @return a {@link Builder} object
		 */
		public Builder<T> name(String name) {
			this.name = name;
			return this;
		}

		/**
		 * Sets the type of the attribute
		 * @param type a {@link AttributeType} object
		 * @return a {@link Builder} object
		 */
		public Builder<T> type(AttributeType type) {
			this.type = type;
			return this;
		}

		/**
		 * Sets the value of the attribute
		 * @param value a {@link Object} object
		 * @return a {@link Builder} object
		 */
		public Builder<T> value(Object value) {
			this.value = value;
			return this;
		}

		/**
		 * Builds the attribute
		 * @return a {@link Attribute} object
		 */
		public Attribute build() {
			return new Attribute(name, type, value);
		}

		/**
		 * Returns the parent object
		 * @return a &lt;T&gt; object
		 */
		public T done() {
			if (parent == null) {
				throw new IllegalArgumentException("Parent cannot be null");
			}
			return parent;
		}
	}
}
