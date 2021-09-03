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

	public Integer getId() {
		return id;
	}

	public int getShippingTypeId() {
		return shippingTypeId;
	}

	public String getName() {
		return name;
	}

	public boolean isCashOnDelivery() {
		return cashOnDelivery;
	}

	public Double getPrice() {
		return price;
	}

	public String getShippingTypeName() {
		return shippingTypeName;
	}

	public Integer getShippingSectionId() {
		return shippingSectionId;
	}

	public ShippingCalculation getShippingCalculation() {
		return shippingCalculation;
	}

	public String getShipperPId() {
		return shipperPId;
	}

	public String getShippingTypePId() {
		return shippingTypePId;
	}

	public List<OrderItemTax> getTaxes() {
		return taxes;
	}

	public List<OrderDiscount> getDiscounts() {
		return discounts;
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

	public void setId(Integer id) {
		this.id = id;
	}

	public void setShippingTypeId(int shippingTypeId) {
		this.shippingTypeId = shippingTypeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCashOnDelivery(boolean cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setShippingTypeName(String shippingTypeName) {
		this.shippingTypeName = shippingTypeName;
	}

	public void setShippingSectionId(Integer shippingSectionId) {
		this.shippingSectionId = shippingSectionId;
	}

	public void setShippingCalculation(ShippingCalculation shippingCalculation) {
		this.shippingCalculation = shippingCalculation;
	}

	public void setShipperPId(String shipperPId) {
		this.shipperPId = shipperPId;
	}

	public void setShippingTypePId(String shippingTypePId) {
		this.shippingTypePId = shippingTypePId;
	}

	public void setTaxes(List<OrderItemTax> taxes) {
		this.taxes = taxes;
	}

	public void setDiscounts(List<OrderDiscount> discounts) {
		this.discounts = discounts;
	}

	public void setProperties(List<ElementProperty> properties) {
		this.properties = properties;
	}

	public void cleanProperties() {
		properties = null;
	}

	public OrderShippingTracking getTracking() {
		return tracking;
	}

	public void setTracking(OrderShippingTracking tracking) {
		this.tracking = tracking;
	}

	public int getShipperId() {
		return shipperId;
	}

	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}
}