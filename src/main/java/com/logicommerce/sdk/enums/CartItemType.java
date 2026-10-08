package com.logicommerce.sdk.enums;

/**
 * <p>CartItemType Enum. This contains de list of cart item types</p>
 *
 * <p>{@link #BUNDLE_ITEM} is only returned for the items of a bundle row
 * ({@link com.logicommerce.sdk.models.order.OrderItem#getBundleItems()}).</p>
 *
 * @see		com.logicommerce.sdk.models.CartItem CartItem
 * @author 	Logicommerce
 * @since 	1.0.16
 */
public enum CartItemType {
	/** 
	 * Indicates that the item is of type normal product 
	 */
	PRODUCT,
	/**
	 * Indicates that the item is of type gift product  
	 */
	GIFT,
	/**
	 * Indicates that the item is of type linked product
	 */
	LINKED,
	/**
	 * Indicates that the item is of type bundle product
	 * */
	BUNDLE,
	/**
	 * Indicates that the item is of type bundle product ??
	 * */
	BUNDLE_ITEM,
	/**
	 * Indicates that the item is of type voucher purchase
	 */
	VOUCHER_PURCHASE,
	/**
	 * Indicates that the item is a gift the buyer selected among the ones a discount offers.
	 *
	 * @since 2.8.5
	 */
	SELECTABLE_GIFT
}
