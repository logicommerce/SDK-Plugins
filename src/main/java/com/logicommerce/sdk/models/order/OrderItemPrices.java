package com.logicommerce.sdk.models.order;

public interface OrderItemPrices {

	double getProductPrice();

	double getOptionsPrice();

	double getPreviousPrice();

	double getPrice();

	double getTotalTaxes();

	double getTotal();

}
