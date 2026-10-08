package com.logicommerce.sdk.enums;

/**
 * <p>Code of an order-time check on the customer data that fails on a basket ({@link IssueSource#END_ORDER}).
 * {@link com.logicommerce.sdk.models.basket.BasketIssue#getCode()} of such an issue is one of these names, so
 * {@code EndOrderCode.valueOf(issue.getCode())} never fails. Every failing field is reported as its own issue.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public enum EndOrderCode {
	/**
	 * A required field is empty. A required account creation is reported with {@link EndOrderField#OTHER}.
	 */
	REQUIRED,
	/**
	 * A field has an invalid value.
	 */
	INVALID,
	/**
	 * The commerce requires the billing country to match the shipping country and they differ. Reported with
	 * {@link EndOrderField#ADDRESS}.
	 */
	FORCE_BILLING_ADDRESS_COUNTRY,
	/**
	 * Any other failure. Reported with {@link EndOrderField#OTHER}.
	 */
	OTHER;
}
