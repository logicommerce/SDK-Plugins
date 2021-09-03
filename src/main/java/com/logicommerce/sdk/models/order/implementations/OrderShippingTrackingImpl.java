package com.logicommerce.sdk.models.order.implementations;

import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;
import com.logicommerce.sdk.models.order.OrderShippingTracking;
import com.logicommerce.sdk.models.order.OrderShippingTrackingPackage;
import com.logicommerce.utilities.annotations.Uses;

public class OrderShippingTrackingImpl implements OrderShippingTracking {

	private Integer id;
	
	private String trackingNumber;
	
	@Uses(value = OrderShippingTrackingPackageImpl.class)
	private List<OrderShippingTrackingPackage> packages;
	
	@Uses(value = ElementProperyImpl.class)
	private List<ElementProperty> properties;

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public List<OrderShippingTrackingPackage> getPackages() {
		return packages;
	}

	public void addPackage(OrderShippingTrackingPackage trackingPackage) {
		packages.add(trackingPackage);
	}

	public List<ElementProperty> getProperties() {
		return properties;
	}

	public void addProperty(ElementProperty property) {
		if (properties == null) {
			properties = new ArrayList<>();
		}
		properties.add(property);
	}

	public void addProperty(String name, String value) {
		addProperty(new ElementProperyImpl(name, value));
	}

	public void setPackages(List<OrderShippingTrackingPackage> packages) {
		this.packages = packages;
	}

	public void setProperties(List<ElementProperty> properties) {
		this.properties = properties;
	}

}
