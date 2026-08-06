package com.logicommerce.sdk.models.product;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * CustomTagGroup model builder.
 *
 * @author LogiCommerce
 * @see CustomTagGroup
 * @param <T> parent builder type
 * @since 2.8.0
 */
public class CustomTagGroupBuilder<T> {

	private T parentBuilder;

	private String id;

	private Map<Integer, LanguageBuilder<CustomTagGroupBuilder<T>>> languages;

	/**
	 * <p>Constructor for CustomTagGroupBuilder.</p>
	 */
	public CustomTagGroupBuilder() {
		languages = new LinkedHashMap<>();
	}

	/**
	 * <p>Constructor for CustomTagGroupBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public CustomTagGroupBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * Sets the id of the custom tag group.
	 *
	 * @param id a {@link java.lang.String} object
	 * @return a {@link CustomTagGroupBuilder} object
	 */
	public CustomTagGroupBuilder<T> id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Adds a language to the custom tag group.
	 *
	 * @param languageId a {@link java.lang.Integer} object
	 * @return a {@link LanguageBuilder} object
	 */
	public LanguageBuilder<CustomTagGroupBuilder<T>> language(Integer languageId) {
		LanguageBuilder<CustomTagGroupBuilder<T>> language = new LanguageBuilder<>(this);
		languages.put(languageId, language);
		return language;
	}

	/**
	 * Builds a {@link CustomTagGroupImpl} object.
	 *
	 * @return a {@link CustomTagGroup} object
	 */
	public CustomTagGroup build() {
		CustomTagGroupImpl group = new CustomTagGroupImpl();
		group.setId(id);
		Map<Integer, Language> builtLanguages = new LinkedHashMap<>();
		languages.forEach((languageId, builder) -> builtLanguages.put(languageId, builder.build()));
		group.setLanguages(builtLanguages);
		return group;
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
