package com.logicommerce.sdk.builders.order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.enums.ShippingCalculation;
import com.logicommerce.sdk.models.order.OrderShipping;
import com.logicommerce.sdk.models.order.implementations.OrderShippingImpl;

/**
 * <p>OrderShippingBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
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

	/**
	 * <p>Constructor for OrderShippingBuilder.</p>
	 */
	public OrderShippingBuilder() {
		taxes = new ArrayList<>();
		discounts = new ArrayList<>();
		tracking = new OrderShippingTrackingBuilder<>(this);
		shippingCalculation = ShippingCalculation.BY_WEIGHT;
	}

	/**
	 * <p>Constructor for OrderShippingBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderShippingBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingBuilder} object
	 */
	public OrderShippingBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * <p>shippingTypeId.</p>
	 *
	 * @param shippingTypeId a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingBuilder} object
	 */
	public OrderShippingBuilder<T> shippingTypeId(int shippingTypeId) {
		this.shippingTypeId = shippingTypeId;
		return this;
	}

	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingBuilder} object
	 */
	public OrderShippingBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * <p>price.</p>
	 *
	 * @param price a {@link java.lang.Double} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingBuilder} object
	 */
	public OrderShippingBuilder<T> price(Double price) {
		this.price = price;
		return this;
	}

	/**
	 * <p>shippingTypeName.</p>
	 *
	 * @param shippingTypeName a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingBuilder} object
	 */
	public OrderShippingBuilder<T> shippingTypeName(String shippingTypeName) {
		this.shippingTypeName = shippingTypeName;
		return this;
	}

	/**
	 * <p>shippingSectionId.</p>
	 *
	 * @param shippingSectionId a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingBuilder} object
	 */
	public OrderShippingBuilder<T> shippingSectionId(Integer shippingSectionId) {
		this.shippingSectionId = shippingSectionId;
		return this;
	}

	/**
	 * <p>shippingCalculation.</p>
	 *
	 * @param shippingCalculation a {@link com.logicommerce.sdk.enums.ShippingCalculation} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingBuilder} object
	 */
	public OrderShippingBuilder<T> shippingCalculation(ShippingCalculation shippingCalculation) {
		this.shippingCalculation = shippingCalculation;
		return this;
	}

	/**
	 * <p>shipperPId.</p>
	 *
	 * @param shipperPId a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingBuilder} object
	 */
	public OrderShippingBuilder<T> shipperPId(String shipperPId) {
		this.shipperPId = shipperPId;
		return this;
	}
	
	/**
	 * <p>shipperId.</p>
	 *
	 * @param shipperId a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingBuilder} object
	 */
	public OrderShippingBuilder<T> shipperId(int shipperId) {
		this.shipperId = shipperId;
		return this;
	}

	/**
	 * <p>shippingTypePId.</p>
	 *
	 * @param shippingTypePId a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingBuilder} object
	 */
	public OrderShippingBuilder<T> shippingTypePId(String shippingTypePId) {
		this.shippingTypePId = shippingTypePId;
		return this;
	}

	/**
	 * <p>cashOnDelivery.</p>
	 *
	 * @param cashOnDelivery a boolean
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingBuilder} object
	 */
	public OrderShippingBuilder<T> cashOnDelivery(boolean cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
		return this;
	}

	/**
	 * <p>tax.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemTaxBuilder} object
	 */
	public OrderItemTaxBuilder<OrderShippingBuilder<T>> tax() {
		OrderItemTaxBuilder<OrderShippingBuilder<T>> tax = new OrderItemTaxBuilder<>(this);
		taxes.add(tax);
		return tax;
	}

	/**
	 * <p>discount.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<OrderShippingBuilder<T>> discount() {
		OrderDiscountBuilder<OrderShippingBuilder<T>> discount = new OrderDiscountBuilder<>(this);
		discounts.add(discount);
		return discount;
	}
	
	/**
	 * <p>tracking.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderShippingTrackingBuilder} object
	 */
	public OrderShippingTrackingBuilder<OrderShippingBuilder<T>> tracking() {
		return this.tracking;
	}
	
	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderShipping} object
	 */
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
		shipping.setTaxes(taxes.stream()
				.map(OrderItemTaxBuilder::build)
				.collect(Collectors.toList()));
		shipping.setDiscounts(discounts.stream()
				.map(OrderDiscountBuilder::build)
				.collect(Collectors.toList()));
		shipping.setTracking(tracking.build());
		return shipping;
	}

	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
