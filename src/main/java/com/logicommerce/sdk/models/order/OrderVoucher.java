package com.logicommerce.sdk.models.order;

public interface OrderVoucher {

	double getAvailableBalance();

	String getCode();

	boolean isBalanceProcessed();

}
