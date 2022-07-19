package com.logicommerce.sdk.models;

/**
 * <p>ElementPropertyPlugin class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class ElementPropertyPlugin extends ElementProperyImpl {

	private Integer pluginId;
	
	/**
	 * <p>Constructor for ElementPropertyPlugin.</p>
	 */
	public ElementPropertyPlugin() {

	}

	/**
	 * <p>Constructor for ElementPropertyPlugin.</p>
	 *
	 * @param property a {@link com.logicommerce.sdk.models.ElementProperty} object
	 */
	public ElementPropertyPlugin(ElementProperty property) {
		setName(property.getName());
		setValue(property.getValue());
	}

	/**
	 * <p>Getter for the field <code>pluginId</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getPluginId() {
		return pluginId;
	}

	/**
	 * <p>Setter for the field <code>pluginId</code>.</p>
	 *
	 * @param pluginId a {@link java.lang.Integer} object
	 */
	public void setPluginId(Integer pluginId) {
		if (this.pluginId == null) {
			this.pluginId = pluginId;
		}
	}
}
