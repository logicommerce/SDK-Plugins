package com.logicommerce.sdk.resources;

import java.util.List;
import com.logicommerce.sdk.models.document.CustomerDocumentListParam;
import com.logicommerce.sdk.models.rma.RMA;

/**
 * <p>Resource to read the return merchandise authorizations (RMAs) of the commerce, whatever their status.</p>
 *
 * <p>{@link #getRMAs(CustomerDocumentListParam)} finds the RMAs by the exact email stored in them, not by account. The
 * id of each RMA of an order ({@link com.logicommerce.sdk.models.order.OrderRMA#getId()}) reads the whole RMA with
 * {@link #getRMA(int)}, and {@link RMA#getOrderId()} reads its order with {@link OrderResource#getOrder(int)}. The RMAs read by id or document number are not checked against any customer:
 * compare the email of {@link RMA#getCustomer()} before showing one to a customer.</p>
 *
 * <pre>
 * &#64;Resource
 * private RMAResource rmaResource;
 * </pre>
 *
 * @author LogiCommerce
 * @since 2.9.1
 */
public interface RMAResource {

	/**
	 * Returns a page of the RMAs of a customer, from the most recent to the oldest.
	 *
	 * @param param the customer email, the dates and the page
	 * @return a {@link java.util.List} of {@link com.logicommerce.sdk.models.rma.RMA}, empty when the param or its
	 *         email is null or blank
	 * @throws PluginResourceException if the RMAs cannot be read
	 */
	List<RMA> getRMAs(CustomerDocumentListParam param) throws PluginResourceException;

	/**
	 * Returns the RMA with the given id.
	 *
	 * @param rmaId an int
	 * @return a {@link com.logicommerce.sdk.models.rma.RMA} object, or null when the commerce has no RMA with that id
	 * @throws PluginResourceException if the RMA cannot be read
	 */
	RMA getRMA(int rmaId) throws PluginResourceException;

	/**
	 * Returns the RMA with the given document number.
	 *
	 * @param documentNumber a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.rma.RMA} object, or null when the commerce has no RMA with that
	 *         document number
	 * @throws PluginResourceException if the RMA cannot be read
	 */
	RMA getRMA(String documentNumber) throws PluginResourceException;

}
