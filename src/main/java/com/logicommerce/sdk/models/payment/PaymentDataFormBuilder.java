package com.logicommerce.sdk.models.payment;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.logicommerce.sdk.models.Param;
import com.logicommerce.sdk.models.ParamImpl;

public class PaymentDataFormBuilder<T> extends PaymentDataBuilder<T, PaymentDataForm> {

	private String url;

	private String method;

	private Map<String, String> params;

	private static final String GET = "get";
	private static final String POST = "post";
	private static final String PUT = "put";
	private static final String DELETE = "delete";

	public PaymentDataFormBuilder(T parentBuilder) {
		super(parentBuilder);
		this.params = new LinkedHashMap<>();
	}

	public PaymentDataFormBuilder<T> url(String url) {
		this.url = url;
		return this;
	}

	public PaymentDataFormBuilder<T> method(String method) {
		this.method = method;
		return this;
	}

	public PaymentDataFormBuilder<T> get() {
		return method(GET);
	}

	public PaymentDataFormBuilder<T> post() {
		return method(POST);
	}

	public PaymentDataFormBuilder<T> put() {
		return method(PUT);
	}

	public PaymentDataFormBuilder<T> delete() {
		return method(DELETE);
	}

	public PaymentDataFormBuilder<T> param(String name, String value) {
		params.put(name, value);
		return this;
	}

	private List<Param> getParams() {
		return params.entrySet().stream()
				.map(ParamImpl::new)
				.collect(Collectors.toList());
	}

	@Override
	protected PaymentDataForm build() {
		PaymentDataFormImpl dataForm = new PaymentDataFormImpl();
		dataForm.setMethod(method);
		dataForm.setUrl(url);
		dataForm.setParams(getParams());
		return dataForm;
	}

}
