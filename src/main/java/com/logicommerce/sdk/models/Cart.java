package com.logicommerce.sdk.models;

import java.time.LocalDateTime;
import java.util.List;

public interface Cart {

	String getToken();

	LocalDateTime getCreatedAt();

	List<CartItem> getItems();

	CartTotals getTotals();

	CartDelivery getDelivery();

	String getAbandonedBasketLink();

	User getUser();
}
