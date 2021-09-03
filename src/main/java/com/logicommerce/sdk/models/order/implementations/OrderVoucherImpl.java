package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.OrderVoucher;

public class OrderVoucherImpl implements OrderVoucher {
	
	private double availableBalance;

	private String code;

	private boolean balanceProcessed;

	public double getAvailableBalance() {
		return availableBalance;
	}

	public String getCode() {
		return code;
	}

	public boolean isBalanceProcessed() {
		return balanceProcessed;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setBalanceProcessed(boolean balanceProcessed) {
		this.balanceProcessed = balanceProcessed;
	}
}
