package com.logicommerce.sdk.models;

import java.util.List;
import com.logicommerce.sdk.enums.CartItemType;

public interface CartItem {

	Integer getId();

	String getHash();

	String getName();

	CartItemType getType();

	Integer getQuantity();

	Double getWeight();

	Double getSubtotal();

	Double getTotal();

	Double getTotalTaxes();

	List<CustomTag> getCustomTagValues();
	
	List<CustomTag> getCustomTagPluginValues();
}
