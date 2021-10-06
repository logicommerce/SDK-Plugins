package com.logicommerce.sdk.services;

import com.logicommerce.sdk.enums.CustomTagItemType;

public interface CustomTagService extends PluginService {

	public String getCustomTagValue(CustomTagItemType itemType, String value) throws PluginServiceException;

}