package com.logicommerce.sdk.services;

import java.util.Map;

public interface DataService extends PluginService {

	Map<String, Object> executeAction(String action, Map<String, String> params) throws PluginServiceException;

}
