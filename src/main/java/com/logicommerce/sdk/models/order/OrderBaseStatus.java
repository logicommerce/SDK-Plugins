package com.logicommerce.sdk.models.order;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>OrderBaseStatus interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderBaseStatus<T> {

	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * <p>getActions.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderStatusAction> getActions();

	/**
	 * <p>getCurrentDateTime.</p>
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	LocalDateTime getCurrentDateTime();
	
	/**
	 * <p>getStatus.</p>
	 *
	 * @return a T object
	 */
	T getStatus();

	/**
	 * <p>getSubstatusId.</p>
	 *
	 * @return a int
	 */
	int getSubstatusId();

}
