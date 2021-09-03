package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.enums.PrevisionType;
import com.logicommerce.sdk.models.order.OrderItemSubstractedStock;
import com.logicommerce.sdk.models.order.implementations.OrderItemSubstractedStockImpl;

public class OrderItemSubstractedStockBuilder<T> {

	private T parentBuilder;
	
	protected Integer id;

	protected PrevisionType previsionType;

	protected Integer productCombinationStockId;

	protected int quantity;

	public OrderItemSubstractedStockBuilder() {

	}

	public OrderItemSubstractedStockBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderItemSubstractedStockBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}
	
	public OrderItemSubstractedStockBuilder<T> previsionType(PrevisionType previsionType) {
		this.previsionType = previsionType;
		return this;
	}

	public OrderItemSubstractedStockBuilder<T> productCombinationStockId(Integer productCombinationStockId) {
		this.productCombinationStockId = productCombinationStockId;
		return this;
	}

	public OrderItemSubstractedStockBuilder<T> quantity(int quantity) {
		this.quantity = quantity;
		return this;
	}


	public OrderItemSubstractedStock build() {
		OrderItemSubstractedStockImpl substractedStock = new OrderItemSubstractedStockImpl();
		substractedStock.setId(null);
		substractedStock.setPrevisionType(previsionType);
		substractedStock.setProductCombinationStockId(productCombinationStockId);
		substractedStock.setQuantity(quantity);
		return substractedStock;
	}

	public T done() {
		return parentBuilder;
	}

}
