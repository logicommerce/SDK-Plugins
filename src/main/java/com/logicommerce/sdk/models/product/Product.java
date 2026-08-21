package com.logicommerce.sdk.models.product;

import java.util.List;
import java.util.Map;

public interface Product {

	String getProductId();

	Map<Integer, ProductLanguage> getLanguages();

	ProductImage getImages();

	List<ProductImage> getAdditionalImages();

	List<ProductCustomTag> getCustomTags();

	List<AdditionalAttachment> getAdditionalAttachments();

	ProductCodes getProductCodes();

	ProductBrand getProductBrand();

	ProductCategory getProductCategory();

}
