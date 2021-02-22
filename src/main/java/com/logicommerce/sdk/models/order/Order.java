package com.logicommerce.sdk.models.order;

import java.time.LocalDateTime;
import java.util.List;
import com.logicommerce.sdk.enums.ExportStatusType;
import com.logicommerce.sdk.enums.OrderStatusType;
import com.logicommerce.sdk.models.CustomTag;
import com.logicommerce.sdk.models.ElementProperty;

public interface Order {

	Integer getId();

	String getPId();

	List<CustomTag> getCustomTags();

	List<OrderItem> getItems();

	OrderDelivery getDelivery();

	List<OrderStatus> getStatuses();

	List<OrderAdditionalInformation> getAdditionalInformation();

	List<ElementProperty> getProperties();

	void addProperty(ElementProperty property);

	void addProperty(String name, String value);

	List<OrderCurrency> getCurrencies();

	OrderInformation getInformation();

	OrderPaymentSystem getPaymentSystem();

	List<OrderTax> getTaxes();

	OrderTotal getTotals();

	OrderUser getUser();

	List<OrderVoucher> getVouchers();

	List<OrderDiscount> getDiscounts();

	String getDocumentNumber();

	Integer getLanguageId();

	LocalDateTime getDate();

	OrderStatusType getStatus();

	int getSubstatusId();

	LocalDateTime getDeliveryDate();

	boolean isPaid();

	LocalDateTime getPaymentDate();

	String getComment();

	ExportStatusType getExportStatus();

	boolean isReverseChargeVat();

}
