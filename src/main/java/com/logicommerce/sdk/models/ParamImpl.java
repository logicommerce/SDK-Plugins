package com.logicommerce.sdk.models;

import java.util.Map.Entry;

/**
 * <p>ParamImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class ParamImpl implements Param {

	private String name;

	private String value;

	/**
	 * <p>Constructor for ParamImpl.</p>
	 *
	 * @param entry a {@link java.util.Map.Entry} object
	 */
	public ParamImpl(Entry<String, String> entry) {
		name = entry.getKey();
		value = entry.getValue();
	}

	/** {@inheritDoc} */
	@Override
	public String getName() {
		return name;
	}

	/** {@inheritDoc} */
	@Override
	public String getValue() {
		return value;
	}

}
