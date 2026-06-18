package com.logicommerce.sdk.models.validator;

/**
 * Message implementation
 *
 * @author LogiCommerce
 * @since 2.7.6
 */
public class MessageImpl implements Message {

	private String code;

	private String message;

	private String detail;

	/** {@inheritDoc} */
	@Override
	public String getCode() {
		return code;
	}

	/** {@inheritDoc} */
	@Override
	public String getMessage() {
		return message;
	}

	/** {@inheritDoc} */
	@Override
	public String getDetail() {
		return detail;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}
