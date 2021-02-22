package com.logicommerce.sdk.models;

public interface CartWarehouse {

	String getAddress();

	String getCity();

	String getCountry();

	String getName();

	String getState();

	int getLocationId();

	String getPostalCode();

	Integer getPhysicalLocationId();

	int getOffsetDays();

	boolean needsShipping();
}
