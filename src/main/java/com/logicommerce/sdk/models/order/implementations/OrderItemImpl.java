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

/**
 * <p>OrderItemImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
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

	/**
	 * <p>Getter for the field <code>backOrder</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.BackorderMode} object
	 */
	public BackorderMode getBackOrder() {
		return backOrder;
	}

	/**
	 * <p>Getter for the field <code>codes</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.ProductCodes} object
	 */
	public ProductCodes getCodes() {
		return codes;
	}

	/**
	 * <p>Getter for the field <code>customTags</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	public List<CustomTag> getCustomTags() {
		return customTags;
	}

	/**
	 * <p>Getter for the field <code>discounts</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	public List<OrderDiscount> getDiscounts() {
		return discounts;
	}

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <p>Getter for the field <code>image</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getName() {
		return name;
	}

	/**
	 * <p>Getter for the field <code>onRequestDays</code>.</p>
	 *
	 * @return a int
	 */
	public int getOnRequestDays() {
		return onRequestDays;
	}

	/**
	 * <p>Getter for the field <code>options</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	public List<OrderItemOption> getOptions() {
		return options;
	}

	/**
	 * <p>Getter for the field <code>pId</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getPId() {
		return pId;
	}

	/**
	 * <p>Getter for the field <code>prices</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderItemPrices} object
	 */
	public OrderItemPrices getPrices() {
		return prices;
	}

	/**
	 * <p>Getter for the field <code>productId</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * <p>Getter for the field <code>quantity</code>.</p>
	 *
	 * @return a int
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <p>Getter for the field <code>stocks</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	public List<OrderItemStock> getStocks() {
		return stocks;
	}

	/**
	 * <p>Getter for the field <code>taxes</code>.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	public List<OrderItemTax> getTaxes() {
		return taxes;
	}

	/**
	 * <p>Getter for the field <code>vinculatedTo</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getVinculatedTo() {
		return vinculatedTo;
	}

	/**
	 * <p>Getter for the field <code>weight</code>.</p>
	 *
	 * @return a double
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * <p>isNoReturn.</p>
	 *
	 * @return a boolean
	 */
	public boolean isNoReturn() {
		return noReturn;
	}

	/**
	 * <p>isOnRequest.</p>
	 *
	 * @return a boolean
	 */
	public boolean isOnRequest() {
		return onRequest;
	}

	/**
	 * <p>isReverseChargeVat.</p>
	 *
	 * @return a boolean
	 */
	public boolean isReverseChargeVat() {
		return reverseChargeVat;
	}

	/**
	 * <p>isSale.</p>
	 *
	 * @return a boolean
	 */
	public boolean isSale() {
		return sale;
	}

	/**
	 * <p>isStockManagement.</p>
	 *
	 * @return a boolean
	 */
	public boolean isStockManagement() {
		return stockManagement;
	}

	/**
	 * <p>Getter for the field <code>link</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getLink() {
		return link;
	}

	/**
	 * <p>Setter for the field <code>backOrder</code>.</p>
	 *
	 * @param backOrder a {@link com.logicommerce.sdk.enums.BackorderMode} object
	 */
	public void setBackOrder(BackorderMode backOrder) {
		this.backOrder = backOrder;
	}

	/**
	 * <p>Setter for the field <code>codes</code>.</p>
	 *
	 * @param codes a {@link com.logicommerce.sdk.models.ProductCodes} object
	 */
	public void setCodes(ProductCodes codes) {
		this.codes = codes;
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
	 * <p>Setter for the field <code>discounts</code>.</p>
	 *
	 * @param discounts a {@link java.util.List} object
	 */
	public void setDiscounts(List<OrderDiscount> discounts) {
		this.discounts = discounts;
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
	 * <p>Setter for the field <code>image</code>.</p>
	 *
	 * @param image a {@link java.lang.String} object
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Setter for the field <code>onRequestDays</code>.</p>
	 *
	 * @param onRequestDays a int
	 */
	public void setOnRequestDays(int onRequestDays) {
		this.onRequestDays = onRequestDays;
	}

	/**
	 * <p>Setter for the field <code>options</code>.</p>
	 *
	 * @param options a {@link java.util.List} object
	 */
	public void setOptions(List<OrderItemOption> options) {
		this.options = options;
	}

	/**
	 * <p>Setter for the field <code>pId</code>.</p>
	 *
	 * @param pId a {@link java.lang.String} object
	 */
	public void setPId(String pId) {
		this.pId = pId;
	}

	/** {@inheritDoc} */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 * <p>Setter for the field <code>prices</code>.</p>
	 *
	 * @param prices a {@link com.logicommerce.sdk.models.order.OrderItemPrices} object
	 */
	public void setPrices(OrderItemPrices prices) {
		this.prices = prices;
	}

	/**
	 * <p>Setter for the field <code>quantity</code>.</p>
	 *
	 * @param quantity a int
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * <p>Setter for the field <code>stocks</code>.</p>
	 *
	 * @param stocks a {@link java.util.List} object
	 */
	public void setStocks(List<OrderItemStock> stocks) {
		this.stocks = stocks;
	}

	/**
	 * <p>Setter for the field <code>taxes</code>.</p>
	 *
	 * @param taxes a {@link java.util.List} object
	 */
	public void setTaxes(List<OrderItemTax> taxes) {
		this.taxes = taxes;
	}

	/**
	 * <p>Setter for the field <code>vinculatedTo</code>.</p>
	 *
	 * @param vinculatedTo a {@link java.lang.Integer} object
	 */
	public void setVinculatedTo(Integer vinculatedTo) {
		this.vinculatedTo = vinculatedTo;
	}

	/**
	 * <p>Setter for the field <code>weight</code>.</p>
	 *
	 * @param weight a double
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * <p>Setter for the field <code>noReturn</code>.</p>
	 *
	 * @param noReturn a boolean
	 */
	public void setNoReturn(boolean noReturn) {
		this.noReturn = noReturn;
	}

	/**
	 * <p>Setter for the field <code>onRequest</code>.</p>
	 *
	 * @param onRequest a boolean
	 */
	public void setOnRequest(boolean onRequest) {
		this.onRequest = onRequest;
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
	 * <p>Setter for the field <code>sale</code>.</p>
	 *
	 * @param sale a boolean
	 */
	public void setSale(boolean sale) {
		this.sale = sale;
	}

	/**
	 * <p>Setter for the field <code>stockManagement</code>.</p>
	 *
	 * @param stockManagement a boolean
	 */
	public void setStockManagement(boolean stockManagement) {
		this.stockManagement = stockManagement;
	}

	/**
	 * <p>Setter for the field <code>link</code>.</p>
	 *
	 * @param link a {@link java.lang.String} object
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * <p>Getter for the field <code>combinationId</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getCombinationId() {
		return combinationId;
	}

	/** {@inheritDoc} */
	public void setCombinationId(Integer combinationId) {
		this.combinationId = combinationId;
	}

	/** {@inheritDoc} */
	@Override
	public String getSupplierReference() {
		return supplierReference;
	}

	/**
	 * <p>Setter for the field <code>supplierReference</code>.</p>
	 *
	 * @param supplierReference a {@link java.lang.String} object
	 */
	public void setSupplierReference(String supplierReference) {
		this.supplierReference = supplierReference;
	}
}
