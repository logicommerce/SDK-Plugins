package com.logicommerce.sdk.models.product;

import java.util.List;
import java.util.Map;
import com.logicommerce.utilities.annotations.Uses;

public class ProductImpl implements Product {

	private String productId;

	@Uses(ProductLanguageImpl.class)
	private Map<Integer, ProductLanguage> languages;

	@Uses(ProductImageImpl.class)
	private ProductImage images;

	@Uses(ProductImageImpl.class)
	private List<ProductImage> additionalImages;

	@Uses(ProductCustomTagImpl.class)
	private List<ProductCustomTag> customTags;

	@Uses(AdditionalAttachmentImpl.class)
	private List<AdditionalAttachment> additionalAttachments;

	@Uses(ProductCodesImpl.class)
	private ProductCodes productCodes;

	@Uses(ProductBrandImpl.class)
	private ProductBrand productBrand;

	@Uses(ProductCategoryImpl.class)
	private ProductCategory productCategory;

	@Override
	public String getProductId() {
		return productId;
	}

	@Override
	public Map<Integer, ProductLanguage> getLanguages() {
		return languages;
	}

	@Override
	public ProductImage getImages() {
		return images;
	}

	@Override
	public List<ProductImage> getAdditionalImages() {
		return additionalImages;
	}

	@Override
	public List<ProductCustomTag> getCustomTags() {
		return customTags;
	}

	@Override
	public List<AdditionalAttachment> getAdditionalAttachments() {
		return additionalAttachments;
	}

	@Override
	public ProductCodes getProductCodes() {
		return productCodes;
	}

	@Override
	public ProductBrand getProductBrand() {
		return productBrand;
	}

	@Override
	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public void setLanguages(Map<Integer, ProductLanguage> languages) {
		this.languages = languages;
	}

	public void setImages(ProductImage images) {
		this.images = images;
	}

	public void setAdditionalImages(List<ProductImage> additionalImages) {
		this.additionalImages = additionalImages;
	}

	public void setCustomTags(List<ProductCustomTag> customTags) {
		this.customTags = customTags;
	}

	public void setAdditionalAttachments(List<AdditionalAttachment> additionalAttachments) {
		this.additionalAttachments = additionalAttachments;
	}

	public void setProductCodes(ProductCodes productCodes) {
		this.productCodes = productCodes;
	}

	public void setProductBrand(ProductBrand productBrand) {
		this.productBrand = productBrand;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
}
