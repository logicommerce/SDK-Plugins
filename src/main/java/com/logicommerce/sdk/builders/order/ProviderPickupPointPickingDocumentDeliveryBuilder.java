package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.ProviderPickupPointPickingDocumentDelivery;
import com.logicommerce.sdk.models.order.implementations.ProviderPickupPointPickingDocumentDeliveryImpl;

/**
 * <p>ProviderPickupPointPickingDocumentDeliveryBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.3.8
 */
public class ProviderPickupPointPickingDocumentDeliveryBuilder<T> {

	private T parentBuilder;

	private DocumentPickupPointProviderBuilder<ProviderPickupPointPickingDocumentDeliveryBuilder<T>> 
			provider;

	private DocumentProviderPickupPointBuilder<ProviderPickupPointPickingDocumentDeliveryBuilder<T>> 
			pickupPoint;

	/**
	 * <p>Constructor for ProviderPickupPointPickingDocumentDeliveryBuilder.</p>
	 */
	public ProviderPickupPointPickingDocumentDeliveryBuilder() {
		this.provider = new DocumentPickupPointProviderBuilder<>(this);
		this.pickupPoint = new DocumentProviderPickupPointBuilder<>(this);
	}

	/**
	 * <p>Constructor for ProviderPickupPointPickingDocumentDeliveryBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public ProviderPickupPointPickingDocumentDeliveryBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>pickupPointProvider.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentPickupPointProviderBuilder} object
	 */
	public DocumentPickupPointProviderBuilder<ProviderPickupPointPickingDocumentDeliveryBuilder<T>> 
			pickupPointProvider() {
		DocumentPickupPointProviderBuilder<ProviderPickupPointPickingDocumentDeliveryBuilder<T>> 
			providerBuild = new DocumentPickupPointProviderBuilder<>(this);
		this.provider = providerBuild;
		return providerBuild;
	}

	/**
	 * <p>destinationAddress.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentProviderPickupPointBuilder} object
	 */
	public DocumentProviderPickupPointBuilder<ProviderPickupPointPickingDocumentDeliveryBuilder<T>> 
		providerPickupPoint() {
		DocumentProviderPickupPointBuilder<ProviderPickupPointPickingDocumentDeliveryBuilder<T>> 
		pickupPointBuild = new DocumentProviderPickupPointBuilder<>(this);
		this.pickupPoint = pickupPointBuild;
		return pickupPointBuild;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.ProviderPickupPointPickingDocumentDelivery} object
	 */
	public ProviderPickupPointPickingDocumentDelivery build() {
		ProviderPickupPointPickingDocumentDeliveryImpl providerPickupPointPickingDocumentDelivery =
				new ProviderPickupPointPickingDocumentDeliveryImpl();
		providerPickupPointPickingDocumentDelivery.setProvider(provider.build());
		providerPickupPointPickingDocumentDelivery.setPickupPoint(pickupPoint.build());
		return providerPickupPointPickingDocumentDelivery;
	}

	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}

}
