package com.logicommerce.sdk.models.product;

/**
 * CustomTagSelectableValueLanguage model builder.
 *
 * @author LogiCommerce
 * @see CustomTagSelectableValueLanguage
 * @param <T> parent builder type
 * @since 2.8.3
 */
public class CustomTagSelectableValueLanguageBuilder<T> {

	private T parentBuilder;

	private String name;

	private String description;

	/**
	 * <p>Constructor for CustomTagSelectableValueLanguageBuilder.</p>
	 */
	public CustomTagSelectableValueLanguageBuilder() {
	}

	/**
	 * <p>Constructor for CustomTagSelectableValueLanguageBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public CustomTagSelectableValueLanguageBuilder(T parentBuilder) {
		this.parentBuilder = parentBuilder;
	}

	/**
	 * Sets the label of the selectable value for this language.
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link CustomTagSelectableValueLanguageBuilder} object
	 */
	public CustomTagSelectableValueLanguageBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Sets the description of the selectable value for this language.
	 *
	 * @param description a {@link java.lang.String} object
	 * @return a {@link CustomTagSelectableValueLanguageBuilder} object
	 */
	public CustomTagSelectableValueLanguageBuilder<T> description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Builds a {@link CustomTagSelectableValueLanguageImpl} object.
	 *
	 * @return a {@link CustomTagSelectableValueLanguage} object
	 */
	public CustomTagSelectableValueLanguage build() {
		CustomTagSelectableValueLanguageImpl language = new CustomTagSelectableValueLanguageImpl();
		language.setName(name);
		language.setDescription(description);
		return language;
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
