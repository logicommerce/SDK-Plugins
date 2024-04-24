package com.logicommerce.sdk.models.order;

public interface ProviderPickupPointPickingDocumentDelivery {

	/**
	 * Returns the pickup point provider from document
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.DocumentPickupPointProvider} object
	 */
	DocumentPickupPointProvider getPickupPointProvider();

	/**
	 * Returns provider pickup point from document 
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.DocumentProviderPickupPoint} object
	 */
	DocumentProviderPickupPoint getProviderPickupPoint();

}
