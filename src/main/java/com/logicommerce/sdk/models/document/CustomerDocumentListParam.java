package com.logicommerce.sdk.models.document;

import java.time.LocalDateTime;
import com.logicommerce.sdk.models.PaginationParam;

/**
 * <p>Filter param for the documents of a customer, such as
 * {@link com.logicommerce.sdk.resources.RMAResource#getRMAs(CustomerDocumentListParam)} and
 * {@link com.logicommerce.sdk.resources.ShipmentResource#getShipments(CustomerDocumentListParam)}.</p>
 *
 * <p>The documents are found by the email stored in them (for a shipment, the one of its order), not by the account of
 * the customer. The dates filter by the RMA date for RMAs and by the order date for shipments.</p>
 *
 * <p>Build it with {@link CustomerDocumentListParamBuilder}. A page below 1 is read as 1, and a page size below 1 as 25
 * and above 100 as 100. A {@code fromDate} after {@code toDate} finds nothing.</p>
 *
 * @author LogiCommerce
 * @since 2.9.1
 */
public class CustomerDocumentListParam extends PaginationParam {

	private String email;

	private LocalDateTime fromDate;

	private LocalDateTime toDate;

	/**
	 * Returns the customer email. Only the documents whose customer has exactly this email (ignoring surrounding
	 * blanks) are returned; it is not a prefix search.
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the customer email.
	 *
	 * @param email a {@link java.lang.String} object
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Returns the inclusive lower bound of the document date. The date of a shipment is the date of its order.
	 *
	 * @return a {@link java.time.LocalDateTime} object, or null for no lower bound
	 */
	public LocalDateTime getFromDate() {
		return fromDate;
	}

	/**
	 * Sets the inclusive lower bound of the document date.
	 *
	 * @param fromDate a {@link java.time.LocalDateTime} object
	 */
	public void setFromDate(LocalDateTime fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * Returns the inclusive upper bound of the document date. The date of a shipment is the date of its order.
	 *
	 * @return a {@link java.time.LocalDateTime} object, or null for no upper bound
	 */
	public LocalDateTime getToDate() {
		return toDate;
	}

	/**
	 * Sets the inclusive upper bound of the document date.
	 *
	 * @param toDate a {@link java.time.LocalDateTime} object
	 */
	public void setToDate(LocalDateTime toDate) {
		this.toDate = toDate;
	}

}
