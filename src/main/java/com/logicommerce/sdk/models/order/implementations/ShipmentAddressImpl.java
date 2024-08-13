package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.implementations.AddressImpl;
import com.logicommerce.sdk.models.order.ShipmentAddress;

/**
 * <p>ShipmentAddressImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class ShipmentAddressImpl extends AddressImpl implements ShipmentAddress {

	private String email;
	
	private String company;

	/**
	 * <p>Getter for the field <code>email</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <p>Setter for the field <code>email</code>.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * <p>Getter for the field <code>company</code>.</p>
	 * 
	 * @since 2.0.0		 
	 * @return a {@link java.lang.String} object
	 */
	public String getCompany() {
		return company;
	}
	
	/**
     * <p>Setter for the field <code>company</code>.</p>
     * 
     * @since 2.0.0
     */
	public void setCompany(String company) {
		this.company = company;
	}
	
}
