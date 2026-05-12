package com.logicommerce.sdk.models.rewardpoints;

public class RewardPointsBalanceImpl implements RewardPointsBalance {

	private Integer id;

	private int availablePoints;

	private String code;

	/** {@inheritDoc} */
	@Override
	public int getAvailablePoints() {
		return availablePoints;
	}

	/** {@inheritDoc} */
	@Override
	public Integer getId() {
		return id;
	}

	/** {@inheritDoc} */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * set available points
	 * @param availablePoints int
	 */
	public void setAvailablePoints(int availablePoints) {
		this.availablePoints = availablePoints;
	}

	/**
	 * set id
	 * @param id Integer
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * set code
	 * @param code a String
	 */
	public void setCode(String code) {
		this.code = code;
	}
}
