package com.logicommerce.sdk.models.order.list;

import java.time.LocalDateTime;
import java.util.List;
import com.logicommerce.sdk.enums.ExportStatusType;
import com.logicommerce.sdk.enums.OrderStatusType;
import com.logicommerce.sdk.models.order.OrderCurrency;

/**
 * Lightweight order model used in order listings.
 *
 * @author LogiCommerce
 * @since 2.8.5
 */
public interface OrderList {

	/**
	 * Returns the order id.
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * Returns the order pId.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getPId();

	/**
	 * Returns the headquarter id.
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getHeadquarterId();

	/**
	 * Returns the payment system.
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.list.OrderListPaymentSystem} object
	 */
	OrderListPaymentSystem getPaymentSystem();

	/**
	 * Returns the customer.
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.list.OrderListCustomer} object
	 */
	OrderListCustomer getCustomer();

	/**
	 * Returns the order total.
	 *
	 * @return a double
	 */
	double getTotal();

	/**
	 * Returns the currencies of the order, one for each {@link com.logicommerce.sdk.enums.CurrencyMode}.
	 *
	 * @return a {@link java.util.List} of {@link com.logicommerce.sdk.models.order.OrderCurrency}
	 */
	List<OrderCurrency> getCurrencies();

	/**
	 * Returns the channel id.
	 *
	 * @return an int
	 */
	int getChannelId();

	/**
	 * Returns the transaction id.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getTransactionId();

	/**
	 * Returns the authorization number.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getAuthNumber();

	/**
	 * Returns the marketplace id.
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getMarketplaceId();

	/**
	 * Returns the document id.
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getDocumentId();

	/**
	 * Returns the commerce id.
	 *
	 * @return an int
	 */
	int getCommerceId();

	/**
	 * Returns the document number.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getDocumentNumber();

	/**
	 * Returns the language id.
	 *
	 * @return an int
	 */
	int getLanguageId();

	/**
	 * Returns the document id length.
	 *
	 * @return an int
	 */
	int getDocumentIdLength();

	/**
	 * Returns the date.
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	LocalDateTime getDate();

	/**
	 * Returns the status.
	 *
	 * @return a {@link com.logicommerce.sdk.enums.OrderStatusType} object
	 */
	OrderStatusType getStatus();

	/**
	 * Returns the substatus id.
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getSubstatusId();

	/**
	 * Returns the prefix.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getPrefix();

	/**
	 * Returns the suffix.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getSuffix();

	/**
	 * Returns the owner account id.
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getOwnerAccountId();

	/**
	 * Returns the delivery date.
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	LocalDateTime getDeliveryDate();

	/**
	 * Returns the paid status.
	 *
	 * @return a boolean
	 */
	boolean isPaid();

	/**
	 * Returns the payment date.
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	LocalDateTime getPaymentDate();

	/**
	 * Returns the export status.
	 *
	 * @return a {@link com.logicommerce.sdk.enums.ExportStatusType} object
	 */
	ExportStatusType getExportStatus();

}
