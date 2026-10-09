package com.logicommerce.sdk.models.order.list;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.enums.ExportStatusType;
import com.logicommerce.sdk.enums.OrderStatusType;
import com.logicommerce.sdk.models.order.OrderCurrency;

/**
 * OrderList model builder.
 *
 * @author LogiCommerce
 * @see OrderList
 * @since 2.8.5
 */
public class OrderListBuilder {

	private Integer id;

	private String pId;

	private Integer headquarterId;

	private OrderListPaymentSystem paymentSystem;

	private OrderListCustomer customer;

	private double total;

	private List<OrderCurrency> currencies = new ArrayList<>();

	private int channelId;

	private String transactionId;

	private String authNumber;

	private Integer marketplaceId;

	private Integer documentId;

	private int commerceId;

	private String documentNumber;

	private int languageId;

	private int documentIdLength;

	private LocalDateTime date;

	private OrderStatusType status;

	private Integer substatusId;

	private String prefix;

	private String suffix;

	private Integer ownerAccountId;

	private LocalDateTime deliveryDate;

	private boolean paid;

	private LocalDateTime paymentDate;

	private ExportStatusType exportStatus;

	/**
	 * Sets the id.
	 *
	 * @param id a Integer
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * Sets the pId.
	 *
	 * @param pId a String
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder pId(String pId) {
		this.pId = pId;
		return this;
	}

	/**
	 * Sets the headquarterId.
	 *
	 * @param headquarterId a Integer
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder headquarterId(Integer headquarterId) {
		this.headquarterId = headquarterId;
		return this;
	}

	/**
	 * Sets the paymentSystem.
	 *
	 * @param paymentSystem a OrderListPaymentSystem
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder paymentSystem(OrderListPaymentSystem paymentSystem) {
		this.paymentSystem = paymentSystem;
		return this;
	}

	/**
	 * Sets the customer.
	 *
	 * @param customer a OrderListCustomer
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder customer(OrderListCustomer customer) {
		this.customer = customer;
		return this;
	}

	/**
	 * Sets the total.
	 *
	 * @param total a double
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder total(double total) {
		this.total = total;
		return this;
	}

	/**
	 * Sets the currencies.
	 *
	 * @param currencies a List of OrderCurrency
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder currencies(List<OrderCurrency> currencies) {
		this.currencies = new ArrayList<>(currencies);
		return this;
	}

	/**
	 * Sets the channelId.
	 *
	 * @param channelId a int
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder channelId(int channelId) {
		this.channelId = channelId;
		return this;
	}

	/**
	 * Sets the transactionId.
	 *
	 * @param transactionId a String
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder transactionId(String transactionId) {
		this.transactionId = transactionId;
		return this;
	}

	/**
	 * Sets the authNumber.
	 *
	 * @param authNumber a String
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder authNumber(String authNumber) {
		this.authNumber = authNumber;
		return this;
	}

	/**
	 * Sets the marketplaceId.
	 *
	 * @param marketplaceId a Integer
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder marketplaceId(Integer marketplaceId) {
		this.marketplaceId = marketplaceId;
		return this;
	}

	/**
	 * Sets the documentId.
	 *
	 * @param documentId a Integer
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder documentId(Integer documentId) {
		this.documentId = documentId;
		return this;
	}

	/**
	 * Sets the commerceId.
	 *
	 * @param commerceId a int
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder commerceId(int commerceId) {
		this.commerceId = commerceId;
		return this;
	}

	/**
	 * Sets the documentNumber.
	 *
	 * @param documentNumber a String
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder documentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
		return this;
	}

	/**
	 * Sets the languageId.
	 *
	 * @param languageId a int
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder languageId(int languageId) {
		this.languageId = languageId;
		return this;
	}

	/**
	 * Sets the documentIdLength.
	 *
	 * @param documentIdLength a int
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder documentIdLength(int documentIdLength) {
		this.documentIdLength = documentIdLength;
		return this;
	}

	/**
	 * Sets the date.
	 *
	 * @param date a LocalDateTime
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder date(LocalDateTime date) {
		this.date = date;
		return this;
	}

	/**
	 * Sets the status.
	 *
	 * @param status a OrderStatusType
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder status(OrderStatusType status) {
		this.status = status;
		return this;
	}

	/**
	 * Sets the substatusId.
	 *
	 * @param substatusId a Integer
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder substatusId(Integer substatusId) {
		this.substatusId = substatusId;
		return this;
	}

	/**
	 * Sets the prefix.
	 *
	 * @param prefix a String
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder prefix(String prefix) {
		this.prefix = prefix;
		return this;
	}

	/**
	 * Sets the suffix.
	 *
	 * @param suffix a String
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder suffix(String suffix) {
		this.suffix = suffix;
		return this;
	}

	/**
	 * Sets the ownerAccountId.
	 *
	 * @param ownerAccountId a Integer
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder ownerAccountId(Integer ownerAccountId) {
		this.ownerAccountId = ownerAccountId;
		return this;
	}

	/**
	 * Sets the deliveryDate.
	 *
	 * @param deliveryDate a LocalDateTime
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder deliveryDate(LocalDateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
		return this;
	}

	/**
	 * Sets the paid.
	 *
	 * @param paid a boolean
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder paid(boolean paid) {
		this.paid = paid;
		return this;
	}

	/**
	 * Sets the paymentDate.
	 *
	 * @param paymentDate a LocalDateTime
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder paymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
		return this;
	}

	/**
	 * Sets the exportStatus.
	 *
	 * @param exportStatus a ExportStatusType
	 * @return a {@link OrderListBuilder} object
	 */
	public OrderListBuilder exportStatus(ExportStatusType exportStatus) {
		this.exportStatus = exportStatus;
		return this;
	}

	/**
	 * Builds a {@link OrderListImpl} object.
	 *
	 * @return a {@link OrderList} object
	 */
	public OrderList build() {
		OrderListImpl orderList = new OrderListImpl();
		orderList.setId(id);
		orderList.setPId(pId);
		orderList.setHeadquarterId(headquarterId);
		orderList.setPaymentSystem(paymentSystem);
		orderList.setCustomer(customer);
		orderList.setTotal(total);
		orderList.setCurrencies(new ArrayList<>(currencies));
		orderList.setChannelId(channelId);
		orderList.setTransactionId(transactionId);
		orderList.setAuthNumber(authNumber);
		orderList.setMarketplaceId(marketplaceId);
		orderList.setDocumentId(documentId);
		orderList.setCommerceId(commerceId);
		orderList.setDocumentNumber(documentNumber);
		orderList.setLanguageId(languageId);
		orderList.setDocumentIdLength(documentIdLength);
		orderList.setDate(date);
		orderList.setStatus(status);
		orderList.setSubstatusId(substatusId);
		orderList.setPrefix(prefix);
		orderList.setSuffix(suffix);
		orderList.setOwnerAccountId(ownerAccountId);
		orderList.setDeliveryDate(deliveryDate);
		orderList.setPaid(paid);
		orderList.setPaymentDate(paymentDate);
		orderList.setExportStatus(exportStatus);
		return orderList;
	}

}
