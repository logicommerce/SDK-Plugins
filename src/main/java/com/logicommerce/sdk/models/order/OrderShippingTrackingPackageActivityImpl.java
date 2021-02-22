package com.logicommerce.sdk.models.order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;

public class OrderShippingTrackingPackageActivityImpl implements OrderShippingTrackingPackageActivity {

	private Integer id;
	private LocalDateTime dateTime;
	private String status;
	private String description;
	private List<ElementProperty> properties;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public LocalDateTime getDateTime() {
		return dateTime;
	}

	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public List<ElementProperty> getProperties() {
		return properties;
	}

	@Override
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
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

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public void setProperties(List<ElementProperty> properties) {
		this.properties = properties;
	}

}
