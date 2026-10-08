package com.logicommerce.sdk.models.order;

/**
 * <p>A returned quantity of one order row ({@link OrderRMA#getItems()}).</p>
 *
 * <p>For a bundle, the hash is that of a bundle item ({@link OrderItem#getBundleItems()}) and the quantity counts
 * units of that item.</p>
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
