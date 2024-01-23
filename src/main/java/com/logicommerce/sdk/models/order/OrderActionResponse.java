package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.definition.OrderStatusDefinition;
import com.logicommerce.sdk.enums.OrderActionStatusType;
import com.logicommerce.sdk.models.ElementProperty;

/**
 * <p>PaymentValidateResponse interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderActionResponse {

	/**
	 * <p>isPaid.</p>
	 *
	 * @return a boolean
	 */
	boolean isPaid();

	/**
	 * <p>getOrderStatus.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.definition.OrderStatusDefinition} object
	 */
	OrderStatusDefinition getOrderStatus();

	/**
	 * <p>
	 *	OK: for validate new order,<br>
	 *	KO: for denied order.<br>
	 *	</p>
	 *
	 * @since 	1.0.22
	 * @return a {@link com.logicommerce.sdk.enums.PaymentValidateStatusType} object
	 */
	OrderActionStatusType getStatus();
	
	/**
	 * Returns the properties.
	 *
	 * @return a {@link java.util.List} object
	 */
	List<ElementProperty> getProperties();

	/**
	 * Adds a property to the document.
	 *
	 * @param property a {@link com.logicommerce.sdk.models.ElementProperty} object
	 */
	void addProperty(ElementProperty property);

	/**
	 * Adds a property to the document.
	 *
	 * @param name a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 */
	void addProperty(String name, String value);

}
