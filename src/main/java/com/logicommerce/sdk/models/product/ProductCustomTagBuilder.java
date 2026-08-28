package com.logicommerce.sdk.models.product;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * ProductCustomTag model builder.
 *
 * @author LogiCommerce
 * @see ProductCustomTag
 * @param <T> parent builder type
 * @since 2.8.0
 */
public class ProductCustomTagBuilder<T> {

	private T parentBuilder;

	private Map<Integer, ProductCustomTagLanguageBuilder<ProductCustomTagBuilder<T>>> languages;

	private CustomTagType type;

	private boolean filtrable;

	private boolean searchable;

	private String id;

	private CustomTagGroupBuilder<ProductCustomTagBuilder<T>> customTagGroup;

	private List<CustomTagSelectableValueBuilder<ProductCustomTagBuilder<T>>> selectableValues;

	/**
	 * <p>Constructor for ProductCustomTagBuilder.</p>
	 */
	public ProductCustomTagBuilder() {
		languages = new LinkedHashMap<>();
		selectableValues = new ArrayList<>();
	}

	/**
	 * <p>Constructor for ProductCustomTagBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public ProductCustomTagBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * Adds a language to the product custom tag.
	 *
	 * @param languageId a {@link java.lang.Integer} object
	 * @return a {@link ProductCustomTagLanguageBuilder} object
	 */
	public ProductCustomTagLanguageBuilder<ProductCustomTagBuilder<T>> language(Integer languageId) {
		ProductCustomTagLanguageBuilder<ProductCustomTagBuilder<T>> language = new ProductCustomTagLanguageBuilder<>(this);
		languages.put(languageId, language);
		return language;
	}

	/**
	 * Sets the type of the product custom tag.
	 *
	 * @param type a {@link CustomTagType} object
	 * @return a {@link ProductCustomTagBuilder} object
	 */
	public ProductCustomTagBuilder<T> type(CustomTagType type) {
		this.type = type;
		return this;
	}

	/**
	 * Sets whether the product custom tag is filtrable.
	 *
	 * @param filtrable a boolean
	 * @return a {@link ProductCustomTagBuilder} object
	 */
	public ProductCustomTagBuilder<T> filtrable(boolean filtrable) {
		this.filtrable = filtrable;
		return this;
	}

	/**
	 * Sets whether the product custom tag is searchable.
	 *
	 * @param searchable a boolean
	 * @return a {@link ProductCustomTagBuilder} object
	 */
	public ProductCustomTagBuilder<T> searchable(boolean searchable) {
		this.searchable = searchable;
		return this;
	}

	/**
	 * Set id for customTag
	 *
	 * @param id a {@link java.lang.String} object
	 * @return a {@link ProductCustomTagBuilder} object
	 */
	public ProductCustomTagBuilder<T> id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Sets the group of the product custom tag.
	 *
	 * @return a {@link CustomTagGroupBuilder} object
	 */
	public CustomTagGroupBuilder<ProductCustomTagBuilder<T>> customTagGroup() {
		customTagGroup = new CustomTagGroupBuilder<>(this);
		return customTagGroup;
	}

	/**
	 * Adds a selectable value (option) to the product custom tag.
	 *
	 * @return a {@link CustomTagSelectableValueBuilder} object
	 */
	public CustomTagSelectableValueBuilder<ProductCustomTagBuilder<T>> selectableValue() {
		CustomTagSelectableValueBuilder<ProductCustomTagBuilder<T>> selectableValue = new CustomTagSelectableValueBuilder<>(this);
		selectableValues.add(selectableValue);
		return selectableValue;
	}

	/**
	 * Builds a {@link ProductCustomTagImpl} object.
	 *
	 * @return a {@link ProductCustomTag} object
	 */
	public ProductCustomTag build() {
		ProductCustomTagImpl customTag = new ProductCustomTagImpl();
		Map<Integer, ProductCustomTagLanguage> builtLanguages = new LinkedHashMap<>();
		languages.forEach((languageId, builder) -> builtLanguages.put(languageId, builder.build()));
		customTag.setLanguages(builtLanguages);
		customTag.setType(type);
		customTag.setFiltrable(filtrable);
		customTag.setSearchable(searchable);
		customTag.setId(id);
		if (customTagGroup != null) {
			customTag.setCustomTagGroup(customTagGroup.build());
		}
		List<CustomTagSelectableValue> builtSelectableValues = new ArrayList<>();
		selectableValues.forEach(builder -> builtSelectableValues.add(builder.build()));
		customTag.setSelectableValues(builtSelectableValues);
		return customTag;
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
