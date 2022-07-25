package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.TrackerResponse;
import java.util.List;
import com.logicommerce.sdk.enums.WidgetPageType;

/**
 * <p>TrackerService interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface TrackerService extends PluginService {

	/**
	 * <p>getTrackers.</p>
	 *
	 * @param pageType a {@link com.logicommerce.sdk.enums.WidgetPageType} object
	 * @return a {@link java.util.List} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	List<TrackerResponse> getTrackers(WidgetPageType pageType) throws PluginServiceException;

}
