package com.logicommerce.sdk.enums;

/**
 * <p>Status of a registered user in one of its accounts
 * ({@link com.logicommerce.sdk.models.user.RegisteredUserAccount#getStatus()}).</p>
 *
 * @author Logicommerce
 * @since 2.9.1
 */
public enum RegisteredUserAccountStatus {
	ENABLED,
	DISABLED,
	PENDING_APPROVAL;
}
