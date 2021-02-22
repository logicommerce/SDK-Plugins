package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.TrackerResponse;
import java.util.List;
import com.logicommerce.sdk.enums.TrackerPageType;

public interface TrackerService extends PluginService {

	List<TrackerResponse> getTrackers(TrackerPageType pageType) throws PluginServiceException;

}
