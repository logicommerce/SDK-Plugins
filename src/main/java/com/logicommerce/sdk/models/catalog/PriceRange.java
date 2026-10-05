package com.logicommerce.sdk.models.catalog;

/**
 * <p>The lowest and highest price of a catalog product across its combinations
 * ({@link ProductView#getPriceRange()}, {@link ProductView#getPreviousPriceRange()}). Both prices are in the same
 * currency.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface PriceRange {

	/**
	 * Returns the lowest price.
	 *
	 * @return the minimum, never null
	 */
	PriceView getMin();

	/**
	 * Returns the highest price.
	 *
	 * @return the maximum, never null
	 */
	PriceView getMax();

}
