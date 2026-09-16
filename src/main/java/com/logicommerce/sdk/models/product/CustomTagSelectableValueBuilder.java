package com.logicommerce.sdk.models.product;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * CustomTagSelectableValue model builder.
 *
 * @author LogiCommerce
 * @see CustomTagSelectableValue
 * @param <T> parent builder type
 * @since 2.8.3
 */
public class CustomTagSelectableValueBuilder<T> {

	private T parentBuilder;

	private String value;

	private String image;

	private Map<Integer, CustomTagSelectableValueLanguageBuilder<CustomTagSelectableValueBuilder<T>>> languages;

	/**
	 * <p>Constructor for CustomTagSelectableValueBuilder.</p>
	 */
	public CustomTagSelectableValueBuilder() {
		languages = new LinkedHashMap<>();
	}

	/**
	 * <p>Constructor for CustomTagSelectableValueBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public CustomTagSelectableValueBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * Sets the language-neutral key of the selectable value (Icecat RawValue).
	 *
	 * @param value a {@link java.lang.String} object
	 * @return a {@link CustomTagSelectableValueBuilder} object
	 */
	public CustomTagSelectableValueBuilder<T> value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Sets the image of the selectable value (used by the image control types).
	 *
	 * @param image a {@link java.lang.String} object
	 * @return a {@link CustomTagSelectableValueBuilder} object
	 */
	public CustomTagSelectableValueBuilder<T> image(String image) {
		this.image = image;
		return this;
	}

	/**
	 * Adds a language (label) to the selectable value.
	 *
	 * @param languageId a {@link java.lang.Integer} object
	 * @return a {@link CustomTagSelectableValueLanguageBuilder} object
	 */
	public CustomTagSelectableValueLanguageBuilder<CustomTagSelectableValueBuilder<T>> language(Integer languageId) {
		CustomTagSelectableValueLanguageBuilder<CustomTagSelectableValueBuilder<T>> language =
				new CustomTagSelectableValueLanguageBuilder<>(this);
		languages.put(languageId, language);
		return language;
	}

	/**
	 * Builds a {@link CustomTagSelectableValueImpl} object.
	 *
	 * @return a {@link CustomTagSelectableValue} object
	 */
	public CustomTagSelectableValue build() {
		CustomTagSelectableValueImpl selectableValue = new CustomTagSelectableValueImpl();
		Map<Integer, CustomTagSelectableValueLanguage> builtLanguages = new LinkedHashMap<>();
		languages.forEach((languageId, builder) -> builtLanguages.put(languageId, builder.build()));
		selectableValue.setLanguages(builtLanguages);
		selectableValue.setValue(value);
		selectableValue.setImage(image);
		return selectableValue;
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
