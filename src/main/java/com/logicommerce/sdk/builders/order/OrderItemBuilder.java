package com.logicommerce.sdk.builders.order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.logicommerce.sdk.builders.CustomTagBuilder;
import com.logicommerce.sdk.builders.ProductCodesBuilder;
import com.logicommerce.sdk.enums.BackorderMode;
import com.logicommerce.sdk.models.order.OrderItem;
import com.logicommerce.sdk.models.order.implementations.OrderItemImpl;

public class OrderItemBuilder<T> {

	private T parentBuilder;

	protected Integer id;
	
	protected String pId;

	protected List<OrderItemTaxBuilder<OrderItemBuilder<T>>> taxes;

	protected List<OrderItemOptionBuilder<OrderItemBuilder<T>>> options;

	protected List<OrderItemStockBuilder<OrderItemBuilder<T>>> stocks;

	protected List<CustomTagBuilder<OrderItemBuilder<T>>> customTags;

	protected List<OrderDiscountBuilder<OrderItemBuilder<T>>> discounts;

	protected String name;

	protected int quantity;

	protected Integer productId;

	protected double weight;

	protected OrderItemPricesBuilder<OrderItemBuilder<T>> prices;

	protected double affiliatePercentCommission;

	protected Integer vinculatedTo;

	protected String image;

	protected boolean sale;

	protected boolean stockManagement;

	protected boolean reverseChargeVat;

	protected ProductCodesBuilder<OrderItemBuilder<T>> codes;

	protected boolean noReturn;

	protected BackorderMode backOrder;

	protected boolean onRequest;

	protected int onRequestDays;

	public OrderItemBuilder() {
		taxes = new ArrayList<>();
		options = new ArrayList<>();
		stocks = new ArrayList<>();
		customTags = new ArrayList<>();
		discounts = new ArrayList<>();
		prices = new OrderItemPricesBuilder<>(this);
		codes = new ProductCodesBuilder<>(this);
		backOrder = BackorderMode.NONE;
	}

	public OrderItemBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}

	public OrderItemBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	public OrderItemBuilder<T> pId(String pId) {
		this.pId = pId;
		return this;
	}

	public OrderItemTaxBuilder<OrderItemBuilder<T>> taxes() {
		OrderItemTaxBuilder<OrderItemBuilder<T>> tax = new OrderItemTaxBuilder<>(this);
		taxes.add(tax);
		return tax;
	}

	public OrderItemOptionBuilder<OrderItemBuilder<T>> options() {
		OrderItemOptionBuilder<OrderItemBuilder<T>> option = new OrderItemOptionBuilder<>(this);
		options.add(option);
		return option;
	}

	public OrderItemStockBuilder<OrderItemBuilder<T>> stocks() {
		OrderItemStockBuilder<OrderItemBuilder<T>> stock = new OrderItemStockBuilder<>(this);
		stocks.add(stock);
		return stock;
	}

	public CustomTagBuilder<OrderItemBuilder<T>> customTag() {
		CustomTagBuilder<OrderItemBuilder<T>> customTag = new CustomTagBuilder<>(this);
		customTags.add(customTag);
		return customTag;
	}

	public OrderDiscountBuilder<OrderItemBuilder<T>> discount() {
		OrderDiscountBuilder<OrderItemBuilder<T>> discount = new OrderDiscountBuilder<>(this);
		discounts.add(discount);
		return discount;
	}

	public OrderItemBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	public OrderItemBuilder<T> quantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	public OrderItemBuilder<T> productId(Integer productId) {
		this.productId = productId;
		return this;
	}

	public OrderItemBuilder<T> weight(double weight) {
		this.weight = weight;
		return this;
	}

	public OrderItemPricesBuilder<OrderItemBuilder<T>> prices() {
		return prices;
	}

	public OrderItemBuilder<T> affiliatePercentCommission(double affiliatePercentCommission) {
		this.affiliatePercentCommission = affiliatePercentCommission;
		return this;
	}

	public OrderItemBuilder<T> vinculatedTo(Integer vinculatedTo) {
		this.vinculatedTo = vinculatedTo;
		return this;
	}

	public OrderItemBuilder<T> image(String image) {
		this.image = image;
		return this;
	}

	public OrderItemBuilder<T> sale(boolean sale) {
		this.sale = sale;
		return this;
	}

	public OrderItemBuilder<T> stockManagement(boolean stockManagement) {
		this.stockManagement = stockManagement;
		return this;
	}

	public OrderItemBuilder<T> reverseChargeVat(boolean reverseChargeVat) {
		this.reverseChargeVat = reverseChargeVat;
		return this;
	}

	public ProductCodesBuilder<OrderItemBuilder<T>> codes() {
		return codes;
	}

	public OrderItemBuilder<T> noReturn(boolean noReturn) {
		this.noReturn = noReturn;
		return this;
	}

	public OrderItemBuilder<T> backOrder(BackorderMode backOrder) {
		this.backOrder = backOrder;
		return this;
	}

	public OrderItemBuilder<T> onRequest(boolean onRequest) {
		this.onRequest = onRequest;
		return this;
	}

	public OrderItemBuilder<T> onRequestDays(int onRequestDays) {
		this.onRequestDays = onRequestDays;
		return this;
	}

	public OrderItem build() {
		OrderItemImpl item = new OrderItemImpl();
		item.setId(null);
		item.setPId(pId);
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
		item.setAffiliatePercentCommission(affiliatePercentCommission);
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
		return item;
	}

	public T done() {
		return parentBuilder;
	}
}