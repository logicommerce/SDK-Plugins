package com.logicommerce.sdk.enums;

/**
 * <p>OrderStatusType class.</p>
 *
 * <p>{@link #PENDING_APPROVAL} was added in 2.8.5 before {@link #CONFIRM_DELETED}, shifting its ordinal: do not rely
 * on the ordinals.</p>
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
	 * The order waits for the approval of an account manager (B2B approval flows). It has no document number yet.
	 *
	 * @since 2.8.5
	 */
	PENDING_APPROVAL,
	CONFIRM_DELETED;
}
