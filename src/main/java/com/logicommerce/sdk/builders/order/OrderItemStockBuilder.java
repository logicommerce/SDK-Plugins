package com.logicommerce.sdk.builders.order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.enums.PrevisionType;
import com.logicommerce.sdk.models.order.OrderItemStock;
import com.logicommerce.sdk.models.order.implementations.OrderItemStockImpl;

/**
 * <p>OrderItemStockBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderItemStockBuilder<T> {

	private T parentBuilder;

	protected Integer id;

	protected String hash;

	protected LocalDate incomingDate;

	protected int offsetDays;

	protected PrevisionType previsionType;

	protected int priority;

	protected int quantity;

	protected int reservedQuantity;

	protected List<OrderItemSubstractedStockBuilder<OrderItemStockBuilder<T>>> substractedStocks;

	protected Integer warehouseGroupId;

	protected Integer warehouseId;

	/**
	 * <p>Constructor for OrderItemStockBuilder.</p>
	 */
	public OrderItemStockBuilder() {
		substractedStocks = new ArrayList<>();
	}

	/**
	 * <p>Constructor for OrderItemStockBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderItemStockBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemStockBuilder} object
	 */
	public OrderItemStockBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * <p>hash.</p>
	 *
	 * @param hash a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemStockBuilder} object
	 */
	public OrderItemStockBuilder<T> hash(String hash) {
		this.hash = hash;
		return this;
	}

	/**
	 * <p>incomingDate.</p>
	 *
	 * @param incomingDate a {@link java.time.LocalDate} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemStockBuilder} object
	 */
	public OrderItemStockBuilder<T> incomingDate(LocalDate incomingDate) {
		this.incomingDate = incomingDate;
		return this;
	}

	/**
	 * <p>offsetDays.</p>
	 *
	 * @param offsetDays a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemStockBuilder} object
	 */
	public OrderItemStockBuilder<T> offsetDays(int offsetDays) {
		this.offsetDays = offsetDays;
		return this;
	}

	/**
	 * <p>previsionType.</p>
	 *
	 * @param previsionType a {@link com.logicommerce.sdk.enums.PrevisionType} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemStockBuilder} object
	 */
	public OrderItemStockBuilder<T> previsionType(PrevisionType previsionType) {
		this.previsionType = previsionType;
		return this;
	}

	/**
	 * <p>priority.</p>
	 *
	 * @param priority a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemStockBuilder} object
	 */
	public OrderItemStockBuilder<T> priority(int priority) {
		this.priority = priority;
		return this;
	}

	/**
	 * <p>quantity.</p>
	 *
	 * @param quantity a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemStockBuilder} object
	 */
	public OrderItemStockBuilder<T> quantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	/**
	 * <p>reservedQuantity.</p>
	 *
	 * @param reservedQuantity a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemStockBuilder} object
	 */
	public OrderItemStockBuilder<T> reservedQuantity(int reservedQuantity) {
		this.reservedQuantity = reservedQuantity;
		return this;
	}

	/**
	 * <p>substractedStock.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemSubstractedStockBuilder} object
	 */
	public OrderItemSubstractedStockBuilder<OrderItemStockBuilder<T>> substractedStock() {
		OrderItemSubstractedStockBuilder<OrderItemStockBuilder<T>> substractedStock = new OrderItemSubstractedStockBuilder<>(this);
		substractedStocks.add(substractedStock);
		return substractedStock;
	}

	/**
	 * <p>warehouseGroupId.</p>
	 *
	 * @param warehouseGroupId a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemStockBuilder} object
	 */
	public OrderItemStockBuilder<T> warehouseGroupId(Integer warehouseGroupId) {
		this.warehouseGroupId = warehouseGroupId;
		return this;
	}

	/**
	 * <p>warehouseId.</p>
	 *
	 * @param warehouseId a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemStockBuilder} object
	 */
	public OrderItemStockBuilder<T> warehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderItemStock} object
	 */
	public OrderItemStock build() {
		OrderItemStockImpl stock = new OrderItemStockImpl();
		stock.setId(null);
		stock.setHash(hash);
		stock.setIncomingDate(incomingDate);
		stock.setOffsetDays(offsetDays);
		stock.setPrevisionType(previsionType);
		stock.setPriority(priority);
		stock.setQuantity(quantity);
		stock.setReservedQuantity(reservedQuantity);
		stock.setSubstractedStocks(substractedStocks.stream().map(OrderItemSubstractedStockBuilder::build).collect(Collectors.toList()));
		stock.setWarehouseGroupId(warehouseGroupId);
		stock.setWarehouseId(warehouseId);
		return stock;
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
