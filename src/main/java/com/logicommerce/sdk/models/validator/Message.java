package com.logicommerce.sdk.models.validator;

/**
 * Message object
 *
 * @author LogiCommerce
 * @since 2.7.5
 */
public interface Message {

	/**
	 * gets the code of the message
	 * @return a String
	 */
	String getCode();

	/**
	 * gets the message
	 * @return a String
	 */
	String getMessage();

	/**
	 * gets the detail of the message
	 * @return a String
	 */
	String getDetail();
}
