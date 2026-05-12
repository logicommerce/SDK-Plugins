package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.order.Order;
import com.logicommerce.sdk.models.rewardpoints.RewardPointsBalance;
import com.logicommerce.sdk.models.rewardpoints.RewardPointsDiscountResponse;

/**
 * RewardPointsService for Reward Points Systems
 * 
 * @author LogiCommerce
 * @since 2.7.4
 */
public interface RewardPointsService extends PluginService {

	/**
	 * getBalance
	 *
	 * @return a {@link RewardPointsBalance} object
	 * @throws PluginServiceException if any.
	 */
	RewardPointsBalance getBalance() throws PluginServiceException;

	/**
	 *
	 * @param pointsToRedeem
	 * @return a {@link RewardPointsDiscountResponse} object
	 * @throws PluginServiceException
	 */
	RewardPointsDiscountResponse getDiscount(int pointsToRedeem) throws PluginServiceException;

	/**
	 * Notifies the external reward points system that an order has been placed and the given points have been redeemed.
	 *
	 * @param pointsToRedeem number of points to redeem for the order
	 * @param order          the order for which the points are being redeemed
	 * @throws PluginServiceException if any.
	 */
	void redeemPoints(Order order, int pointsToRedeem) throws PluginServiceException;

}
