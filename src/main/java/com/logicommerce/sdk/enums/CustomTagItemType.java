package com.logicommerce.sdk.enums;

/**
 * <p>CustomTagItemType enum. Define different custom tags types.</p>
 *
 * @see com.logicommerce.sdk.services.CustomTagService CustomTagService
 * @author Logicommerce
 * @since 1.0.16
 */
public enum CustomTagItemType {
	/** 
	 * Indicates that the custom tag item is of type product. 
	 */
	PRODUCT,
	/** 
	 * Indicates that the custom tag item is of type category.
	 */
	CATEGORY,
	/** 
	 * Indicates that the custom tag item is of type basket.
	 */
	BASKET,
	/** 
	 * Indicates that the custom tag item is of type page.
	 */
	PAGE	
}
