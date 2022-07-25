package com.logicommerce.sdk.models.order.implementations;

import java.time.LocalDate;
import java.util.List;
import com.logicommerce.sdk.enums.PrevisionType;
import com.logicommerce.sdk.models.order.OrderItemStock;
import com.logicommerce.sdk.models.order.OrderItemSubstractedStock;
import com.logicommerce.utilities.annotations.NoMappable;
import com.logicommerce.utilities.annotations.Uses;

/**
 * <p>OrderItemStockImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
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

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <p>Getter for the field <code>warehouseId</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getWarehouseId() {
		return warehouseId;
	}

	/**
	 * <p>Getter for the field <code>warehouseGroupId</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getWarehouseGroupId() {
		return warehouseGroupId;
	}

	/**
	 * <p>Getter for the field <code>quantity</code>.</p>
	 *
	 * @return a int
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <p>Getter for the field <code>reservedQuantity</code>.</p>
	 *
	 * @return a int
	 */
	public int getReservedQuantity() {
		return reservedQuantity;
	}

	/**
	 * <p>Getter for the field <code>incomingDate</code>.</p>
	 *
	 * @return a {@link java.time.LocalDate} object
	 */
	public LocalDate getIncomingDate() {
		return incomingDate;
	}

	/**
	 * <p>Getter for the field <code>offsetDays</code>.</p>
	 *
	 * @return a int
	 */
	public int getOffsetDays() {
		return offsetDays;
	}

	/**
	 * <p>Getter for the field <code>priority</code>.</p>
	 *
	 * @return a int
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <p>Getter for the field <code>hash</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * <p>Getter for the field <code>previsionType</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.PrevisionType} object
	 */
	public PrevisionType getPrevisionType() {
		return previsionType;
	}

	/**
	 * <p>Getter for the field <code>substractedStocks</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	public List<OrderItemSubstractedStock> getSubstractedStocks() {
		return substractedStocks;
	}

	/**
	 * <p>Setter for the field <code>warehouseGroupId</code>.</p>
	 *
	 * @param warehouseGroupId a {@link java.lang.Integer} object
	 */
	public void setWarehouseGroupId(Integer warehouseGroupId) {
		this.warehouseGroupId = warehouseGroupId;
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
	 * <p>Setter for the field <code>warehouseId</code>.</p>
	 *
	 * @param warehouseId a {@link java.lang.Integer} object
	 */
	public void setWarehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
	}

	/**
	 * <p>Setter for the field <code>quantity</code>.</p>
	 *
	 * @param quantity a int
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * <p>Setter for the field <code>reservedQuantity</code>.</p>
	 *
	 * @param reservedQuantity a int
	 */
	public void setReservedQuantity(int reservedQuantity) {
		this.reservedQuantity = reservedQuantity;
	}

	/**
	 * <p>Setter for the field <code>incomingDate</code>.</p>
	 *
	 * @param incomingDate a {@link java.time.LocalDate} object
	 */
	public void setIncomingDate(LocalDate incomingDate) {
		this.incomingDate = incomingDate;
	}

	/**
	 * <p>Setter for the field <code>offsetDays</code>.</p>
	 *
	 * @param offsetDays a int
	 */
	public void setOffsetDays(int offsetDays) {
		this.offsetDays = offsetDays;
	}

	/**
	 * <p>Setter for the field <code>priority</code>.</p>
	 *
	 * @param priority a int
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * <p>Setter for the field <code>hash</code>.</p>
	 *
	 * @param hash a {@link java.lang.String} object
	 */
	public void setHash(String hash) {
		this.hash = hash;
	}

	/**
	 * <p>Setter for the field <code>previsionType</code>.</p>
	 *
	 * @param previsionType a {@link com.logicommerce.sdk.enums.PrevisionType} object
	 */
	public void setPrevisionType(PrevisionType previsionType) {
		this.previsionType = previsionType;
	}

	/**
	 * <p>Setter for the field <code>substractedStocks</code>.</p>
	 *
	 * @param substractedStocks a {@link java.util.List} object
	 */
	public void setSubstractedStocks(List<OrderItemSubstractedStock> substractedStocks) {
		this.substractedStocks = substractedStocks;
	}
}
