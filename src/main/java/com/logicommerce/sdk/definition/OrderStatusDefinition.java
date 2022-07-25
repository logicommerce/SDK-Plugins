package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.OrderStatusType;

/**
 * <p>OrderStatusDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderStatusDefinition {

	/**
	 * <p>getStatus.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.OrderStatusType} object
	 */
	OrderStatusType getStatus();

	/**
	 * <p>getSubstatus.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getSubstatus();

}
