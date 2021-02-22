package com.logicommerce.sdk.models;

import com.logicommerce.sdk.enums.ConnectorType;

public interface UserDataProperty {

	ConnectorType getConnectorType();

	String getName();

	String getValue();
	
	void setValue(String value); 

}
