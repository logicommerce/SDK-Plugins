package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.enums.PrevisionType;
import com.logicommerce.sdk.models.order.OrderItemSubstractedStock;

public class OrderItemSubstractedStockImpl implements OrderItemSubstractedStock {

	private Integer id;

	private int quantity;

	private Integer productCombinationStockId;

	private PrevisionType previsionType;

	public Integer getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public Integer getProductCombinationStockId() {
		return productCombinationStockId;
	}

	public PrevisionType getPrevisionType() {
		return previsionType;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setProductCombinationStockId(Integer productCombinationStockId) {
		this.productCombinationStockId = productCombinationStockId;
	}

	public void setPrevisionType(PrevisionType previsionType) {
		this.previsionType = previsionType;
	}

}