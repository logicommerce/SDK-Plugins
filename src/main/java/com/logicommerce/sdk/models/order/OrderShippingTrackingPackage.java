package com.logicommerce.sdk.models.order;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderShippingTrackingPackage {

	Integer getId();

	Double getWeight();

	String getWeightUnits();

	LocalDateTime getLastUpdate();

	List<OrderShippingTrackingPackageActivity> getActivities();
	
	void setWeight(Double weight);
	
	void setWeightUnits(String weightUnits);
	
	void addActivty(OrderShippingTrackingPackageActivity activity);

}
