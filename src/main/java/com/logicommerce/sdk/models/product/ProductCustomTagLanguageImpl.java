package com.logicommerce.sdk.models.product;

public class ProductCustomTagLanguageImpl implements ProductCustomTagLanguage {

	private String name;

	private String value;

	private String description;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
