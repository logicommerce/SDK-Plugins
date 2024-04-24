package com.logicommerce.sdk.enums;

/**
 * <p>DeliveryMode class.</p>
 *
 * @author Logicommerce
 * @since 1.3.8
 */
public enum DocumentPickingDeliveryMode {
	PROVIDER_PICKUP_POINT(0),
	PICKUP_POINT_PHYSICAL_LOCATION(1);
	
	private Integer value;

	private DocumentPickingDeliveryMode(Integer value) {
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
