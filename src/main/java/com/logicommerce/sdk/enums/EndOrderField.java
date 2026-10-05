package com.logicommerce.sdk.enums;

/**
 * <p>Customer field an order-time check ({@link IssueSource#END_ORDER} basket issue) refers to.</p>
 *
 * <p>Returned by {@link com.logicommerce.sdk.models.basket.BasketIssue#getField()}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public enum EndOrderField {
	/**
	 * The customer's email.
	 */
	EMAIL,
	/**
	 * The customer's first name.
	 */
	FIRST_NAME,
	/**
	 * The customer's last name.
	 */
	LAST_NAME,
	/**
	 * The customer's phone.
	 */
	PHONE,
	/**
	 * Any address field (billing or shipping).
	 */
	ADDRESS,
	/**
	 * A field that is none of the above.
	 */
	OTHER;
}
