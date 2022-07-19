package com.logicommerce.sdk.definition;

import com.logicommerce.sdk.enums.OrderShipmentStatusType;

/**
 * <p>OrderShipmentStatusDefinition interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderShipmentStatusDefinition {

	/**
	 * <p>getStatus.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.OrderShipmentStatusType} object
	 */
	OrderShipmentStatusType getStatus();

	/**
	 * <p>getSubstatus.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getSubstatus();

}
