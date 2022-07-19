package com.logicommerce.sdk.models.payment;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.logicommerce.sdk.models.Param;
import com.logicommerce.sdk.models.ParamImpl;

/**
 * <p>PaymentDataFormBuilder class.</p>
 *
 * @author Logicommerce
 * @since 1.0.16
 */
public class PaymentDataFormBuilder<T> extends PaymentDataBuilder<T, PaymentDataForm> {

	private String url;

	private String method;

	private Map<String, String> params;

	private static final String GET = "get";
	private static final String POST = "post";
	private static final String PUT = "put";
	private static final String DELETE = "delete";

	/**
	 * <p>Constructor for PaymentDataFormBuilder.</p>
	 *
	 * @param parentBuilder a T object
	 */
	public PaymentDataFormBuilder(T parentBuilder) {
		super(parentBuilder);
		this.params = new LinkedHashMap<>();
	}

	/**
	 * <p>url.</p>
	 *
	 * @param url a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentDataFormBuilder} object
	 */
	public PaymentDataFormBuilder<T> url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * <p>method.</p>
	 *
	 * @param method a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentDataFormBuilder} object
	 */
	public PaymentDataFormBuilder<T> method(String method) {
		this.method = method;
		return this;
	}

	/**
	 * <p>get.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentDataFormBuilder} object
	 */
	public PaymentDataFormBuilder<T> get() {
		return method(GET);
	}

	/**
	 * <p>post.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentDataFormBuilder} object
	 */
	public PaymentDataFormBuilder<T> post() {
		return method(POST);
	}

	/**
	 * <p>put.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentDataFormBuilder} object
	 */
	public PaymentDataFormBuilder<T> put() {
		return method(PUT);
	}

	/**
	 * <p>delete.</p>
	 *
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentDataFormBuilder} object
	 */
	public PaymentDataFormBuilder<T> delete() {
		return method(DELETE);
	}

	/**
	 * <p>param.</p>
	 *
	 * @param name a {@link java.lang.String} object
	 * @param value a {@link java.lang.String} object
	 * @return a {@link com.logicommerce.sdk.models.payment.PaymentDataFormBuilder} object
	 */
	public PaymentDataFormBuilder<T> param(String name, String value) {
		params.put(name, value);
		return this;
	}

	private List<Param> getParams() {
		return params.entrySet().stream()
				.map(ParamImpl::new)
				.collect(Collectors.toList());
	}

	/** {@inheritDoc} */
	@Override
	protected PaymentDataForm build() {
		PaymentDataFormImpl dataForm = new PaymentDataFormImpl();
		dataForm.setMethod(method);
		dataForm.setUrl(url);
		dataForm.setParams(getParams());
		return dataForm;
	}

}
