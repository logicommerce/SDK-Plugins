package com.logicommerce.sdk.builders.order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.enums.PrevisionType;
import com.logicommerce.sdk.models.order.OrderItemStock;
import com.logicommerce.sdk.models.order.implementations.OrderItemStockImpl;

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

	public OrderItemStockBuilder() {
		substractedStocks = new ArrayList<>();
	}

	public OrderItemStockBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	public OrderItemStockBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	public OrderItemStockBuilder<T> hash(String hash) {
		this.hash = hash;
		return this;
	}

	public OrderItemStockBuilder<T> incomingDate(LocalDate incomingDate) {
		this.incomingDate = incomingDate;
		return this;
	}

	public OrderItemStockBuilder<T> offsetDays(int offsetDays) {
		this.offsetDays = offsetDays;
		return this;
	}

	public OrderItemStockBuilder<T> previsionType(PrevisionType previsionType) {
		this.previsionType = previsionType;
		return this;
	}

	public OrderItemStockBuilder<T> priority(int priority) {
		this.priority = priority;
		return this;
	}

	public OrderItemStockBuilder<T> quantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	public OrderItemStockBuilder<T> reservedQuantity(int reservedQuantity) {
		this.reservedQuantity = reservedQuantity;
		return this;
	}

	public OrderItemSubstractedStockBuilder<OrderItemStockBuilder<T>> substractedStock() {
		OrderItemSubstractedStockBuilder<OrderItemStockBuilder<T>> substractedStock = new OrderItemSubstractedStockBuilder<>(this);
		substractedStocks.add(substractedStock);
		return substractedStock;
	}

	public OrderItemStockBuilder<T> warehouseGroupId(Integer warehouseGroupId) {
		this.warehouseGroupId = warehouseGroupId;
		return this;
	}

	public OrderItemStockBuilder<T> warehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
		return this;
	}

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

	public T done() {
		return parentBuilder;
	}
}