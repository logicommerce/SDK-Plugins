package com.logicommerce.sdk.models.validator;

import java.util.function.Consumer;

/**
 * Message builder
 *
 * @author LogiCommerce
 * @see Message
 * @since 2.7.5
 * @param <P> parent builder type, used when building nested
 */
public class MessageBuilder<P> {

	private final P parent;

	private final Consumer<Message> setter;

	private String code;

	private String message;

	private String detail;

	public MessageBuilder() {
		this.parent = null;
		this.setter = null;
	}

	MessageBuilder(P parent, Consumer<Message> setter) {
		this.parent = parent;
		this.setter = setter;
	}

	/**
	 * Sets the code of the message.
	 * @param code a String
	 * @return a {@link MessageBuilder} object
	 */
	public MessageBuilder<P> code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * Sets the message text.
	 * @param message a String
	 * @return a {@link MessageBuilder} object
	 */
	public MessageBuilder<P> message(String message) {
		this.message = message;
		return this;
	}

	/**
	 * Sets the detail of the message.
	 * @param detail a String
	 * @return a {@link MessageBuilder} object
	 */
	public MessageBuilder<P> detail(String detail) {
		this.detail = detail;
		return this;
	}

	/**
	 * Finishes the nested builder, adds the message to the parent and returns it.
	 * @return the parent builder
	 */
	public P done() {
		setter.accept(build());
		return parent;
	}

	/**
	 * Builds a {@link MessageImpl} object.
	 * @return a {@link Message} object
	 */
	public Message build() {
		MessageImpl messageImpl = new MessageImpl();
		messageImpl.setCode(code);
		messageImpl.setMessage(message);
		messageImpl.setDetail(detail);
		return messageImpl;
	}
}
