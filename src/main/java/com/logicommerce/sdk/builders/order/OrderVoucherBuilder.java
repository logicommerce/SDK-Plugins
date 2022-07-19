package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderVoucher;
import com.logicommerce.sdk.models.order.implementations.OrderVoucherImpl;

/**
 * <p>OrderVoucherBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderVoucherBuilder<T> {

	private T parentBuilder;

	protected double availableBalance;

	protected String code;

	protected boolean balanceProcessed;

	/**
	 * <p>Constructor for OrderVoucherBuilder.</p>
	 */
	public OrderVoucherBuilder() {
	}

	/**
	 * <p>Constructor for OrderVoucherBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderVoucherBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>availableBalance.</p>
	 *
	 * @param availableBalance a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderVoucherBuilder} object
	 */
	public OrderVoucherBuilder<T> availableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
		return this;
	}

	/**
	 * <p>code.</p>
	 *
	 * @param code a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderVoucherBuilder} object
	 */
	public OrderVoucherBuilder<T> code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * <p>balanceProcessed.</p>
	 *
	 * @param balanceProcessed a boolean
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderVoucherBuilder} object
	 */
	public OrderVoucherBuilder<T> balanceProcessed(boolean balanceProcessed) {
		this.balanceProcessed = balanceProcessed;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderVoucher} object
	 */
	public OrderVoucher build() {
		OrderVoucherImpl voucher = new OrderVoucherImpl();
		voucher.setAvailableBalance(availableBalance);
		voucher.setCode(code);
		voucher.setBalanceProcessed(balanceProcessed);
		return voucher;
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
