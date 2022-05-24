package com.logicommerce.sdk.models;

import java.util.List;
import com.logicommerce.sdk.enums.CartItemType;

public interface CartItem {

	Integer getId();

	String getHash();

	String getName();

	String getUrlSeo();

	String getImageUrl();

	CartItemCodes getCodes();

	CartItemType getType();

	Integer getQuantity();

	Double getWeight();

	Double getSubtotal();

	Double getTotal();

	Double getTotalTaxes();

	List<CustomTag> getCustomTagValues();

	List<CustomTag> getCustomTagPluginValues();
}
