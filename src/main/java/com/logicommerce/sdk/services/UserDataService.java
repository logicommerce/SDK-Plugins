package com.logicommerce.sdk.services;

import java.util.List;
import com.logicommerce.sdk.models.UserDataProperty;

public interface UserDataService extends PluginService {

	void prepareUserDataProperties(List<UserDataProperty> properties) throws PluginServiceException;

}
