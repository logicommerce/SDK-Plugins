package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.models.ElementProperty;

public interface OrderShippingTracking {

	Integer getId();

	String getTrackingReference();

	void setTrackingReference(String trackingReference);

	List<OrderShippingTrackingPackage> getPackages();

	void addPackage(OrderShippingTrackingPackage trackingPackage);

	List<ElementProperty> getProperties();

	void addProperty(ElementProperty property);

	void addProperty(String name, String value);
}
