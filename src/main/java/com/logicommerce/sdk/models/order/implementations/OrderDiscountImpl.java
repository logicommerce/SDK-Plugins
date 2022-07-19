package com.logicommerce.sdk.models.order.implementations;

import java.time.LocalDateTime;
import com.logicommerce.sdk.enums.BenefitMode;
import com.logicommerce.sdk.enums.CalculationMode;
import com.logicommerce.sdk.enums.DiscountApplyTo;
import com.logicommerce.sdk.enums.DiscountType;
import com.logicommerce.sdk.models.order.OrderDiscount;

/**
 * <p>OrderDiscountImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
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

	/**
	 * <p>Getter for the field <code>discountType</code>.</p>
	 *
	 * @return a int
	 */
	public int getDiscountType() {
		return discountType;
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
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getName() {
		return name;
	}

	/**
	 * <p>Getter for the field <code>description</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <p>Getter for the field <code>applyTo</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.DiscountApplyTo} object
	 */
	public DiscountApplyTo getApplyTo() {
		return applyTo;
	}

	/**
	 * <p>Getter for the field <code>discountTypeValue</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.DiscountType} object
	 */
	public DiscountType getDiscountTypeValue() {
		return discountTypeValue;
	}

	/**
	 * <p>Getter for the field <code>discountValue</code>.</p>
	 *
	 * @return a {@link java.lang.Double} object
	 */
	public Double getDiscountValue() {
		return discountValue;
	}

	/**
	 * <p>Getter for the field <code>minCondition</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getMinCondition() {
		return minCondition;
	}

	/**
	 * <p>Getter for the field <code>maxCondition</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getMaxCondition() {
		return maxCondition;
	}

	/**
	 * <p>Getter for the field <code>ticketCode</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getTicketCode() {
		return ticketCode;
	}

	/**
	 * <p>Getter for the field <code>expiryDate</code>.</p>
	 *
	 * @return a {@link java.time.LocalDateTime} object
	 */
	public LocalDateTime getExpiryDate() {
		return expiryDate;
	}

	/**
	 * <p>Getter for the field <code>amount</code>.</p>
	 *
	 * @return a {@link java.lang.Double} object
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * <p>Getter for the field <code>discountId</code>.</p>
	 *
	 * @return a {@link java.lang.Integer} object
	 */
	public Integer getDiscountId() {
		return discountId;
	}

	/**
	 * <p>Getter for the field <code>triggeredBy</code>.</p>
	 *
	 * @return a {@link java.lang.String} object
	 */
	public String getTriggeredBy() {
		return triggeredBy;
	}

	/**
	 * <p>Getter for the field <code>accumulateProducts</code>.</p>
	 *
	 * @return a boolean
	 */
	public boolean getAccumulateProducts() {
		return accumulateProducts;
	}

	/**
	 * <p>Getter for the field <code>calculationMode</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.CalculationMode} object
	 */
	public CalculationMode getCalculationMode() {
		return calculationMode;
	}

	/**
	 * <p>Getter for the field <code>benefitMode</code>.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.enums.BenefitMode} object
	 */
	public BenefitMode getBenefitMode() {
		return benefitMode;
	}

	/**
	 * <p>Setter for the field <code>discountType</code>.</p>
	 *
	 * @param discountType a int
	 */
	public void setDiscountType(int discountType) {
		this.discountType = discountType;
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
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Setter for the field <code>description</code>.</p>
	 *
	 * @param description a {@link java.lang.String} object
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * <p>Setter for the field <code>applyTo</code>.</p>
	 *
	 * @param applyTo a {@link com.logicommerce.sdk.enums.DiscountApplyTo} object
	 */
	public void setApplyTo(DiscountApplyTo applyTo) {
		this.applyTo = applyTo;
	}

	/**
	 * <p>Setter for the field <code>discountTypeValue</code>.</p>
	 *
	 * @param discountTypeValue a {@link com.logicommerce.sdk.enums.DiscountType} object
	 */
	public void setDiscountTypeValue(DiscountType discountTypeValue) {
		this.discountTypeValue = discountTypeValue;
	}

	/**
	 * <p>Setter for the field <code>discountValue</code>.</p>
	 *
	 * @param discountValue a {@link java.lang.Double} object
	 */
	public void setDiscountValue(Double discountValue) {
		this.discountValue = discountValue;
	}

	/**
	 * <p>Setter for the field <code>minCondition</code>.</p>
	 *
	 * @param minCondition a {@link java.lang.Integer} object
	 */
	public void setMinCondition(Integer minCondition) {
		this.minCondition = minCondition;
	}

	/**
	 * <p>Setter for the field <code>maxCondition</code>.</p>
	 *
	 * @param maxCondition a {@link java.lang.Integer} object
	 */
	public void setMaxCondition(Integer maxCondition) {
		this.maxCondition = maxCondition;
	}

	/**
	 * <p>Setter for the field <code>ticketCode</code>.</p>
	 *
	 * @param ticketCode a {@link java.lang.String} object
	 */
	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

	/**
	 * <p>Setter for the field <code>expiryDate</code>.</p>
	 *
	 * @param expiryDate a {@link java.time.LocalDateTime} object
	 */
	public void setExpiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * <p>Setter for the field <code>amount</code>.</p>
	 *
	 * @param amount a {@link java.lang.Double} object
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * <p>Setter for the field <code>discountId</code>.</p>
	 *
	 * @param discountId a {@link java.lang.Integer} object
	 */
	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}

	/**
	 * <p>Setter for the field <code>triggeredBy</code>.</p>
	 *
	 * @param triggeredBy a {@link java.lang.String} object
	 */
	public void setTriggeredBy(String triggeredBy) {
		this.triggeredBy = triggeredBy;
	}

	/**
	 * <p>Setter for the field <code>accumulateProducts</code>.</p>
	 *
	 * @param accumulateProducts a boolean
	 */
	public void setAccumulateProducts(boolean accumulateProducts) {
		this.accumulateProducts = accumulateProducts;
	}

	/**
	 * <p>Setter for the field <code>calculationMode</code>.</p>
	 *
	 * @param calculationMode a {@link com.logicommerce.sdk.enums.CalculationMode} object
	 */
	public void setCalculationMode(CalculationMode calculationMode) {
		this.calculationMode = calculationMode;
	}

	/**
	 * <p>Setter for the field <code>benefitMode</code>.</p>
	 *
	 * @param benefitMode a {@link com.logicommerce.sdk.enums.BenefitMode} object
	 */
	public void setBenefitMode(BenefitMode benefitMode) {
		this.benefitMode = benefitMode;
	}
}
