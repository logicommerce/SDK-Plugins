package com.logicommerce.sdk.models.queues;

import java.util.Set;
import com.logicommerce.sdk.models.Cart;

/**
 * Message to be sent to the queue for order message type
 * 
 * @author LogiCommerce
 * @since 1.3.9
 */
public final class CartQueueMessage extends QueueMessage {

	private final String token;

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

		/**
		 * Sets the order
		 * 
		 * @param cart a {@link Cart} object
		 * @return a {@link Builder} object
		 */
		public Builder cart(Cart cart) {
			this.cart = cart;
			return this;
		}

		@Override
		protected Builder returnThis() {
			return this;
		}

		@Override
		protected CartQueueMessage build(String action, Set<Attribute> attributes, Settings settings) {
			return new CartQueueMessage(action, attributes, settings, cart);
		}
	}
}
