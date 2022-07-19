package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderItemPrices;
import com.logicommerce.sdk.models.order.implementations.OrderItemPricesImpl;

/**
 * <p>OrderItemPricesBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderItemPricesBuilder<T> {

	private T parentBuilder;

	protected double productPrice;

	protected double optionsPrice;

	protected double previousPrice;

	protected double price;

	protected double totalTaxes;

	protected double total;

	/**
	 * <p>Constructor for OrderItemPricesBuilder.</p>
	 */
	public OrderItemPricesBuilder() {
	}

	/**
	 * <p>Constructor for OrderItemPricesBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderItemPricesBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>productPrice.</p>
	 *
	 * @param productPrice a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemPricesBuilder} object
	 */
	public OrderItemPricesBuilder<T> productPrice(double productPrice) {
		this.productPrice = productPrice;
		return this;
	}

	/**
	 * <p>optionsPrice.</p>
	 *
	 * @param optionsPrice a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemPricesBuilder} object
	 */
	public OrderItemPricesBuilder<T> optionsPrice(double optionsPrice) {
		this.optionsPrice = optionsPrice;
		return this;
	}

	/**
	 * <p>previousPrice.</p>
	 *
	 * @param previousPrice a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemPricesBuilder} object
	 */
	public OrderItemPricesBuilder<T> previousPrice(double previousPrice) {
		this.previousPrice = previousPrice;
		return this;
	}

	/**
	 * <p>price.</p>
	 *
	 * @param price a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemPricesBuilder} object
	 */
	public OrderItemPricesBuilder<T> price(double price) {
		this.price = price;
		return this;
	}

	/**
	 * <p>totalTaxes.</p>
	 *
	 * @param totalTaxes a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemPricesBuilder} object
	 */
	public OrderItemPricesBuilder<T> totalTaxes(double totalTaxes) {
		this.totalTaxes = totalTaxes;
		return this;
	}

	/**
	 * <p>total.</p>
	 *
	 * @param total a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemPricesBuilder} object
	 */
	public OrderItemPricesBuilder<T> total(double total) {
		this.total = total;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderItemPrices} object
	 */
	public OrderItemPrices build() {
		OrderItemPricesImpl prices = new OrderItemPricesImpl();
		prices.setProductPrice(productPrice);
		prices.setOptionsPrice(optionsPrice);
		prices.setPreviousPrice(previousPrice);
		prices.setPrice(price);
		prices.setTotalTaxes(totalTaxes);
		prices.setTotal(total);
		return prices;
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
