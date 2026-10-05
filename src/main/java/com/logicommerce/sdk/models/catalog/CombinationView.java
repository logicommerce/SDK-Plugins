package com.logicommerce.sdk.models.catalog;

import java.util.List;
import java.util.Map;
import com.logicommerce.sdk.enums.StockStatus;

/**
 * <p>A combination of a catalog product ({@link ProductView#getCombinations()}): for a product with combinable
 * options, one of its active combinations made of active option values (a combination row of the product, or, for a
 * product whose combinations have no rows and no stock management, a combination of its active values); for a product
 * without combinable options, the product itself. Its product id and {@link #getOptionValueIds()} are what a
 * {@link com.logicommerce.sdk.models.basket.RowChange} requests.</p>
 *
 * <p>A combination is <em>orderable</em> when {@link com.logicommerce.sdk.resources.BasketResource} adds it as a row
 * (a {@link com.logicommerce.sdk.models.basket.RowChange} for it is not rejected as
 * {@link com.logicommerce.sdk.enums.RejectionCode#ROW_NOT_BUYABLE}), that is when its {@link #getStockStatus()} is
 * not {@link StockStatus#NOT_ORDERABLE}. Orderability is decided per product and context: the product's definition is
 * buyable (it shows its price and its order box, is active, and its available date has passed), the commerce shows
 * prices for the context, and the product is not a voucher purchase (a balance voucher product). Stock does not
 * matter: a combination out of stock is orderable and reports {@link StockStatus#OUT_OF_STOCK}. A product that needs a
 * personalisation ({@link ProductView#requiresNonCombinableOption()}) can still have orderable combinations in this
 * sense; adding it goes through the storefront.</p>
 *
 * <p>Prices are those the basket would compute for the same context (the combination data), gross or net per
 * {@link ProductView#isTaxesIncluded()}. Every price of one {@link com.logicommerce.sdk.resources.CatalogResource} call
 * is in the same currency.</p>
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
	 * Returns the combination's SKU: the combination's code, else the product's.
	 *
	 * @return the SKU, or null when none
	 */
	String getSku();

	/**
	 * Returns the combination's barcodes by standard: keys {@code EAN}, {@code UPC}, {@code ISBN} and {@code JAN}, from
	 * the combination's codes, else the product's. Empty codes are left out.
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
	 * Returns the previous price: the price before discounts, for strikethrough display.
	 *
	 * @return the previous price, or null when there is none, it equals {@link #getPrice()}, or prices are not shown
	 */
	PriceView getPreviousPrice();

	/**
	 * Returns the stock status: {@link StockStatus#NOT_ORDERABLE} when the combination is not orderable, else from the
	 * stock and the backorder and on-request definitions.
	 *
	 * @return the stock status, never null
	 */
	StockStatus getStockStatus();

}
