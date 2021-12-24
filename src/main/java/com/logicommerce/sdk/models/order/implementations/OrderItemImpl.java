package com.logicommerce.sdk.models.order.implementations;

import java.util.List;
import com.logicommerce.sdk.enums.BackorderMode;
import com.logicommerce.sdk.models.CustomTag;
import com.logicommerce.sdk.models.ProductCodes;
import com.logicommerce.sdk.models.implementations.CustomTagImpl;
import com.logicommerce.sdk.models.implementations.ProductCodesImpl;
import com.logicommerce.sdk.models.order.OrderDiscount;
import com.logicommerce.sdk.models.order.OrderItem;
import com.logicommerce.sdk.models.order.OrderItemOption;
import com.logicommerce.sdk.models.order.OrderItemPrices;
import com.logicommerce.sdk.models.order.OrderItemStock;
import com.logicommerce.sdk.models.order.OrderItemTax;
import com.logicommerce.utilities.annotations.Uses;

public class OrderItemImpl implements OrderItem {

	private Integer id;

	private String pId;

	@Uses(value = OrderItemTaxImpl.class)
	private List<OrderItemTax> taxes;

	@Uses(value = OrderItemOptionImpl.class)
	private List<OrderItemOption> options;

	@Uses(value = OrderItemStockImpl.class)
	private List<OrderItemStock> stocks;

	@Uses(value = CustomTagImpl.class)
	private List<CustomTag> customTags;

	@Uses(value = OrderDiscountImpl.class)
	private List<OrderDiscount> discounts;

	private String name;

	private int quantity;

	private Integer productId;

	private double weight;

	@Uses(value = OrderItemPricesImpl.class)
	private OrderItemPrices prices;

	private double affiliatePercentCommission;

	private Integer vinculatedTo;

	private String image;

	private boolean sale;

	private boolean stockManagement;

	private boolean reverseChargeVat;

	@Uses(value = ProductCodesImpl.class)
	private ProductCodes codes;

	private boolean noReturn;

	private BackorderMode backOrder;

	private boolean onRequest;

	private int onRequestDays;

	private String link;
	
	private Integer combinationId;
	
	private String supplierReference;

	public double getAffiliatePercentCommission() {
		return affiliatePercentCommission;
	}

	public BackorderMode getBackOrder() {
		return backOrder;
	}

	public ProductCodes getCodes() {
		return codes;
	}

	public List<CustomTag> getCustomTags() {
		return customTags;
	}

	public List<OrderDiscount> getDiscounts() {
		return discounts;
	}

	public Integer getId() {
		return id;
	}

	public String getImage() {
		return image;
	}

	public String getName() {
		return name;
	}

	public int getOnRequestDays() {
		return onRequestDays;
	}

	public List<OrderItemOption> getOptions() {
		return options;
	}

	public String getPId() {
		return pId;
	}

	public OrderItemPrices getPrices() {
		return prices;
	}

	public Integer getProductId() {
		return productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public List<OrderItemStock> getStocks() {
		return stocks;
	}

	public List<OrderItemTax> getTaxes() {
		return taxes;
	}

	public Integer getVinculatedTo() {
		return vinculatedTo;
	}

	public double getWeight() {
		return weight;
	}

	public boolean isNoReturn() {
		return noReturn;
	}

	public boolean isOnRequest() {
		return onRequest;
	}

	public boolean isReverseChargeVat() {
		return reverseChargeVat;
	}

	public boolean isSale() {
		return sale;
	}

	public boolean isStockManagement() {
		return stockManagement;
	}

	public String getLink() {
		return link;
	}

	public void setAffiliatePercentCommission(double affiliatePercentCommission) {
		this.affiliatePercentCommission = affiliatePercentCommission;
	}

	public void setBackOrder(BackorderMode backOrder) {
		this.backOrder = backOrder;
	}

	public void setCodes(ProductCodes codes) {
		this.codes = codes;
	}

	public void setCustomTags(List<CustomTag> customTags) {
		this.customTags = customTags;
	}

	public void setDiscounts(List<OrderDiscount> discounts) {
		this.discounts = discounts;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOnRequestDays(int onRequestDays) {
		this.onRequestDays = onRequestDays;
	}

	public void setOptions(List<OrderItemOption> options) {
		this.options = options;
	}

	public void setPId(String pId) {
		this.pId = pId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public void setPrices(OrderItemPrices prices) {
		this.prices = prices;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setStocks(List<OrderItemStock> stocks) {
		this.stocks = stocks;
	}

	public void setTaxes(List<OrderItemTax> taxes) {
		this.taxes = taxes;
	}

	public void setVinculatedTo(Integer vinculatedTo) {
		this.vinculatedTo = vinculatedTo;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setNoReturn(boolean noReturn) {
		this.noReturn = noReturn;
	}

	public void setOnRequest(boolean onRequest) {
		this.onRequest = onRequest;
	}

	public void setReverseChargeVat(boolean reverseChargeVat) {
		this.reverseChargeVat = reverseChargeVat;
	}

	public void setSale(boolean sale) {
		this.sale = sale;
	}

	public void setStockManagement(boolean stockManagement) {
		this.stockManagement = stockManagement;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Integer getCombinationId() {
		return combinationId;
	}

	public void setCombinationId(Integer combinationId) {
		this.combinationId = combinationId;
	}

	@Override
	public String getSupplierReference() {
		return supplierReference;
	}

	public void setSupplierReference(String supplierReference) {
		this.supplierReference = supplierReference;
	}
}
