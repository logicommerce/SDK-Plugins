package com.logicommerce.sdk.enums;

public enum DeliveryType {
	SHIPPING(0),
	PICKING(1);
	
	private Integer value;

	private DeliveryType(Integer value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}
}
