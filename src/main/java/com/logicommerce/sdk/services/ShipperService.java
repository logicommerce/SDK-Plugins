package com.logicommerce.sdk.services;

import java.util.List;
import java.util.Map;
import com.logicommerce.sdk.models.Carriers;
import com.logicommerce.sdk.models.ElementProperty;

public interface ShipperService extends PluginService {

	Carriers getAvailableCarriers() throws PluginServiceException;

	List<ElementProperty> selectShipper(String shippingHash, Map<String, String> additionalData) throws PluginServiceException;

}
