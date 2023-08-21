package com.logicommerce.sdk.models;

/**
 * AddressValidatedMessage for Address Service
 * 
 * @author Logicommerce
 * @since 1.3.0
 */
public class AddressValidatedMessage {
	
	private String message;
	private String detail;

	/**
	 * Default constructor
	 */
	public AddressValidatedMessage() {}

	/**
	 * Constructor with message and details
	 * 
	 * @param message a String
	 * @param detail a String
	 */
	public AddressValidatedMessage(String message, String detail) {
		setMessage(message);
		setDetail(detail);
	}

	/**
	 * Returns the message
	 * 
	 * @return a String
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message
	 * 
	 * @param message a String
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Returns the details
	 * 
	 * @return a String
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * Sets the details
	 * 
	 * @param details a String
	 */
	public void setDetail(String details) {
		this.detail = details;
	}

}
