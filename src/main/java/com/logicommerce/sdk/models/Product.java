package com.logicommerce.sdk.models;

public interface Product {
	
	Integer getId();
	
	ProductCodes getCodes();

	ProductLanguage getLanguage();
	
	ProductMedia getImages();

}
