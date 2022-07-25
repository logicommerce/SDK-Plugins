package com.logicommerce.sdk.models;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * <p>User interface. Get user data associated to the cart.</p>
 *
 * @see		com.logicommerce.sdk.models.Cart Cart
 * @see 	com.logicommerce.sdk.models.UserAddress UserAddress
 * @author 	Logicommerce
 * @since 	1.0.16
 */
public interface User {

	/**
	 * <p>Get user ID value.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.Integer Integer} object
	 */
	Integer getId();

	/**
	 * <p>Get user email value.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getEmail();

	/**
	 * <p>Get user nick value.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getNick();

	/**
	 * <p>Get user gender value.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getGender();

	/**
	 * <p>Get user birthday date value.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.time.LocalDate LocalDate} object
	 */
	LocalDate getBirthday();

	/**
	 * <p>Get user company value.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.String String} object
	 */
	String getCompany();

	/**
	 * <p>Get sales Agent ID associated to the user. This value is filled in if the purchase has been assisted by a sales agent.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.Integer Integer} object
	 */
	Integer getSalesAgentId();

	/**
	 * <p>Get sales agent. return true if the purchase has been realized by a sales agent.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.lang.Boolean Boolean} object
	 */
	Boolean isSalesAgent();

	/**
	 * <p>Get list of user Billing Addresses.</p>
	 *
	 * @see com.logicommerce.sdk.models.UserAddress UserAddress
	 * @since 1.0.16
	 * @return a {@link java.util.List List}&lt;{@link com.logicommerce.sdk.models.UserAddress UserAddress}&gt; object
	 */
	List<UserAddress> getBillingAddresses();

	/**
	 * <p>Get list of user Shipping Addresses.</p>
	 *
	 * @see	com.logicommerce.sdk.models.UserAddress UserAddress
	 * @since 1.0.16
	 * @return a {@link java.util.List List}&lt;{@link com.logicommerce.sdk.models.UserAddress UserAddress}&gt; object
	 */
	List<UserAddress> getShippingAddresses();

	/**
	 * <p> Get the user custom tags. This is a map with key, value, and de key is the name of the custom tag.</p>
	 *
	 * @since 1.0.16
	 * @return a {@link java.util.Map Map}&lt;{@link java.lang.String String}, {@link java.lang.String String}&gt; object
	 */
	Map<String, String> getCustomTags();

}
