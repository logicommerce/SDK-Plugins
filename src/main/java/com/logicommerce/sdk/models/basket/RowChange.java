package com.logicommerce.sdk.models.basket;

import java.util.List;

/**
 * <p>A requested basket row ({@link BasketChanges#getRows()}). Build it with
 * {@link com.logicommerce.sdk.builders.basket.RowChangeBuilder}.</p>
 *
 * <p>With the hash of an existing row for the same product and option values, it sets that row's quantity; with the
 * hash of a row for another product or option values, it replaces that row; without a hash (or with one that matches
 * no row), it adds the product. Identical rows are merged.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface RowChange {

	/**
	 * Returns the hash of the basket row the change refers to.
	 *
	 * @return the row hash ({@link BasketRowView#getHash()}), or null for a new row
	 */
	String getRowHash();

	/**
	 * Returns the product id.
	 *
	 * @return the product id
	 */
	int getProductId();

	/**
	 * Returns the ids of the combinable option values that select the combination, in any order. A product with a
	 * required non-combinable option cannot be added
	 * ({@link com.logicommerce.sdk.enums.RejectionCode#ROW_REQUIRES_NON_COMBINABLE_OPTION}).
	 *
	 * @return the option value ids, never null, empty for a product without combinable options
	 */
	List<Integer> getOptionValueIds();

	/**
	 * Returns the quantity.
	 *
	 * @return a positive quantity
	 */
	long getQuantity();

}
