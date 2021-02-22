package com.logicommerce.sdk.resources;

public interface Navigator {

	String getUserAgent();
	
	String getUrl();

	String getReferer();

	String getLanguage();
	
	String getCountry();
	
	String getCurrency();
	
	String getDefaultCurrency();
	
	String getPageType();

	String getCookie(String name);

	void setCookie(String name, String value);
	
	void removeCookie(String name);
	
	String getCookies();

	String getIp();
}
