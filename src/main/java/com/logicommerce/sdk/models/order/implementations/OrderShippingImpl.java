package com.logicommerce.sdk.models.order.implementations;

import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.enums.ShippingCalculation;
import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;
import com.logicommerce.sdk.models.order.OrderDiscount;
import com.logicommerce.sdk.models.order.OrderItemTax;
import com.logicommerce.sdk.models.order.OrderShipping;
import com.logicommerce.sdk.models.order.OrderShippingTracking;
import com.logicommerce.utilities.annotations.NoMappable;
import com.logicommerce.utilities.annotations.Uses;

/**
 * <p>OrderShippingImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderShippingImpl implements OrderShipping {

	private Integer id;

	private int shippingTypeId;

	private String name;

	private boolean cashOnDelivery;

	private Double price;

	private String shippingTypeName;

	private Integer shippingSectionId;

	private ShippingCalculation shippingCalculation;
	
	private int shipperId;

	private String shipperPId;

	private String shippingTypePId;

	@Uses(value = OrderItemTaxImpl.class)
	private List<OrderItemTax> taxes;

	@Uses(value = OrderDiscountImpl.class)
	private List<OrderDiscount> discounts;

	@NoMappable
	@Uses(value = ElementProperyImpl.class)
	private List<ElementProperty> properties;

	//@FirstFromList(name = "trackings")
	@Uses(value = OrderShippingTrackingImpl.class)
	private OrderShippingTracking tracking;

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <p>Getter for the field <code>shippingTypeId</code>.</p>
	 *
	 * @return a int
	 */
	public int getShippingTypeId() {
		return shippingTypeId;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getName() {
		return name;
	}

	/**
	 * <p>isCashOnDelivery.</p>
	 *
	 * @return a boolean
	 */
	public boolean isCashOnDelivery() {
		return cashOnDelivery;
	}

	/**
	 * <p>Getter for the field <code>price</code>.</p>
	 *
	 * @return a {@link java.lang.Double} object
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * <p>Getter for the field <code>shippingTypeName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getShippingTypeName() {
		return shippingTypeName;
	}

	/**
	 * <p>Getter for the field <code>shippingSectionId</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getShippingSectionId() {
		return shippingSectionId;
	}

	/**
	 * <p>Getter for the field <code>shippingCalculation</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.ShippingCalculation} object
	 */
	public ShippingCalculation getShippingCalculation() {
		return shippingCalculation;
	}

	/**
	 * <p>Getter for the field <code>shipperPId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getShipperPId() {
		return shipperPId;
	}

	/**
	 * <p>Getter for the field <code>shippingTypePId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getShippingTypePId() {
		return shippingTypePId;
	}

	/**
	 * <p>Getter for the field <code>taxes</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	public List<OrderItemTax> getTaxes() {
		return taxes;
	}

	/**
	 * <p>Getter for the field <code>discounts</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	public List<OrderDiscount> getDiscounts() {
		return discounts;
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
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * <p>Setter for the field <code>shippingTypeId</code>.</p>
	 *
	 * @param shippingTypeId a int
	 */
	public void setShippingTypeId(int shippingTypeId) {
		this.shippingTypeId = shippingTypeId;
	}

	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Setter for the field <code>cashOnDelivery</code>.</p>
	 *
	 * @param cashOnDelivery a boolean
	 */
	public void setCashOnDelivery(boolean cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}

	/**
	 * <p>Setter for the field <code>price</code>.</p>
	 *
	 * @param price a {@link java.lang.Double} object
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * <p>Setter for the field <code>shippingTypeName</code>.</p>
	 *
	 * @param shippingTypeName a {@link java.lang.String} object
	 */
	public void setShippingTypeName(String shippingTypeName) {
		this.shippingTypeName = shippingTypeName;
	}

	/**
	 * <p>Setter for the field <code>shippingSectionId</code>.</p>
	 *
	 * @param shippingSectionId a {@link java.lang.Integer} object
	 */
	public void setShippingSectionId(Integer shippingSectionId) {
		this.shippingSectionId = shippingSectionId;
	}

	/**
	 * <p>Setter for the field <code>shippingCalculation</code>.</p>
	 *
	 * @param shippingCalculation a {@link com.logicommerce.sdk.enums.ShippingCalculation} object
	 */
	public void setShippingCalculation(ShippingCalculation shippingCalculation) {
		this.shippingCalculation = shippingCalculation;
	}

	/**
	 * <p>Setter for the field <code>shipperPId</code>.</p>
	 *
	 * @param shipperPId a {@link java.lang.String} object
	 */
	public void setShipperPId(String shipperPId) {
		this.shipperPId = shipperPId;
	}

	/**
	 * <p>Setter for the field <code>shippingTypePId</code>.</p>
	 *
	 * @param shippingTypePId a {@link java.lang.String} object
	 */
	public void setShippingTypePId(String shippingTypePId) {
		this.shippingTypePId = shippingTypePId;
	}

	/**
	 * <p>Setter for the field <code>taxes</code>.</p>
	 *
	 * @param taxes a {@link java.util.List} object
	 */
	public void setTaxes(List<OrderItemTax> taxes) {
		this.taxes = taxes;
	}

	/**
	 * <p>Setter for the field <code>discounts</code>.</p>
	 *
	 * @param discounts a {@link java.util.List} object
	 */
	public void setDiscounts(List<OrderDiscount> discounts) {
		this.discounts = discounts;
	}

	/**
	 * <p>Setter for the field <code>properties</code>.</p>
	 *
	 * @param properties a {@link java.util.List} object
	 */
	public void setProperties(List<ElementProperty> properties) {
		this.properties = properties;
	}

	/**
	 * <p>cleanProperties.</p>
	 */
	public void cleanProperties() {
		properties = null;
	}

	/**
	 * <p>Getter for the field <code>tracking</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderShippingTracking} object
	 */
	public OrderShippingTracking getTracking() {
		return tracking;
	}

	/** {@inheritDoc} */
	public void setTracking(OrderShippingTracking tracking) {
		this.tracking = tracking;
	}

	/**
	 * <p>Getter for the field <code>shipperId</code>.</p>
	 *
	 * @return a int
	 */
	public int getShipperId() {
		return shipperId;
	}

	/**
	 * <p>Setter for the field <code>shipperId</code>.</p>
	 *
	 * @param shipperId a int
	 */
	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}
}
