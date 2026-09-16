package com.logicommerce.sdk.models.product;

import java.util.List;
import java.util.Map;
import com.logicommerce.utilities.annotations.Uses;

public class ProductCustomTagImpl implements ProductCustomTag {

	@Uses(ProductCustomTagLanguageImpl.class)
	private Map<Integer, ProductCustomTagLanguage> languages;

	@Uses(CustomTagSelectableValueImpl.class)
	private List<CustomTagSelectableValue> selectableValues;

	private CustomTagType type;

	private boolean filtrable;

	private boolean searchable;

	private String id;

	@Uses(CustomTagGroupImpl.class)
	private CustomTagGroup customTagGroup;

	@Override
	public Map<Integer, ProductCustomTagLanguage> getLanguages() {
		return languages;
	}

	@Override
	public CustomTagType getType() {
		return type;
	}

	@Override
	public boolean isFiltrable() {
		return filtrable;
	}

	@Override
	public boolean isSearchable() {
		return searchable;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public CustomTagGroup getCustomTagGroup() {
		return customTagGroup;
	}

	@Override
	public List<CustomTagSelectableValue> getSelectableValues() {
		return selectableValues;
	}

	public void setSelectableValues(List<CustomTagSelectableValue> selectableValues) {
		this.selectableValues = selectableValues;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setCustomTagGroup(CustomTagGroup customTagGroup) {
		this.customTagGroup = customTagGroup;
	}

	public void setLanguages(Map<Integer, ProductCustomTagLanguage> languages) {
		this.languages = languages;
	}

	public void setType(CustomTagType type) {
		this.type = type;
	}

	public void setFiltrable(boolean filtrable) {
		this.filtrable = filtrable;
	}

	public void setSearchable(boolean searchable) {
		this.searchable = searchable;
	}
}
