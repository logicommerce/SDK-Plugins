package com.logicommerce.sdk.models;

import java.util.List;

public interface CartShipment {

	List<CartShipmentItem> getItems();

	double getTotal();

	double getWeight();

	CartWarehouse getWarehouse();

}
