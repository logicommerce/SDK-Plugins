package com.logicommerce.sdk.builders.order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.builders.CustomTagBuilder;
import com.logicommerce.sdk.enums.ExportStatusType;
import com.logicommerce.sdk.models.order.implementations.DocumentImpl;

/**
 * Document Sdk Builder.
 * 
 * @author LogiCommerce
 * @since 1.3.0
 */
public abstract class DocumentSdkBuilder<T extends DocumentSdkBuilder<T>> {
	
	protected String comment;

	protected List<CustomTagBuilder<T>> customTags;

	protected Integer languageId;

	protected OrderUserBuilder<T> user;

	protected OrderTotalBuilder<T> totals;

	protected List<OrderVoucherBuilder<T>> vouchers;

	protected List<OrderItemBuilder<T>> items;

	protected OrderDeliveryBuilder<T> delivery;

	protected OrderInformationBuilder<T> information;

	protected OrderPaymentSystemBuilder<T> paymentSystem;

	protected List<OrderAdditionalInformationBuilder<T>> additionalInformation;

	protected List<OrderCurrencyBuilder<T>> currencies;

	protected LocalDateTime date;

	protected LocalDateTime deliveryDate;

	protected List<OrderDiscountBuilder<T>> discounts;

	protected String documentNumber;

	protected ExportStatusType exportStatus;

	protected Integer id;

	protected String pId;

	protected LocalDateTime paymentDate;

	protected List<OrderStatusBuilder<T>> statuses;

	protected boolean paid;

	protected boolean reverseChargeVat;

	protected List<OrderTaxBuilder<T>> taxes;

	/**
	 * <p>Constructor for DocumentSdkBuilder.</p>
	 */
	public DocumentSdkBuilder() {
		customTags = new ArrayList<>();
		user = new OrderUserBuilder<>(returnThis());
		totals = new OrderTotalBuilder<>(returnThis());
		vouchers = new ArrayList<>();
		items = new ArrayList<>();
		delivery = new OrderDeliveryBuilder<>(returnThis());
		information = new OrderInformationBuilder<>(returnThis());
		paymentSystem = new OrderPaymentSystemBuilder<>(returnThis());
		additionalInformation = new ArrayList<>();
		currencies = new ArrayList<>();
		discounts = new ArrayList<>();
		statuses = new ArrayList<>();
		taxes = new ArrayList<>();
		exportStatus = ExportStatusType.PENDING_TO_SEND;
	}

	/**
	 * <p>comment.</p>
	 *
	 * @param comment a {@link java.lang.String} object
	 * @return a T object
	 */
	public T comment(String comment) {
		this.comment = comment;
		return returnThis();
	}

	/**
	 * <p>customTag.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.CustomTagBuilder} object
	 */
	public CustomTagBuilder<T> customTag() {
		CustomTagBuilder<T> customTag = new CustomTagBuilder<>(returnThis());
		customTags.add(customTag);
		return customTag;
	}

	/**
	 * <p>language.</p>
	 *
	 * @param languageId a {@link java.lang.Integer} object
	 * @return a T object
	 */
	public T language(Integer languageId) {
		this.languageId = languageId;
		return returnThis();
	}

	/**
	 * <p>user.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderUserBuilder} object
	 */
	public OrderUserBuilder<T> user() {
		return user;
	}

	/**
	 * <p>totals.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTotalBuilder} object
	 */
	public OrderTotalBuilder<T> totals() {
		return totals;
	}

	/**
	 * <p>voucher.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderVoucherBuilder} object
	 */
	public OrderVoucherBuilder<T> voucher() {
		OrderVoucherBuilder<T> voucher = new OrderVoucherBuilder<>(returnThis());
		vouchers.add(voucher);
		return voucher;
	}

	/**
	 * <p>item.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<T> item() {
		OrderItemBuilder<T> item = new OrderItemBuilder<>(returnThis());
		items.add(item);
		return item;
	}
	
	/**
	 * <p>delivery.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDeliveryBuilder} object
	 */
	public OrderDeliveryBuilder<T> delivery() {
		return delivery;
	}

	/**
	 * <p>information.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderInformationBuilder} object
	 */
	public OrderInformationBuilder<T> information() {
		return information;
	}

	/**
	 * <p>paymentSystem.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderPaymentSystemBuilder} object
	 */
	public OrderPaymentSystemBuilder<T> paymentSystem() {
		return paymentSystem;
	}

	/**
	 * <p>additionalInformation.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderAdditionalInformationBuilder} object
	 */
	public OrderAdditionalInformationBuilder<T> additionalInformation() {
		OrderAdditionalInformationBuilder<T> additionalInfo = new OrderAdditionalInformationBuilder<>(returnThis());
		additionalInformation.add(additionalInfo);
		return additionalInfo;
	}

	/**
	 * <p>currencies.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderCurrencyBuilder} object
	 */
	public OrderCurrencyBuilder<T> currencies() {
		OrderCurrencyBuilder<T> currency = new OrderCurrencyBuilder<>(returnThis());
		currencies.add(currency);
		return currency;
	}

	/**
	 * <p>date.</p>
	 *
	 * @param date a {@link java.time.LocalDateTime} object
	 * @return a T object
	 */
	public T date(LocalDateTime date) {
		this.date = date;
		return returnThis();
	}

	/**
	 * <p>deliveryDate.</p>
	 *
	 * @param deliveryDate a {@link java.time.LocalDateTime} object
	 * @return a T object
	 */
	public T deliveryDate(LocalDateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
		return returnThis();
	}

	/**
	 * <p>discounts.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<T> discounts() {
		OrderDiscountBuilder<T> discount = new OrderDiscountBuilder<>(returnThis());
		discounts.add(discount);
		return discount;
	}

	/**
	 * <p>documentNumber.</p>
	 *
	 * @param documentNumber a {@link java.lang.String} object
	 * @return a T object
	 */
	public T documentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
		return returnThis();
	}

	/**
	 * <p>exportStatus.</p>
	 *
	 * @param exportStatus a {@link com.logicommerce.sdk.enums.ExportStatusType} object
	 * @return a T object
	 */
	public T exportStatus(ExportStatusType exportStatus) {
		this.exportStatus = exportStatus;
		return returnThis();
	}

	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a T object
	 */
	public T id(Integer id) {
		this.id = id;
		return returnThis();
	}

	/**
	 * <p>pId.</p>
	 *
	 * @param pId a {@link java.lang.String} object
	 * @return a T object
	 */
	public T pId(String pId) {
		this.pId = pId;
		return returnThis();
	}

	/**
	 * <p>paymentDate.</p>
	 *
	 * @param paymentDate a {@link java.time.LocalDateTime} object
	 * @return a T object
	 */
	public T paymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
		return returnThis();
	}

	/**
	 * <p>statuses.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderStatusBuilder} object
	 */
	public OrderStatusBuilder<T> statuses() {
		OrderStatusBuilder<T> statusItem = new OrderStatusBuilder<>(returnThis());
		statuses.add(statusItem);
		return statusItem;
	}

	/**
	 * <p>paid.</p>
	 *
	 * @param paid a boolean
	 * @return a T object
	 */
	public T paid(boolean paid) {
		this.paid = paid;
		return returnThis();
	}

	/**
	 * <p>reverseChargeVat.</p>
	 *
	 * @param reverseChargeVat a boolean
	 * @return a T object
	 */
	public T reverseChargeVat(boolean reverseChargeVat) {
		this.reverseChargeVat = reverseChargeVat;
		return returnThis();
	}
	
	/**
	 * <p>tax.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTaxBuilder} object
	 */
	public OrderTaxBuilder<T> tax() {
		OrderTaxBuilder<T> tax = new OrderTaxBuilder<>(returnThis());
		taxes.add(tax);
		return tax;
	}

	/**
	 * Set the fields of the document.
	 * 
	 * @param document a {@link com.logicommerce.sdk.models.order.implementations.DocumentImpl} 
	 */
	public void setFields(DocumentImpl document) {
		document.setComment(comment);
		document.setCustomTags(customTags.stream().map(CustomTagBuilder::build).collect(Collectors.toList()));
		document.setLanguageId(languageId);
		document.setUser(user.build());
		document.setTotals(totals.build());
		document.setVouchers(vouchers.stream().map(OrderVoucherBuilder::build).collect(Collectors.toList()));
		document.setItems(items.stream().map(OrderItemBuilder::build).collect(Collectors.toList()));
		document.setInformation(information.build());
		document.setPaymentSystem(paymentSystem.build());
		document.setAdditionalInformation(additionalInformation.stream()
				.map(OrderAdditionalInformationBuilder::build)
				.collect(Collectors.toList()));
		document.setCurrencies(currencies.stream().map(OrderCurrencyBuilder::build).collect(Collectors.toList()));
		document.setDate((date == null) ? LocalDateTime.now() : date);
		document.setDeliveryDate(deliveryDate);
		document.setDiscounts(discounts.stream().map(OrderDiscountBuilder::build).collect(Collectors.toList()));
		document.setDocumentNumber(documentNumber);
		document.setExportStatus(exportStatus);
		document.setId(id);
		document.setPId(pId);
		document.setPaymentDate(paymentDate);
		document.setDelivery(delivery.build());
		document.setStatuses(statuses.stream().map(OrderStatusBuilder::build).collect(Collectors.toList()));
		document.setPaid(paid);
		document.setReverseChargeVat(reverseChargeVat);
		document.setTaxes(taxes.stream().map(OrderTaxBuilder::build).collect(Collectors.toList()));
	}

	/**
	 * <p>returnThis.</p>
	 *
	 * @return a T object
	 */
	public abstract T returnThis();

}
