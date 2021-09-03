package com.logicommerce.sdk.builders.order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.logicommerce.sdk.enums.ShippingCalculation;
import com.logicommerce.sdk.models.order.OrderShipping;
import com.logicommerce.sdk.models.order.implementations.OrderShippingImpl;

public class OrderShippingBuilder<T> {

	private T parentBuilder;

	protected Integer id;

	protected int shippingTypeId;

	protected String name;

	protected Double price;

	protected String shippingTypeName;

	protected Integer shippingSectionId;

	protected ShippingCalculation shippingCalculation;

	protected String shipperPId;
	
	protected int shipperId;

	protected String shippingTypePId;

	protected boolean cashOnDelivery;

	protected List<OrderItemTaxBuilder<OrderShippingBuilder<T>>> taxes;

	protected List<OrderDiscountBuilder<OrderShippingBuilder<T>>> discounts;

	protected OrderShippingTrackingBuilder<OrderShippingBuilder<T>> tracking;

	public OrderShippingBuilder() {
		taxes = new ArrayList<>();
		discounts = new ArrayList<>();
		tracking = new OrderShippingTrackingBuilder<>(this);
		shippingCalculation = ShippingCalculation.BY_WEIGHT;
	}

	public OrderShippingBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderShippingBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	public OrderShippingBuilder<T> shippingTypeId(int shippingTypeId) {
		this.shippingTypeId = shippingTypeId;
		return this;
	}

	public OrderShippingBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	public OrderShippingBuilder<T> price(Double price) {
		this.price = price;
		return this;
	}

	public OrderShippingBuilder<T> shippingTypeName(String shippingTypeName) {
		this.shippingTypeName = shippingTypeName;
		return this;
	}

	public OrderShippingBuilder<T> shippingSectionId(Integer shippingSectionId) {
		this.shippingSectionId = shippingSectionId;
		return this;
	}

	public OrderShippingBuilder<T> shippingCalculation(ShippingCalculation shippingCalculation) {
		this.shippingCalculation = shippingCalculation;
		return this;
	}

	public OrderShippingBuilder<T> shipperPId(String shipperPId) {
		this.shipperPId = shipperPId;
		return this;
	}
	
	public OrderShippingBuilder<T> shipperId(int shipperId) {
		this.shipperId = shipperId;
		return this;
	}

	public OrderShippingBuilder<T> shippingTypePId(String shippingTypePId) {
		this.shippingTypePId = shippingTypePId;
		return this;
	}

	public OrderShippingBuilder<T> cashOnDelivery(boolean cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
		return this;
	}

	public OrderItemTaxBuilder<OrderShippingBuilder<T>> tax() {
		OrderItemTaxBuilder<OrderShippingBuilder<T>> tax = new OrderItemTaxBuilder<>(this);
		taxes.add(tax);
		return tax;
	}

	public OrderDiscountBuilder<OrderShippingBuilder<T>> discount() {
		OrderDiscountBuilder<OrderShippingBuilder<T>> discount = new OrderDiscountBuilder<>(this);
		discounts.add(discount);
		return discount;
	}
	
	public OrderShippingTrackingBuilder<OrderShippingBuilder<T>> tracking() {
//		OrderShippingTrackingBuilder<OrderShippingBuilder<T>> tracking = new OrderShippingTrackingBuilder<>(this); 
//		//this.trackings.add(tracking);
//		this.tracking = tracking;
		return this.tracking;
	}
	
	public OrderShipping build() {
		OrderShippingImpl shipping = new OrderShippingImpl();
		shipping.setId(null);
		shipping.setShippingTypeId(shippingTypeId);
		shipping.setName(name);
		shipping.setPrice(price);
		shipping.setShippingTypeName(shippingTypeName);
		shipping.setShippingSectionId(shippingSectionId);
		shipping.setShippingCalculation(shippingCalculation);
		shipping.setShipperId(shipperId);
		shipping.setShipperPId(shipperPId);
		shipping.setShippingTypePId(shippingTypePId);
		shipping.setCashOnDelivery(cashOnDelivery);
		shipping.setTaxes(taxes.stream().map(OrderItemTaxBuilder::build).collect(Collectors.toList()));
		shipping.setDiscounts(discounts.stream().map(OrderDiscountBuilder::build).collect(Collectors.toList()));
		shipping.setTracking(tracking.build());
		return shipping;
	}

	public T done() {
		return parentBuilder;
	}
}