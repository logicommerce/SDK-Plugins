package com.logicommerce.sdk.services;

import com.logicommerce.sdk.enums.OrderShipmentStatusType;
import com.logicommerce.sdk.enums.ShipmentActionType;
import com.logicommerce.sdk.models.DataFile;
import com.logicommerce.sdk.models.order.OrderShipment;

/**
 * <p>ShipmentService interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface ShipmentService extends PluginService {

	/**
	 * <p>processAction.</p>
	 *
	 * @param shipment a {@link com.logicommerce.sdk.models.order.OrderShipment} object
	 * @param actionType a {@link com.logicommerce.sdk.enums.ShipmentActionType} object
	 * @return a {@link com.logicommerce.sdk.models.order.OrderShipment} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	OrderShipment processAction(final OrderShipment shipment, ShipmentActionType actionType) throws PluginServiceException;

	/**
	 * <p>changeStatus.</p>
	 *
	 * @param orderShipment a {@link com.logicommerce.sdk.models.order.OrderShipment} object
	 * @param orderShipmentStatusType a {@link com.logicommerce.sdk.enums.OrderShipmentStatusType} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	void changeStatus(OrderShipment orderShipment, OrderShipmentStatusType orderShipmentStatusType) throws PluginServiceException;

	/**
	 * <p>getShipmentLabel.</p>
	 *
	 * @param shipment a {@link com.logicommerce.sdk.models.order.OrderShipment} object
	 * @return a {@link com.logicommerce.sdk.models.DataFile} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	DataFile getShipmentLabel(final OrderShipment shipment) throws PluginServiceException;

	/**
	 * <p>createShipmentLabel.</p>
	 *
	 * @param shipment a {@link com.logicommerce.sdk.models.order.OrderShipment} object
 	 * @since 1.2.3
	 * @return a {@link com.logicommerce.sdk.models.DataFile} object
	 * @throws com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	DataFile createShipmentLabel(final OrderShipment shipment) throws PluginServiceException;
}
