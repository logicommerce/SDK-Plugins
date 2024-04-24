package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.DocumentPickupPointProvider;
import com.logicommerce.sdk.models.order.DocumentProviderPickupPoint;
import com.logicommerce.sdk.models.order.ProviderPickupPointPickingDocumentDelivery;

public class ProviderPickupPointPickingDocumentDeliveryImpl 
	implements ProviderPickupPointPickingDocumentDelivery {

	private DocumentPickupPointProvider provider;
	
	private DocumentProviderPickupPoint pickupPoint;
	
	/** {@inheritDoc} */
	@Override
	public DocumentPickupPointProvider getProvider() {
		return provider;
	}

	/** {@inheritDoc} */
	@Override
	public DocumentProviderPickupPoint getPickupPoint() {
		return pickupPoint;
	}

	/**
	 * <p>Setter for the field <code>provider</code>.</p>
	 *
	 * @param provider a {@link com.logicommerce.sdk.models.order.DocumentPickupPointProvider} object
	 */
	public void setProvider(DocumentPickupPointProvider provider) {
		this.provider = provider;
	}

	/**
	 * <p>Setter for the field <code>pickupPoint</code>.</p>
	 *
	 * @param pickupPoint a {@link com.logicommerce.sdk.models.order.DocumentProviderPickupPoint} object
	 */
	public void setPickupPoint(DocumentProviderPickupPoint pickupPoint) {
		this.pickupPoint = pickupPoint;
	}
}
