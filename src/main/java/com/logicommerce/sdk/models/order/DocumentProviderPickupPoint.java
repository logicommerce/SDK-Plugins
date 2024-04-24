package com.logicommerce.sdk.models.order;

import com.logicommerce.sdk.models.Address;

/**
 * <p>DocumentProviderPickupPoint interface.</p>
 *
 * @author Logicommerce
 * @since 1.3.8
 */
public interface DocumentProviderPickupPoint extends Address {

	/**
	 * Returns the provider pickup point key.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getKey();
	
	/**
	 * Returns the provider pickup point name.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getName();
	
	/**
	 * Returns the provider pickup point email.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getEmail();
}
