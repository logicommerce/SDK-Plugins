package com.logicommerce.sdk.models.order;

/**
 * <p>A returned quantity of one order row ({@link OrderRMA#getItems()}).</p>
 *
 * <p>The row is identified by its hash: a row of the order ({@link Document#getItems()}) or, for the units of a
 * bundle, an item of a bundle row ({@link OrderItem#getBundleItems()}), whose returned quantity counts units of that
 * item, not complete bundles.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface OrderRMAItem {

	/**
	 * Returns the hash of the returned row.
	 *
	 * @return the row hash, as in {@link OrderItem#getHash()}; it may match no row of the order
	 */
	String getHash();

	/**
	 * Returns the returned quantity.
	 *
	 * @return the quantity
	 */
	int getQuantity();

}
