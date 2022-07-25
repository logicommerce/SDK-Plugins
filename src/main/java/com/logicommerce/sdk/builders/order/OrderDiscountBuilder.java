package com.logicommerce.sdk.builders.order;

import java.time.LocalDateTime;
import com.logicommerce.sdk.enums.BenefitMode;
import com.logicommerce.sdk.enums.CalculationMode;
import com.logicommerce.sdk.enums.DiscountApplyTo;
import com.logicommerce.sdk.enums.DiscountType;
import com.logicommerce.sdk.models.order.OrderDiscount;
import com.logicommerce.sdk.models.order.implementations.OrderDiscountImpl;

/**
 * <p>OrderDiscountBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
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

	/**
	 * <p>Constructor for OrderDiscountBuilder.</p>
	 */
	public OrderDiscountBuilder() {

	}

	/**
	 * <p>Constructor for OrderDiscountBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public OrderDiscountBuilder(T parentBuilder) {
		this();
		this.parentBuilder = parentBuilder;
	}
	
	/**
	 * <p>id.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<T> id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * <p>discountType.</p>
	 *
	 * @param discountType a int
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<T> discountType(int discountType) {
		this.discountType = discountType;
		return this;
	}

	/**
	 * <p>name.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<T> name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * <p>description.</p>
	 *
	 * @param description a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<T> description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * <p>applyTo.</p>
	 *
	 * @param applyTo a {@link com.logicommerce.sdk.enums.DiscountApplyTo} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<T> applyTo(DiscountApplyTo applyTo) {
		this.applyTo = applyTo;
		return this;
	}

	/**
	 * <p>discountTypeValue.</p>
	 *
	 * @param discountTypeValue a {@link com.logicommerce.sdk.enums.DiscountType} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<T> discountTypeValue(DiscountType discountTypeValue) {
		this.discountTypeValue = discountTypeValue;
		return this;
	}

	/**
	 * <p>discountValue.</p>
	 *
	 * @param discountValue a {@link java.lang.Double} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<T> discountValue(Double discountValue) {
		this.discountValue = discountValue;
		return this;
	}

	/**
	 * <p>minCondition.</p>
	 *
	 * @param minCondition a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<T> minCondition(Integer minCondition) {
		this.minCondition = minCondition;
		return this;
	}

	/**
	 * <p>maxCondition.</p>
	 *
	 * @param maxCondition a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<T> maxCondition(Integer maxCondition) {
		this.maxCondition = maxCondition;
		return this;
	}

	/**
	 * <p>ticketCode.</p>
	 *
	 * @param ticketCode a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<T> ticketCode(String ticketCode) {
		this.ticketCode = ticketCode;
		return this;
	}

	/**
	 * <p>expiryDate.</p>
	 *
	 * @param expiryDate a {@link java.time.LocalDateTime} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<T> expiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	/**
	 * <p>amount.</p>
	 *
	 * @param amount a {@link java.lang.Double} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<T> amount(Double amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * <p>discountId.</p>
	 *
	 * @param discountId a {@link java.lang.Integer} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<T> discountId(Integer discountId) {
		this.discountId = discountId;
		return this;
	}

	/**
	 * <p>triggeredBy.</p>
	 *
	 * @param triggeredBy a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<T> triggeredBy(String triggeredBy) {
		this.triggeredBy = triggeredBy;
		return this;
	}

	/**
	 * <p>accumulateProducts.</p>
	 *
	 * @param accumulateProducts a boolean
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<T> accumulateProducts(boolean accumulateProducts) {
		this.accumulateProducts = accumulateProducts;
		return this;
	}

	/**
	 * <p>calculationMode.</p>
	 *
	 * @param calculationMode a {@link com.logicommerce.sdk.enums.CalculationMode} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<T> calculationMode(CalculationMode calculationMode) {
		this.calculationMode = calculationMode;
		return this;
	}

	/**
	 * <p>benefitMode.</p>
	 *
	 * @param benefitMode a {@link com.logicommerce.sdk.enums.BenefitMode} object
	 * @return a {@link com.logicommerce.sdk.builders.order.OrderDiscountBuilder} object
	 */
	public OrderDiscountBuilder<T> benefitMode(BenefitMode benefitMode) {
		this.benefitMode = benefitMode;
		return this;
	}

	/**
	 * <p>build.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.order.OrderDiscount} object
	 */
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

	/**
	 * <p>done.</p>
	 *
	 * @return a T object
	 */
	public T done() {
		return parentBuilder;
	}
}
