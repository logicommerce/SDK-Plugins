package com.logicommerce.sdk.models.order.implementations;

import java.util.List;
import com.logicommerce.sdk.enums.DeliveryType;
import com.logicommerce.sdk.models.order.GeographicalZone;
import com.logicommerce.sdk.models.order.OrderDelivery;
import com.logicommerce.sdk.models.order.OrderDeliveryPhysicalLocation;
import com.logicommerce.sdk.models.order.OrderShipment;
import com.logicommerce.utilities.annotations.Uses;

public class OrderDeliveryImpl implements OrderDelivery {

	private DeliveryType type;
	
	@Uses(value = OrderDeliveryPhysicalLocationImpl.class)
	private OrderDeliveryPhysicalLocation physicalLocation;
	
	@Uses(value = OrderShipmentImpl.class)
	private List<OrderShipment> shipments;

	@Uses(value = GeographicalZoneImpl.class)
	private GeographicalZone geographicalZone;

	public DeliveryType getType() {
		return type;
	}

	public OrderDeliveryPhysicalLocation getPhysicalLocation() {
		return physicalLocation;
	}

	public List<OrderShipment> getShipments() {
		return shipments;
	}

	public GeographicalZone getGeographicalZone() {
		return geographicalZone;
	}

	public void setType(DeliveryType type) {
		this.type = type;
	}

	public void setPhysicalLocation(OrderDeliveryPhysicalLocation physicalLocation) {
		this.physicalLocation = physicalLocation;
	}

	public void setShipments(List<OrderShipment> shipments) {
		this.shipments = shipments;
	}
	public void setGeographicalZone(GeographicalZone geographicalZone) {
		this.geographicalZone = geographicalZone;
	}
}