package com.logicommerce.sdk.models;

public class ElementProperyImpl implements ElementProperty {

	private String name;

	private String value;

	public ElementProperyImpl() {

	}

	public ElementProperyImpl(String name, String value) {
		setName(name);
		setValue(value);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setValue(String value) {
		this.value = value;
	}
}