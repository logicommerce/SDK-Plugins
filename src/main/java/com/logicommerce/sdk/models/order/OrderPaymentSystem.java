package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.enums.AmountType;

/**
 * <p>OrderPaymentSystem interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderPaymentSystem {

	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * <p>getPaymentSystemId.</p>
	 *
	 * @return a int
	 */
	int getPaymentSystemId();

	/**
	 * <p>getTaxes.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderTax> getTaxes();

	/**
	 * <p>getName.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getName();

	/**
	 * <p>getIncreaseType.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.AmountType} object
	 */
	AmountType getIncreaseType();

	/**
	 * <p>getIncreaseValue.</p>
	 *
	 * @return a double
	 */
	double getIncreaseValue();

	/**
	 * <p>getPrice.</p>
	 *
	 * @return a double
	 */
	double getPrice();

	/**
	 * <p>getIncreaseMin.</p>
	 *
	 * @return a double
	 */
	double getIncreaseMin();

	/**
	 * <p>isCashOnDelivery.</p>
	 *
	 * @return a boolean
	 */
	boolean isCashOnDelivery();
	
	/**
	 * <p>getProperty.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getProperty();	

}
