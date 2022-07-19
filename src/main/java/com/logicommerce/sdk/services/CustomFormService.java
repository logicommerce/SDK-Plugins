package com.logicommerce.sdk.services;

/**
 * <p>CustomFormService interface. To implement service for receiving custom forms.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface CustomFormService extends PluginService {
	
	/**
	 * <p>Process the received form.</p>
	 * <p>The plugin will take care of parsing the data received in the data parameter.</p>
	 *
	 * @param data a {@link java.lang.String String} object
	 * @since 1.0.16
	 * @throws com.logicommerce.sdk.services.PluginServiceException PluginServiceException if any.
	 */
	void processForm(String data) throws PluginServiceException;

}
