package com.logicommerce.sdk.models.product;

import java.util.Map;
import com.logicommerce.utilities.annotations.Uses;

public class CustomTagGroupImpl implements CustomTagGroup {

	private String id;

	@Uses(LanguageImpl.class)
	private Map<Integer, Language> languages;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public Map<Integer, Language> getLanguages() {
		return languages;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setLanguages(Map<Integer, Language> languages) {
		this.languages = languages;
	}
}
