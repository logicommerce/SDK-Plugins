package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.enums.AmountType;

public interface OrderPaymentSystem {

	Integer getId();

	int getPaymentSystemId();

	List<OrderTax> getTaxes();

	String getName();

	AmountType getIncreaseType();

	double getIncreaseValue();

	double getPrice();

	double getIncreaseMin();

	boolean isCashOnDelivery();
	
	String getProperty();	

}
