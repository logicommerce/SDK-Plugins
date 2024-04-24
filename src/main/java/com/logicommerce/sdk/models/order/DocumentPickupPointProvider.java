package com.logicommerce.sdk.models.order;

/**
 * <p>DocumentPickupPointProvider interface.</p>
 *
 * @author Logicommerce
 * @since 1.3.8
 */
public interface DocumentPickupPointProvider {

	String getName();

	Integer getPickupPointProviderId();

	Integer getPluginAccountId();

	String getPluginAccountModule();
	
}
