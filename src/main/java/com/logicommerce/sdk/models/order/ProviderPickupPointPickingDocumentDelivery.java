package com.logicommerce.sdk.models.order;

public interface ProviderPickupPointPickingDocumentDelivery {

	/**
	 * Returns the provider for pickup points from document
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.DocumentPickupPointProvider} object
	 */
	DocumentPickupPointProvider getProvider();

	/**
	 * Returns the pickup point selected from document 
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.DocumentProviderPickupPoint} object
	 */
	DocumentProviderPickupPoint getPickupPoint();

}
