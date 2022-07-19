package com.logicommerce.sdk.enums;

/**
 * <p>CartItemType Enum. This contains de list of cart item types</p>
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
	BUNDLE_ITEM
}
