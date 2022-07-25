package com.logicommerce.sdk.models.order.implementations;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;
import com.logicommerce.sdk.models.order.OrderShippingTrackingPackageActivity;
import com.logicommerce.utilities.annotations.Uses;

/**
 * <p>OrderShippingTrackingPackageActivityImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderShippingTrackingPackageActivityImpl implements OrderShippingTrackingPackageActivity {

	private Integer id;
	
	private LocalDateTime dateTime;
	
	private String status;
	
	private String description;
	
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
	 * <p>Getter for the field <code>dateTime</code>.</p>
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	public LocalDateTime getDateTime() {
		return dateTime;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <p>Getter for the field <code>description</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getDescription() {
		return description;
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
	public void setStatus(String status) {
		this.status = status;
	}

	/** {@inheritDoc} */
	public void setDescription(String description) {
		this.description = description;
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
	 * <p>Setter for the field <code>dateTime</code>.</p>
	 *
	 * @param dateTime a {@link java.time.LocalDateTime} object
	 */
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
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
