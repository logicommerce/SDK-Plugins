package com.logicommerce.sdk.models.rewardpoints;

/**
 * RewardPointsDiscount model builder
 * 
 * @author LogiCommerce
 * @see RewardPointsDiscount
 * @since 2.7.4
 */
public class RewardPointsDiscountBuilder {

	private double amount;

	private double pointsToRedeem;

	private String name;

	private String description;

	private String code;

	/**
	 * Sets amount to discount
	 * @param amount double
	 * @return a {@link RewardPointsDiscountBuilder} object
	 */
	public RewardPointsDiscountBuilder amount(double amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Sets pointsToRedeem
	 * @param pointsToRedeem double
	 * @return a {@link RewardPointsDiscountBuilder} object
	 */
	public RewardPointsDiscountBuilder pointsToRedeem(double pointsToRedeem) {
		this.pointsToRedeem = pointsToRedeem;
		return this;
	}

	/**
	 * Sets name
	 * @param name String
	 * @return a {@link RewardPointsDiscountBuilder} object
	 */
	public RewardPointsDiscountBuilder name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Sets description
	 * @param description String
	 * @return a {@link RewardPointsDiscountBuilder} object
	 */
	public RewardPointsDiscountBuilder description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * 	Sets code
	 * @param code String
	 * @return a {@link RewardPointsDiscountBuilder} object
	 */
	public RewardPointsDiscountBuilder code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * Builds a {@link RewardPointsBalanceImpl} object.
	 * @return a {@link RewardPointsBalance} object
	 */
	public RewardPointsDiscount build() {
		RewardPointsDiscountImpl rewardPointsDiscount = new RewardPointsDiscountImpl();
		rewardPointsDiscount.setAmount(amount);
		rewardPointsDiscount.setPointsToRedeem(pointsToRedeem);
		rewardPointsDiscount.setName(name);
		rewardPointsDiscount.setDescription(description);
		rewardPointsDiscount.setCode(code);
		return rewardPointsDiscount;
	}

}
