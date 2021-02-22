package com.logicommerce.sdk.models.order;

public interface OrderTax {

	double getTaxRate();

	double getReRate();

	double getBase();

	double getTaxPrice();

	double getRePrice();

	double getTotalPrice();

	double getBaseWithoutDiscounts();

	double getDiscount();

}
