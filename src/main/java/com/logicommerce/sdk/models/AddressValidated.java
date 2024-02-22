package com.logicommerce.sdk.models;

import java.util.List;

/**
 * AddressValidated for Address Service
 * 
 * @author Logicommerce
 * @since 1.3.0
 */
public class AddressValidated {

	private boolean valid;

	private Address address;

	private List<Address> validAddresses;

	private List<AddressValidatedMessage> messages;

	/**
	 * Returns true if the address is valid
	 * 
	 * @return a boolean
	 */
	public boolean isValid() {
		return valid;
	}

	/**
	 * Sets the address validity
	 * 
	 * @param valid a boolean
	 */
	public void setValid(boolean valid) {
		this.valid = valid;
	}

	/**
	 * Returns the address validated
	 * 
	 * @return a {@link Address} object
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Sets the address validated
	 * 
	 * @param address a {@link Address} object
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * Returns the valid addresses
	 * 
	 * @return a {@link List} object
	 * @since 1.3.1
	 */
	public List<Address> getValidAddresses() {
		return validAddresses;
	}

	/**
	 * Sets the valid addresses
	 * 
	 * @param validAddresses a {@link List} object
	 * @since 1.3.1
	 */
	public void setValidAddresses(List<Address> validAddresses) {
		this.validAddresses = validAddresses;
	}

	/**
	 * Returns the messages if any
	 * 
	 * @return a {@link AddressValidatedMessage} object
	 */
	public List<AddressValidatedMessage> getMessages() {
		return messages;
	}

	/**
	 * Sets the messages
	 * 
	 * @param message a {@link List} object
	 */
	public void setMessages(List<AddressValidatedMessage> message) {
		this.messages = message;
	}

}
