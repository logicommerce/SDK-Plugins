package com.logicommerce.sdk.models;

import java.util.List;
import com.logicommerce.sdk.enums.CartItemType;

/**
 * <p>
 * CartItem interface. To get cart item values.
 * </p>
 *
 * @see		com.logicommerce.sdk.models.Cart Cart
 * @author 	Logicommerce
 * @since 	1.0.16
 */
public interface CartItem {

	/**
	 * <p>Get the identifier of this item.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * <p>Get a Hash identifier of this item.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String} object
	 */
	String getHash();

	/**
	 * <p>Get the name of this item.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String} object
	 */
	String getName();

	/**
	 * <p>Get the URL SEO of this item.</p>
	 * <p>Ex. https://test.test/category/product<p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String} object
	 */
	String getUrlSeo();

	/**
	 * <p>Get image URL of this item.</p>
	 * <p>Ex. https://test.test/image.png<p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String} object
	 */
	String getImageUrl();
	
	/**
	 * <p>Get the RowCodes object.</p>
	 *
	 * @since 1.1.10
	 * @return a {@link com.logicommerce.sdk.models.RowCodes RowCodes} object
	 */
	RowCodes getCodes();

	/**
	 * <p>Get Type of this item. </p>
	 *
	 * @since 1.0.16
	 * @return a {@link com.logicommerce.sdk.enums.CartItemType CartItemType} object
	 */
	CartItemType getType();

	/**
	 * <p>Get the quantity value of this item.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.Integer Integer} object
	 */
	Integer getQuantity();

	/**
	 * <p>Get the weight value of this item.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.Double Double} object
	 */
	Double getWeight();

	/**
	 * <p>Get the unitPrice value of this item.</p>
	 *
	 * @since 1.0.18
	 * @return a {@link java.lang.Double Double} object
	 */
	Double getUnitPrice();

	/**
	 * <p>Get subtotal value of this item, this value define the price of the item without taxes.</p>
	 *
	 * @return a {@link java.lang.Double Double} object
	 */
	Double getSubtotal();

	/**
	 * <p>Get total of this item, this value define the price of the item.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.Double Double} object
	 */
	Double getTotal();

	/**
	 * <p>Get total taxes of this item.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.Double Double} object
	 */
	Double getTotalTaxes();

	/**
	 * <p>Get the different customTag Values for this item.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.util.List List} object
	 */
	List<CustomTag> getCustomTagValues();

	/**
	 * <p>Get the specific plugin customTag Values for this item.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.util.List List} object
	 */
	List<CustomTag> getCustomTagPluginValues();

	/**
	 * <p>Get the specific brand for cart item.</p>
	 *
	 * @since 1.0.18
	 * @return a {@link com.logicommerce.sdk.models.Brand Brand} object
	 */
	Brand getBrand();

	/**
	 * <p>Get the specific category for cart item.</p>
	 *
	 * @since 1.0.18
	 * @return a {@link com.logicommerce.sdk.models.Category Category} object
	 */
	Category getMainCategory();

}
