package com.logicommerce.sdk.models.order.implementations;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.enums.ExportStatusType;
import com.logicommerce.sdk.enums.OrderStatusType;
import com.logicommerce.sdk.models.CustomTag;
import com.logicommerce.sdk.models.ElementProperty;
import com.logicommerce.sdk.models.ElementProperyImpl;
import com.logicommerce.sdk.models.implementations.CustomTagImpl;
import com.logicommerce.sdk.models.order.Order;
import com.logicommerce.sdk.models.order.OrderAdditionalInformation;
import com.logicommerce.sdk.models.order.OrderCurrency;
import com.logicommerce.sdk.models.order.OrderDelivery;
import com.logicommerce.sdk.models.order.OrderDiscount;
import com.logicommerce.sdk.models.order.OrderInformation;
import com.logicommerce.sdk.models.order.OrderItem;
import com.logicommerce.sdk.models.order.OrderPaymentSystem;
import com.logicommerce.sdk.models.order.OrderStatus;
import com.logicommerce.sdk.models.order.OrderTax;
import com.logicommerce.sdk.models.order.OrderTotal;
import com.logicommerce.sdk.models.order.OrderUser;
import com.logicommerce.sdk.models.order.OrderVoucher;
import com.logicommerce.utilities.annotations.NoMappable;
import com.logicommerce.utilities.annotations.Uses;

public class OrderImpl implements Order  {

	private String comment;

	@Uses(value = CustomTagImpl.class)
	private List<CustomTag> customTags;

	private Integer languageId;

	@Uses(value = OrderUserImpl.class)
	private OrderUser user;

	@Uses(value = OrderTotalImpl.class)
	private OrderTotal totals;

	@Uses(value = OrderVoucherImpl.class)
	private List<OrderVoucher> vouchers;

	//@Mapped(name = "rows")
	@Uses(value = OrderItemImpl.class)
	private List<OrderItem> items;

	@Uses(value = OrderPaymentSystemImpl.class)
	private OrderPaymentSystem paymentSystem;

	@Uses(value = OrderAdditionalInformationImpl.class)
	private List<OrderAdditionalInformation> additionalInformation;
	
	@NoMappable
	private List<ElementProperty> properties;

	@Uses(value = OrderCurrencyImpl.class)
	private List<OrderCurrency> currencies;

	private LocalDateTime date;

	private LocalDateTime deliveryDate;

	@Uses(value = OrderDiscountImpl.class)
	private List<OrderDiscount> discounts;

	private String documentNumber;

	private ExportStatusType exportStatus;

	private Integer id;

	private String pId;

	private LocalDateTime paymentDate;

	//@Uses(value = OrderDeliveryImpl.class)
	//TODO tema location
	@Uses(value = OrderDeliveryImpl.class)
	private OrderDelivery delivery;

	private OrderStatusType status;

	@Uses(value = OrderStatusImpl.class)
	private List<OrderStatus> statuses;

	private int substatusId;

	private boolean paid;

	private boolean reverseChargeVat;

	@Uses(value = OrderInformationImpl.class)	
	private OrderInformation information;

	@Uses(value = OrderTaxImpl.class)
	private List<OrderTax> taxes;

	public List<OrderAdditionalInformation> getAdditionalInformation() {
		return additionalInformation;
	}

	public List<ElementProperty> getProperties() {
		return properties;
	}

	public void addProperty(ElementProperty property) {
		if (properties == null) {
			properties = new ArrayList<>();
		}
		properties.add(property);
	}

	public void addProperty(String name, String value) {
		if (name == null || value == null) {
			return;
		}
		addProperty(new ElementProperyImpl(name, value));
	}

	public String getComment() {
		return comment;
	}

	public List<OrderCurrency> getCurrencies() {
		return currencies;
	}

	public List<CustomTag> getCustomTags() {
		return customTags;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public LocalDateTime getDeliveryDate() {
		return deliveryDate;
	}

	public List<OrderDiscount> getDiscounts() {
		return discounts;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public ExportStatusType getExportStatus() {
		return exportStatus;
	}

	public Integer getId() {
		return id;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public Integer getLanguageId() {
		
		return languageId;
	}

	public String getPId() {
		return pId;
	}

	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public OrderInformation getInformation() {
		return information;
	}

	public OrderPaymentSystem getPaymentSystem() {
		return paymentSystem;
	}

	public OrderStatusType getStatus() {
		return status;
	}

	public List<OrderStatus> getStatuses() {
		return statuses;
	}

	public int getSubstatusId() {
		return substatusId;
	}

	public List<OrderTax> getTaxes() {
		return taxes;
	}

	public OrderTotal getTotals() {
		return totals;
	}

	public OrderUser getUser() {
		return user;
	}

	public OrderDelivery getDelivery() {
		return delivery;
	}

	public List<OrderVoucher> getVouchers() {
		return vouchers;
	}

	public boolean isPaid() {
		return paid;
	}

	public boolean isReverseChargeVat() {
		return reverseChargeVat;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setCustomTags(List<CustomTag> customTags) {
		this.customTags = customTags;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public void setUser(OrderUser user) {
		this.user = user;
	}

	public void setTotals(OrderTotal totals) {
		this.totals = totals;
	}

	public void setVouchers(List<OrderVoucher> vouchers) {
		this.vouchers = vouchers;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public void setPaymentSystem(OrderPaymentSystem paymentSystem) {
		this.paymentSystem = paymentSystem;
	}

	public void setAdditionalInformation(List<OrderAdditionalInformation> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public void setCurrencies(List<OrderCurrency> currencies) {
		this.currencies = currencies;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public void setDeliveryDate(LocalDateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public void setDiscounts(List<OrderDiscount> discounts) {
		this.discounts = discounts;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public void setExportStatus(ExportStatusType exportStatus) {
		this.exportStatus = exportStatus;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPId(String pId) {
		this.pId = pId;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	public void setDelivery(OrderDelivery delivery) {
		this.delivery = delivery;
	}

	public void setStatus(OrderStatusType status) {
		this.status = status;
	}

	public void setStatuses(List<OrderStatus> statuses) {
		this.statuses = statuses;
	}

	public void setSubstatusId(int substatusId) {
		this.substatusId = substatusId;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public void setReverseChargeVat(boolean reverseChargeVat) {
		this.reverseChargeVat = reverseChargeVat;
	}

	public void setInformation(OrderInformation information) {
		this.information = information;
	}

	public void cleanProperties() {
		this.properties = null;
	}
	
	public void setTaxes(List<OrderTax> taxes) {
		this.taxes = taxes;
	}
}