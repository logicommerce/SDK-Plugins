package com.logicommerce.sdk.models.payment;

import java.util.List;
import com.logicommerce.sdk.models.Param;

/**
 * <p>PaymentDataFormImpl class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PaymentDataFormImpl implements PaymentDataForm {

	private String method;

	private List<Param> params;

	private String url;

	/** {@inheritDoc} */
	@Override
	public String getMethod() {
		return method;
	}

	/** {@inheritDoc} */
	@Override
	public List<Param> getParams() {
		return params;
	}

	/** {@inheritDoc} */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <p>Setter for the field <code>method</code>.</p>
	 *
	 * @param method a {@link java.lang.String} object
	 */
	public void setMethod(String method) {
		this.method = method;
	}

	/**
	 * <p>Setter for the field <code>params</code>.</p>
	 *
	 * @param params a {@link java.util.List} object
	 */
	public void setParams(List<Param> params) {
		this.params = params;
	}

	/**
	 * <p>Setter for the field <code>url</code>.</p>
	 *
	 * @param url a {@link java.lang.String} object
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	

}
