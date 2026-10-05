package com.logicommerce.sdk.models.order;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import com.logicommerce.sdk.enums.DeliveryType;
import com.logicommerce.sdk.enums.OrderStatusType;
import com.logicommerce.sdk.models.basket.AppliedDiscountView;
import com.logicommerce.sdk.models.basket.CustomerView;
import com.logicommerce.sdk.models.basket.TotalsView;

/**
 * <p>An order as {@link com.logicommerce.sdk.resources.OrderResource#getOrder(int)} returns it.</p>
 *
 * <p>Every amount is an integer number of minor units of the order's purchase currency ({@link #getCurrencyCode()}),
 * converted by core from the headquarter currency with the currency values stored on the order, and rounded as for
 * baskets: each unit price and each discount allocation once, and every total as the sum of its rounded parts (see
 * {@link TotalsView}). Lists and maps are never null.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public interface OrderView {

	/**
	 * Returns the order id.
	 *
	 * @return the id
	 */
	int getId();

	/**
	 * Returns the document number, assigned when the order is placed (when it leaves {@code INCIDENTS},
	 * {@code DENIED} and {@code PENDING_APPROVAL}).
	 *
	 * @return the document number, or null while the order has not been placed
	 */
	String getDocumentNumber();

	/**
	 * Returns the order status.
	 *
	 * @return the status
	 */
	OrderStatusType getStatus();

	/**
	 * Returns the order date, set when the order is created and never changed afterwards. Core truncates it to whole
	 * seconds, the precision the database stores. For an order read from the database,
	 * {@code LocalDateTime.ofInstant(getDate(), ZoneOffset.UTC)} equals its stored {@link Document#getDate()}. For an
	 * order core still holds in memory (the request that created it), it is the creation time truncated to seconds,
	 * which may be one second earlier than the stored value, because the database may round the fraction up.
	 *
	 * @return the date (UTC, truncated to whole seconds)
	 */
	Instant getDate();

	/**
	 * Returns the purchase currency, the currency of every amount in the view.
	 *
	 * @return the ISO 4217 code, upper case
	 */
	String getCurrencyCode();

	/**
	 * Returns whether the amounts include taxes (the commerce's {@code showTaxesIncluded} for the order's country), as
	 * {@link com.logicommerce.sdk.models.basket.BasketView#isTaxesIncluded()} does for baskets.
	 *
	 * @return true when prices are gross
	 */
	boolean isTaxesIncluded();

	/**
	 * Returns the order language.
	 *
	 * @return the language id
	 */
	int getLanguageId();

	/**
	 * Returns the order's status history, in chronological order.
	 *
	 * @return the history
	 */
	List<StatusHistory> getStatusHistory();

	/**
	 * Returns the properties the calling plugin account added to the order with {@link Document#addProperty}, by name.
	 * Properties other plugins (or other accounts of the same plugin) added are not included, so they can never shadow
	 * the caller's. For a name added more than once, the latest value wins.
	 *
	 * @return the properties
	 */
	Map<String, String> getProperties();

	/**
	 * Returns the order rows.
	 *
	 * @return the rows
	 */
	List<OrderRowView> getRows();

	/**
	 * Returns the discounts applied to the order, one entry per discount.
	 *
	 * @return the applied discounts
	 */
	List<AppliedDiscountView> getDiscounts();

	/**
	 * Returns the order totals. The delivery total is the shipments' shipping prices plus the pickup price, and a
	 * pickup order ({@link DeliveryType#PICKING}) counts as a selected delivery
	 * ({@link TotalsView#isDeliverySelected()}).
	 *
	 * @return the totals, never null
	 */
	TotalsView getTotals();

	/**
	 * Returns the shipping address.
	 *
	 * @return the address, or null when the order has none (for instance a pickup order)
	 */
	AddressView getShippingAddress();

	/**
	 * Returns the customer data of the order.
	 *
	 * @return the customer, never null
	 */
	CustomerView getCustomer();

	/**
	 * Returns how the order is delivered.
	 *
	 * @return the delivery type, or null when the order has no delivery
	 */
	DeliveryType getDeliveryType();

	/**
	 * Returns where a pickup order ({@link DeliveryType#PICKING}) is collected: one of the commerce's physical locations,
	 * or a carrier's pickup point (a provider pickup point, whose {@link PickupLocationView#getPhysicalLocationId()} is
	 * 0).
	 *
	 * @return the pickup location, or null unless the order is a pickup order; null also for a pickup order that has
	 *         neither a physical location nor a provider pickup point
	 */
	PickupLocationView getPhysicalLocation();

	/**
	 * Returns the order's shipments.
	 *
	 * @return the shipments
	 */
	List<OrderShipmentView> getShipments();

	/**
	 * Returns the return merchandise authorizations (RMAs) of the order.
	 *
	 * @return the RMAs
	 */
	List<RMAView> getRMAs();

	/**
	 * Returns the credit notes issued for the order.
	 *
	 * @return the credit notes
	 */
	List<CreditNoteView> getCreditNotes();

	/**
	 * Returns the storefront's guest order page ({@code <store>/orders/<id>?token=<token>}), built by core, never from
	 * the request: {@code <store>} is the storefront version route resolution picks for the order's language and its
	 * shipping (else invoicing) country; when none matches, the first version of the order's language for any
	 * country; else the store URL setting of the order's language.
	 *
	 * @return an absolute URL
	 */
	String getPermalinkUrl();

}
