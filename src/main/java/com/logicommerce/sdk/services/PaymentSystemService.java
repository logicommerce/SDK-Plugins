package com.logicommerce.sdk.services;

import java.util.Map;
import com.logicommerce.sdk.models.payment.PaymentSystemProperties;

public interface PaymentSystemService extends PluginService {

	PaymentSystemProperties getProperties() throws PluginServiceException;

	void selectProperty(String propertyName, Map<String, String> additionalData) throws PluginServiceException;

}
