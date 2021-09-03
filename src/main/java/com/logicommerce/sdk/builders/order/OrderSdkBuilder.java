package com.logicommerce.sdk.builders.order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.builders.CustomTagBuilder;
import com.logicommerce.sdk.enums.ExportStatusType;
import com.logicommerce.sdk.enums.OrderStatusType;
import com.logicommerce.sdk.models.order.Order;
import com.logicommerce.sdk.models.order.implementations.OrderImpl;

public class OrderSdkBuilder {

	protected String comment;

	protected List<CustomTagBuilder<OrderSdkBuilder>> customTags;

	protected Integer languageId;

	protected OrderUserBuilder<OrderSdkBuilder> user;

	protected OrderTotalBuilder<OrderSdkBuilder> totals;

	protected List<OrderVoucherBuilder<OrderSdkBuilder>> vouchers;

	protected List<OrderItemBuilder<OrderSdkBuilder>> items;
	
	protected OrderDeliveryBuilder<OrderSdkBuilder> delivery;

	protected OrderInformationBuilder<OrderSdkBuilder> information;

	protected OrderPaymentSystemBuilder<OrderSdkBuilder> paymentSystem;

	protected List<OrderAdditionalInformationBuilder<OrderSdkBuilder>> additionalInformation;

	protected List<OrderCurrencyBuilder<OrderSdkBuilder>> currencies;

	protected LocalDateTime date;

	protected LocalDateTime deliveryDate;

	protected List<OrderDiscountBuilder<OrderSdkBuilder>> discounts;

	protected String documentNumber;

	protected ExportStatusType exportStatus;

	protected Integer id;

	protected String pId;

	protected LocalDateTime paymentDate;

	protected OrderStatusType status;

	protected List<OrderStatusBuilder<OrderSdkBuilder>> statuses;

	protected int substatusId;

	protected boolean paid;

	protected boolean reverseChargeVat;
	
	protected List<OrderTaxBuilder<OrderSdkBuilder>> taxes;

	public OrderSdkBuilder() {
		customTags = new ArrayList<>();
		user = new OrderUserBuilder<>(this);
		totals = new OrderTotalBuilder<>(this);
		vouchers = new ArrayList<>();
		items = new ArrayList<>();
		delivery = new OrderDeliveryBuilder<>(this);
		information = new OrderInformationBuilder<>(this);
		paymentSystem = new OrderPaymentSystemBuilder<>(this);
		additionalInformation = new ArrayList<>();
		currencies = new ArrayList<>();
		discounts = new ArrayList<>();
		statuses = new ArrayList<>();
		taxes = new ArrayList<>();
		exportStatus = ExportStatusType.PENDING_TO_SEND;
		status = OrderStatusType.INCIDENTS;
	}

	public OrderSdkBuilder comment(String comment) {
		this.comment = comment;
		return this;
	}

	public CustomTagBuilder<OrderSdkBuilder> customTag() {
		CustomTagBuilder<OrderSdkBuilder> customTag = new CustomTagBuilder<>(this);
		customTags.add(customTag);
		return customTag;
	}

	public OrderSdkBuilder language(Integer languageId) {
		this.languageId = languageId;
		return this;
	}

	public OrderUserBuilder<OrderSdkBuilder> user() {
		return user;
	}

	public OrderTotalBuilder<OrderSdkBuilder> totals() {
		return totals;
	}

	public OrderVoucherBuilder<OrderSdkBuilder> voucher() {
		OrderVoucherBuilder<OrderSdkBuilder> voucher = new OrderVoucherBuilder<>(this);
		vouchers.add(voucher);
		return voucher;
	}

	public OrderItemBuilder<OrderSdkBuilder> item() {
		OrderItemBuilder<OrderSdkBuilder> item = new OrderItemBuilder<>(this);
		items.add(item);
		return item;
	}
	
	public OrderDeliveryBuilder<OrderSdkBuilder> delivery() {
		return delivery;
	}	

	public OrderInformationBuilder<OrderSdkBuilder> information() {
		return information;
	}

	public OrderPaymentSystemBuilder<OrderSdkBuilder> paymentSystem() {
		return paymentSystem;
	}

	public OrderAdditionalInformationBuilder<OrderSdkBuilder> additionalInformation() {
		OrderAdditionalInformationBuilder<OrderSdkBuilder> additionalInfo = new OrderAdditionalInformationBuilder<>(this);
		additionalInformation.add(additionalInfo);
		return additionalInfo;
	}

	public OrderCurrencyBuilder<OrderSdkBuilder> currencies() {
		OrderCurrencyBuilder<OrderSdkBuilder> currency = new OrderCurrencyBuilder<>(this);
		currencies.add(currency);
		return currency;
	}

	public OrderSdkBuilder date(LocalDateTime date) {
		this.date = date;
		return this;
	}

	public OrderSdkBuilder deliveryDate(LocalDateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
		return this;
	}

	public OrderDiscountBuilder<OrderSdkBuilder> discounts() {
		OrderDiscountBuilder<OrderSdkBuilder> discount = new OrderDiscountBuilder<>(this);
		discounts.add(discount);
		return discount;
	}

	public OrderSdkBuilder documentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
		return this;
	}

	public OrderSdkBuilder exportStatus(ExportStatusType exportStatus) {
		this.exportStatus = exportStatus;
		return this;
	}

	public OrderSdkBuilder id(Integer id) {
		this.id = id;
		return this;
	}

	public OrderSdkBuilder pId(String pId) {
		this.pId = pId;
		return this;
	}

	public OrderSdkBuilder paymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
		return this;
	}

	public OrderSdkBuilder status(OrderStatusType status) {
		this.status = status;
		return this;
	}

	public OrderStatusBuilder<OrderSdkBuilder> statuses() {
		OrderStatusBuilder<OrderSdkBuilder> statusItem = new OrderStatusBuilder<>(this);
		statuses.add(statusItem);
		return statusItem;
	}

	public OrderSdkBuilder substatusId(int substatusId) {
		this.substatusId = substatusId;
		return this;
	}

	public OrderSdkBuilder paid(boolean paid) {
		this.paid = paid;
		return this;
	}

	public OrderSdkBuilder reverseChargeVat(boolean reverseChargeVat) {
		this.reverseChargeVat = reverseChargeVat;
		return this;
	}
	
	public OrderTaxBuilder<OrderSdkBuilder> tax() {
		OrderTaxBuilder<OrderSdkBuilder> tax = new OrderTaxBuilder<>(this);
		taxes.add(tax);
		return tax;
	}

	public Order build() {
		OrderImpl order = new OrderImpl();
		order.setComment(comment);
		order.setCustomTags(customTags.stream().map(CustomTagBuilder::build).collect(Collectors.toList()));
		order.setLanguageId(languageId);
		order.setUser(user.build());
		order.setTotals(totals.build());
		order.setVouchers(vouchers.stream().map(OrderVoucherBuilder::build).collect(Collectors.toList()));
		order.setItems(items.stream().map(OrderItemBuilder::build).collect(Collectors.toList()));
		order.setInformation(information.build());
		order.setPaymentSystem(paymentSystem.build());
		order.setAdditionalInformation(additionalInformation.stream().map(OrderAdditionalInformationBuilder::build).collect(Collectors.toList()));
		order.setCurrencies(currencies.stream().map(OrderCurrencyBuilder::build).collect(Collectors.toList()));
		order.setDate((date==null) ? LocalDateTime.now() : date);
		order.setDeliveryDate(deliveryDate);
		order.setDiscounts(discounts.stream().map(OrderDiscountBuilder::build).collect(Collectors.toList()));
		order.setDocumentNumber(documentNumber);
		order.setExportStatus(exportStatus);
		order.setId(id);
		order.setPId(pId);
		order.setPaymentDate(paymentDate);
		order.setDelivery(delivery.build());
		order.setStatus(status);
		order.setStatuses(statuses.stream().map(OrderStatusBuilder::build).collect(Collectors.toList()));
		order.setSubstatusId(substatusId);
		order.setPaid(paid);
		order.setReverseChargeVat(reverseChargeVat);
		order.setTaxes(taxes.stream().map(OrderTaxBuilder::build).collect(Collectors.toList()));
		return order;
	}
}