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
public final class Attribute {

	private final String name;
	private final AttributeType type;
	private final Object value;

	private static final String NAME = "Name";
	private static final String TYPE = "Type";
	private static final String VALUE = "Value";

	/**
	 * Attribute constructor
	 *
	 * @param name a {@link String} object
	 * @param type a {@link AttributeType} object
	 * @param value a {@link Object} object
	 */
	public Attribute(String name, AttributeType type, Object value) {
		Validator.validateKey(NAME, name);
		this.name = name;

		Validator.validateNotNull(TYPE, type);
		this.type = type;

		this.value = prepareValue(value);
	}

	private Object prepareValue(Object value) {
		Validator.validateNotNull(VALUE, value);
		Validator.validateNotEmpty(VALUE, name);
		switch (this.type) {
		case BOOLEAN:
			Validator.validateBooleanValue(VALUE, value);
			return Boolean.valueOf(value.toString());
		case DOUBLE:
			Validator.validateDoubleValue(VALUE, value);
			return Double.valueOf(value.toString());
		case INTEGER:
			Validator.validateIntegerValue(VALUE, value);
			return Integer.valueOf(value.toString());
		default:
			Validator.validateStringValue(VALUE, value);
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
		 * <p>Sets the name of the attribute.</p>
		 * The name cannot be null or empty, can only contain alphanumeric characters and 
		 * underscores and cannot be longer than 100 characters.
		 * 
		 * @param name a {@link String} object
		 * @return a {@link Builder} object
		 */
		public Builder<T> name(String name) {
			this.name = name;
			return this;
		}

		/**
		 * Sets the type of the attribute.
		 * @param type a {@link AttributeType} object
		 * @return a {@link Builder} object
		 */
		public Builder<T> type(AttributeType type) {
			this.type = type;
			return this;
		}

		/**
		 * Sets the value of the attribute.
		 * <p>The value must be of the following types:</p>
		 * <p> - When the type is {@link AttributeType#BOOLEAN}, the value must be a 
		 * {@link Boolean} object.</p>
		 * <p> - When the type is {@link AttributeType#DOUBLE}, the value must be a 
		 * {@link Double} object.</p>
		 * <p> - When the type is {@link AttributeType#INTEGER}, the value must be a 
		 * {@link Integer} object.</p>
		 * <p> - Otherwise, the value must be a {@link String} object. The value cannot be null and
		 * cannot be longer than 250 characters.</p>
		 * 
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
			Validator.validateNotNull("Parent", parent);
			return parent;
		}
	}
}
