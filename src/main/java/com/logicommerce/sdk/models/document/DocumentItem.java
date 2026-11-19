package com.logicommerce.sdk.models.document;

/**
 * <p>A product line of a {@link CustomerDocument}.</p>
 *
 * @author LogiCommerce
 * @since 2.9.1
 */
public interface DocumentItem {

	/**
	 * Returns the product id.
	 *
	 * @return the product id
	 */
	int getProductId();

	/**
	 * Returns the product name, as stored in the document.
	 *
	 * @return the name
	 */
	String getName();

	/**
	 * Returns the SKU of the product combination.
	 *
	 * @return the SKU, or null when it is not set
	 */
	String getSku();

	/**
	 * Returns the quantity.
	 *
	 * @return the quantity
	 */
	int getQuantity();

}
