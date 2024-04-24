package com.logicommerce.sdk.models.pickuppoints;

import com.logicommerce.sdk.definition.DefinitionLanguages;

/**
 * <p>PickupPointProvider interface.</p>
 *
 * @author 	Logicommerce
 * @since 	1.3.7
 */
public interface PickupPointProvider {

	/**
	 * <p>getCode.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getCode();

	/**
	 * <p>getName.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.definition.DefinitionLanguages} object
	 */
	DefinitionLanguages getName();

	/**
	 * <p>getDescription.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.definition.DefinitionLanguages} object
	 */
	DefinitionLanguages getDescription();

	/**
	 * <p>getLogo.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getLogo();

	/**
	 * <p>getUrl.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getUrl();
	
	//data plugin??
	
}
