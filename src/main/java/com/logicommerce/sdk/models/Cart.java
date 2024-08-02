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
	 * Get the headquarter of the cart.
	 * 
	 * @since 	1.3.3
	 * @return a {@link Headquarter} object
	 */
	Headquarter getHeadquarter();

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
	 * <p>Get basketLink, this link is for add items to the cart.</p>
	 *
	 * @since 	1.3.7
	 * @return a {@link java.lang.String String} object
	 */
	String getBasketLink();

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

	/**
	 * Get payment method for the cart.
	 *
	 * @since 	1.3.0
	 * @return a {@link CartPaymentSystem} object
	 */
	CartPaymentSystem getPaymentSystem();


	/**
	 * Get discounts for the cart.
	 * 
	 * @since 	1.3.0
	 * @return a {@link List} of {@link CartDiscount} objects
	 */
	List<CartDiscount> getDiscounts();

}
