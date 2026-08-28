package com.logicommerce.sdk.models.product;

public class CustomTagSelectableValueLanguageImpl implements CustomTagSelectableValueLanguage {

	private String name;

	private String description;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
