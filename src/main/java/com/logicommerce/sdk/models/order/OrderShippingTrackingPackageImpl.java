package com.logicommerce.sdk.models.order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderShippingTrackingPackageImpl implements OrderShippingTrackingPackage {

	private Integer id;
	private Double weight;
	private String weightUnits;
	private LocalDateTime lastUpdate;
	private List<OrderShippingTrackingPackageActivity> activities;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public Double getWeight() {
		return weight;
	}

	@Override
	public String getWeightUnits() {
		return weightUnits;
	}

	@Override
	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}

	@Override
	public List<OrderShippingTrackingPackageActivity> getActivities() {
		return activities;
	}

	@Override
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public void setWeightUnits(String weightUnits) {
		this.weightUnits = weightUnits;
	}

	@Override
	public void addActivty(OrderShippingTrackingPackageActivity activity) {
		if (activities == null) {
			activities = new ArrayList<>();
		}
		activities.add(activity);
	}

	public void setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public void setActivities(List<OrderShippingTrackingPackageActivity> activities) {
		this.activities = activities;
	}

}
