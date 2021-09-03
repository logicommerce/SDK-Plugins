package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;

public class ElementPropertyBuilder<T> {

	private T parentBuilder;

	protected String name;

	protected String value;

	public ElementPropertyBuilder() {
		name = "name DEFAULT";
		value = "value DEFAULT";
	}

	public ElementPropertyBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public ElementPropertyBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	public ElementPropertyBuilder<T> value(String value) {
		this.value = value;
		return this;
	}
	
	public ElementProperty build() {
		ElementProperty elementProperty = new ElementProperyImpl();
		elementProperty.setName(name);
		elementProperty.setValue(value);
		return elementProperty;
	}
	
	public T done() {
		return parentBuilder;
	}
}
