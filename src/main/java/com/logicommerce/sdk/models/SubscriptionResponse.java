package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.SubscriptionStatusType;

/**
 * Interface for subcription response
 *
 * @author	Logicommerce
 * @since	1.1.2
 */
public interface SubscriptionResponse {

	/**
	 * Return status type
	 *
	 * @return          {@link com.logicommerce.sdk.enums.SubscriptionStatusType}
	 * @since           1.1.2
	 */
	SubscriptionStatusType getStatus();

	/**
	 * Return message
	 *
	 * @return          {@link java.lang.String}
	 * @since           1.1.2
	 */
	String getMessage();

}
