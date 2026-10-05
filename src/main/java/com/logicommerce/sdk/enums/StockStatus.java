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
	 * Orderable, out of stock but can be ordered (backorder, with or without a restock prevision, or on request).
	 */
	BACKORDER,
	/**
	 * Orderable in the sense of {@link com.logicommerce.sdk.models.catalog.CombinationView}, but out of stock and not
	 * deliverable until restocked: a basket accepts it as a row and reports a {@code STOCK_RESTRICTION} issue.
	 */
	OUT_OF_STOCK,
	/**
	 * The product cannot be ordered in the context, whatever its stock: its definition is not buyable (it hides its
	 * price or its order box, as a catalogue-only product does, or its available date has not come yet), the commerce
	 * hides prices for the context (its {@code showPrice} setting for the country and account group), or the product is
	 * a voucher purchase (a balance voucher product, which is bought in the storefront only). A basket rejects a row for
	 * it ({@link RejectionCode#ROW_NOT_BUYABLE}). Decided per product: every combination of such a product has this
	 * value.
	 */
	NOT_ORDERABLE;
}
