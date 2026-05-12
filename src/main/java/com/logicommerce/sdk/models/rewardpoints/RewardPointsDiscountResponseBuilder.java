package com.logicommerce.sdk.models.rewardpoints;

import com.logicommerce.sdk.enums.RewardPointsErrorType;

/**
 * RewardPointsDiscount model builder
 * 
 * @author LogiCommerce
 * @see RewardPointsDiscountResponse
 * @since 2.7.4
 */
public class RewardPointsDiscountResponseBuilder {

	private RewardPointsDiscount rewardPointsDiscount;

	private RewardPointsErrorType errorType;

	private boolean error;

	/**
	 * Sets error to response
	 * @param error boolean
	 * @return a {@link RewardPointsDiscountResponseBuilder} object
	 */
	public RewardPointsDiscountResponseBuilder error(boolean error) {
		this.error = error;
		return this;
	}

	/**
	 * Sets pointsSpent
	 * @param discount a {@link RewardPointsDiscount} object
	 * @return a {@link RewardPointsDiscountResponseBuilder} object
	 */
	public RewardPointsDiscountResponseBuilder discount(RewardPointsDiscount discount) {
		this.rewardPointsDiscount = discount;
		return this;
	}

	/**
	 * Sets errorType
	 * @param errorType {@link RewardPointsErrorType}
	 * @return a {@link RewardPointsDiscountResponseBuilder} object
	 */
	public RewardPointsDiscountResponseBuilder errorType(RewardPointsErrorType errorType) {
		this.errorType = errorType;
		return this;
	}

	/**
	 * Builds a {@link RewardPointsBalanceImpl} object.
	 * @return a {@link RewardPointsBalance} object
	 */
	public RewardPointsDiscountResponse build() {
		RewardPointsDiscountResponseImpl rewardPointsDiscountResponse = new RewardPointsDiscountResponseImpl();
		rewardPointsDiscountResponse.setRewardPointsDiscount(this.rewardPointsDiscount);
		rewardPointsDiscountResponse.setErrorType(this.errorType);
		rewardPointsDiscountResponse.setError(this.error);
		return rewardPointsDiscountResponse;
	}

}
