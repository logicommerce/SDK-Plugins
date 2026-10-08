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
	 * A basket warning computed by the last recalculation.
	 */
	WARNING,
	/**
	 * An order-time check evaluated as a dry run: creating the order would fail. Its code is an {@link EndOrderCode}
	 * name.
	 */
	END_ORDER;
}
