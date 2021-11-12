package com.logicommerce.sdk.models;

import java.util.List;
import java.util.Map;

public interface Marketplace {

	String getMarketplaceId();
	
	String getName();
	
	String getLogo();
	
	List<Carrier> getCarriers();
	
	Map<String, String> getAdditionalData();

}
