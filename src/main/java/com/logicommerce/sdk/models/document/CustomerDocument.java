package com.logicommerce.sdk.models.document;

import java.util.List;

/**
 * <p>The data that every document of a customer shares, such as an
 * {@link com.logicommerce.sdk.models.rma.RMA} or a {@link com.logicommerce.sdk.models.shipment.Shipment}.</p>
 *
 * <p>The resources do not check which customer a document read by id or document number belongs to: compare the email
 * of {@link #getCustomer()} before showing it to a customer. {@link #getOrderId()} reads the order of the document
 * with {@link com.logicommerce.sdk.resources.OrderResource#getOrder(int)}.</p>
 *
 * @param <I> the type of the document lines
 * @author LogiCommerce
 * @since 2.9.1
 */
public interface CustomerDocument<I extends DocumentItem> {

	/**
	 * Returns the id.
	 *
	 * @return the id
	 */
	int getId();

	/**
	 * Returns the document number the customer sees.
	 *
	 * @return the document number, or null when the document has none
	 */
	String getDocumentNumber();

	/**
	 * Returns the id of the order the document belongs to.
	 *
	 * @return the order id, or null when it is not linked to an order
	 */
	Integer getOrderId();

	/**
	 * Returns the document number of the order the document belongs to.
	 *
	 * @return the order document number, or null when it is not linked to an order
	 */
	String getOrderDocumentNumber();

	/**
	 * Returns the customer.
	 *
	 * @return the customer, never null
	 */
	DocumentCustomer getCustomer();

	/**
	 * Returns the product lines, sorted by id.
	 *
	 * @return the lines, never null
	 */
	List<I> getItems();

}
