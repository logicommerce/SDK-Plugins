package com.logicommerce.sdk.models.catalog;

import java.util.List;
import java.util.Map;
import com.logicommerce.sdk.enums.StockStatus;

/**
 * <p>A combination of a catalog product ({@link ProductView#getCombinations()}): one of its active combinations, or
 * the product itself when it has no combinable options. Its product id and {@link #getOptionValueIds()} are what a
 * {@link com.logicommerce.sdk.models.basket.RowChange} requests.</p>
 *
 * <p>A combination is orderable (a basket accepts it as a row) unless its {@link #getStockStatus()} is
 * {@link StockStatus#NOT_ORDERABLE}; stock does not affect orderability.</p>
 *
 * <p>Prices are those a basket would compute for the same context, gross or net per
 * {@link ProductView#isTaxesIncluded()}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface CombinationView {

	/**
	 * Returns the ids of the combinable option values that make the combination, sorted by option id.
	 *
	 * @return the option value ids, empty for a product without combinable options
	 */
	List<Integer> getOptionValueIds();

	/**
	 * Returns the combination's SKU, else the product's.
	 *
	 * @return the SKU, or null when none
	 */
	String getSku();

	/**
	 * Returns the combination's barcodes (else the product's), keyed by {@code EAN}, {@code UPC}, {@code ISBN} and
	 * {@code JAN}. Empty codes are left out.
	 *
	 * @return the barcodes, never null
	 */
	Map<String, String> getBarcodes();

	/**
	 * Returns the selling price.
	 *
	 * @return the price, or null when the product's prices are hidden for the context (see {@link ProductView})
	 */
	PriceView getPrice();

	/**
	 * Returns the price before discounts, for strikethrough display.
	 *
	 * @return the previous price, or null when there is none, it equals {@link #getPrice()}, or prices are hidden
	 */
	PriceView getPreviousPrice();

	/**
	 * Returns the stock status.
	 *
	 * @return the stock status, never null
	 */
	StockStatus getStockStatus();

}
