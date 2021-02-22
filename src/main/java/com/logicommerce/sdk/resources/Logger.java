package com.logicommerce.sdk.resources;

public interface Logger {

	void info(String... args);
	
	void warning(String... args);
	
	void severe(String... args);

}
