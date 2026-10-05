package com.logicommerce.sdk.models.order;

/**
 * <p>A quantity of one order row: in a shipment ({@link OrderShipmentView#getRows()}) or in a return
 * ({@link RMAView#getRows()}).</p>
 *
 * <p>Quantities are counted per order row ({@link OrderRowView}) within one shipment or one return. A shipment row is
 * matched to its order row by the row link, else by hash; a return row by hash; a hash that matches no order row is
 * reported as it is. A bundle row counts its complete bundles only: for each item of the bundle, the item's quantity
 * in that shipment or return divided by the item's quantity per bundle (rounded down); the smallest of those, at most
 * the bundle's quantity. A bundle whose items are split across several shipments therefore counts in none of them.
 * Rows with no quantity are left out.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface RowQuantity {

	/**
	 * Returns the hash of the order row.
	 *
	 * @return the row hash, as in {@link OrderRowView#getHash()}
	 */
	String getRowHash();

	/**
	 * Returns the quantity of the row.
	 *
	 * @return the quantity
	 */
	long getQuantity();

}
