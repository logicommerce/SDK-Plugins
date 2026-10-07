package com.logicommerce.sdk.enums;

/**
 * <p>Status of a return merchandise authorization (RMA) of an order, as core stores it (core
 * {@code RMAStatusType}).</p>
 *
 * <p>Returned by {@link com.logicommerce.sdk.models.order.OrderRMA#getStatus()}.</p>
 *
 * @author Logicommerce
 * @since 2.8.5
 */
public enum RMAStatusType {
	/**
	 * The RMA has an incident and is not being processed.
	 */
	INCIDENTS,
	/**
	 * The RMA has been requested and waits for the merchant.
	 */
	PENDING,
	/**
	 * The merchant authorized the return; the goods have not been accepted yet.
	 */
	AUTHORIZED,
	/**
	 * The merchant refused to authorize the return.
	 */
	NO_AUTHORIZED,
	/**
	 * The returned goods are being processed.
	 */
	IN_PROCESS,
	/**
	 * The returned goods were accepted.
	 */
	ACCEPTED,
	/**
	 * The returned goods were denied.
	 */
	DENIED,
	/**
	 * The return is completed.
	 */
	COMPLETED,
	/**
	 * The RMA was deleted.
	 */
	DELETED;
}
