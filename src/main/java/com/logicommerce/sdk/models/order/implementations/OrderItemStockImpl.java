package com.logicommerce.sdk.models.order.implementations;

import java.time.LocalDate;
import java.util.List;
import com.logicommerce.sdk.enums.PrevisionType;
import com.logicommerce.sdk.models.order.OrderItemStock;
import com.logicommerce.sdk.models.order.OrderItemSubstractedStock;
import com.logicommerce.utilities.annotations.NoMappable;
import com.logicommerce.utilities.annotations.Uses;

public class OrderItemStockImpl implements OrderItemStock {

private Integer id;
	
	private Integer warehouseId;

	private Integer warehouseGroupId;
	
	private int quantity;
	
	private int reservedQuantity;
	
	private LocalDate incomingDate;
	
	private int offsetDays;
	
	private int priority;

	private String hash;
	
	@NoMappable
	private PrevisionType previsionType;

	@Uses(value = OrderItemSubstractedStockImpl.class)
	private List<OrderItemSubstractedStock> substractedStocks;

	public Integer getId() {
		return id;
	}

	public Integer getWarehouseId() {
		return warehouseId;
	}

	public Integer getWarehouseGroupId() {
		return warehouseGroupId;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getReservedQuantity() {
		return reservedQuantity;
	}

	public LocalDate getIncomingDate() {
		return incomingDate;
	}

	public int getOffsetDays() {
		return offsetDays;
	}

	public int getPriority() {
		return priority;
	}

	public String getHash() {
		return hash;
	}

	public PrevisionType getPrevisionType() {
		return previsionType;
	}

	public List<OrderItemSubstractedStock> getSubstractedStocks() {
		return substractedStocks;
	}

	public void setWarehouseGroupId(Integer warehouseGroupId) {
		this.warehouseGroupId = warehouseGroupId;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setWarehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setReservedQuantity(int reservedQuantity) {
		this.reservedQuantity = reservedQuantity;
	}

	public void setIncomingDate(LocalDate incomingDate) {
		this.incomingDate = incomingDate;
	}

	public void setOffsetDays(int offsetDays) {
		this.offsetDays = offsetDays;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public void setPrevisionType(PrevisionType previsionType) {
		this.previsionType = previsionType;
	}

	public void setSubstractedStocks(List<OrderItemSubstractedStock> substractedStocks) {
		this.substractedStocks = substractedStocks;
	}
}