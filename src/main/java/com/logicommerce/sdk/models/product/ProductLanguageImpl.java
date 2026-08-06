package com.logicommerce.sdk.models.product;

public class ProductLanguageImpl implements ProductLanguage {

	private String name;

	private String description;

	private String longDescription;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getLongDescription() {
		return longDescription;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
}
