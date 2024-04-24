package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.DocumentPickupPointProvider;

/**
 * <p>DocumentPickupPointProviderImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.3.8
 */
public class DocumentPickupPointProviderImpl implements DocumentPickupPointProvider {
	
	private String name;
	
	private Integer pickupPointProviderId;
	
	private Integer pluginAccountId;

	private String pluginAccountModule;

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a String
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <p>Getter for the field <code>pickupPointProviderId</code>.</p>
	 *
	 * @return a Integer
	 */
	@Override
	public Integer getPickupPointProviderId() {
		return pickupPointProviderId;
	}

	/**
	 * <p>Getter for the field <code>pluginAccountId</code>.</p>
	 *
	 * @return a Integer
	 */
	@Override
	public Integer getPluginAccountId() {
		return pluginAccountId;
	}

	/**
	 * <p>Getter for the field <code>pluginAccountModule</code>.</p>
	 *
	 * @return a String
	 */
	@Override
	public String getPluginAccountModule() {
		return pluginAccountModule;
	}

	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Setter for the field <code>pickupPointProviderId</code>.</p>
	 *
	 * @param pickupPointProviderId a Integer
	 */
	public void setPickupPointProviderId(Integer pickupPointProviderId) {
		this.pickupPointProviderId = pickupPointProviderId;
	}

	/**
	 * <p>Setter for the field <code>pluginAccountId</code>.</p>
	 *
	 * @param pluginAccountId a Integer
	 */
	public void setPluginAccountId(Integer pluginAccountId) {
		this.pluginAccountId = pluginAccountId;
	}

	/**
	 * <p>Setter for the field <code>pluginAccountModule</code>.</p>
	 *
	 * @param pluginAccountModule a {@link java.lang.String} object
	 */
	public void setPluginAccountModule(String pluginAccountModule) {
		this.pluginAccountModule = pluginAccountModule;
	}		
}
