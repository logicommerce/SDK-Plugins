package com.logicommerce.sdk.models;

/**
 * <p>ElementProperyImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class ElementProperyImpl implements ElementProperty {

	private String name;

	private String value;

	/**
	 * <p>Constructor for ElementProperyImpl.</p>
	 */
	public ElementProperyImpl() {

	}

	/**
	 * <p>Constructor for ElementProperyImpl.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 */
	public ElementProperyImpl(String name, String value) {
		setName(name);
		setValue(value);
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

	/** {@inheritDoc} */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/** {@inheritDoc} */
	@Override
	public void setValue(String value) {
		this.value = value;
	}
}
