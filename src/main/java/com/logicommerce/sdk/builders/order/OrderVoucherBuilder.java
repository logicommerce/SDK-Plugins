package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.OrderVoucher;
import com.logicommerce.sdk.models.order.implementations.OrderVoucherImpl;

public class OrderVoucherBuilder<T> {

	private T parentBuilder;

	protected double availableBalance;

	protected String code;

	protected boolean balanceProcessed;

	public OrderVoucherBuilder() {
	}

	public OrderVoucherBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderVoucherBuilder<T> availableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
		return this;
	}

	public OrderVoucherBuilder<T> code(String code) {
		this.code = code;
		return this;
	}

	public OrderVoucherBuilder<T> balanceProcessed(boolean balanceProcessed) {
		this.balanceProcessed = balanceProcessed;
		return this;
	}

	public OrderVoucher build() {
		OrderVoucherImpl voucher = new OrderVoucherImpl();
		voucher.setAvailableBalance(availableBalance);
		voucher.setCode(code);
		voucher.setBalanceProcessed(balanceProcessed);
		return voucher;
	}

	public T done() {
		return parentBuilder;
	}
}