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

/**
 * <p>OrderImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
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

	private Integer documentId;

	private LocalDateTime paymentDate;

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

	/**
	 * <p>Getter for the field <code>additionalInformation</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	@Override
	public List<OrderAdditionalInformation> getAdditionalInformation() {
		return additionalInformation;
	}

	/**
	 * <p>Getter for the field <code>properties</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	@Override
	public List<ElementProperty> getProperties() {
		return properties;
	}

	/** {@inheritDoc} */
	@Override
	public void addProperty(ElementProperty property) {
		if (properties == null) {
			properties = new ArrayList<>();
		}
		properties.add(property);
	}

	/** {@inheritDoc} */
	@Override
	public void addProperty(String name, String value) {
		if (name == null || value == null) {
			return;
		}
		addProperty(new ElementProperyImpl(name, value));
	}

	/**
	 * <p>Getter for the field <code>comment</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <p>Getter for the field <code>currencies</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	@Override
	public List<OrderCurrency> getCurrencies() {
		return currencies;
	}

	/**
	 * <p>Getter for the field <code>customTags</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	@Override
	public List<CustomTag> getCustomTags() {
		return customTags;
	}

	/**
	 * <p>Getter for the field <code>date</code>.</p>
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	@Override
	public LocalDateTime getDate() {
		return date;
	}

	/**
	 * <p>Getter for the field <code>deliveryDate</code>.</p>
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	@Override
	public LocalDateTime getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * <p>Getter for the field <code>discounts</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	@Override
	public List<OrderDiscount> getDiscounts() {
		return discounts;
	}

	/**
	 * <p>Getter for the field <code>documentNumber</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@Override
	public String getDocumentNumber() {
		return documentNumber;
	}

	/**
	 * <p>Getter for the field <code>exportStatus</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.ExportStatusType} object
	 */
	@Override
	public ExportStatusType getExportStatus() {
		return exportStatus;
	}

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/**
	 * <p>Getter for the field <code>items</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	@Override
	public List<OrderItem> getItems() {
		return items;
	}

	/**
	 * <p>Getter for the field <code>languageId</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	@Override
	public Integer getLanguageId() {

		return languageId;
	}

	/**
	 * <p>Getter for the field <code>pId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@Override
	public String getPId() {
		return pId;
	}

	/**
	 * <p>Getter for the field <code>documentId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	@Override
	public Integer getDocumentId() {
		return documentId;
	}

	/**
	 * <p>Getter for the field <code>paymentDate</code>.</p>
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	@Override
	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	/**
	 * <p>Getter for the field <code>information</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderInformation} object
	 */
	@Override
	public OrderInformation getInformation() {
		return information;
	}

	/**
	 * <p>Getter for the field <code>paymentSystem</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderPaymentSystem} object
	 */
	@Override
	public OrderPaymentSystem getPaymentSystem() {
		return paymentSystem;
	}

	/**
	 * <p>Getter for the field <code>status</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.OrderStatusType} object
	 */
	@Override
	public OrderStatusType getStatus() {
		return status;
	}

	/**
	 * <p>Getter for the field <code>statuses</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	@Override
	public List<OrderStatus> getStatuses() {
		return statuses;
	}

	/**
	 * <p>Getter for the field <code>substatusId</code>.</p>
	 *
	 * @return a int
	 */
	@Override
	public int getSubstatusId() {
		return substatusId;
	}

	/**
	 * <p>Getter for the field <code>taxes</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	@Override
	public List<OrderTax> getTaxes() {
		return taxes;
	}

	/**
	 * <p>Getter for the field <code>totals</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderTotal} object
	 */
	@Override
	public OrderTotal getTotals() {
		return totals;
	}

	/**
	 * <p>Getter for the field <code>user</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderUser} object
	 */
	@Override
	public OrderUser getUser() {
		return user;
	}

	/**
	 * <p>Getter for the field <code>delivery</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderDelivery} object
	 */
	@Override
	public OrderDelivery getDelivery() {
		return delivery;
	}

	/**
	 * <p>Getter for the field <code>vouchers</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	@Override
	public List<OrderVoucher> getVouchers() {
		return vouchers;
	}

	/**
	 * <p>isPaid.</p>
	 *
	 * @return a boolean
	 */
	@Override
	public boolean isPaid() {
		return paid;
	}

	/**
	 * <p>isReverseChargeVat.</p>
	 *
	 * @return a boolean
	 */
	@Override
	public boolean isReverseChargeVat() {
		return reverseChargeVat;
	}

	/**
	 * <p>Setter for the field <code>comment</code>.</p>
	 *
	 * @param comment a {@link java.lang.String} object
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * <p>Setter for the field <code>customTags</code>.</p>
	 *
	 * @param customTags a {@link java.util.List} object
	 */
	public void setCustomTags(List<CustomTag> customTags) {
		this.customTags = customTags;
	}

	/**
	 * <p>Setter for the field <code>languageId</code>.</p>
	 *
	 * @param languageId a {@link java.lang.Integer} object
	 */
	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	/**
	 * <p>Setter for the field <code>user</code>.</p>
	 *
	 * @param user a {@link com.logicommerce.sdk.models.order.OrderUser} object
	 */
	public void setUser(OrderUser user) {
		this.user = user;
	}

	/**
	 * <p>Setter for the field <code>totals</code>.</p>
	 *
	 * @param totals a {@link com.logicommerce.sdk.models.order.OrderTotal} object
	 */
	public void setTotals(OrderTotal totals) {
		this.totals = totals;
	}

	/**
	 * <p>Setter for the field <code>vouchers</code>.</p>
	 *
	 * @param vouchers a {@link java.util.List} object
	 */
	public void setVouchers(List<OrderVoucher> vouchers) {
		this.vouchers = vouchers;
	}

	/**
	 * <p>Setter for the field <code>items</code>.</p>
	 *
	 * @param items a {@link java.util.List} object
	 */
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	/**
	 * <p>Setter for the field <code>paymentSystem</code>.</p>
	 *
	 * @param paymentSystem a {@link com.logicommerce.sdk.models.order.OrderPaymentSystem} object
	 */
	public void setPaymentSystem(OrderPaymentSystem paymentSystem) {
		this.paymentSystem = paymentSystem;
	}

	/**
	 * <p>Setter for the field <code>additionalInformation</code>.</p>
	 *
	 * @param additionalInformation a {@link java.util.List} object
	 */
	public void setAdditionalInformation(List<OrderAdditionalInformation> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	/**
	 * <p>Setter for the field <code>currencies</code>.</p>
	 *
	 * @param currencies a {@link java.util.List} object
	 */
	public void setCurrencies(List<OrderCurrency> currencies) {
		this.currencies = currencies;
	}

	/**
	 * <p>Setter for the field <code>date</code>.</p>
	 *
	 * @param date a {@link java.time.LocalDateTime} object
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	/**
	 * <p>Setter for the field <code>deliveryDate</code>.</p>
	 *
	 * @param deliveryDate a {@link java.time.LocalDateTime} object
	 */
	public void setDeliveryDate(LocalDateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	/**
	 * <p>Setter for the field <code>discounts</code>.</p>
	 *
	 * @param discounts a {@link java.util.List} object
	 */
	public void setDiscounts(List<OrderDiscount> discounts) {
		this.discounts = discounts;
	}

	/**
	 * <p>Setter for the field <code>documentNumber</code>.</p>
	 *
	 * @param documentNumber a {@link java.lang.String} object
	 */
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	/**
	 * <p>Setter for the field <code>exportStatus</code>.</p>
	 *
	 * @param exportStatus a {@link com.logicommerce.sdk.enums.ExportStatusType} object
	 */
	public void setExportStatus(ExportStatusType exportStatus) {
		this.exportStatus = exportStatus;
	}

	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * <p>Setter for the field <code>pId</code>.</p>
	 *
	 * @param pId a {@link java.lang.String} object
	 */
	public void setPId(String pId) {
		this.pId = pId;
	}

	/**
	 * <p>Setter for the field <code>paymentDate</code>.</p>
	 *
	 * @param paymentDate a {@link java.time.LocalDateTime} object
	 */
	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	/**
	 * <p>Setter for the field <code>delivery</code>.</p>
	 *
	 * @param delivery a {@link com.logicommerce.sdk.models.order.OrderDelivery} object
	 */
	public void setDelivery(OrderDelivery delivery) {
		this.delivery = delivery;
	}

	/**
	 * <p>Setter for the field <code>status</code>.</p>
	 *
	 * @param status a {@link com.logicommerce.sdk.enums.OrderStatusType} object
	 */
	public void setStatus(OrderStatusType status) {
		this.status = status;
	}

	/**
	 * <p>Setter for the field <code>statuses</code>.</p>
	 *
	 * @param statuses a {@link java.util.List} object
	 */
	public void setStatuses(List<OrderStatus> statuses) {
		this.statuses = statuses;
	}

	/**
	 * <p>Setter for the field <code>substatusId</code>.</p>
	 *
	 * @param substatusId a int
	 */
	public void setSubstatusId(int substatusId) {
		this.substatusId = substatusId;
	}

	/**
	 * <p>Setter for the field <code>paid</code>.</p>
	 *
	 * @param paid a boolean
	 */
	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	/**
	 * <p>Setter for the field <code>reverseChargeVat</code>.</p>
	 *
	 * @param reverseChargeVat a boolean
	 */
	public void setReverseChargeVat(boolean reverseChargeVat) {
		this.reverseChargeVat = reverseChargeVat;
	}

	/**
	 * <p>Setter for the field <code>information</code>.</p>
	 *
	 * @param information a {@link com.logicommerce.sdk.models.order.OrderInformation} object
	 */
	public void setInformation(OrderInformation information) {
		this.information = information;
	}

	/**
	 * <p>cleanProperties.</p>
	 */
	public void cleanProperties() {
		this.properties = null;
	}

	/**
	 * <p>Setter for the field <code>taxes</code>.</p>
	 *
	 * @param taxes a {@link java.util.List} object
	 */
	public void setTaxes(List<OrderTax> taxes) {
		this.taxes = taxes;
	}
}
