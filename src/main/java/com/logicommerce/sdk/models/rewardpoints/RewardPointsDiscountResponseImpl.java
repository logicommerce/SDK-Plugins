package com.logicommerce.sdk.models.rewardpoints;

import com.logicommerce.sdk.enums.RewardPointsErrorType;

/**
 * RewardPointsDiscountResponse Implementation
 *
 * @author LogiCommerce
 * @see RewardPointsDiscountResponse
 * @see RewardPointsDiscount
 * @see RewardPointsErrorType
 *
 * @since 2.7.4
 */
public class RewardPointsDiscountResponseImpl implements RewardPointsDiscountResponse {

	private RewardPointsDiscount rewardPointsDiscount;

	private RewardPointsErrorType errorType;

	private boolean error;

	/** {@inheritDoc} */
	@Override
	public RewardPointsErrorType getErrorType() {
		return errorType;
	}

	/**
	 * set Error Type of the response
	 * @param errorType a {@link RewardPointsErrorType} enum value
	 */
	public void setErrorType(RewardPointsErrorType errorType) {
		this.errorType = errorType;
	}

	/** {@inheritDoc} */
	@Override
	public boolean hasError() {
		return error;
	}

	/**
	 * set Error status of the response
	 *
	 * @param error a boolean
	 */
	public void setError(boolean error) {
		this.error = error;
	}

	/** {@inheritDoc} */
	@Override
	public RewardPointsDiscount getRewardPointsDiscount() {
		return rewardPointsDiscount;
	}

	/**
	 *  set RewardPointsDiscount of the response
	 *
 	 * @param rewardPointsDiscount a {@link RewardPointsDiscount} object
	 */
	public void setRewardPointsDiscount(RewardPointsDiscount rewardPointsDiscount) {
		this.rewardPointsDiscount = rewardPointsDiscount;
	}
}
