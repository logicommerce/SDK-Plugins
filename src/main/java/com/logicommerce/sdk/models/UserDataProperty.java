package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.ConnectorType;

/**
 * <p>UserDataProperty interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface UserDataProperty {

	/**
	 * <p>getConnectorType.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.ConnectorType} object
	 */
	ConnectorType getConnectorType();

	/**
	 * <p>getName.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getName();

	/**
	 * <p>getValue.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getValue();
	
	/**
	 * <p>setValue.</p>
	 *
	 * @param value a {@link java.lang.String} object
	 */
	void setValue(String value); 

}
