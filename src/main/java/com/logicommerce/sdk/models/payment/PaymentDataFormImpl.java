package com.logicommerce.sdk.models.payment;

import java.util.List;
import com.logicommerce.sdk.models.Param;

public class PaymentDataFormImpl implements PaymentDataForm {

	private String method;

	private List<Param> params;

	private String url;

	@Override
	public String getMethod() {
		return method;
	}

	@Override
	public List<Param> getParams() {
		return params;
	}

	@Override
	public String getUrl() {
		return url;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public void setParams(List<Param> params) {
		this.params = params;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	

}
