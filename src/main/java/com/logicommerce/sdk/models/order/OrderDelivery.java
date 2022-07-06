package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.enums.DeliveryType;

public interface OrderDelivery {

	DeliveryType getType();

	OrderDeliveryPhysicalLocation getPhysicalLocation();

	List<OrderShipment> getShipments();

	GeographicalZone getGeographicalZone();

}
