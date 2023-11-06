package com.logicommerce.sdk.models.order;

import java.time.LocalDateTime;
import java.util.List;
import com.logicommerce.sdk.enums.ExportStatusType;
import com.logicommerce.sdk.models.CustomTag;
import com.logicommerce.sdk.models.ElementProperty;

/**
 * Document interface.
 * 
 * @since 1.3.0
 */
public interface Document {
	
	/**
	 * Returns the document id.
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * Returns the document pId.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getPId();

	/**
	 * Returns the custom tags.
	 *
	 * @return a {@link java.util.List} object
	 */
	List<CustomTag> getCustomTags();

	/**
	 * Returns the document items.
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderItem> getItems();

	/**
	 * Returns the delivery.
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderDelivery} object
	 */
	OrderDelivery getDelivery();

	/**
	 * Returns the statuses.
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderStatus> getStatuses();

	/**
	 * Returns the additional information.
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderAdditionalInformation> getAdditionalInformation();

	/**
	 * Returns the properties.
	 *
	 * @return a {@link java.util.List} object
	 */
	List<ElementProperty> getProperties();

	/**
	 * Adds a property to the document.
	 *
	 * @param property a {@link com.logicommerce.sdk.models.ElementProperty} object
	 */
	void addProperty(ElementProperty property);

	/**
	 * Adds a property to the document.
	 *
	 * @param name a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 */
	void addProperty(String name, String value);

	/**
	 * Returns the currencies.
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderCurrency> getCurrencies();

	/**
	 * Returns the information.
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderInformation} object
	 */
	OrderInformation getInformation();

	/**
	 * Returns the payment system.
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderPaymentSystem} object
	 */
	OrderPaymentSystem getPaymentSystem();

	/**
	 * Returns the taxes.
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderTax> getTaxes();

	/**
	 * Returns the totals.
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderTotal} object
	 */
	OrderTotal getTotals();

	/**
	 * Returns the user.
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderUser} object
	 */
	OrderUser getUser();

	/**
	 * Returns the vouchers.
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderVoucher> getVouchers();

	/**
	 * Returns the discounts.
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderDiscount> getDiscounts();

	/**
	 * Returns the documentId.
	 *
	 * @since 1.0.18
	 * @return a {@link java.lang.String} object
	 */
	Integer getDocumentId();

	/**
	 * Returns the document number.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getDocumentNumber();

	/**
	 * Returns the language id of the document.
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getLanguageId();

	/**
	 * Returns the date.
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	LocalDateTime getDate();

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
	 * Returns the comment.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getComment();

	/**
	 * Returns the export status.
	 *
	 * @return a {@link com.logicommerce.sdk.enums.ExportStatusType} object
	 */
	ExportStatusType getExportStatus();

	/**
	 * Returns the export date.
	 *
	 * @return a boolean
	 */
	boolean isReverseChargeVat();

}
