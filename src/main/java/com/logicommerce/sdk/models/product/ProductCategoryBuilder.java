package com.logicommerce.sdk.models.product;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * ProductCategory model builder.
 *
 * @author LogiCommerce
 * @see ProductCategory
 * @param <T> parent builder type
 * @since 2.8.0
 */
public class ProductCategoryBuilder<T> {

	private T parentBuilder;

	private String categoryId;

	private Map<Integer, LanguageBuilder<ProductCategoryBuilder<T>>> languages;

	/**
	 * <p>Constructor for ProductCategoryBuilder.</p>
	 */
	public ProductCategoryBuilder() {
		languages = new LinkedHashMap<>();
	}

	/**
	 * <p>Constructor for ProductCategoryBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public ProductCategoryBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * Sets the id of the product category.
	 *
	 * @param categoryId a {@link java.lang.String} object
	 * @return a {@link ProductCategoryBuilder} object
	 */
	public ProductCategoryBuilder<T> categoryId(String categoryId) {
		this.categoryId = categoryId;
		return this;
	}

	/**
	 * Adds a language to the product category.
	 *
	 * @param languageId a {@link java.lang.Integer} object
	 * @return a {@link LanguageBuilder} object
	 */
	public LanguageBuilder<ProductCategoryBuilder<T>> language(Integer languageId) {
		LanguageBuilder<ProductCategoryBuilder<T>> language = new LanguageBuilder<>(this);
		languages.put(languageId, language);
		return language;
	}

	/**
	 * Builds a {@link ProductCategoryImpl} object.
	 *
	 * @return a {@link ProductCategory} object
	 */
	public ProductCategory build() {
		ProductCategoryImpl category = new ProductCategoryImpl();
		category.setCategoryId(categoryId);
		Map<Integer, Language> builtLanguages = new LinkedHashMap<>();
		languages.forEach((languageId, builder) -> builtLanguages.put(languageId, builder.build()));
		category.setLanguages(builtLanguages);
		return category;
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
