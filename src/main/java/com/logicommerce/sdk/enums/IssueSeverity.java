package com.logicommerce.sdk.enums;

/**
 * <p>Severity of a basket issue.</p>
 *
 * <p>Returned by {@link com.logicommerce.sdk.models.basket.BasketIssue#getSeverity()}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public enum IssueSeverity {
	/**
	 * The order cannot be created while the issue remains.
	 */
	ERROR,
	/**
	 * Informative: the order can be created.
	 */
	WARNING;
}
