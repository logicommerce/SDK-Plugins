package com.logicommerce.sdk.models.order;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>OrderShippingTrackingPackage interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderShippingTrackingPackage {

	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * <p>getWeight.</p>
	 *
	 * @return a {@link java.lang.Double} object
	 */
	Double getWeight();

	/**
	 * <p>getWeightUnits.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getWeightUnits();

	/**
	 * <p>getLastUpdate.</p>
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	LocalDateTime getLastUpdate();

	/**
	 * <p>getActivities.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderShippingTrackingPackageActivity> getActivities();
	
	/**
	 * <p>setWeight.</p>
	 *
	 * @param weight a {@link java.lang.Double} object
	 */
	void setWeight(Double weight);
	
	/**
	 * <p>setWeightUnits.</p>
	 *
	 * @param weightUnits a {@link java.lang.String} object
	 */
	void setWeightUnits(String weightUnits);
	
	/**
	 * <p>addActivty.</p>
	 *
	 * @param activity a {@link com.logicommerce.sdk.models.order.OrderShippingTrackingPackageActivity} object
	 */
	void addActivty(OrderShippingTrackingPackageActivity activity);

}
