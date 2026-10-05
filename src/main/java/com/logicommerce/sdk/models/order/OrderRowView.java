package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.enums.CartItemType;
import com.logicommerce.sdk.models.basket.Allocation;

/**
 * <p>A row of an order ({@link OrderView#getRows()}), with the same shape as a
 * {@link com.logicommerce.sdk.models.basket.BasketRowView}.</p>
 *
 * <p>Amounts are minor units of the order's purchase currency, gross or net per {@link OrderView#isTaxesIncluded()};
 * discount amounts are non-negative magnitudes, so {@code getTotal() == getSubtotal() - sum(getDiscounts().amount)}.</p>
 *
 * <p>Unlike the usual LogiCommerce meaning of subtotal and total (without and with taxes), {@link #getSubtotal()} and
 * {@link #getTotal()} are the row amount before and after its discounts, both in the order's tax mode.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface OrderRowView {

	/**
	 * Returns the row hash, copied from the basket row the order was created from.
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
	 * Returns the ids of the row's combinable option values, sorted by option id.
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
	 * Returns the row name, as stored on the order.
	 *
	 * @return the name
	 */
	String getName();

	/**
	 * Returns the URL of the row's first image.
	 *
	 * @return an absolute URL, or null
	 */
	String getImageUrl();

	/**
	 * Returns the ordered quantity.
	 *
	 * @return the quantity
	 */
	long getQuantity();

	/**
	 * Returns the unit price, rounded once to minor units.
	 *
	 * @return the unit price
	 */
	long getUnitPrice();

	/**
	 * Returns the unit price times the quantity, before discounts. It is not the amount without taxes: it follows
	 * {@link OrderView#isTaxesIncluded()}.
	 *
	 * @return the subtotal, before discounts
	 */
	long getSubtotal();

	/**
	 * Returns the row's share of each discount applied to it, one entry per discount, each rounded once.
	 *
	 * @return the allocations, never null
	 */
	List<Allocation> getDiscounts();

	/**
	 * Returns the subtotal minus the row's discount allocations: the row amount after discounts. It is not the amount
	 * with taxes: it follows {@link OrderView#isTaxesIncluded()}.
	 *
	 * @return the total, after discounts
	 */
	long getTotal();

}
