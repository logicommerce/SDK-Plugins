package com.logicommerce.sdk.models.order;

import java.util.List;
import com.logicommerce.sdk.enums.OptionValueType;

/**
 * <p>OrderItemOption interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderItemOption {

	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * <p>getValues.</p>
	 *
	 * @return a {@link java.util.List} object
	 */
	List<OrderItemOptionValue> getValues();

	/**
	 * <p>getOptionId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getOptionId();

	/**
	 * <p>getOptionValueId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getOptionValueId();

	/**
	 * <p>getSku.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getSku();

	/**
	 * <p>getName.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getName();

	/**
	 * <p>getPrompt.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getPrompt();

	/**
	 * <p>getValue.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getValue();

	/**
	 * <p>getPrice.</p>
	 *
	 * @return a {@link java.lang.Double} object
	 */
	Double getPrice();

	/**
	 * <p>getWeight.</p>
	 *
	 * @return a double
	 */
	double getWeight();

	/**
	 * <p>isUniquePrice.</p>
	 *
	 * @return a boolean
	 */
	boolean isUniquePrice();

	/**
	 * <p>getValueType.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.OptionValueType} object
	 */
	OptionValueType getValueType();

	/**
	 * <p>getPreviousPrice.</p>
	 *
	 * @return a double
	 */
	double getPreviousPrice();

	/**
	 * <p>getProductOptionPId.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getProductOptionPId();

	/**
	 * <p>isCombinable.</p>
	 *
	 * @return a boolean
	 */
	boolean isCombinable();
}
