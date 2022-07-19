package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.CustomTag;
import com.logicommerce.sdk.models.implementations.CustomTagImpl;

/**
 * <p>CustomTagBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class CustomTagBuilder<T> {

	protected T parentBuilder;

	protected String name;

	protected String value;

	/**
	 * <p>Constructor for CustomTagBuilder.</p>
	 */
	public CustomTagBuilder() {
	}

	/**
	 * <p>Constructor for CustomTagBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public CustomTagBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.CustomTagBuilder} object
	 */
	public CustomTagBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * <p>value.</p>
	 *
	 * @param value a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.CustomTagBuilder} object
	 */
	public CustomTagBuilder<T> value(String value) {
		this.value = value;
		return this;
	}
	
	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.CustomTag} object
	 */
	public CustomTag build() {
		CustomTagImpl customTag = new CustomTagImpl();
		customTag.setName(name);
		customTag.setValue(value);
		return customTag;
	}
	
	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
