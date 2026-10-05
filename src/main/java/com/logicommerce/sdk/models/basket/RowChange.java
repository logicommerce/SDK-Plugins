package com.logicommerce.sdk.models.basket;

import java.util.List;

/**
 * <p>A requested basket row ({@link BasketChanges#getRows()}). Build it with
 * {@link com.logicommerce.sdk.builders.basket.RowChangeBuilder}.</p>
 *
 * <p>A row change with the hash of an existing row for the same product and option values sets that row's quantity;
 * one with the hash of an existing row for another product or option values removes that row and adds the new one; one
 * without a hash (or with a hash that matches no row) adds the product. The same product and option values requested
 * twice end up in one row (core merges identical rows).</p>
 *
 * <p>{@link com.logicommerce.sdk.builders.basket.RowChangeBuilder} requires a positive product id and quantity; core
 * checks them again whatever built the row change, and a request with a row change that breaks them throws
 * {@link IllegalArgumentException} before any change is applied.</p>
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
	 * Returns the ids of the combinable option values that select the combination, in any order. Core resolves them to
	 * their options, and requires a combination of the product ({@link com.logicommerce.sdk.models.catalog.CombinationView})
	 * when the product has combinable options. Non-combinable options are never set: a product with a required non-combinable
	 * option is not added ({@link com.logicommerce.sdk.enums.RejectionCode#ROW_REQUIRES_NON_COMBINABLE_OPTION}).
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
