package com.logicommerce.sdk.models.order;

public interface OrderItemOptionValue {

	Integer getId();

	Integer getProductOptionValueId();

	String getSku();

	double getWeight();

	double getPrice();

	double getPreviousPrice();

	String getValue();

	String getOptionValuePId();

	boolean isNoReturn();

}
