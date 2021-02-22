package com.logicommerce.sdk.models.order;

import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;

public class OrderShippingTrackingImpl implements OrderShippingTracking {

	private Integer id;
	private String trackingNumber;
	private List<OrderShippingTrackingPackage> trackingPackages;
	private List<ElementProperty> properties;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public String getTrackingNumber() {
		return trackingNumber;
	}

	@Override
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	@Override
	public List<OrderShippingTrackingPackage> getTrackingPackages() {
		return trackingPackages;
	}

	@Override
	public void addPackage(OrderShippingTrackingPackage trackingPackage) {
		trackingPackages.add(trackingPackage);
	}

	@Override
	public List<ElementProperty> getProperties() {
		return properties;
	}

	@Override
	public void addProperty(ElementProperty property) {
		if (properties == null) {
			properties = new ArrayList<>();
		}
		properties.add(property);
	}

	@Override
	public void addProperty(String name, String value) {
		addProperty(new ElementProperyImpl(name, value));
	}

	public void setTrackingPackages(List<OrderShippingTrackingPackage> trackingPackages) {
		this.trackingPackages = trackingPackages;
	}

	public void setProperties(List<ElementProperty> properties) {
		this.properties = properties;
	}

}
