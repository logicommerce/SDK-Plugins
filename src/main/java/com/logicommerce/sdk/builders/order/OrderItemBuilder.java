package com.logicommerce.sdk.builders.order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.builders.CustomTagBuilder;
import com.logicommerce.sdk.builders.RowCodesBuilder;
import com.logicommerce.sdk.enums.BackorderMode;
import com.logicommerce.sdk.models.order.OrderItem;
import com.logicommerce.sdk.models.order.implementations.OrderItemImpl;

/**
 * <p>OrderItemBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderItemBuilder<T> {

	private T parentBuilder;

	private Integer id;
	
	private String pId;

	private String hash;

	private List<OrderItemTaxBuilder<OrderItemBuilder<T>>> taxes;

	private List<OrderItemOptionBuilder<OrderItemBuilder<T>>> options;

	private List<OrderItemStockBuilder<OrderItemBuilder<T>>> stocks;

	private List<CustomTagBuilder<OrderItemBuilder<T>>> customTags;

	private List<OrderDiscountBuilder<OrderItemBuilder<T>>> discounts;

	private String name;

	private int quantity;

	private Integer productId;

	private double weight;

	private OrderItemPricesBuilder<OrderItemBuilder<T>> prices;

	private Integer vinculatedTo;

	private String image;

	private boolean sale;

	private boolean stockManagement;

	private boolean reverseChargeVat;
	
	private RowCodesBuilder<OrderItemBuilder<T>> codes;

	private boolean noReturn;

	private BackorderMode backOrder;

	private boolean onRequest;

	private int onRequestDays;
	
	private String supplierReference;

	/**
	 * <p>Constructor for OrderItemBuilder.</p>
	 */
	public OrderItemBuilder() {
		taxes = new ArrayList<>();
		options = new ArrayList<>();
		stocks = new ArrayList<>();
		customTags = new ArrayList<>();
		discounts = new ArrayList<>();
		prices = new OrderItemPricesBuilder<>(this);
		codes = new RowCodesBuilder<>(this);
		backOrder = BackorderMode.NONE;
	}

	/**
	 * <p>Constructor for OrderItemBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderItemBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * <p>pId.</p>
	 *
	 * @param pId a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<T> pId(String pId) {
		this.pId = pId;
		return this;
	}

	/**
	 * <p>hash.</p>
	 *
	 * @param hash a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<T> hash(String hash) {
		this.hash = hash;
		return this;
	}

	/**
	 * <p>taxes.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemTaxBuilder} object
	 */
	public OrderItemTaxBuilder<OrderItemBuilder<T>> taxes() {
		OrderItemTaxBuilder<OrderItemBuilder<T>> tax = new OrderItemTaxBuilder<>(this);
		taxes.add(tax);
		return tax;
	}

	/**
	 * <p>options.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemOptionBuilder} object
	 */
	public OrderItemOptionBuilder<OrderItemBuilder<T>> options() {
		OrderItemOptionBuilder<OrderItemBuilder<T>> option = new OrderItemOptionBuilder<>(this);
		options.add(option);
		return option;
	}

	/**
	 * <p>stocks.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemStockBuilder} object
	 */
	public OrderItemStockBuilder<OrderItemBuilder<T>> stocks() {
		OrderItemStockBuilder<OrderItemBuilder<T>> stock = new OrderItemStockBuilder<>(this);
		stocks.add(stock);
		return stock;
	}

	/**
	 * <p>customTag.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.CustomTagBuilder} object
	 */
	public CustomTagBuilder<OrderItemBuilder<T>> customTag() {
		CustomTagBuilder<OrderItemBuilder<T>> customTag = new CustomTagBuilder<>(this);
		customTags.add(customTag);
		return customTag;
	}

	/**
	 * <p>discount.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<OrderItemBuilder<T>> discount() {
		OrderDiscountBuilder<OrderItemBuilder<T>> discount = new OrderDiscountBuilder<>(this);
		discounts.add(discount);
		return discount;
	}

	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * <p>quantity.</p>
	 *
	 * @param quantity a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<T> quantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	/**
	 * <p>productId.</p>
	 *
	 * @param productId a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<T> productId(Integer productId) {
		this.productId = productId;
		return this;
	}

	/**
	 * <p>weight.</p>
	 *
	 * @param weight a double
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<T> weight(double weight) {
		this.weight = weight;
		return this;
	}

	/**
	 * <p>prices.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemPricesBuilder} object
	 */
	public OrderItemPricesBuilder<OrderItemBuilder<T>> prices() {
		return prices;
	}

	/**
	 * <p>vinculatedTo.</p>
	 *
	 * @param vinculatedTo a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<T> vinculatedTo(Integer vinculatedTo) {
		this.vinculatedTo = vinculatedTo;
		return this;
	}

	/**
	 * <p>image.</p>
	 *
	 * @param image a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<T> image(String image) {
		this.image = image;
		return this;
	}

	/**
	 * <p>sale.</p>
	 *
	 * @param sale a boolean
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<T> sale(boolean sale) {
		this.sale = sale;
		return this;
	}

	/**
	 * <p>stockManagement.</p>
	 *
	 * @param stockManagement a boolean
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<T> stockManagement(boolean stockManagement) {
		this.stockManagement = stockManagement;
		return this;
	}

	/**
	 * <p>reverseChargeVat.</p>
	 *
	 * @param reverseChargeVat a boolean
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<T> reverseChargeVat(boolean reverseChargeVat) {
		this.reverseChargeVat = reverseChargeVat;
		return this;
	}
	
	/**
	 * <p>codes.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.builders.RowCodesBuilder} object
	 */
	public RowCodesBuilder<OrderItemBuilder<T>> codes() {
		return codes;
	}

	/**
	 * <p>noReturn.</p>
	 *
	 * @param noReturn a boolean
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<T> noReturn(boolean noReturn) {
		this.noReturn = noReturn;
		return this;
	}

	/**
	 * <p>backOrder.</p>
	 *
	 * @param backOrder a {@link com.logicommerce.sdk.enums.BackorderMode} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<T> backOrder(BackorderMode backOrder) {
		this.backOrder = backOrder;
		return this;
	}

	/**
	 * <p>onRequest.</p>
	 *
	 * @param onRequest a boolean
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<T> onRequest(boolean onRequest) {
		this.onRequest = onRequest;
		return this;
	}

	/**
	 * <p>onRequestDays.</p>
	 *
	 * @param onRequestDays a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<T> onRequestDays(int onRequestDays) {
		this.onRequestDays = onRequestDays;
		return this;
	}
	
	/**
	 * <p>supplierReference.</p>
	 *
	 * @param supplierReference a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderItemBuilder} object
	 */
	public OrderItemBuilder<T> supplierReference(String supplierReference) {
		this.supplierReference = supplierReference;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderItem} object
	 */
	public OrderItem build() {
		OrderItemImpl item = new OrderItemImpl();
		if (id != null) {
			item.setId(id);
		}
		item.setId(null);
		item.setPId(pId);
		item.setHash(hash);
		item.setTaxes(taxes.stream().map(OrderItemTaxBuilder::build).collect(Collectors.toList()));
		item.setOptions(options.stream().map(OrderItemOptionBuilder::build).collect(Collectors.toList()));
		item.setStocks(stocks.stream().map(OrderItemStockBuilder::build).collect(Collectors.toList()));
		item.setCustomTags(customTags.stream().map(CustomTagBuilder::build).collect(Collectors.toList()));
		item.setDiscounts(discounts.stream().map(OrderDiscountBuilder::build).collect(Collectors.toList()));
		item.setName(name);
		item.setQuantity(quantity);
		item.setProductId(productId);
		item.setWeight(weight);
		item.setPrices(prices.build());
		item.setVinculatedTo(vinculatedTo);
		item.setImage(image);
		item.setSale(sale);
		item.setStockManagement(stockManagement);
		item.setReverseChargeVat(reverseChargeVat);
		item.setCodes(codes.build());
		item.setNoReturn(noReturn);
		item.setBackOrder(backOrder);
		item.setOnRequest(onRequest);
		item.setOnRequestDays(onRequestDays);
		item.setSupplierReference(supplierReference);
		return item;
	}

	/**
	 * Returns the parent builder.
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
