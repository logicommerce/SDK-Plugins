package com.logicommerce.sdk.models;

/**
 * <p>
 * Category interface. To get product category values.
 * </p>
 *
 * @see		com.logicommerce.sdk.models.Category Category
 * @author 	Logicommerce
 * @since 	1.0.18
 */
public interface Category {

	/**
	 * <p>Get the id for brand.</p>
	 *
	 * @since 1.0.18
	 * @return a {@link java.lang.Integer Integer} object
	 */
	Integer getId();

	/**
	 * <p>Get the name for brand.</p>
	 *
	 * @since 1.0.18
	 * @return a {@link java.lang.String String} object
	 */
	String getName();

}
