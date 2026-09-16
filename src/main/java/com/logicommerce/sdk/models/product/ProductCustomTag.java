package com.logicommerce.sdk.models.product;

import java.util.List;
import java.util.Map;

public interface ProductCustomTag {

	Map<Integer, ProductCustomTagLanguage> getLanguages();

	String getId();

	CustomTagGroup getCustomTagGroup();

	CustomTagType getType();

	boolean isFiltrable();

	boolean isSearchable();

	List<CustomTagSelectableValue> getSelectableValues();

}
