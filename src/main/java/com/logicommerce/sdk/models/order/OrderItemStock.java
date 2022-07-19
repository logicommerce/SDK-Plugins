package com.logicommerce.sdk.models.order;

import java.time.LocalDate;
import java.util.List;
import com.logicommerce.sdk.enums.PrevisionType;

/**
 * <p>OrderItemStock interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderItemStock {

	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();
	
	/**
	 * <p>getWarehouseId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getWarehouseId();
	
	/**
	 * <p>getWarehouseGroupId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getWarehouseGroupId();

	/**
	 * <p>getQuantity.</p>
	 *
	 * @return a int
	 */
	int getQuantity();
	
	/**
	 * <p>getReservedQuantity.</p>
	 *
	 * @return a int
	 */
	int getReservedQuantity();
	
	/**
	 * <p>getIncomingDate.</p>
	 *
	 * @return a {@link java.time.LocalDate} object
	 */
	LocalDate getIncomingDate();

	/**
	 * <p>getOffsetDays.</p>
	 *
	 * @return a int
	 */
	int getOffsetDays();

	/**
	 * <p>getPriority.</p>
	 *
	 * @return a int
	 */
	int getPriority();
	
	/**
	 * <p>getHash.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getHash();
	
	/**
	 * <p>getPrevisionType.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.PrevisionType} object
	 */
	PrevisionType getPrevisionType();
	
	/**
	 * <p>getSubstractedStocks.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderItemSubstractedStock> getSubstractedStocks();

}
