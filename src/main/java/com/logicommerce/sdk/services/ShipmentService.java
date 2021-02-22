package com.logicommerce.sdk.services;

import com.logicommerce.sdk.enums.OrderShipmentStatusType;
import com.logicommerce.sdk.enums.ShipmentActionType;
import com.logicommerce.sdk.models.DataFile;
import com.logicommerce.sdk.models.order.OrderShipment;

public interface ShipmentService extends PluginService {

	OrderShipment processAction(final OrderShipment shipment, ShipmentActionType actionType) throws PluginServiceException;

	void changeStatus(OrderShipment orderShipment, OrderShipmentStatusType orderShipmentStatusType) throws PluginServiceException;

	DataFile getShipmentLabel(final OrderShipment shipment) throws PluginServiceException;

}
