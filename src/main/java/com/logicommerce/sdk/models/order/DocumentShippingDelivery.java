package com.logicommerce.sdk.models.order;

import com.logicommerce.sdk.enums.DeliveryType;

public interface DocumentShippingDelivery extends OrderDelivery {

	DeliveryType getType();
	
	void setType(DeliveryType deliveryType);
}
