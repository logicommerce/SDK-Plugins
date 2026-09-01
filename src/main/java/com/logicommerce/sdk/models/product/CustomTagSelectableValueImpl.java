package com.logicommerce.sdk.models.product;

import java.util.Map;
import com.logicommerce.utilities.annotations.Uses;

public class CustomTagSelectableValueImpl implements CustomTagSelectableValue {

	private String value;

	private String image;

	@Uses(CustomTagSelectableValueLanguageImpl.class)
	private Map<Integer, CustomTagSelectableValueLanguage> languages;

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public String getImage() {
		return image;
	}

	@Override
	public Map<Integer, CustomTagSelectableValueLanguage> getLanguages() {
		return languages;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setLanguages(Map<Integer, CustomTagSelectableValueLanguage> languages) {
		this.languages = languages;
	}
}
