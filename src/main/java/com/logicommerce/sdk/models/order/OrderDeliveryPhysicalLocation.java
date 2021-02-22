package com.logicommerce.sdk.models.order;

import com.logicommerce.sdk.models.Location;

public interface OrderDeliveryPhysicalLocation {

	int getPhysicalLocationId();

	String getPhysicalLocationPId();

	String getName();

	String getAddress();

	String getCity();

	String getState();

	String getPostalCode();

	Location getLocation();
	
}
