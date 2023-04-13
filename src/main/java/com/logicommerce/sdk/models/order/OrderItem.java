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
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * <p>getPId.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getPId();

	/**
	 * <p>getName.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getName();

	/**
	 * <p>getQuantity.</p>
	 *
	 * @return a int
	 */
	int getQuantity();

	/**
	 * <p>getPrices.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderItemPrices} object
	 */
	OrderItemPrices getPrices();
	
	/**
	 * <p>getWeight.</p>
	 *
	 * @return a double
	 */
	double getWeight();
	
	/**
	 * <p>getDiscounts.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderDiscount> getDiscounts();

	/**
	 * <p>getTaxes.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderItemTax> getTaxes();

	/**
	 * <p>getOptions.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderItemOption> getOptions();

	/**
	 * <p>getStocks.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderItemStock> getStocks();

	/**
	 * <p>getCustomTags.</p>
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
	 * <p>getRowCodes.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.RowCodes} object
	 */
	RowCodes getRowCodes();

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
