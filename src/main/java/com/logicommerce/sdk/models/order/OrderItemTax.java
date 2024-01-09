package com.logicommerce.sdk.models.order;

import com.logicommerce.sdk.enums.TaxType;

/**
 * <p>OrderItemTax interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderItemTax {

	/**
	 * <p>getBase.</p>
	 *
	 * @return a double
	 */
	double getBase();

	/**
	 * <p>getTaxValue.</p>
	 *
	 * @return a double
	 */
	double getTaxValue();

	/**
	 * <p>getTaxValue.</p>
	 *
	 * @return a double
	 */
	double getTaxRate();

	/** 
	 * <p>getTaxType.</p>
	 * 
	 * @return a {@link TaxType} object
	*/
	TaxType getType();

	/**
	 * <p>get code</p>
	 * 
	 * @return a String object
	 */
	String getCode();

}
