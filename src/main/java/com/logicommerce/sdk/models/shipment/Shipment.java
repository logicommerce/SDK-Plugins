package com.logicommerce.sdk.models.shipment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import com.logicommerce.sdk.enums.OrderShipmentStatusType;
import com.logicommerce.sdk.models.document.CustomerDocument;
import com.logicommerce.sdk.models.document.DocumentItem;

/**
 * <p>A shipment of an order of a customer ({@link com.logicommerce.sdk.resources.ShipmentResource}).</p>
 *
 * <p>{@link #getDocumentNumber()} is the number of the delivery note of the shipment, or null when no delivery note has
 * been created yet. When the shipment has several delivery notes, it is the number of the first one. It is not the
 * {@link com.logicommerce.sdk.models.order.OrderShipment#getDocumentNumber() document number of the order shipment},
 * which is the number of the order, although both share the {@link #getId() id}.</p>
 *
 * <p>The {@link #getItems() items} are the lines of the shipment: their quantity is the one sent in this shipment, and
 * their product, name and SKU are those of the order line.</p>
 *
 * @author LogiCommerce
 * @since 2.9.1
 */
public interface Shipment extends CustomerDocument<DocumentItem> {

	/**
	 * Returns the date of the order of the shipment.
	 *
	 * @return the order date
	 */
	LocalDateTime getOrderDate();

	/**
	 * Returns the shipment status.
	 *
	 * @return the status, or null when the shipment has no status yet
	 */
	OrderShipmentStatusType getStatus();

	/**
	 * Returns the date the goods are expected to arrive at the warehouse the shipment leaves from. It is not the delivery
	 * date to the customer.
	 *
	 * @return the incoming date, or null when it is not set
	 */
	LocalDate getIncomingDate();

	/**
	 * Returns the name of the shipping service, as stored in the order.
	 *
	 * @return the shipping name, or null when the shipment has no shipping
	 */
	String getShippingName();

	/**
	 * Returns the name of the shipping type, as stored in the order.
	 *
	 * @return the shipping type name, or null when the shipment has no shipping
	 */
	String getShippingTypeName();

	/**
	 * Returns the public id of the carrier.
	 *
	 * @return the carrier public id, or null when it is not set
	 */
	String getShipperPId();

	/**
	 * Returns the tracking number.
	 *
	 * @return the tracking number, or null when it is not set
	 */
	String getTrackingNumber();

	/**
	 * Returns the tracking URL.
	 *
	 * @return the tracking URL, or null when it is not set
	 */
	String getTrackingUrl();

}
