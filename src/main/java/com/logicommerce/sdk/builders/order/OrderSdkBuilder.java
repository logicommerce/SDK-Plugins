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

/**
 * <p>OrderSdkBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
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

	/**
	 * <p>Constructor for OrderSdkBuilder.</p>
	 */
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

	/**
	 * <p>comment.</p>
	 *
	 * @param comment a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderSdkBuilder} object
	 */
	public OrderSdkBuilder comment(String comment) {
		this.comment = comment;
		return this;
	}

	/**
	 * <p>customTag.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.CustomTagBuilder} object
	 */
	public CustomTagBuilder<OrderSdkBuilder> customTag() {
		CustomTagBuilder<OrderSdkBuilder> customTag = new CustomTagBuilder<>(this);
		customTags.add(customTag);
		return customTag;
	}

	/**
	 * <p>language.</p>
	 *
	 * @param languageId a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderSdkBuilder} object
	 */
	public OrderSdkBuilder language(Integer languageId) {
		this.languageId = languageId;
		return this;
	}

	/**
	 * <p>user.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderUserBuilder} object
	 */
	public OrderUserBuilder<OrderSdkBuilder> user() {
		return user;
	}

	/**
	 * <p>totals.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTotalBuilder} object
	 */
	public OrderTotalBuilder<OrderSdkBuilder> totals() {
		return totals;
	}

	/**
	 * <p>voucher.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderVoucherBuilder} object
	 */
	public OrderVoucherBuilder<OrderSdkBuilder> voucher() {
		OrderVoucherBuilder<OrderSdkBuilder> voucher = new OrderVoucherBuilder<>(this);
		vouchers.add(voucher);
		return voucher;
	}

	/**
	 * <p>item.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<OrderSdkBuilder> item() {
		OrderItemBuilder<OrderSdkBuilder> item = new OrderItemBuilder<>(this);
		items.add(item);
		return item;
	}
	
	/**
	 * <p>delivery.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDeliveryBuilder} object
	 */
	public OrderDeliveryBuilder<OrderSdkBuilder> delivery() {
		return delivery;
	}

	/**
	 * <p>information.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderInformationBuilder} object
	 */
	public OrderInformationBuilder<OrderSdkBuilder> information() {
		return information;
	}

	/**
	 * <p>paymentSystem.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderPaymentSystemBuilder} object
	 */
	public OrderPaymentSystemBuilder<OrderSdkBuilder> paymentSystem() {
		return paymentSystem;
	}

	/**
	 * <p>additionalInformation.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderAdditionalInformationBuilder} object
	 */
	public OrderAdditionalInformationBuilder<OrderSdkBuilder> additionalInformation() {
		OrderAdditionalInformationBuilder<OrderSdkBuilder> additionalInfo = new OrderAdditionalInformationBuilder<>(this);
		additionalInformation.add(additionalInfo);
		return additionalInfo;
	}

	/**
	 * <p>currencies.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderCurrencyBuilder} object
	 */
	public OrderCurrencyBuilder<OrderSdkBuilder> currencies() {
		OrderCurrencyBuilder<OrderSdkBuilder> currency = new OrderCurrencyBuilder<>(this);
		currencies.add(currency);
		return currency;
	}

	/**
	 * <p>date.</p>
	 *
	 * @param date a {@link java.time.LocalDateTime} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderSdkBuilder} object
	 */
	public OrderSdkBuilder date(LocalDateTime date) {
		this.date = date;
		return this;
	}

	/**
	 * <p>deliveryDate.</p>
	 *
	 * @param deliveryDate a {@link java.time.LocalDateTime} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderSdkBuilder} object
	 */
	public OrderSdkBuilder deliveryDate(LocalDateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
		return this;
	}

	/**
	 * <p>discounts.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<OrderSdkBuilder> discounts() {
		OrderDiscountBuilder<OrderSdkBuilder> discount = new OrderDiscountBuilder<>(this);
		discounts.add(discount);
		return discount;
	}

	/**
	 * <p>documentNumber.</p>
	 *
	 * @param documentNumber a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderSdkBuilder} object
	 */
	public OrderSdkBuilder documentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
		return this;
	}

	/**
	 * <p>exportStatus.</p>
	 *
	 * @param exportStatus a {@link com.logicommerce.sdk.enums.ExportStatusType} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderSdkBuilder} object
	 */
	public OrderSdkBuilder exportStatus(ExportStatusType exportStatus) {
		this.exportStatus = exportStatus;
		return this;
	}

	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderSdkBuilder} object
	 */
	public OrderSdkBuilder id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * <p>pId.</p>
	 *
	 * @param pId a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderSdkBuilder} object
	 */
	public OrderSdkBuilder pId(String pId) {
		this.pId = pId;
		return this;
	}

	/**
	 * <p>paymentDate.</p>
	 *
	 * @param paymentDate a {@link java.time.LocalDateTime} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderSdkBuilder} object
	 */
	public OrderSdkBuilder paymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
		return this;
	}

	/**
	 * <p>status.</p>
	 *
	 * @param status a {@link com.logicommerce.sdk.enums.OrderStatusType} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderSdkBuilder} object
	 */
	public OrderSdkBuilder status(OrderStatusType status) {
		this.status = status;
		return this;
	}

	/**
	 * <p>statuses.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderStatusBuilder} object
	 */
	public OrderStatusBuilder<OrderSdkBuilder> statuses() {
		OrderStatusBuilder<OrderSdkBuilder> statusItem = new OrderStatusBuilder<>(this);
		statuses.add(statusItem);
		return statusItem;
	}

	/**
	 * <p>substatusId.</p>
	 *
	 * @param substatusId a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderSdkBuilder} object
	 */
	public OrderSdkBuilder substatusId(int substatusId) {
		this.substatusId = substatusId;
		return this;
	}

	/**
	 * <p>paid.</p>
	 *
	 * @param paid a boolean
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderSdkBuilder} object
	 */
	public OrderSdkBuilder paid(boolean paid) {
		this.paid = paid;
		return this;
	}

	/**
	 * <p>reverseChargeVat.</p>
	 *
	 * @param reverseChargeVat a boolean
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderSdkBuilder} object
	 */
	public OrderSdkBuilder reverseChargeVat(boolean reverseChargeVat) {
		this.reverseChargeVat = reverseChargeVat;
		return this;
	}
	
	/**
	 * <p>tax.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderTaxBuilder} object
	 */
	public OrderTaxBuilder<OrderSdkBuilder> tax() {
		OrderTaxBuilder<OrderSdkBuilder> tax = new OrderTaxBuilder<>(this);
		taxes.add(tax);
		return tax;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.Order} object
	 */
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
		order.setAdditionalInformation(additionalInformation.stream()
				.map(OrderAdditionalInformationBuilder::build)
				.collect(Collectors.toList()));
		order.setCurrencies(currencies.stream().map(OrderCurrencyBuilder::build).collect(Collectors.toList()));
		order.setDate((date == null) ? LocalDateTime.now() : date);
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
