package com.logicommerce.sdk.models.implementations;

import com.logicommerce.sdk.models.Headquarter;

/**
 * HeadquarterImpl class
 * 
 * @see AddressImpl
 * @see com.logicommerce.sdk.models.Headquarter Headquarter
 * @since 1.3.3
 */
public class HeadquarterImpl extends AddressImpl implements Headquarter {

	private String email;

	private String vat;

	private String timezone;

	private String locale;

	/**
	 * Get the headquarter email
	 * 
	 * @since 1.3.3
	 * @return a {@link java.lang.String String} object
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * Get the headquarter VAT
	 *
	 * @since 1.3.3
	 * @return a {@link java.lang.String String} object
	 */
	@Override
	public String getVat() {
		return vat;
	}

	/**
	 * Get the headquarter timezone
	 *
	 * @since 1.3.3
	 * @return a {@link java.lang.String String} object
	 */
	@Override
	public String getTimezone() {
		return timezone;
	}

	/**
	 * Get the headquarter locale
	 *
	 * @since 1.3.3
	 * @return a {@link java.lang.String String} object
	 */
	@Override
	public String getLocale() {
		return locale;
	}

	/**
	 * Set the headquarter email
	 * 
	 * @since 1.3.3
	 * @param email a {@link java.lang.String String} object
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Set the headquarter VAT
	 *
	 * @since 1.3.3
	 * @param vat a {@link java.lang.String String} object
	 */
	public void setVat(String vat) {
		this.vat = vat;
	}

	/**
	 * Set the headquarter timezone
	 *
	 * @since 1.3.3
	 * @param timezone a {@link java.lang.String String} object
	 */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	/**
	 * Set the headquarter locale
	 *
	 * @since 1.3.3
	 * @param locale a {@link java.lang.String String} object
	 */
	public void setLocale(String locale) {
		this.locale = locale;
	}

}
