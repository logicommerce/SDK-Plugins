package com.logicommerce.sdk.models.order.list;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.logicommerce.sdk.enums.ExportStatusType;
import com.logicommerce.sdk.enums.OrderStatusType;
import com.logicommerce.sdk.models.order.OrderCurrency;
import com.logicommerce.sdk.models.order.implementations.OrderCurrencyImpl;
import com.logicommerce.utilities.annotations.Uses;

/**
 * OrderList implementation.
 *
 * @author LogiCommerce
 * @see OrderList
 * @since 2.8.5
 */
public class OrderListImpl implements OrderList {

	private Integer id;

	private String pId;

	private Integer headquarterId;

	@Uses(value = OrderListPaymentSystemImpl.class)
	private OrderListPaymentSystem paymentSystem;

	@Uses(value = OrderListCustomerImpl.class)
	private OrderListCustomer customer;

	private double total;

	@Uses(value = OrderCurrencyImpl.class)
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

	/** {@inheritDoc} */
	@Override
	public Integer getId() {
		return id;
	}

	/** {@inheritDoc} */
	@Override
	public String getPId() {
		return pId;
	}

	/** {@inheritDoc} */
	@Override
	public Integer getHeadquarterId() {
		return headquarterId;
	}

	/** {@inheritDoc} */
	@Override
	public OrderListPaymentSystem getPaymentSystem() {
		return paymentSystem;
	}

	/** {@inheritDoc} */
	@Override
	public OrderListCustomer getCustomer() {
		return customer;
	}

	/** {@inheritDoc} */
	@Override
	public double getTotal() {
		return total;
	}

	/** {@inheritDoc} */
	@Override
	public List<OrderCurrency> getCurrencies() {
		return currencies;
	}

	/** {@inheritDoc} */
	@Override
	public int getChannelId() {
		return channelId;
	}

	/** {@inheritDoc} */
	@Override
	public String getTransactionId() {
		return transactionId;
	}

	/** {@inheritDoc} */
	@Override
	public String getAuthNumber() {
		return authNumber;
	}

	/** {@inheritDoc} */
	@Override
	public Integer getMarketplaceId() {
		return marketplaceId;
	}

	/** {@inheritDoc} */
	@Override
	public Integer getDocumentId() {
		return documentId;
	}

	/** {@inheritDoc} */
	@Override
	public int getCommerceId() {
		return commerceId;
	}

	/** {@inheritDoc} */
	@Override
	public String getDocumentNumber() {
		return documentNumber;
	}

	/** {@inheritDoc} */
	@Override
	public int getLanguageId() {
		return languageId;
	}

	/** {@inheritDoc} */
	@Override
	public int getDocumentIdLength() {
		return documentIdLength;
	}

	/** {@inheritDoc} */
	@Override
	public LocalDateTime getDate() {
		return date;
	}

	/** {@inheritDoc} */
	@Override
	public OrderStatusType getStatus() {
		return status;
	}

	/** {@inheritDoc} */
	@Override
	public Integer getSubstatusId() {
		return substatusId;
	}

	/** {@inheritDoc} */
	@Override
	public String getPrefix() {
		return prefix;
	}

	/** {@inheritDoc} */
	@Override
	public String getSuffix() {
		return suffix;
	}

	/** {@inheritDoc} */
	@Override
	public Integer getOwnerAccountId() {
		return ownerAccountId;
	}

	/** {@inheritDoc} */
	@Override
	public LocalDateTime getDeliveryDate() {
		return deliveryDate;
	}

	/** {@inheritDoc} */
	@Override
	public boolean isPaid() {
		return paid;
	}

	/** {@inheritDoc} */
	@Override
	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	/** {@inheritDoc} */
	@Override
	public ExportStatusType getExportStatus() {
		return exportStatus;
	}

	/**
	 * Sets the id.
	 *
	 * @param id a Integer
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Sets the pId.
	 *
	 * @param pId a String
	 */
	public void setPId(String pId) {
		this.pId = pId;
	}

	/**
	 * Sets the headquarterId.
	 *
	 * @param headquarterId a Integer
	 */
	public void setHeadquarterId(Integer headquarterId) {
		this.headquarterId = headquarterId;
	}

	/**
	 * Sets the paymentSystem.
	 *
	 * @param paymentSystem a OrderListPaymentSystem
	 */
	public void setPaymentSystem(OrderListPaymentSystem paymentSystem) {
		this.paymentSystem = paymentSystem;
	}

	/**
	 * Sets the customer.
	 *
	 * @param customer a OrderListCustomer
	 */
	public void setCustomer(OrderListCustomer customer) {
		this.customer = customer;
	}

	/**
	 * Sets the total.
	 *
	 * @param total a double
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/**
	 * Sets the currencies.
	 *
	 * @param currencies a List of OrderCurrency
	 */
	public void setCurrencies(List<OrderCurrency> currencies) {
		this.currencies = currencies;
	}

	/**
	 * Sets the channelId.
	 *
	 * @param channelId a int
	 */
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	/**
	 * Sets the transactionId.
	 *
	 * @param transactionId a String
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * Sets the authNumber.
	 *
	 * @param authNumber a String
	 */
	public void setAuthNumber(String authNumber) {
		this.authNumber = authNumber;
	}

	/**
	 * Sets the marketplaceId.
	 *
	 * @param marketplaceId a Integer
	 */
	public void setMarketplaceId(Integer marketplaceId) {
		this.marketplaceId = marketplaceId;
	}

	/**
	 * Sets the documentId.
	 *
	 * @param documentId a Integer
	 */
	public void setDocumentId(Integer documentId) {
		this.documentId = documentId;
	}

	/**
	 * Sets the commerceId.
	 *
	 * @param commerceId a int
	 */
	public void setCommerceId(int commerceId) {
		this.commerceId = commerceId;
	}

	/**
	 * Sets the documentNumber.
	 *
	 * @param documentNumber a String
	 */
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	/**
	 * Sets the languageId.
	 *
	 * @param languageId a int
	 */
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	/**
	 * Sets the documentIdLength.
	 *
	 * @param documentIdLength a int
	 */
	public void setDocumentIdLength(int documentIdLength) {
		this.documentIdLength = documentIdLength;
	}

	/**
	 * Sets the date.
	 *
	 * @param date a LocalDateTime
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	/**
	 * Sets the status.
	 *
	 * @param status a OrderStatusType
	 */
	public void setStatus(OrderStatusType status) {
		this.status = status;
	}

	/**
	 * Sets the substatusId.
	 *
	 * @param substatusId a Integer
	 */
	public void setSubstatusId(Integer substatusId) {
		this.substatusId = substatusId;
	}

	/**
	 * Sets the prefix.
	 *
	 * @param prefix a String
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	/**
	 * Sets the suffix.
	 *
	 * @param suffix a String
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	/**
	 * Sets the ownerAccountId.
	 *
	 * @param ownerAccountId a Integer
	 */
	public void setOwnerAccountId(Integer ownerAccountId) {
		this.ownerAccountId = ownerAccountId;
	}

	/**
	 * Sets the deliveryDate.
	 *
	 * @param deliveryDate a LocalDateTime
	 */
	public void setDeliveryDate(LocalDateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	/**
	 * Sets the paid.
	 *
	 * @param paid a boolean
	 */
	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	/**
	 * Sets the paymentDate.
	 *
	 * @param paymentDate a LocalDateTime
	 */
	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	/**
	 * Sets the exportStatus.
	 *
	 * @param exportStatus a ExportStatusType
	 */
	public void setExportStatus(ExportStatusType exportStatus) {
		this.exportStatus = exportStatus;
	}

}
