package com.logicommerce.sdk.models.order.implementations;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;
import com.logicommerce.sdk.models.order.OrderShippingTrackingPackageActivity;
import com.logicommerce.utilities.annotations.Uses;

public class OrderShippingTrackingPackageActivityImpl implements OrderShippingTrackingPackageActivity {

	private Integer id;
	
	private LocalDateTime dateTime;
	
	private String status;
	
	private String description;
	
	@Uses(value = ElementProperyImpl.class)
	private List<ElementProperty> properties;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public String getStatus() {
		return status;
	}

	public String getDescription() {
		return description;
	}

	public List<ElementProperty> getProperties() {
		return properties;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public void setProperties(List<ElementProperty> properties) {
		this.properties = properties;
	}
}