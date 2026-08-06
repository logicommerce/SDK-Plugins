package com.logicommerce.sdk.models.product;

/**
 * ProductLanguage model builder.
 *
 * @author LogiCommerce
 * @see ProductLanguage
 * @param <T> parent builder type
 * @since 2.8.0
 */
public class ProductLanguageBuilder<T> {

	private T parentBuilder;

	private String name;

	private String description;

	private String longDescription;

	/**
	 * <p>Constructor for ProductLanguageBuilder.</p>
	 */
	public ProductLanguageBuilder() {
	}

	/**
	 * <p>Constructor for ProductLanguageBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public ProductLanguageBuilder(T parentBuilder) {
		this.parentBuilder = parentBuilder;
	}

	/**
	 * Sets the name of the product language.
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link ProductLanguageBuilder} object
	 */
	public ProductLanguageBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Sets the description of the product language.
	 *
	 * @param description a {@link java.lang.String} object
	 * @return a {@link ProductLanguageBuilder} object
	 */
	public ProductLanguageBuilder<T> description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Sets the long description of the product language.
	 *
	 * @param longDescription a {@link java.lang.String} object
	 * @return a {@link ProductLanguageBuilder} object
	 */
	public ProductLanguageBuilder<T> longDescription(String longDescription) {
		this.longDescription = longDescription;
		return this;
	}

	/**
	 * Builds a {@link ProductLanguageImpl} object.
	 *
	 * @return a {@link ProductLanguage} object
	 */
	public ProductLanguage build() {
		ProductLanguageImpl language = new ProductLanguageImpl();
		language.setName(name);
		language.setDescription(description);
		language.setLongDescription(longDescription);
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
