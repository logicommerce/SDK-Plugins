package com.logicommerce.sdk.models.catalog;

/**
 * <p>An amount with its currency, used where amounts of several currencies can coexist (the catalog).</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface PriceView {

	/**
	 * Returns the amount, rounded once to minor units of {@link #getCurrencyCode()}.
	 *
	 * @return the amount in minor units
	 */
	long getAmount();

	/**
	 * Returns the currency of the amount.
	 *
	 * @return the ISO 4217 code, upper case
	 */
	String getCurrencyCode();

}
