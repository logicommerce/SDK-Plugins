package com.logicommerce.sdk.resources;

import java.util.List;
import com.logicommerce.sdk.models.document.CustomerDocumentListParam;
import com.logicommerce.sdk.models.shipment.Shipment;

/**
 * <p>Resource to read the shipments of the orders of the commerce, whatever their status.</p>
 *
 * <p>An order can have several shipments, so its document number does not identify one. A shipment is identified by its
 * id (such as {@link com.logicommerce.sdk.models.order.OrderShipment#getId()} of the order) or by the document number of
 * its delivery note, which only exists once the delivery note has been created.</p>
 *
 * <p>{@link #getShipments(CustomerDocumentListParam)} finds the shipments by the exact email stored in their orders, not
 * by account, and pages by shipment. {@link Shipment#getOrderId()} reads the order of a shipment with
 * {@link OrderResource#getOrder(int)}. The shipments read by id or document number are not checked against any
 * customer: compare the email of {@link Shipment#getCustomer()} before showing one to a customer.</p>
 *
 * <pre>
 * &#64;Resource
 * private ShipmentResource shipmentResource;
 * </pre>
 *
 * @author LogiCommerce
 * @since 2.9.1
 */
public interface ShipmentResource {

	/**
	 * Returns a page of the shipments of the orders of a customer, from the most recent order to the oldest. The dates
	 * of the param filter by the order date.
	 *
	 * @param param the customer email, the dates and the page
	 * @return a {@link java.util.List} of {@link com.logicommerce.sdk.models.shipment.Shipment}, empty when the param
	 *         or its email is null or blank
	 * @throws PluginResourceException if the shipments cannot be read
	 */
	List<Shipment> getShipments(CustomerDocumentListParam param) throws PluginResourceException;

	/**
	 * Returns the shipment with the given id.
	 *
	 * @param shipmentId an int
	 * @return a {@link com.logicommerce.sdk.models.shipment.Shipment} object, or null when the commerce has no
	 *         shipment with that id
	 * @throws PluginResourceException if the shipment cannot be read
	 */
	Shipment getShipment(int shipmentId) throws PluginResourceException;

	/**
	 * Returns the shipment of the delivery note with the given document number.
	 *
	 * @param documentNumber the document number of a delivery note
	 * @return a {@link com.logicommerce.sdk.models.shipment.Shipment} object, or null when the commerce has no
	 *         delivery note with that document number
	 * @throws PluginResourceException if the shipment cannot be read
	 */
	Shipment getShipment(String documentNumber) throws PluginResourceException;

}
