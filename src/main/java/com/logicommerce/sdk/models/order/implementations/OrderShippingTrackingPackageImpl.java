package com.logicommerce.sdk.models.order.implementations;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.models.order.OrderShippingTrackingPackage;
import com.logicommerce.sdk.models.order.OrderShippingTrackingPackageActivity;
import com.logicommerce.utilities.annotations.Uses;

/**
 * <p>OrderShippingTrackingPackageImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderShippingTrackingPackageImpl implements OrderShippingTrackingPackage {

	private Integer id;
	private Double weight;
	private String weightUnits;
	private LocalDateTime lastUpdate;
	
	@Uses(value = OrderShippingTrackingPackageActivityImpl.class)
	private List<OrderShippingTrackingPackageActivity> activities;

	/** {@inheritDoc} */
	@Override
	public Integer getId() {
		return id;
	}

	/** {@inheritDoc} */
	@Override
	public Double getWeight() {
		return weight;
	}

	/** {@inheritDoc} */
	@Override
	public String getWeightUnits() {
		return weightUnits;
	}

	/** {@inheritDoc} */
	@Override
	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}

	/** {@inheritDoc} */
	@Override
	public List<OrderShippingTrackingPackageActivity> getActivities() {
		return activities;
	}

	/** {@inheritDoc} */
	@Override
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	/** {@inheritDoc} */
	@Override
	public void setWeightUnits(String weightUnits) {
		this.weightUnits = weightUnits;
	}

	/** {@inheritDoc} */
	@Override
	public void addActivty(OrderShippingTrackingPackageActivity activity) {
		if (activities == null) {
			activities = new ArrayList<>();
		}
		activities.add(activity);
	}
	
	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * <p>Setter for the field <code>lastUpdate</code>.</p>
	 *
	 * @param lastUpdate a {@link java.time.LocalDateTime} object
	 */
	public void setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * <p>Setter for the field <code>activities</code>.</p>
	 *
	 * @param activities a {@link java.util.List} object
	 */
	public void setActivities(List<OrderShippingTrackingPackageActivity> activities) {
		this.activities = activities;
	}
}
