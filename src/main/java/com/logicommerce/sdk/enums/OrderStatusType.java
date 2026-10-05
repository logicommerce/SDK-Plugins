package com.logicommerce.sdk.enums;

/**
 * <p>OrderStatusType class.</p>
 *
 * <p>Since 2.8.5 the enum has {@link #PENDING_APPROVAL}, placed before {@link #CONFIRM_DELETED} (whose ordinal moves
 * from 6 to 7). Platforms that used to report such orders with a null status now report {@code PENDING_APPROVAL}:
 * plugins must not rely on the ordinals, and an exhaustive {@code switch} expression over the enum without a
 * {@code default} branch, compiled against an earlier SDK, throws when it meets the new constant.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public enum OrderStatusType {
	DENIED,
	INCIDENTS,
	INCOMING,
	IN_PROCESS,
	COMPLETED,
	DELETED,
	/**
	 * The order waits for the approval of an account manager before it can go on (B2B approval flows). Like
	 * {@link #INCIDENTS} and {@link #DENIED}, the order has not been placed yet: it has no document number.
	 *
	 * @since 2.8.5
	 */
	PENDING_APPROVAL,
	CONFIRM_DELETED;
}
