package com.logicommerce.sdk.models.product;

import java.util.Map;

public interface CustomTagSelectableValue {

	String getValue();

	String getImage();

	Map<Integer, CustomTagSelectableValueLanguage> getLanguages();

}
