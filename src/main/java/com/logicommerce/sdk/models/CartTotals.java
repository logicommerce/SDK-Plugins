package com.logicommerce.sdk.models;

public interface CartTotals {

	double getSubtotal();

	double getSubtotalItems();

	double getSubtotalPaymentSystem();

	double getSubtotalShippings();

	double getTotal();

	double getTotalDiscounts();

	double getTotalItems();

	double getTotalPaymentSystem();

	double getTotalShippings();

	double getTotalTaxes();

	double getTotalVouchers();

}
