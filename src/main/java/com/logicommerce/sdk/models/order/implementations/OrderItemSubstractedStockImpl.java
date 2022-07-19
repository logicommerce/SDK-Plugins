package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.enums.PrevisionType;
import com.logicommerce.sdk.models.order.OrderItemSubstractedStock;

/**
 * <p>OrderItemSubstractedStockImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderItemSubstractedStockImpl implements OrderItemSubstractedStock {

	private Integer id;

	private int quantity;

	private Integer productCombinationStockId;

	private PrevisionType previsionType;

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getId() {
		return id;
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
	 * <p>Getter for the field <code>productCombinationStockId</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getProductCombinationStockId() {
		return productCombinationStockId;
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
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * <p>Setter for the field <code>productCombinationStockId</code>.</p>
	 *
	 * @param productCombinationStockId a {@link java.lang.Integer} object
	 */
	public void setProductCombinationStockId(Integer productCombinationStockId) {
		this.productCombinationStockId = productCombinationStockId;
	}

	/**
	 * <p>Setter for the field <code>previsionType</code>.</p>
	 *
	 * @param previsionType a {@link com.logicommerce.sdk.enums.PrevisionType} object
	 */
	public void setPrevisionType(PrevisionType previsionType) {
		this.previsionType = previsionType;
	}

}
