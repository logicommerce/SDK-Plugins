package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.models.UserDataProperty;

/**
 * <p>UserDataService interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface UserDataService extends PluginService {

	/**
	 * <p>prepareUserDataProperties.</p>
	 *
	 * @param properties a {@link java.util.List} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void prepareUserDataProperties(List<UserDataProperty> properties) throws PluginServiceException;

}
