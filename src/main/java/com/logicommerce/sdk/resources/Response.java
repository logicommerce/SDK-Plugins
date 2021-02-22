package com.logicommerce.sdk.resources;

import java.util.List;
import java.util.Map;

public interface Response {

	String getResponse();

	int getStatusCode();

	Map<String, List<String>> getHeaders();

}
