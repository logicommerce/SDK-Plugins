package com.logicommerce.sdk.models.order.implementations;

import java.time.LocalDateTime;
import com.logicommerce.sdk.enums.BenefitMode;
import com.logicommerce.sdk.enums.CalculationMode;
import com.logicommerce.sdk.enums.DiscountApplyTo;
import com.logicommerce.sdk.enums.DiscountType;
import com.logicommerce.sdk.models.order.OrderDiscount;

public class OrderDiscountImpl implements OrderDiscount {

	private int discountType;

	private Integer id;

	private String name;

	private String description;

	private DiscountApplyTo applyTo;

	private DiscountType discountTypeValue;

	private Double discountValue;

	private Integer minCondition;

	private Integer maxCondition;

	private String ticketCode;

	private LocalDateTime expiryDate;

	private Double amount;

	private Integer discountId;

	private String triggeredBy;

	private boolean accumulateProducts;

	private CalculationMode calculationMode;

	private BenefitMode benefitMode;

	public int getDiscountType() {
		return discountType;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public DiscountApplyTo getApplyTo() {
		return applyTo;
	}

	public DiscountType getDiscountTypeValue() {
		return discountTypeValue;
	}

	public Double getDiscountValue() {
		return discountValue;
	}

	public Integer getMinCondition() {
		return minCondition;
	}

	public Integer getMaxCondition() {
		return maxCondition;
	}

	public String getTicketCode() {
		return ticketCode;
	}

	public LocalDateTime getExpiryDate() {
		return expiryDate;
	}

	public Double getAmount() {
		return amount;
	}

	public Integer getDiscountId() {
		return discountId;
	}

	public String getTriggeredBy() {
		return triggeredBy;
	}

	public boolean getAccumulateProducts() {
		return accumulateProducts;
	}

	public CalculationMode getCalculationMode() {
		return calculationMode;
	}

	public BenefitMode getBenefitMode() {
		return benefitMode;
	}

	public void setDiscountType(int discountType) {
		this.discountType = discountType;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setApplyTo(DiscountApplyTo applyTo) {
		this.applyTo = applyTo;
	}

	public void setDiscountTypeValue(DiscountType discountTypeValue) {
		this.discountTypeValue = discountTypeValue;
	}

	public void setDiscountValue(Double discountValue) {
		this.discountValue = discountValue;
	}

	public void setMinCondition(Integer minCondition) {
		this.minCondition = minCondition;
	}

	public void setMaxCondition(Integer maxCondition) {
		this.maxCondition = maxCondition;
	}

	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

	public void setExpiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}

	public void setTriggeredBy(String triggeredBy) {
		this.triggeredBy = triggeredBy;
	}

	public void setAccumulateProducts(boolean accumulateProducts) {
		this.accumulateProducts = accumulateProducts;
	}

	public void setCalculationMode(CalculationMode calculationMode) {
		this.calculationMode = calculationMode;
	}

	public void setBenefitMode(BenefitMode benefitMode) {
		this.benefitMode = benefitMode;
	}
}