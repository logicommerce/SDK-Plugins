package com.logicommerce.sdk.models.basket;

/**
 * <p>One tax of a basket or an order ({@link TotalsView#getAppliedTaxes()}). An equivalence surcharge is folded into
 * the entry of its tax: its rate and amount include the surcharge.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface AppliedTaxView {

	/**
	 * Returns the tax name in the view's language.
	 *
	 * @return the name
	 */
	String getName();

	/**
	 * Returns the tax rate, equivalence surcharge included, as a decimal number without percent sign or trailing zeros
	 * (for instance {@code "21"} or {@code "5.5"}).
	 *
	 * @return the rate
	 */
	String getRate();

	/**
	 * Returns the net taxable base (taxes excluded), whatever the view's tax mode.
	 *
	 * @return the base in minor units
	 */
	long getBase();

	/**
	 * Returns the tax amount.
	 *
	 * @return the amount in minor units
	 */
	long getAmount();

}
