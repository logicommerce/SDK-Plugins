package com.logicommerce.sdk.builders.basket;

import java.util.List;
import java.util.Objects;
import com.logicommerce.sdk.models.basket.RowChange;
import com.logicommerce.sdk.models.basket.implementations.RowChangeImpl;

/**
 * <p>Builder of {@link RowChange}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public class RowChangeBuilder {

	private String rowHash;

	private int productId;

	private List<Integer> optionValueIds = List.of();

	private long quantity;

	/**
	 * <p>Constructor for RowChangeBuilder.</p>
	 */
	public RowChangeBuilder() {
		// defaults are set in the fields
	}

	/**
	 * <p>Sets <code>rowHash</code>.</p>
	 *
	 * @param rowHash the hash of the basket row, or null for a new row
	 * @return this builder
	 */
	public RowChangeBuilder rowHash(String rowHash) {
		this.rowHash = rowHash;
		return this;
	}

	/**
	 * <p>Sets <code>productId</code>.</p>
	 *
	 * @param productId the product id; must be positive
	 * @return this builder
	 */
	public RowChangeBuilder productId(int productId) {
		this.productId = productId;
		return this;
	}

	/**
	 * <p>Sets <code>optionValueIds</code>.</p>
	 *
	 * @param optionValueIds the combinable option value ids; null is taken as none
	 * @return this builder
	 */
	public RowChangeBuilder optionValueIds(List<Integer> optionValueIds) {
		this.optionValueIds = optionValueIds;
		return this;
	}

	/**
	 * <p>Sets <code>quantity</code>.</p>
	 *
	 * @param quantity the quantity; must be positive
	 * @return this builder
	 */
	public RowChangeBuilder quantity(long quantity) {
		this.quantity = quantity;
		return this;
	}

	/**
	 * <p>Builds the {@link RowChange}.</p>
	 *
	 * @return a {@link RowChange} object
	 * @throws IllegalArgumentException if the product id or the quantity is not positive, or an option value id is null
	 */
	public RowChange build() {
		if (productId <= 0) {
			throw new IllegalArgumentException("productId must be positive");
		}
		if (quantity <= 0) {
			throw new IllegalArgumentException("quantity must be positive");
		}
		if (optionValueIds != null && optionValueIds.stream().anyMatch(Objects::isNull)) {
			throw new IllegalArgumentException("optionValueIds must not contain null");
		}
		RowChangeImpl result = new RowChangeImpl();
		result.setRowHash(rowHash);
		result.setProductId(productId);
		result.setOptionValueIds(optionValueIds == null ? List.of() : List.copyOf(optionValueIds));
		result.setQuantity(quantity);
		return result;
	}

}
