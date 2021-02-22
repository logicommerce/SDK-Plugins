package com.logicommerce.sdk.models.order;

import com.logicommerce.sdk.enums.CurrencyMode;

public interface OrderCurrency {
	
	Integer getId();
	
	CurrencyMode getMode();
	
	int getCurrencyId();
	
	String getName();
	
	String getCode();
	
	String getCodeNumber();
	
	String getSymbol();
	
	double getUsdValue();

}
