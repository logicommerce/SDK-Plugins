package com.logicommerce.sdk.builders.order;

import com.logicommerce.sdk.models.order.DocumentPickupPointProvider;
import com.logicommerce.sdk.models.order.implementations.DocumentPickupPointProviderImpl;

/**
 * <p>OrderDeliveryPhysicalLocationBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.3.8
 */
public class DocumentPickupPointProviderBuilder<T> {

	private T parentBuilder;
	
	private String name;

	private Integer pickupPointProviderId;

	private Integer pluginAccountId;

	private String pluginAccountModule;
	
	/**
	 * <p>Constructor for OrderDeliveryPhysicalLocationBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public DocumentPickupPointProviderBuilder(T parentBuilder) {
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentPickupPointProviderBuilder} object
	 */
	public DocumentPickupPointProviderBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * <p>pickupPointProviderId.</p>
	 *
	 * @param pickupPointProviderId a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentPickupPointProviderBuilder} object
	 */
	public DocumentPickupPointProviderBuilder<T> pickupPointProviderId(Integer pickupPointProviderId) {
		this.pickupPointProviderId = pickupPointProviderId;
		return this;
	}

	/**
	 * <p>pluginAccountId.</p>
	 *
	 * @param pluginAccountId a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentPickupPointProviderBuilder} object
	 */
	public DocumentPickupPointProviderBuilder<T> pluginAccountId(Integer pluginAccountId) {
		this.pluginAccountId = pluginAccountId;
		return this;
	}

	/**
	 * <p>pluginAccountModule.</p>
	 *
	 * @param pluginAccountModule a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.DocumentPickupPointProviderBuilder} object
	 */
	public DocumentPickupPointProviderBuilder<T> pluginAccountModule(String pluginAccountModule) {
		this.pluginAccountModule = pluginAccountModule;
		return this;
	}
	
	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.DocumentPickupPointProvider} object
	 */
	public DocumentPickupPointProvider build() {
		DocumentPickupPointProviderImpl documentPickupPointProvider = new DocumentPickupPointProviderImpl();
		documentPickupPointProvider.setName(name);
		documentPickupPointProvider.setPickupPointProviderId(pickupPointProviderId);
		documentPickupPointProvider.setPluginAccountId(pluginAccountId);
		documentPickupPointProvider.setPluginAccountModule(pluginAccountModule);
		return documentPickupPointProvider;
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
