package com.logicommerce.sdk.models.product;

import java.util.Map;

public interface ProductCategory {

	String getCategoryId();

	Map<Integer, Language> getLanguages();

}
