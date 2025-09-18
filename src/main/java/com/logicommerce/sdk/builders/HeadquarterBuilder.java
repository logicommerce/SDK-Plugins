package com.logicommerce.sdk.builders;

import com.logicommerce.sdk.models.Headquarter;
import com.logicommerce.sdk.models.implementations.HeadquarterImpl;

/**
 * <p>HeadquarterBuilder class.</p>
 *
 * @author LogiCommerce
 * @since 2.5.2
 */
public class HeadquarterBuilder<T, S> extends AddressBuilder<T, HeadquarterBuilder<T, S>> {

	private String email;

	private String vat;

	private String timezone;

	private String locale;

	/**
	 * <p>Constructor for HeadquarterBuilder.</p>
	 */
	public HeadquarterBuilder() {
		super();
	}

	/**
	 * <p>Constructor for HeadquarterBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public HeadquarterBuilder(T parentBuilder) {
		super(parentBuilder);
	}

	/**
	 * <p>email.</p>
	 *
	 * @param email a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.HeadquarterBuilder} object
	 */
	public HeadquarterBuilder<T, S> email(String email) {
		this.email = email;
		return returnThis();
	}

	/**
	 * <p>vat.</p>
	 *
	 * @param vat a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.HeadquarterBuilder} object
	 */
	public HeadquarterBuilder<T, S> vat(String vat) {
		this.vat = vat;
		return returnThis();
	}

	/**
	 * <p>timezone.</p>
	 *
	 * @param timezone a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.HeadquarterBuilder} object
	 */
	public HeadquarterBuilder<T, S> timezone(String timezone) {
		this.timezone = timezone;
		return returnThis();
	}

	/**
	 * <p>
	 * locale.
	 * </p>
	 *
	 * @param locale a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.HeadquarterBuilder} object
	 */
	public HeadquarterBuilder<T, S> locale(String locale) {
		this.locale = locale;
		return returnThis();
	}
	
	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.Headquarter} object
	 */
	public Headquarter build() {
		HeadquarterImpl headquarter = new HeadquarterImpl();
		super.setElements(headquarter);
		headquarter.setEmail(email);
		headquarter.setVat(vat);
		headquarter.setTimezone(timezone);
		headquarter.setLocale(locale);
		return headquarter;
	}

	/**
	 * <p>returnThis.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.HeadquarterBuilder} object
	 */
	protected HeadquarterBuilder<T, S> returnThis() {
		return this;
	}
}
