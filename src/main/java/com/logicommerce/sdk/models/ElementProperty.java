package com.logicommerce.sdk.models;

/**
 * <p>ElementProperty interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface ElementProperty {

	/**
	 * <p>Get name value of the element.</p>
	 * @since  1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getName();

	/**
	 * <p>Get value of the element.</p>
	 *
	 * @since  1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getValue();

	/**
	 * <p>Set name value of the element.</p>
	 *
	 * @param name a {@link java.lang.String String} object
	 * @since  1.0.16
	 */
	void setName(String name);

	/**
	 * <p>Set value of the element.</p>
	 *
	 * @param value a {@link java.lang.String String} object
	 * @since  1.0.16
	 */
	void setValue(String value);

}
