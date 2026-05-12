package com.logicommerce.sdk.models.rewardpoints;

import com.logicommerce.sdk.enums.RewardPointsErrorType;

/**
 * RewardPointsDiscountResponse model
 *
 * @author LogiCommerce
 * @since 2.7.4
 */
public interface RewardPointsDiscountResponse {

	/**
	 * get error type
	 *
	 * @return a {@link RewardPointsErrorType} enum value
	 */
	RewardPointsErrorType getErrorType();

	/**
	 * has error
	 *
	 * @return a boolean
	 */
	boolean hasError();

	/**
	 * get reward points discount
	 *
	 * @return a {@link RewardPointsDiscount} object
	 */
	RewardPointsDiscount getRewardPointsDiscount();
}
