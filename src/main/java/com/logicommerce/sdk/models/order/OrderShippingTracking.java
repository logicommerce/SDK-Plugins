package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.models.ElementProperty;

/**
 * <p>OrderShippingTracking interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderShippingTracking {

	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * <p>getTrackingReference.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getTrackingReference();

	/**
	 * <p>setTrackingReference.</p>
	 *
	 * @param trackingReference a {@link java.lang.String} object
	 */
	void setTrackingReference(String trackingReference);

	/**
	 * <p>getPackages.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderShippingTrackingPackage> getPackages();

	/**
	 * <p>addPackage.</p>
	 *
	 * @param trackingPackage a {@link com.logicommerce.sdk.models.order.OrderShippingTrackingPackage} object
	 */
	void addPackage(OrderShippingTrackingPackage trackingPackage);

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
