package com.logicommerce.sdk.models;

import java.util.List;

public interface CartShipment {

	String getHash();

	List<CartShipmentItem> getItems();

	double getTotal();

	double getWeight();

	CartWarehouse getWarehouse();

}
