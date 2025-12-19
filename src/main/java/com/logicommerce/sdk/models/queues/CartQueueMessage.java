package com.logicommerce.sdk.models.queues;

import java.util.Set;
import com.logicommerce.sdk.models.Cart;

/**
 * Message to be sent to the queue for cart message type
 * 
 * @author LogiCommerce
 * @since 1.3.9
 */
public final class CartQueueMessage extends QueueMessage {

	private final String token;
	private Integer languageId;
	private String countryCode;

	/**
	 * CartQueueMessage constructor
	 *
	 * @param action a {@link String} object
	 * @param attributes a {@link Set} object
	 * @param settings a {@link Settings} object
	 * @param cart a {@link Cart} object
	 */
	public CartQueueMessage(String action, Set<Attribute> attributes, Settings settings, Cart cart) {
		super(action, attributes, settings);
		Validator.validateNotNull("Cart", cart);
		Validator.validateNotNull("Cart id", cart.getToken());
		this.token = this.getBasketToken(cart);
	}

	/**
	 * Returns the type of the message
	 * @return a {@link QueueMessageType} object
	 */
	@Override
	public QueueMessageType getType() {
		return QueueMessageType.CART;
	}

	/**
	 * Returns the token
	 * @return a {@link String} object
	 */
	public String getToken() {
		return token;
	}

	private String getBasketToken(Cart cart) {
		if (cart.getToken() == null) {
			return "";
		}
		String[] tokenSplit = cart.getToken().split("_");
		return tokenSplit[0];
	}

	/**
	 * * Returns the language id
	 * 
	 * @return a {@link Integer} object
	 */
	public Integer getLanguageId() {
		return languageId;
	}

	/**
	 * Returns the currency code
	 * 
	 * @return a {@link String} object
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Sets the language id
	 * 
	 * @param languageId a {@link Integer} object
	 */
	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	/**
	 * Sets the currency code
	 * 
	 * @param countryCode a {@link String} object
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * Creates a Builder for the CartQueueMessage
	 * 
	 * @return a {@link Builder} object
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder for the CartQueueMessage
	 */
	public static final class Builder extends QueueMessageBuilder<Builder> {

		private Cart cart;

		private Integer languageId;

		private String countryCode;

		/**
		 * Sets the cart
		 * 
		 * @param cart a {@link Cart} object
		 * @return a {@link Builder} object
		 */
		public Builder cart(Cart cart) {
			this.cart = cart;
			return this;
		}

		/**
		 * Sets the languageId id
		 * 
		 * @param languageId a {@link Integer} object
		 * @return a {@link Builder} object
		 */
		public Builder languageId(Integer languageId) {
			this.languageId = languageId;
			return this;
		}

		/**
		 * Sets the country code
		 * 
		 * @param countryCode a {@link String} object
		 * @return a {@link Builder} object
		 */
		public Builder countryCode(String countryCode) {
			this.countryCode = countryCode;
			return this;
		}

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		protected CartQueueMessage build(String action, Set<Attribute> attributes, Settings settings) {
			CartQueueMessage message = new CartQueueMessage(action, attributes, settings, cart);
			message.setLanguageId(languageId);
			message.setCountryCode(countryCode);
			return message;
		}
	}
}
