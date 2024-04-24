package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.enums.DeliveryType;
import com.logicommerce.sdk.enums.DocumentPickingDeliveryMode;

/**
 * <p>OrderDelivery interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderDelivery {

	/**
	 * <p>getType.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.DeliveryType} object
	 */
	DeliveryType getType();

	/**
	 * <p>getPhysicalLocation.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderDeliveryPhysicalLocation} object
	 */
	OrderDeliveryPhysicalLocation getPhysicalLocation();

	/**
	 * <p>getMode.</p>
	 *
	 * @since 1.3.8
	 * @return a {@link com.logicommerce.sdk.enums.DocumentPickingDeliveryMode} object
	 */
	DocumentPickingDeliveryMode getMode();

	/**
	 * <p>getShipments.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderShipment> getShipments();

	/**
	 * <p>getGeographicalZone.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.GeographicalZone} object
	 */
	GeographicalZone getGeographicalZone();

	/**
	 * <p>getProviderPickupPointPickingDocumentDelivery.</p>
	 * 
 	 * @since 1.3.8
	 * @return a {@link com.logicommerce.sdk.models.order.ProviderPickupPointPickingDocumentDelivery} object
	 */
	ProviderPickupPointPickingDocumentDelivery getProviderPickupPointPickingDocumentDelivery();

}
