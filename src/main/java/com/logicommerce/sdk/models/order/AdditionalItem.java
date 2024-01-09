package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.enums.AdditionalItemType;

/**
 * AdditionalItem interface.
 * 
 * @author LogiCommerce
 * @since 1.3.0
 */
public interface AdditionalItem {

	/**
	 * Returns the id of the additional item
	 * 
	 * @return a {@link Integer} object
	 */
	Integer getId();

	/**
	 * Returns the product id of the additional item
	 * 
	 * @return a {@link String} object
	 */
	String getName();

	/**
	 * Returns the product id of the additional item
	 * 
	 * @return a {@link String} object
	 */
	String getComment();

	/**
	 * Returns the product id of the additional item
	 * 
	 * @return a {@link AdditionalItemType} object
	 */
	AdditionalItemType getType();

	/**
	 * Returns the product id of the additional item
	 * 
	 * @return a double
	 */
	double getAmount();
	
	/**
	 * Returns taxes applied to the additional item
	 *
	 * @return a {@link List}&lt;{@link OrderTax}&gt; object
	 */
	List<OrderTax> getTaxes();

}
