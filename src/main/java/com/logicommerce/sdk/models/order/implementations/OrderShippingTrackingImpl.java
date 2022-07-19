package com.logicommerce.sdk.models.order.implementations;

import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;
import com.logicommerce.sdk.models.order.OrderShippingTracking;
import com.logicommerce.sdk.models.order.OrderShippingTrackingPackage;
import com.logicommerce.utilities.annotations.Uses;

/**
 * <p>OrderShippingTrackingImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderShippingTrackingImpl implements OrderShippingTracking {

	private Integer id;
	
	private String trackingReference;
	
	@Uses(value = OrderShippingTrackingPackageImpl.class)
	private List<OrderShippingTrackingPackage> packages;
	
	@Uses(value = ElementProperyImpl.class)
	private List<ElementProperty> properties;

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getId() {
		return id;
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
	 * <p>Getter for the field <code>trackingReference</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getTrackingReference() {
		return trackingReference;
	}

	/** {@inheritDoc} */
	public void setTrackingReference(String trackingReference) {
		this.trackingReference = trackingReference;
	}

	/**
	 * <p>Getter for the field <code>packages</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	public List<OrderShippingTrackingPackage> getPackages() {
		return packages;
	}

	/** {@inheritDoc} */
	public void addPackage(OrderShippingTrackingPackage trackingPackage) {
		packages.add(trackingPackage);
	}

	/**
	 * <p>Getter for the field <code>properties</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	public List<ElementProperty> getProperties() {
		return properties;
	}

	/** {@inheritDoc} */
	public void addProperty(ElementProperty property) {
		if (properties == null) {
			properties = new ArrayList<>();
		}
		properties.add(property);
	}

	/** {@inheritDoc} */
	public void addProperty(String name, String value) {
		addProperty(new ElementProperyImpl(name, value));
	}

	/**
	 * <p>Setter for the field <code>packages</code>.</p>
	 *
	 * @param packages a {@link java.util.List} object
	 */
	public void setPackages(List<OrderShippingTrackingPackage> packages) {
		this.packages = packages;
	}

	/**
	 * <p>Setter for the field <code>properties</code>.</p>
	 *
	 * @param properties a {@link java.util.List} object
	 */
	public void setProperties(List<ElementProperty> properties) {
		this.properties = properties;
	}

}
