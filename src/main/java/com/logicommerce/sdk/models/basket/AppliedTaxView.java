package com.logicommerce.sdk.models.basket;

/**
 * <p>One tax of a basket or an order ({@link TotalsView#getAppliedTaxes()}): one entry per tax group of core (tax rate,
 * equivalence surcharge rate and tax). An equivalence surcharge is not an entry of its own: it is folded into the entry
 * of its tax, whose rate is then the tax rate plus the surcharge rate and whose amount includes the surcharge, while the
 * entry keeps the tax's name.</p>
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
	 * Returns the tax rate as a decimal number in text, without a percent sign and without trailing zeros (for instance
	 * {@code "21"} or {@code "5.5"}), including the equivalence surcharge rate when the entry carries one (for instance
	 * {@code "26.2"} for a 21 tax with a 5.2 surcharge).
	 *
	 * @return the rate
	 */
	String getRate();

	/**
	 * Returns the taxable base the tax is computed on: the net base (taxes excluded) in both tax modes, also when the
	 * view's prices include taxes.
	 *
	 * @return the base in minor units
	 */
	long getBase();

	/**
	 * Returns the tax amount, rounded once.
	 *
	 * @return the amount in minor units
	 */
	long getAmount();

}
