package com.logicommerce.sdk.models;

import java.util.List;

/**
 * <p>Carriers interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface Carriers {

	/**
	 * <p>getPropertyIdentifier.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getPropertyIdentifier();

	/**
	 * <p>getCarriers.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<Carrier> getCarriers();

}
