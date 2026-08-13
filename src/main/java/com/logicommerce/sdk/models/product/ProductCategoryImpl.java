package com.logicommerce.sdk.models.product;

import java.util.Map;
import com.logicommerce.utilities.annotations.Uses;

public class ProductCategoryImpl implements ProductCategory {

	private String categoryId;

	@Uses(LanguageImpl.class)
	private Map<Integer, Language> languages;

	@Override
	public String getCategoryId() {
		return categoryId;
	}

	@Override
	public Map<Integer, Language> getLanguages() {
		return languages;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public void setLanguages(Map<Integer, Language> languages) {
		this.languages = languages;
	}
}
