package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.ProductMapperType;

/**
 * <p>ProductsDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 2.8.0
 */
public interface ProductsDefinition {

	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * getProductMapperType.
	 *
	 * @return a {@link com.logicommerce.sdk.enums.ProductMapperType} object
	 */
	ProductMapperType getProductMapperType();

}
