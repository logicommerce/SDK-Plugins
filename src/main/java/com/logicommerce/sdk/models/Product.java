package com.logicommerce.sdk.models;

/**
 * <p>Product interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface Product {
	
	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();
	
	/**
	 * <p>getCodes.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.ProductCodes} object
	 */
	ProductCodes getCodes();

	/**
	 * <p>getLanguage.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.ProductLanguage} object
	 */
	ProductLanguage getLanguage();
	
	/**
	 * <p>getImages.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.ProductMedia} object
	 */
	ProductMedia getImages();

}
