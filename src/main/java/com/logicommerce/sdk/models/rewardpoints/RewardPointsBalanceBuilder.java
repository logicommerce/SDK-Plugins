package com.logicommerce.sdk.models.rewardpoints;

/**
 * RewardPointsBalance model builder
 * 
 * @author LogiCommerce
 * @see RewardPointsBalance
 * @since 2.7.4
 */
public class RewardPointsBalanceBuilder {

	private Integer id;

	private int availablePoints;

	private String code;

	/**
	 * Sets available points of the reward points balance.
	 * @param availablePoints int
	 * @return a {@link RewardPointsBalanceBuilder} object
	 */
	public RewardPointsBalanceBuilder availablePoints(int availablePoints) {
		this.availablePoints = availablePoints;
		return this;
	}

	/**
	 * 	Sets the id of the reward points balance.
	 * @param id Integer
	 * @return a {@link RewardPointsBalanceBuilder} object
	 */
	public RewardPointsBalanceBuilder id(Integer id) {
		this.id = id;
		return this;
	}

	public RewardPointsBalanceBuilder code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * Builds a {@link RewardPointsBalanceImpl} object.
	 * @return a {@link RewardPointsBalance} object
	 */
	public RewardPointsBalance build() {
		RewardPointsBalanceImpl rewardPointsBalance = new RewardPointsBalanceImpl();
		rewardPointsBalance.setAvailablePoints(availablePoints);
		rewardPointsBalance.setId(id);
		rewardPointsBalance.setCode(code);
		return rewardPointsBalance;
	}

}
