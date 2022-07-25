package com.logicommerce.sdk.models;

import java.util.Map;

/**
 * <p>Carrier interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface Carrier {

	/**
	 * <p>getName.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getName();

	/**
	 * <p>getAdditionalData.</p>
	 *
	 * @return a {@link java.util.Map} object
	 */
	Map<String, String> getAdditionalData();

}
