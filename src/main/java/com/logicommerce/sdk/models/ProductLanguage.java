package com.logicommerce.sdk.models;

import java.util.Map;

public interface ProductLanguage {
	
	String getName();
	
	void setName(String name);
	
	String getUrlSeo();
	
	void setUrlSeo(String urlSeo);
	
	Map<String, String> getLinkAttributes();
	
	void setLinkAttributes(Map<String, String> linkAttributes);
	
	void addLinkAttribute(String name, String value);

}
