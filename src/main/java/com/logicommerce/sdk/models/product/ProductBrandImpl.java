package com.logicommerce.sdk.models.product;

import java.util.Map;
import com.logicommerce.utilities.annotations.Uses;

public class ProductBrandImpl implements ProductBrand {

	private String brandId;

	@Uses(LanguageImpl.class)
	private Map<Integer, Language> languages;

	@Override
	public String getBrandId() {
		return brandId;
	}

	@Override
	public Map<Integer, Language> getLanguages() {
		return languages;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public void setLanguages(Map<Integer, Language> languages) {
		this.languages = languages;
	}
}
