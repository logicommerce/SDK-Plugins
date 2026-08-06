package com.logicommerce.sdk.models.product;

/**
 * ProductCustomTagLanguage model builder.
 *
 * @author LogiCommerce
 * @see ProductCustomTagLanguage
 * @param <T> parent builder type
 * @since 2.8.0
 */
public class ProductCustomTagLanguageBuilder<T> {

	private T parentBuilder;

	private String name;

	private String value;

	private String description;

	/**
	 * <p>Constructor for ProductCustomTagLanguageBuilder.</p>
	 */
	public ProductCustomTagLanguageBuilder() {
	}

	/**
	 * <p>Constructor for ProductCustomTagLanguageBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public ProductCustomTagLanguageBuilder(T parentBuilder) {
		this.parentBuilder = parentBuilder;
	}

	/**
	 * Sets the name of the custom tag language.
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link ProductCustomTagLanguageBuilder} object
	 */
	public ProductCustomTagLanguageBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Sets the value of the custom tag language.
	 *
	 * @param value a {@link java.lang.String} object
	 * @return a {@link ProductCustomTagLanguageBuilder} object
	 */
	public ProductCustomTagLanguageBuilder<T> value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Sets description value of the custom tag language.
	 *
	 * @param description a {@link java.lang.String} object
	 * @return a {@link ProductCustomTagLanguageBuilder} object
	 */
	public ProductCustomTagLanguageBuilder<T> description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Builds a {@link ProductCustomTagLanguageImpl} object.
	 *
	 * @return a {@link ProductCustomTagLanguage} object
	 */
	public ProductCustomTagLanguage build() {
		ProductCustomTagLanguageImpl language = new ProductCustomTagLanguageImpl();
		language.setName(name);
		language.setValue(value);
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
