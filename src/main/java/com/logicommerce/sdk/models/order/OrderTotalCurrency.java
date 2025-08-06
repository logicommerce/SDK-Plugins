package com.logicommerce.sdk.models.order;

public interface OrderTotalCurrency {

	OrderTotal getTotals();
	
	String getCurrencyCode();
	
	String getCurrencyCodeNumer();
}
