package com.logicommerce.sdk.models.order.implementations;

import java.util.List;
import com.logicommerce.sdk.enums.DeliveryType;
import com.logicommerce.sdk.enums.DocumentPickingDeliveryMode;
import com.logicommerce.sdk.models.order.GeographicalZone;
import com.logicommerce.sdk.models.order.OrderDelivery;
import com.logicommerce.sdk.models.order.OrderDeliveryPhysicalLocation;
import com.logicommerce.sdk.models.order.OrderShipment;
import com.logicommerce.sdk.models.order.ProviderPickupPointPickingDocumentDelivery;
import com.logicommerce.utilities.annotations.Uses;

/**
 * <p>OrderDeliveryImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderDeliveryImpl implements OrderDelivery {

	private DeliveryType type;

	@Uses(value = OrderDeliveryPhysicalLocationImpl.class)
	private OrderDeliveryPhysicalLocation physicalLocation;

	@Uses(value = OrderShipmentImpl.class)
	private List<OrderShipment> shipments;

	@Uses(value = GeographicalZoneImpl.class)
	private GeographicalZone geographicalZone;

	private DocumentPickingDeliveryMode mode;

	@Uses(value = ProviderPickupPointPickingDocumentDeliveryImpl.class)
	private ProviderPickupPointPickingDocumentDelivery providerPickupPointPickingDocumentDelivery;

	/**
	 * <p>Getter for the field <code>type</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.DeliveryType} object
	 */
	@Override
	public DeliveryType getType() {
		return type;
	}

	/**
	 * <p>Getter for the field <code>physicalLocation</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderDeliveryPhysicalLocation} object
	 */
	@Override
	public OrderDeliveryPhysicalLocation getPhysicalLocation() {
		return physicalLocation;
	}

	/**
	 * <p>Getter for the field <code>shipments</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	@Override
	public List<OrderShipment> getShipments() {
		return shipments;
	}

	/**
	 * <p>Getter for the field <code>geographicalZone</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.GeographicalZone} object
	 */
	@Override
	public GeographicalZone getGeographicalZone() {
		return geographicalZone;
	}

	/**
	 * <p>Getter for the field <code>mode</code>.</p>
	 * @since 1.3.8
	 * @return a {@link com.logicommerce.sdk.enums.DocumentPickingDeliveryMode} object
	 */
	@Override
	public DocumentPickingDeliveryMode getMode() {
		return mode;
	}

	@Override
	public ProviderPickupPointPickingDocumentDelivery getProviderPickupPointPickingDocumentDelivery() {
		return providerPickupPointPickingDocumentDelivery;
	}

	/**
	 * <p>Setter for the field <code>type</code>.</p>
	 *
	 * @param type a {@link com.logicommerce.sdk.enums.DeliveryType} object
	 */
	public void setType(DeliveryType type) {
		this.type = type;
	}

	/**
	 * <p>Setter for the field <code>physicalLocation</code>.</p>
	 *
	 * @param physicalLocation a {@link com.logicommerce.sdk.models.order.OrderDeliveryPhysicalLocation} object
	 */
	public void setPhysicalLocation(OrderDeliveryPhysicalLocation physicalLocation) {
		this.physicalLocation = physicalLocation;
	}

	/**
	 * <p>Setter for the field <code>shipments</code>.</p>
	 *
	 * @param shipments a {@link java.util.List} object
	 */
	public void setShipments(List<OrderShipment> shipments) {
		this.shipments = shipments;
	}

	/**
	 * <p>Setter for the field <code>geographicalZone</code>.</p>
	 *
	 * @param geographicalZone a {@link com.logicommerce.sdk.models.order.GeographicalZone} object
	 */
	public void setGeographicalZone(GeographicalZone geographicalZone) {
		this.geographicalZone = geographicalZone;
	}

	/**
	 * <p>Setter for the field <code>mode</code>.</p>
	 * @since 1.3.8
	 * @param mode a {@link com.logicommerce.sdk.enums.DocumentPickingDeliveryMode} object
	 */
	public void setMode(DocumentPickingDeliveryMode mode) {
		this.mode = mode;
	}

	/**
	 * <p>Setter for the field <code>providerPickupPointPickingDocumentDelivery</code>.</p>
	 *
	 * @param providerPickupPointPickingDocumentDelivery a 
	 * {@link com.logicommerce.sdk.models.order.ProviderPickupPointPickingDocumentDelivery} object
	 */
	public void setProviderPickupPointPickingDocumentDelivery(ProviderPickupPointPickingDocumentDelivery 
			providerPickupPointPickingDocumentDelivery) {
		this.providerPickupPointPickingDocumentDelivery = providerPickupPointPickingDocumentDelivery;
	}
}
