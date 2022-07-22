package com.logicommerce.sdk.models;

/**
 * <p>
 * Brand interface. To get brand values.
 * </p>
 *
 * @see		com.logicommerce.sdk.models.Brand Brand
 * @author 	Logicommerce
 * @since 	1.0.18
 */
public interface Brand {

	/**
	 * <p>Get the id.</p>
	 *
	 * @since 1.0.18
	 * @return a {@link java.lang.Integer Integer} object
	 */
	Integer getId();

	/**
	 * <p>Get the public id.</p>
	 *
	 * @since 1.0.18
	 * @return a {@link java.lang.String String} object
	 */
	String getPId();

	/**
	 * <p>Get the name.</p>
	 *
	 * @since 1.0.18
	 * @return a {@link java.lang.String String} object
	 */
	String getName();

	/**
	 * <p>Get the URL Seo.</p>
	 *
	 * @since 1.0.18
	 * @return a {@link java.lang.String} object
	 */
	String getUrlSeo();

	/**
	 * <p>Get the image URL path.</p>
	 * <p>Ex. https://test.test/image.png<p>
	 *
	 * @since 1.0.18
	 * @return a {@link java.lang.String} object
	 */
	String getImageUrl();

}
