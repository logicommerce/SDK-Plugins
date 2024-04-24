package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.DocumentPickupPointProvider;
import com.logicommerce.sdk.models.order.DocumentProviderPickupPoint;
import com.logicommerce.sdk.models.order.ProviderPickupPointPickingDocumentDelivery;

public class ProviderPickupPointPickingDocumentDeliveryImpl 
	implements ProviderPickupPointPickingDocumentDelivery {

	private DocumentPickupPointProvider pickupPointProvider;
	
	private DocumentProviderPickupPoint providerPickupPoint;
	
	/** {@inheritDoc} */
	@Override
	public DocumentPickupPointProvider getPickupPointProvider() {
		return pickupPointProvider;
	}

	/** {@inheritDoc} */
	@Override
	public DocumentProviderPickupPoint getProviderPickupPoint() {
		return providerPickupPoint;
	}

	/**
	 * <p>Setter for the field <code>pickupPointProvider</code>.</p>
	 *
	 * @param pickupPointProvider a {@link com.logicommerce.sdk.models.order.DocumentPickupPointProvider} object
	 */
	public void setPickupPointProvider(DocumentPickupPointProvider pickupPointProvider) {
		this.pickupPointProvider = pickupPointProvider;
	}

	/**
	 * <p>Setter for the field <code>providerPickupPoint</code>.</p>
	 *
	 * @param providerPickupPoint a {@link com.logicommerce.sdk.models.order.DocumentProviderPickupPoint} object
	 */
	public void setProviderPickupPoint(DocumentProviderPickupPoint providerPickupPoint) {
		this.providerPickupPoint = providerPickupPoint;
	}
}
