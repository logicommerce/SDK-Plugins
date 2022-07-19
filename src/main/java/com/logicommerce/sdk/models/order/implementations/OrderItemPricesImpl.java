package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.OrderItemPrices;

/**
 * <p>OrderItemPricesImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderItemPricesImpl implements OrderItemPrices {

	private double productPrice;

	private double optionsPrice;

	private double previousPrice;

	private double price;

	private double totalTaxes;

	private double total;

	/** {@inheritDoc} */
	@Override
	public double getProductPrice() {
		return productPrice;
	}

	/** {@inheritDoc} */
	@Override
	public double getOptionsPrice() {
		return optionsPrice;
	}

	/** {@inheritDoc} */
	@Override
	public double getPreviousPrice() {
		return previousPrice;
	}

	/** {@inheritDoc} */
	@Override
	public double getPrice() {
		return price;
	}

	/** {@inheritDoc} */
	@Override
	public double getTotalTaxes() {
		return totalTaxes;
	}

	/** {@inheritDoc} */
	@Override
	public double getTotal() {
		return total;
	}

	/**
	 * <p>Setter for the field <code>productPrice</code>.</p>
	 *
	 * @param productPrice a double
	 */
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	/**
	 * <p>Setter for the field <code>optionsPrice</code>.</p>
	 *
	 * @param optionsPrice a double
	 */
	public void setOptionsPrice(double optionsPrice) {
		this.optionsPrice = optionsPrice;
	}

	/**
	 * <p>Setter for the field <code>previousPrice</code>.</p>
	 *
	 * @param previousPrice a double
	 */
	public void setPreviousPrice(double previousPrice) {
		this.previousPrice = previousPrice;
	}

	/**
	 * <p>Setter for the field <code>price</code>.</p>
	 *
	 * @param price a double
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * <p>Setter for the field <code>totalTaxes</code>.</p>
	 *
	 * @param totalTaxes a double
	 */
	public void setTotalTaxes(double totalTaxes) {
		this.totalTaxes = totalTaxes;
	}

	/**
	 * <p>Setter for the field <code>total</code>.</p>
	 *
	 * @param total a double
	 */
	public void setTotal(double total) {
		this.total = total;
	}
}
