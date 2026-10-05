package com.logicommerce.sdk.models.basket;

import java.util.List;
import com.logicommerce.sdk.enums.CartItemType;

/**
 * <p>A basket row ({@link BasketView#getRows()}).</p>
 *
 * <p>Amounts are minor units of the enclosing {@link BasketView#getCurrencyCode()}, gross or net per
 * {@link BasketView#isTaxesIncluded()}. Discount amounts are non-negative magnitudes, so
 * {@code getTotal() == getSubtotal() - sum(getDiscounts().amount)}.</p>
 *
 * <p>Unlike the usual LogiCommerce meaning of subtotal and total (without and with taxes, as in
 * {@link com.logicommerce.sdk.models.CartItem#getSubtotal()}), {@link #getSubtotal()} and {@link #getTotal()} are the
 * row amount before and after its discounts, both in the view's tax mode.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface BasketRowView {

	/**
	 * Returns the row hash: an id computed from the product and its option values, independent of the quantity, stable
	 * across recalculations and copied to the order rows (so an order row has the hash of the basket row).
	 *
	 * @return the row hash
	 */
	String getHash();

	/**
	 * Returns the product id. Every row type but {@link CartItemType#BUNDLE} is a product (a
	 * {@link CartItemType#VOUCHER_PURCHASE} row is the balance voucher product); a bundle is identified by
	 * {@link #getBundleId()}.
	 *
	 * @return the product id, or 0 for a {@link CartItemType#BUNDLE} row
	 */
	int getProductId();

	/**
	 * Returns the ids of the row's combinable option values, sorted by option id. Non-combinable option values are not
	 * listed.
	 *
	 * @return the option value ids, empty for a product without combinable options
	 */
	List<Integer> getOptionValueIds();

	/**
	 * Returns the kind of row. The items of a bundle are not rows of their own: a bundle is one
	 * {@link CartItemType#BUNDLE} row, so {@link CartItemType#BUNDLE_ITEM} is never returned.
	 *
	 * @return the row type: {@link CartItemType#PRODUCT}, {@link CartItemType#GIFT}, {@link CartItemType#BUNDLE},
	 *         {@link CartItemType#LINKED}, {@link CartItemType#VOUCHER_PURCHASE} or {@link CartItemType#SELECTABLE_GIFT}
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
	 * Returns the quantity. Core never revises it: quantity and stock limits are reported as issues instead.
	 *
	 * @return the quantity
	 */
	long getQuantity();

	/**
	 * Returns the unit price, rounded once to minor units. An automatic gift ({@link CartItemType#GIFT}) carries the
	 * product's real price, and a discount allocation of the same amount.
	 *
	 * @return the unit price
	 */
	long getUnitPrice();

	/**
	 * Returns the unit price times the quantity, before discounts. It is not the amount without taxes: it follows
	 * {@link BasketView#isTaxesIncluded()}.
	 *
	 * @return the subtotal, before discounts
	 */
	long getSubtotal();

	/**
	 * Returns the row's share of each discount applied to it, one entry per discount, each rounded once.
	 *
	 * @return the allocations, empty when no discount applies to the row
	 */
	List<Allocation> getDiscounts();

	/**
	 * Returns the subtotal minus the row's discount allocations: the row amount after discounts. It is not the amount
	 * with taxes: it follows {@link BasketView#isTaxesIncluded()}.
	 *
	 * @return the total, after discounts
	 */
	long getTotal();

}
