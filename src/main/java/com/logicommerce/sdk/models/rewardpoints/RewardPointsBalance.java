package com.logicommerce.sdk.models.rewardpoints;

/**
 * RewardPointsBalance model
 *
 * @author LogiCommerce
 * @since 2.7.4
 */
public interface RewardPointsBalance {

	/**
	 *  get id of the reward points balance
	 * @return integer
	 */
	Integer getId();

	/**
	 *  get available points of the reward points balance
	 * @return int
	 */
	int getAvailablePoints();

	/**
	 *  get Code
	 * @return String
	 */
	String getCode();
}
