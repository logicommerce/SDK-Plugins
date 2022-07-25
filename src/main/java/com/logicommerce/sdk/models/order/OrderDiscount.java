package com.logicommerce.sdk.models.order;

import java.time.LocalDateTime;
import com.logicommerce.sdk.enums.BenefitMode;
import com.logicommerce.sdk.enums.CalculationMode;
import com.logicommerce.sdk.enums.DiscountApplyTo;
import com.logicommerce.sdk.enums.DiscountType;

/**
 * <p>OrderDiscount interface.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public interface OrderDiscount {

	/**
	 * <p>getDiscountType.</p>
	 *
	 * @return a int
	 */
	int getDiscountType();

	/**
	 * <p>getId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getId();

	/**
	 * <p>getName.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getName();

	/**
	 * <p>getDescription.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getDescription();

	/**
	 * <p>getApplyTo.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.DiscountApplyTo} object
	 */
	DiscountApplyTo getApplyTo();

	/**
	 * <p>getDiscountTypeValue.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.DiscountType} object
	 */
	DiscountType getDiscountTypeValue();

	/**
	 * <p>getDiscountValue.</p>
	 *
	 * @return a {@link java.lang.Double} object
	 */
	Double getDiscountValue();

	/**
	 * <p>getMinCondition.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getMinCondition();

	/**
	 * <p>getMaxCondition.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getMaxCondition();

	/**
	 * <p>getTicketCode.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getTicketCode();

	/**
	 * <p>getExpiryDate.</p>
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	LocalDateTime getExpiryDate();

	/**
	 * <p>getAmount.</p>
	 *
	 * @return a {@link java.lang.Double} object
	 */
	Double getAmount();

	/**
	 * <p>getDiscountId.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	Integer getDiscountId();

	/**
	 * <p>getTriggeredBy.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	String getTriggeredBy();

	/**
	 * <p>getAccumulateProducts.</p>
	 *
	 * @return a boolean
	 */
	boolean getAccumulateProducts();

	/**
	 * <p>getCalculationMode.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.CalculationMode} object
	 */
	CalculationMode getCalculationMode();

	/**
	 * <p>getBenefitMode.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.BenefitMode} object
	 */
	BenefitMode getBenefitMode();

}
