package com.logicommerce.sdk.models.order;

import java.time.LocalDateTime;
import java.util.List;
import com.logicommerce.sdk.enums.ExportStatusType;
import com.logicommerce.sdk.enums.OrderStatusType;
import com.logicommerce.sdk.models.CustomTag;
import com.logicommerce.sdk.models.ElementProperty;

/**
 * <p>Order interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface Order {

	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * <p>getPId.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getPId();

	/**
	 * <p>getCustomTags.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<CustomTag> getCustomTags();

	/**
	 * <p>getItems.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderItem> getItems();

	/**
	 * <p>getDelivery.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderDelivery} object
	 */
	OrderDelivery getDelivery();

	/**
	 * <p>getStatuses.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderStatus> getStatuses();

	/**
	 * <p>getAdditionalInformation.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderAdditionalInformation> getAdditionalInformation();

	/**
	 * <p>getProperties.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<ElementProperty> getProperties();

	/**
	 * <p>addProperty.</p>
	 *
	 * @param property a {@link com.logicommerce.sdk.models.ElementProperty} object
	 */
	void addProperty(ElementProperty property);

	/**
	 * <p>addProperty.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 */
	void addProperty(String name, String value);

	/**
	 * <p>getCurrencies.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderCurrency> getCurrencies();

	/**
	 * <p>getInformation.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderInformation} object
	 */
	OrderInformation getInformation();

	/**
	 * <p>getPaymentSystem.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderPaymentSystem} object
	 */
	OrderPaymentSystem getPaymentSystem();

	/**
	 * <p>getTaxes.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderTax> getTaxes();

	/**
	 * <p>getTotals.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderTotal} object
	 */
	OrderTotal getTotals();

	/**
	 * <p>getUser.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderUser} object
	 */
	OrderUser getUser();

	/**
	 * <p>getVouchers.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderVoucher> getVouchers();

	/**
	 * <p>getDiscounts.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderDiscount> getDiscounts();

	/**
	 * <p>getDocumentId.</p>
	 *
	 * @since 1.0.18
	 * @return a {@link java.lang.String} object
	 */
	Integer getDocumentId();

	/**
	 * <p>getDocumentNumber.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getDocumentNumber();

	/**
	 * <p>getLanguageId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getLanguageId();

	/**
	 * <p>getDate.</p>
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	LocalDateTime getDate();

	/**
	 * <p>getStatus.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.OrderStatusType} object
	 */
	OrderStatusType getStatus();

	/**
	 * <p>getSubstatusId.</p>
	 *
	 * @return a int
	 */
	int getSubstatusId();

	/**
	 * <p>getDeliveryDate.</p>
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	LocalDateTime getDeliveryDate();

	/**
	 * <p>isPaid.</p>
	 *
	 * @return a boolean
	 */
	boolean isPaid();

	/**
	 * <p>getPaymentDate.</p>
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	LocalDateTime getPaymentDate();

	/**
	 * <p>getComment.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getComment();

	/**
	 * <p>getExportStatus.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.ExportStatusType} object
	 */
	ExportStatusType getExportStatus();

	/**
	 * <p>isReverseChargeVat.</p>
	 *
	 * @return a boolean
	 */
	boolean isReverseChargeVat();

}
