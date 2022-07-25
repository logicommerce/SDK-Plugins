package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.enums.PrevisionType;
import com.logicommerce.sdk.models.order.OrderItemSubstractedStock;
import com.logicommerce.sdk.models.order.implementations.OrderItemSubstractedStockImpl;

/**
 * <p>OrderItemSubstractedStockBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderItemSubstractedStockBuilder<T> {

	private T parentBuilder;
	
	protected Integer id;

	protected PrevisionType previsionType;

	protected Integer productCombinationStockId;

	protected int quantity;

	/**
	 * <p>Constructor for OrderItemSubstractedStockBuilder.</p>
	 */
	public OrderItemSubstractedStockBuilder() {

	}

	/**
	 * <p>Constructor for OrderItemSubstractedStockBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderItemSubstractedStockBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemSubstractedStockBuilder} object
	 */
	public OrderItemSubstractedStockBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}
	
	/**
	 * <p>previsionType.</p>
	 *
	 * @param previsionType a {@link com.logicommerce.sdk.enums.PrevisionType} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemSubstractedStockBuilder} object
	 */
	public OrderItemSubstractedStockBuilder<T> previsionType(PrevisionType previsionType) {
		this.previsionType = previsionType;
		return this;
	}

	/**
	 * <p>productCombinationStockId.</p>
	 *
	 * @param productCombinationStockId a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemSubstractedStockBuilder} object
	 */
	public OrderItemSubstractedStockBuilder<T> productCombinationStockId(Integer productCombinationStockId) {
		this.productCombinationStockId = productCombinationStockId;
		return this;
	}

	/**
	 * <p>quantity.</p>
	 *
	 * @param quantity a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemSubstractedStockBuilder} object
	 */
	public OrderItemSubstractedStockBuilder<T> quantity(int quantity) {
		this.quantity = quantity;
		return this;
	}


	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderItemSubstractedStock} object
	 */
	public OrderItemSubstractedStock build() {
		OrderItemSubstractedStockImpl substractedStock = new OrderItemSubstractedStockImpl();
		substractedStock.setId(null);
		substractedStock.setPrevisionType(previsionType);
		substractedStock.setProductCombinationStockId(productCombinationStockId);
		substractedStock.setQuantity(quantity);
		return substractedStock;
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
