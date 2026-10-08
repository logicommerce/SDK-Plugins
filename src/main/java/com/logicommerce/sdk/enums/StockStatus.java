package com.logicommerce.sdk.enums;

/**
 * <p>Stock status of a catalog combination.</p>
 *
 * <p>Returned by {@link com.logicommerce.sdk.models.catalog.CombinationView#getStockStatus()}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public enum StockStatus {
	/**
	 * Orderable and available from stock (or the product does not manage stock).
	 */
	IN_STOCK,
	/**
	 * Out of stock but can be ordered (backorder or on request).
	 */
	BACKORDER,
	/**
	 * Out of stock and not deliverable until restocked: a basket accepts it as a row and reports a
	 * {@code STOCK_RESTRICTION} issue.
	 */
	OUT_OF_STOCK,
	/**
	 * The product cannot be ordered in the context, whatever its stock (for instance a catalogue-only product, hidden
	 * prices, or a voucher purchase). A basket rejects it with {@link RejectionCode#ROW_NOT_BUYABLE}. Applies to every
	 * combination of the product.
	 */
	NOT_ORDERABLE;
}
