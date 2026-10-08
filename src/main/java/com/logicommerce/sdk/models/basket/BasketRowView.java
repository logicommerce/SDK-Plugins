package com.logicommerce.sdk.models.basket;

import java.util.List;
import com.logicommerce.sdk.enums.CartItemType;

/**
 * <p>A basket row ({@link BasketView#getRows()}).</p>
 *
 * <p>Amounts are minor units of {@link BasketView#getCurrencyCode()}, gross or net per
 * {@link BasketView#isTaxesIncluded()}. Unlike {@link com.logicommerce.sdk.models.CartItem},
 * {@link #getSubtotal()} and {@link #getTotal()} are the row amount before and after its discounts, not without and
 * with taxes.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface BasketRowView {

	/**
	 * Returns the row hash: computed from the product and its option values, stable across recalculations and copied
	 * to the order rows.
	 *
	 * @return the row hash
	 */
	String getHash();

	/**
	 * Returns the product id.
	 *
	 * @return the product id, or 0 for a {@link CartItemType#BUNDLE} row (see {@link #getBundleId()})
	 */
	int getProductId();

	/**
	 * Returns the ids of the row's combinable option values, sorted by option id.
	 *
	 * @return the option value ids, empty for a product without combinable options
	 */
	List<Integer> getOptionValueIds();

	/**
	 * Returns the kind of row. A bundle is a single {@link CartItemType#BUNDLE} row, so
	 * {@link CartItemType#BUNDLE_ITEM} is never returned.
	 *
	 * @return the row type
	 */
	CartItemType getType();

	/**
	 * Returns the bundle id of a {@link CartItemType#BUNDLE} row.
	 *
	 * @return the bundle id, or null for any other row type
	 */
	Integer getBundleId();

	/**
	 * Returns the row name in the basket's language.
	 *
	 * @return the name
	 */
	String getName();

	/**
	 * Returns the URL of the row's first image.
	 *
	 * @return an absolute URL, or null when the product has no image
	 */
	String getImageUrl();

	/**
	 * Returns the quantity. It is never revised: quantity and stock limits are reported as issues.
	 *
	 * @return the quantity
	 */
	long getQuantity();

	/**
	 * Returns the unit price. An automatic gift ({@link CartItemType#GIFT}) carries the product's real price and a
	 * discount of the same amount.
	 *
	 * @return the unit price
	 */
	long getUnitPrice();

	/**
	 * Returns the unit price times the quantity.
	 *
	 * @return the subtotal, before discounts
	 */
	long getSubtotal();

	/**
	 * Returns the row's share of each discount applied to it.
	 *
	 * @return the allocations, empty when no discount applies to the row
	 */
	List<Allocation> getDiscounts();

	/**
	 * Returns the subtotal minus the row's discount allocations.
	 *
	 * @return the total, after discounts
	 */
	long getTotal();

}
