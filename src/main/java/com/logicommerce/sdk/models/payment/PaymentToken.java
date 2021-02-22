package com.logicommerce.sdk.models.payment;

import java.util.Map;

public interface PaymentToken {

	String getToken();
	
	void setToken(String token);

	Map<String, String> getData();
	
	void setData(Map<String, String> data);
	
	void addItem(String key, String value);

}
