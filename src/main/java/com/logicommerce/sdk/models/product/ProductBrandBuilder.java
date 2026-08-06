package com.logicommerce.sdk.models.product;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * ProductBrand model builder.
 *
 * @author LogiCommerce
 * @see ProductBrand
 * @param <T> parent builder type
 * @since 2.8.0
 */
public class ProductBrandBuilder<T> {

	private T parentBuilder;

	private String brandId;

	private Map<Integer, LanguageBuilder<ProductBrandBuilder<T>>> languages;

	/**
	 * <p>Constructor for ProductBrandBuilder.</p>
	 */
	public ProductBrandBuilder() {
		languages = new LinkedHashMap<>();
	}

	/**
	 * <p>Constructor for ProductBrandBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public ProductBrandBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * Sets the id of the product brand.
	 *
	 * @param brandId a {@link java.lang.String} object
	 * @return a {@link ProductBrandBuilder} object
	 */
	public ProductBrandBuilder<T> brandId(String brandId) {
		this.brandId = brandId;
		return this;
	}

	/**
	 * Adds a language to the product brand.
	 *
	 * @param languageId a {@link java.lang.Integer} object
	 * @return a {@link LanguageBuilder} object
	 */
	public LanguageBuilder<ProductBrandBuilder<T>> language(Integer languageId) {
		LanguageBuilder<ProductBrandBuilder<T>> language = new LanguageBuilder<>(this);
		languages.put(languageId, language);
		return language;
	}

	/**
	 * Builds a {@link ProductBrandImpl} object.
	 *
	 * @return a {@link ProductBrand} object
	 */
	public ProductBrand build() {
		ProductBrandImpl brand = new ProductBrandImpl();
		brand.setBrandId(brandId);
		Map<Integer, Language> builtLanguages = new LinkedHashMap<>();
		languages.forEach((languageId, builder) -> builtLanguages.put(languageId, builder.build()));
		brand.setLanguages(builtLanguages);
		return brand;
	}

	/**
	 * Returns the parent builder.
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
