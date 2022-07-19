package com.logicommerce.sdk.models.order.implementations;

import com.logicommerce.sdk.models.order.OrderInformation;

/**
 * <p>OrderInformationImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class OrderInformationImpl implements OrderInformation {

	private Integer id;

	private int channelId;

	private String transactionId;

	private String authNumber;

	private Integer marketplaceId;

	/** {@inheritDoc} */
	@Override
	public Integer getId() {
		return id;
	}

	/** {@inheritDoc} */
	@Override
	public int getChannelId() {
		return channelId;
	}

	/** {@inheritDoc} */
	@Override
	public String getTransactionId() {
		return transactionId;
	}

	/** {@inheritDoc} */
	@Override
	public String getAuthNumber() {
		return authNumber;
	}

	/** {@inheritDoc} */
	@Override
	public Integer getMarketplaceId() {
		return marketplaceId;
	}

	/**
	 * <p>Setter for the field <code>id</code>.</p>
	 *
	 * @param id a {@link java.lang.Integer} object
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * <p>Setter for the field <code>channelId</code>.</p>
	 *
	 * @param channelId a int
	 */
	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	/**
	 * <p>Setter for the field <code>transactionId</code>.</p>
	 *
	 * @param transactionId a {@link java.lang.String} object
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * <p>Setter for the field <code>authNumber</code>.</p>
	 *
	 * @param authNumber a {@link java.lang.String} object
	 */
	public void setAuthNumber(String authNumber) {
		this.authNumber = authNumber;
	}

	/**
	 * <p>Setter for the field <code>marketplaceId</code>.</p>
	 *
	 * @param marketplaceId a {@link java.lang.Integer} object
	 */
	public void setMarketplaceId(Integer marketplaceId) {
		this.marketplaceId = marketplaceId;
	}

}
