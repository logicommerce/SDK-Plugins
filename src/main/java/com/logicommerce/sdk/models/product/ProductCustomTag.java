package com.logicommerce.sdk.models.product;

import java.util.Map;

public interface ProductCustomTag {

	Map<Integer, ProductCustomTagLanguage> getLanguages();

	String getId();

	CustomTagGroup getCustomTagGroup();

	CustomTagType getType();

	boolean isFiltrable();

	boolean isSearchable();

}
