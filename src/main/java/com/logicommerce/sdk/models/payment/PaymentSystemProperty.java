package com.logicommerce.sdk.models.payment;

import java.util.Map;

public interface PaymentSystemProperty {

	String getName();

	void setName(String name);

	Map<String, String> getValues();

	void setValues(Map<String, String> value);

}
