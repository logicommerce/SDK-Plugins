package com.logicommerce.sdk.models.rewardpoints;

/**
 * RewardPointsDiscount model
 *
 * @author LogiCommerce
 * @since 2.7.4
 */
public interface RewardPointsDiscount {

	/**
	 * get amount value
	 * @return double
	 */
	double getAmount();

	/**
	 *  get points to redeem value
	 * @return double
	 */
	double getPointsToRedeem();

	/**
	 * get discount name
	 * @return String
	 */
	String getName();

	/**
	 * get discount description
	 * @return String
	 */
	String getDescription();

	/**
	 * get discount code
	 * @return String
	 */
	String getCode();

	/**
	 * set amount value
	 * @param amount a double
	 */
	void setAmount(double amount);

	/**
	 * set points to redeem value
	 * @param pointsToRedeem a double
	 */
	void setPointsToRedeem(double pointsToRedeem);

	/**
	 *  set discount name
	 * @param name a String
	 */
	void setName(String name);

	/**
	 * set discount description
	 * @param description a String
	 */
	void setDescription(String description);

	/**
	 * set discount code
	 * @param code a String
	 */
	void setCode(String code);

}
