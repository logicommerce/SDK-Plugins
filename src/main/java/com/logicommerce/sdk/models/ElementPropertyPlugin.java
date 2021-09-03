package com.logicommerce.sdk.models;

public class ElementPropertyPlugin extends ElementProperyImpl {

	private Integer pluginId;
	
	public ElementPropertyPlugin() {

	}

	public ElementPropertyPlugin(ElementProperty property) {
		setName(property.getName());
		setValue(property.getValue());
	}

	public Integer getPluginId() {
		return pluginId;
	}

	public void setPluginId(Integer pluginId) {
		if (this.pluginId == null) {
			this.pluginId = pluginId;
		}
	}
}