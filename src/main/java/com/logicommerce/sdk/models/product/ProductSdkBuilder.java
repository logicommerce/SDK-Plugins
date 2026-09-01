package com.logicommerce.sdk.models.product;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Product model builder.
 *
 * @author LogiCommerce
 * @see Product
 * @since 2.8.0
 */
public class ProductSdkBuilder {

	private String productId;

	private Map<Integer, ProductLanguageBuilder<ProductSdkBuilder>> languages;

	private ProductImageBuilder<ProductSdkBuilder> images;

	private List<ProductImageBuilder<ProductSdkBuilder>> additionalImages;

	private List<ProductCustomTagBuilder<ProductSdkBuilder>> customTags;

	private ProductCodesBuilder<ProductSdkBuilder> productCodes;

	private ProductBrandBuilder<ProductSdkBuilder> productBrand;

	private ProductCategoryBuilder<ProductSdkBuilder> productCategory;

	/**
	 * <p>Constructor for ProductSdkBuilder.</p>
	 */
	public ProductSdkBuilder() {
		languages = new LinkedHashMap<>();
		additionalImages = new ArrayList<>();
		customTags = new ArrayList<>();
	}

	/**
	 * Sets the product id.
	 *
	 * @param productId a {@link java.lang.String} object
	 * @return a {@link ProductSdkBuilder} object
	 */
	public ProductSdkBuilder productId(String productId) {
		this.productId = productId;
		return this;
	}

	/**
	 * Adds a language to the product.
	 *
	 * @param languageId a {@link java.lang.Integer} object
	 * @return a {@link ProductLanguageBuilder} object
	 */
	public ProductLanguageBuilder<ProductSdkBuilder> language(Integer languageId) {
		ProductLanguageBuilder<ProductSdkBuilder> language = new ProductLanguageBuilder<>(this);
		languages.put(languageId, language);
		return language;
	}

	/**
	 * Adds a language to the product with language builder.
	 *
	 * @param languageId a {@link java.lang.Integer} object
	 * @param language a {@link ProductLanguageBuilder} object
	 * @return a {@link ProductLanguageBuilder} object
	 */
	public ProductLanguageBuilder<ProductSdkBuilder> language(Integer languageId, ProductLanguageBuilder<ProductSdkBuilder> language) {
		languages.put(languageId, language);
		return language;
	}

	/**
	 * Sets the main images of the product.
	 *
	 * @return a {@link ProductImageBuilder} object
	 */
	public ProductImageBuilder<ProductSdkBuilder> images() {
		images = new ProductImageBuilder<>(this);
		return images;
	}

	/**
	 * Adds a new additional image to the product.
	 *
	 * @return a {@link ProductImageBuilder} object
	 */
	public ProductImageBuilder<ProductSdkBuilder> additionalImage() {
		ProductImageBuilder<ProductSdkBuilder> additionalImage = new ProductImageBuilder<>(this);
		additionalImages.add(additionalImage);
		return additionalImage;
	}

	/**
	 * Adds a new custom tag to the product.
	 *
	 * @return a {@link ProductCustomTagBuilder} object
	 */
	public ProductCustomTagBuilder<ProductSdkBuilder> customTag() {
		ProductCustomTagBuilder<ProductSdkBuilder> customTag = new ProductCustomTagBuilder<>(this);
		customTags.add(customTag);
		return customTag;
	}

	/**
	 * Sets the codes of the product.
	 *
	 * @return a {@link ProductCodesBuilder} object
	 */
	public ProductCodesBuilder<ProductSdkBuilder> productCodes() {
		productCodes = new ProductCodesBuilder<>(this);
		return productCodes;
	}

	/**
	 * Sets the brand of the product.
	 *
	 * @return a {@link ProductBrandBuilder} object
	 */
	public ProductBrandBuilder<ProductSdkBuilder> productBrand() {
		productBrand = new ProductBrandBuilder<>(this);
		return productBrand;
	}

	/**
	 * Sets the category of the product.
	 *
	 * @return a {@link ProductCategoryBuilder} object
	 */
	public ProductCategoryBuilder<ProductSdkBuilder> productCategory() {
		productCategory = new ProductCategoryBuilder<>(this);
		return productCategory;
	}

	/**
	 * Builds a {@link ProductImpl} object.
	 *
	 * @return a {@link Product} object
	 */
	public Product build() {
		ProductImpl product = new ProductImpl();
		product.setProductId(productId);
		Map<Integer, ProductLanguage> builtLanguages = new LinkedHashMap<>();
		languages.forEach((languageId, builder) -> builtLanguages.put(languageId, builder.build()));
		product.setLanguages(builtLanguages);
		if (images != null) {
			product.setImages(images.build());
		}
		product.setAdditionalImages(additionalImages.stream().map(ProductImageBuilder::build).collect(Collectors.toList()));
		product.setCustomTags(customTags.stream().map(ProductCustomTagBuilder::build).collect(Collectors.toList()));
		if (productCodes != null) {
			product.setProductCodes(productCodes.build());
		}
		if (productBrand != null) {
			product.setProductBrand(productBrand.build());
		}
		if (productCategory != null) {
			product.setProductCategory(productCategory.build());
		}
		return product;
	}
}
