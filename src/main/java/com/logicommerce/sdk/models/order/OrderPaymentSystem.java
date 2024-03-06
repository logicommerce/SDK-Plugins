package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.enums.AmountType;
import com.logicommerce.sdk.models.ElementProperty;

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
	
	/**
	 * <p>getProperties.</p>
	 * 
	 * @since 1.3.4
	 * @return a {@link java.util.List} object
	 */
	List<ElementProperty> getProperties();

	/**
	 * <p>addProperty.</p>
	 *
	 * @since 1.3.4
	 * @param property a {@link com.logicommerce.sdk.models.ElementProperty} object
	 */
	void addProperty(ElementProperty property);

	/**
	 * <p>addProperty.</p>
	 *
 	 * @since 1.3.4
	 * @param name a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 */
	void addProperty(String name, String value);

}
