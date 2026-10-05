package com.logicommerce.sdk.enums;

/**
 * <p>Where a basket issue comes from.</p>
 *
 * <p>Returned by {@link com.logicommerce.sdk.models.basket.BasketIssue#getSource()}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public enum IssueSource {
	/**
	 * A basket warning computed by the last recalculation. Its code is a core {@code BasketWarningCode} constant name.
	 */
	WARNING,
	/**
	 * A check that creating the order would run, evaluated as a dry run (core {@code OrderUserValidator}): at order
	 * time it would be an error. Its code is an {@link EndOrderCode} name.
	 */
	END_ORDER;
}
