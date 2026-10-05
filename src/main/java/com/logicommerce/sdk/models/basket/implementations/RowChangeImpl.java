package com.logicommerce.sdk.models.basket.implementations;

import java.util.List;
import com.logicommerce.sdk.models.basket.RowChange;

/**
 * <p>Implementation of {@link RowChange}.</p>
 *
 * @see com.logicommerce.sdk.builders.basket.RowChangeBuilder
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public class RowChangeImpl implements RowChange {

	private String rowHash;

	private int productId;

	private List<Integer> optionValueIds = List.of();

	private long quantity;

	/**
	 * <p>Constructor for RowChangeImpl.</p>
	 */
	public RowChangeImpl() {
		// fields are set with the setters
	}

	/** {@inheritDoc} */
	@Override
	public String getRowHash() {
		return rowHash;
	}

	/**
	 * <p>Setter for the field <code>rowHash</code>.</p>
	 *
	 * @param rowHash the hash of the basket row, or null for a new row
	 */
	public void setRowHash(String rowHash) {
		this.rowHash = rowHash;
	}

	/** {@inheritDoc} */
	@Override
	public int getProductId() {
		return productId;
	}

	/**
	 * <p>Setter for the field <code>productId</code>.</p>
	 *
	 * @param productId the product id; must be positive
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/** {@inheritDoc} */
	@Override
	public List<Integer> getOptionValueIds() {
		return optionValueIds;
	}

	/**
	 * <p>Setter for the field <code>optionValueIds</code>.</p>
	 *
	 * @param optionValueIds the combinable option value ids; null is taken as none
	 */
	public void setOptionValueIds(List<Integer> optionValueIds) {
		this.optionValueIds = optionValueIds == null ? List.of() : optionValueIds;
	}

	/** {@inheritDoc} */
	@Override
	public long getQuantity() {
		return quantity;
	}

	/**
	 * <p>Setter for the field <code>quantity</code>.</p>
	 *
	 * @param quantity the quantity; must be positive
	 */
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

}
