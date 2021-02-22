package com.logicommerce.sdk.models.order;

import java.time.LocalDateTime;
import com.logicommerce.sdk.enums.BenefitMode;
import com.logicommerce.sdk.enums.CalculationMode;
import com.logicommerce.sdk.enums.DiscountApplyTo;
import com.logicommerce.sdk.enums.DiscountType;

public interface OrderDiscount {

	int getDiscountType();

	Integer getId();

	String getName();

	String getDescription();

	DiscountApplyTo getApplyTo();

	DiscountType getDiscountTypeValue();

	Double getDiscountValue();

	Integer getMinCondition();

	Integer getMaxCondition();

	String getTicketCode();

	LocalDateTime getExpiryDate();

	Double getAmount();

	Integer getDiscountId();

	String getTriggeredBy();

	boolean getAccumulateProducts();

	CalculationMode getCalculationMode();

	BenefitMode getBenefitMode();

}
