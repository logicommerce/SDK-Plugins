package com.logicommerce.sdk.models;

import java.util.Map.Entry;

public class ParamImpl implements Param {

	private String name;

	private String value;

	public ParamImpl(Entry<String, String> entry) {
		name = entry.getKey();
		value = entry.getValue();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getValue() {
		return value;
	}

}
