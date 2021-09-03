package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.TrackerResponse;
import java.util.List;
import com.logicommerce.sdk.enums.WidgetPageType;

public interface TrackerService extends PluginService {

	List<TrackerResponse> getTrackers(WidgetPageType pageType) throws PluginServiceException;

}
