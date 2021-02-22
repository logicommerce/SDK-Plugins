package com.logicommerce.sdk.models;

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

}
