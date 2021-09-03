package com.logicommerce.sdk.builders.order;

import java.time.LocalDateTime;
import com.logicommerce.sdk.enums.BenefitMode;
import com.logicommerce.sdk.enums.CalculationMode;
import com.logicommerce.sdk.enums.DiscountApplyTo;
import com.logicommerce.sdk.enums.DiscountType;
import com.logicommerce.sdk.models.order.OrderDiscount;
import com.logicommerce.sdk.models.order.implementations.OrderDiscountImpl;

public class OrderDiscountBuilder<T> {

	private T parentBuilder;
	
	protected Integer id;

	protected int discountType;

	protected String name;

	protected String description;

	protected DiscountApplyTo applyTo;

	protected DiscountType discountTypeValue;

	protected Double discountValue;

	protected Integer minCondition;

	protected Integer maxCondition;

	protected String ticketCode;

	protected LocalDateTime expiryDate;

	protected Double amount;

	protected Integer discountId;

	protected String triggeredBy;

	protected boolean accumulateProducts;

	protected CalculationMode calculationMode;

	protected BenefitMode benefitMode;

	public OrderDiscountBuilder() {

	}

	public OrderDiscountBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	public OrderDiscountBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	public OrderDiscountBuilder<T> discountType(int discountType) {
		this.discountType = discountType;
		return this;
	}

	public OrderDiscountBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	public OrderDiscountBuilder<T> description(String description) {
		this.description = description;
		return this;
	}

	public OrderDiscountBuilder<T> applyTo(DiscountApplyTo applyTo) {
		this.applyTo = applyTo;
		return this;
	}

	public OrderDiscountBuilder<T> discountTypeValue(DiscountType discountTypeValue) {
		this.discountTypeValue = discountTypeValue;
		return this;
	}

	public OrderDiscountBuilder<T> discountValue(Double discountValue) {
		this.discountValue = discountValue;
		return this;
	}

	public OrderDiscountBuilder<T> minCondition(Integer minCondition) {
		this.minCondition = minCondition;
		return this;
	}

	public OrderDiscountBuilder<T> maxCondition(Integer maxCondition) {
		this.maxCondition = maxCondition;
		return this;
	}

	public OrderDiscountBuilder<T> ticketCode(String ticketCode) {
		this.ticketCode = ticketCode;
		return this;
	}

	public OrderDiscountBuilder<T> expiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	public OrderDiscountBuilder<T> amount(Double amount) {
		this.amount = amount;
		return this;
	}

	public OrderDiscountBuilder<T> discountId(Integer discountId) {
		this.discountId = discountId;
		return this;
	}

	public OrderDiscountBuilder<T> triggeredBy(String triggeredBy) {
		this.triggeredBy = triggeredBy;
		return this;
	}

	public OrderDiscountBuilder<T> accumulateProducts(boolean accumulateProducts) {
		this.accumulateProducts = accumulateProducts;
		return this;
	}

	public OrderDiscountBuilder<T> calculationMode(CalculationMode calculationMode) {
		this.calculationMode = calculationMode;
		return this;
	}

	public OrderDiscountBuilder<T> benefitMode(BenefitMode benefitMode) {
		this.benefitMode = benefitMode;
		return this;
	}

	public OrderDiscount build() {
		OrderDiscountImpl discount = new OrderDiscountImpl();
		discount.setId(null);
		discount.setDiscountType(discountType);
		discount.setName(name);
		discount.setDescription(description);
		discount.setApplyTo(applyTo);
		discount.setDiscountTypeValue(discountTypeValue);
		discount.setDiscountValue(discountValue);
		discount.setMinCondition(minCondition);
		discount.setMaxCondition(maxCondition);
		discount.setTicketCode(ticketCode);
		discount.setExpiryDate(expiryDate);
		discount.setAmount(amount);
		discount.setDiscountId(discountId);
		discount.setTriggeredBy(triggeredBy);
		discount.setAccumulateProducts(accumulateProducts);
		discount.setCalculationMode(calculationMode);
		discount.setBenefitMode(benefitMode);
		return discount;
	}

	public T done() {
		return parentBuilder;
	}
}