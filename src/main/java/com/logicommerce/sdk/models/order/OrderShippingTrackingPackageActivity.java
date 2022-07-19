package com.logicommerce.sdk.models.order;

import java.time.LocalDateTime;
import java.util.List;
import com.logicommerce.sdk.models.ElementProperty;

/**
 * <p>OrderShippingTrackingPackageActivity interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderShippingTrackingPackageActivity {

	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * <p>getDateTime.</p>
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	LocalDateTime getDateTime();

	/**
	 * <p>getStatus.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getStatus();

	/**
	 * <p>getDescription.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getDescription();

	/**
	 * <p>getProperties.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<ElementProperty> getProperties();

	/**
	 * <p>setStatus.</p>
	 *
	 * @param status a {@link java.lang.String} object
	 */
	void setStatus(String status);

	/**
	 * <p>setDescription.</p>
	 *
	 * @param description a {@link java.lang.String} object
	 */
	void setDescription(String description);

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
