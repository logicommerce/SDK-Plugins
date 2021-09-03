package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.CustomTag;
import com.logicommerce.sdk.models.implementations.CustomTagImpl;

public class CustomTagBuilder<T> {

	protected T parentBuilder;

	protected String name;

	protected String value;

	public CustomTagBuilder() {
	}

	public CustomTagBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public CustomTagBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	public CustomTagBuilder<T> value(String value) {
		this.value = value;
		return this;
	}
	
	public CustomTag build() {
		CustomTagImpl customTag = new CustomTagImpl();
		customTag.setName(name);
		customTag.setValue(value);
		return customTag;
	}
	
	public T done() {
		return parentBuilder;
	}
}