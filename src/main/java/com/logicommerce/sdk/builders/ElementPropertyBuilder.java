package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;

/**
 * <p>ElementPropertyBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class ElementPropertyBuilder<T> {

	private T parentBuilder;

	protected String name;

	protected String value;

	/**
	 * <p>Constructor for ElementPropertyBuilder.</p>
	 */
	public ElementPropertyBuilder() {
		name = "name DEFAULT";
		value = "value DEFAULT";
	}

	/**
	 * <p>Constructor for ElementPropertyBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public ElementPropertyBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.ElementPropertyBuilder} object
	 */
	public ElementPropertyBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * <p>value.</p>
	 *
	 * @param value a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.ElementPropertyBuilder} object
	 */
	public ElementPropertyBuilder<T> value(String value) {
		this.value = value;
		return this;
	}
	
	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.ElementProperty} object
	 */
	public ElementProperty build() {
		ElementProperty elementProperty = new ElementProperyImpl();
		elementProperty.setName(name);
		elementProperty.setValue(value);
		return elementProperty;
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
