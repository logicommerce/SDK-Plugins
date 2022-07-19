package com.logicommerce.sdk.models.order;

import com.logicommerce.sdk.enums.PrevisionType;

/**
 * <p>OrderItemSubstractedStock interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderItemSubstractedStock {

	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();
	
	/**
	 * <p>getQuantity.</p>
	 *
	 * @return a int
	 */
	int getQuantity();
	
	/**
	 * <p>getProductCombinationStockId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getProductCombinationStockId();
	
	/**
	 * <p>getPrevisionType.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.PrevisionType} object
	 */
	PrevisionType getPrevisionType();

}
