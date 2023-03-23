package com.logicommerce.sdk.models;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>Cart interface. Get the cart values. This model will be accessible as a Resource. </p>
 * <pre>@{@link com.logicommerce.sdk.Resource Resource} {@link com.logicommerce.sdk.models.Cart Cart}</pre>
 *
 * @see		com.logicommerce.sdk.models.CartItem CartItem
 * @author 	Logicommerce
 * @since 	1.0.16
 */
public interface Cart {

	/**
	 * <p>Get a cart token value. This value identifies the cart</p>
	 *
	 * @since 	1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getToken();

	/**
	 * <p>Get the date when the cart was created</p>
	 *
	 * @since 	1.0.16
	 * @return a {@link java.time.LocalDateTime} object
	 */
	LocalDateTime getCreatedAt();

	/**
	 * <p>Get all Items from the cart.</p>
	 *
	 * @see		com.logicommerce.sdk.models.CartItem CartItem
	 * @since 	1.0.16
	 * @return a {@link java.util.List List}&lt;{@link com.logicommerce.sdk.models.CartItem CartItem}&gt; object
	 */
	List<CartItem> getItems();

	/**
	 * <p>Get Totals values of the cart.</p>
	 *
	 * @see		com.logicommerce.sdk.models.CartTotals CartTotals
	 * @since 	1.0.16
	 * @return a {@link com.logicommerce.sdk.models.CartTotals CartTotals} object
	 */
	CartTotals getTotals();

	/**
	 * <p>Get Delivery object of the cart.</p>
	 *
	 * @see		com.logicommerce.sdk.models.CartDelivery CartDelivery
	 * @since 	1.0.16
	 * @return a {@link com.logicommerce.sdk.models.CartDelivery} object
	 */
	CartDelivery getDelivery();

	/**
	 * <p>Get abandonedBasketLink, this link is for a recovery abandoned carts.</p>
	 *
	 * @since 	1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getAbandonedBasketLink();

	/**
	 * <p>Get User of the cart.</p>
	 *
	 * @see		com.logicommerce.sdk.models.User User
	 * @since 	1.0.16
	 * @return a {@link com.logicommerce.sdk.models.User User} object
	 */
	User getUser();

	/**
	 * <p>Get currencyCode from user info for the cart.</p>
	 *
	 * @since 	1.1.10
	 * @return a {@link java.lang.String String} object
	 */
	String getCurrencyCode();

}
