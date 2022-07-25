package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.enums.ShippingCalculation;
import com.logicommerce.sdk.models.ElementProperty;

/**
 * <p>OrderShipping interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderShipping {

	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * <p>getShippingTypeId.</p>
	 *
	 * @return a int
	 */
	int getShippingTypeId();

	/**
	 * <p>getName.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getName();
	
	/**
	 * <p>isCashOnDelivery.</p>
	 *
	 * @return a boolean
	 */
	boolean isCashOnDelivery();

	/**
	 * <p>getPrice.</p>
	 *
	 * @return a {@link java.lang.Double} object
	 */
	Double getPrice();

	/**
	 * <p>getShippingTypeName.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getShippingTypeName();

	/**
	 * <p>getShippingSectionId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getShippingSectionId();

	/**
	 * <p>getShippingCalculation.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.ShippingCalculation} object
	 */
	ShippingCalculation getShippingCalculation();

	/**
	 * <p>getShipperPId.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getShipperPId();
	
	/**
	 * <p>getShipperId.</p>
	 *
	 * @return a int
	 */
	int getShipperId();

	/**
	 * <p>getShippingTypePId.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getShippingTypePId();

	/**
	 * <p>getTaxes.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderItemTax> getTaxes();

	/**
	 * <p>getDiscounts.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderDiscount> getDiscounts();

	/**
	 * <p>getTracking.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderShippingTracking} object
	 */
	OrderShippingTracking getTracking();

	/**
	 * <p>setTracking.</p>
	 *
	 * @param tracking a {@link com.logicommerce.sdk.models.order.OrderShippingTracking} object
	 */
	void setTracking(OrderShippingTracking tracking);

	/**
	 * <p>getProperties.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<ElementProperty> getProperties();

	/**
	 * <p>addProperty.</p>
	 *
	 * @param property a {@link com.logicommerce.sdk.models.ElementProperty} object
	 */
	void addProperty(ElementProperty property);

	/**
	 * <p>addProperty.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 */
	void addProperty(String name, String value);

}
