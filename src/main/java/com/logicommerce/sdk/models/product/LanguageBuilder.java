package com.logicommerce.sdk.models.product;

/**
 * Language model builder.
 *
 * @author LogiCommerce
 * @see Language
 * @param <T> parent builder type
 * @since 2.8.0
 */
public class LanguageBuilder<T> {

	private T parentBuilder;

	private String name;

	private String description;

	/**
	 * <p>Constructor for LanguageBuilder.</p>
	 */
	public LanguageBuilder() {
	}

	/**
	 * <p>Constructor for LanguageBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public LanguageBuilder(T parentBuilder) {
		this.parentBuilder = parentBuilder;
	}

	/**
	 * Sets the name of the language.
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link LanguageBuilder} object
	 */
	public LanguageBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Sets the description of the language.
	 *
	 * @param description a {@link java.lang.String} object
	 * @return a {@link LanguageBuilder} object
	 */
	public LanguageBuilder<T> description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Builds a {@link LanguageImpl} object.
	 *
	 * @return a {@link Language} object
	 */
	public Language build() {
		LanguageImpl language = new LanguageImpl();
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
