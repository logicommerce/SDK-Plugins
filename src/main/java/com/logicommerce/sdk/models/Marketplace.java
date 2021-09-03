package com.logicommerce.sdk.models;

import java.util.Map;

public interface Marketplace {

	String getMarketplaceId();
	
	String getName();
	
	String getLogo();
	
	Map<String, String> getAdditionalData();

}
