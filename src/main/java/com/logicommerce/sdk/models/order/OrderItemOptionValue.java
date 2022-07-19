package com.logicommerce.sdk.models.order;

/**
 * <p>OrderItemOptionValue interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderItemOptionValue {

	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * <p>getProductOptionValueId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getProductOptionValueId();

	/**
	 * <p>getSku.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getSku();

	/**
	 * <p>getWeight.</p>
	 *
	 * @return a double
	 */
	double getWeight();

	/**
	 * <p>getPrice.</p>
	 *
	 * @return a double
	 */
	double getPrice();

	/**
	 * <p>getPreviousPrice.</p>
	 *
	 * @return a double
	 */
	double getPreviousPrice();

	/**
	 * <p>getValue.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getValue();

	/**
	 * <p>getOptionValuePId.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getOptionValuePId();

	/**
	 * <p>isNoReturn.</p>
	 *
	 * @return a boolean
	 */
	boolean isNoReturn();

}
