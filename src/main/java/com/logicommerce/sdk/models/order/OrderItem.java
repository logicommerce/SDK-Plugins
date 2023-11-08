package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.enums.BackorderMode;
import com.logicommerce.sdk.models.CustomTag;
import com.logicommerce.sdk.models.RowCodes;

/**
 * <p>OrderItem interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderItem {

	/**
	 * Returns the id.
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * Returns the pId.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getPId();

	/**
	 * Returns the hash.
	 * 
	 * @since 1.3.0
	 * @return a {@link java.lang.String} object
	 */
	String getHash();

	/**
	 * Returns the name.
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getName();

	/**
	 * Returns the quantity.
	 *
	 * @return a int
	 */
	int getQuantity();

	/**
	 * Returns the price.
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderItemPrices} object
	 */
	OrderItemPrices getPrices();
	
	/**
	 * Returns the weight.
	 *
	 * @return a double
	 */
	double getWeight();
	
	/**
	 * Returns a list of discounts.
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderDiscount> getDiscounts();

	/**
	 * Returns the taxes.
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderItemTax> getTaxes();

	/**
	 * Returns the options.
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderItemOption> getOptions();

	/**
	 * Returns the stocks.
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderItemStock> getStocks();

	/**
	 * Returns the customTags.
	 *
	 * @return a {@link java.util.List} object
	 */
	List<CustomTag> getCustomTags();

	/**
	 * <p>getProductId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getProductId();

	/**
	 * <p>getVinculatedTo.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getVinculatedTo();

	/**
	 * <p>getImage.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getImage();

	/**
	 * <p>isSale.</p>
	 *
	 * @return a boolean
	 */
	boolean isSale();

	/**
	 * <p>isStockManagement.</p>
	 *
	 * @return a boolean
	 */
	boolean isStockManagement();

	/**
	 * <p>isReverseChargeVat.</p>
	 *
	 * @return a boolean
	 */
	boolean isReverseChargeVat();

	/**
	 * <p>getCodes.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.RowCodes} object
	 */
	RowCodes getCodes();

	/**
	 * <p>isNoReturn.</p>
	 *
	 * @return a boolean
	 */
	boolean isNoReturn();

	/**
	 * <p>getBackOrder.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.BackorderMode} object
	 */
	BackorderMode getBackOrder();

	/**
	 * <p>isOnRequest.</p>
	 *
	 * @return a boolean
	 */
	boolean isOnRequest();

	/**
	 * <p>getOnRequestDays.</p>
	 *
	 * @return a int
	 */
	int getOnRequestDays();

	/**
	 * <p>getLink.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getLink();
	
	/**
	 * <p>setProductId.</p>
	 *
	 * @param productId a {@link java.lang.Integer} object
	 */
	void setProductId(Integer productId);
	
	/**
	 * <p>setCombinationId.</p>
	 *
	 * @param combinationId a {@link java.lang.Integer} object
	 */
	void setCombinationId(Integer combinationId);

	/**
	 * <p>getCombinationId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getCombinationId();
	
	/**
	 * <p>getSupplierReference.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getSupplierReference();
}
