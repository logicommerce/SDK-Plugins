package com.logicommerce.sdk.enums;

/**
 * <p>DeliveryType class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public enum DeliveryType {
	SHIPPING(0),
	PICKING(1);
	
	private Integer value;

	private DeliveryType(Integer value) {
		this.value = value;
	}
	
	/**
	 * <p>Getter for the field <code>value</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getValue() {
		return value;
	}
}
