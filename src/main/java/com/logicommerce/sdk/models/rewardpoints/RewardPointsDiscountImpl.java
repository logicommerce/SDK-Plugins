package com.logicommerce.sdk.models.rewardpoints;

public class RewardPointsDiscountImpl implements RewardPointsDiscount {

	private double amount;

	private double pointsToRedeem;

	private String name;

	private String description;

	private String code;

	/** {@inheritDoc} */
	@Override
	public double getAmount() {
		return amount;
	}

	/** {@inheritDoc} */
	@Override
	public double getPointsToRedeem() {
		return pointsToRedeem;
	}

	/** {@inheritDoc} */
	@Override
	public String getName() {
		return name;
	}

	/** {@inheritDoc} */
	@Override
	public String getDescription() {
		return description;
	}

	/** {@inheritDoc} */
	@Override
	public String getCode() {
		return code;
	}

	/** {@inheritDoc} */
	@Override
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/** {@inheritDoc} */
	@Override
	public void setPointsToRedeem(double pointsToRedeem) {
		this.pointsToRedeem = pointsToRedeem;
	}

	/** {@inheritDoc} */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/** {@inheritDoc} */
	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	/** {@inheritDoc} */
	@Override
	public void setCode(String code) {
		this.code = code;
	}
}
