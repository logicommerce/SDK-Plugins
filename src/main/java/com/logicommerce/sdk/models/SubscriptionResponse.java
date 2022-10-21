package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.SubscriptionActionStatus;
import com.logicommerce.sdk.enums.SubscriptionMessageType;
import com.logicommerce.sdk.enums.SubscriptionStatus;

/**
 * Interface for newsletter subscription response
 *
 * @author	Logicommerce
 * @since	1.1.2
 */
public interface SubscriptionResponse {

	/**
	 * Return action status result
	 *
	 * @return          {@link com.logicommerce.sdk.enums.SubscriptionActionStatus}
	 * @since           1.1.2
	 */
	SubscriptionActionStatus getActionStatus();

	/**
	 * Return subscription status
	 *
	 * @return          {@link com.logicommerce.sdk.enums.SubscriptionStatus}
	 * @since           1.1.2
	 */
	SubscriptionStatus getStatus();

	/**
	 * Return message
	 *
	 * @return          {@link com.logicommerce.sdk.enums.SubscriptionMessageType}
	 * @since           1.1.3
	 */
	SubscriptionMessageType getMessageType();

	/**
	 * Return message
	 *
	 * @return          {@link java.lang.String}
	 * @since           1.1.2
	 */
	String getMessage();

}
