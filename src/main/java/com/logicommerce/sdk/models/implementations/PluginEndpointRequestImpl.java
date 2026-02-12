package com.logicommerce.sdk.models.implementations;

import java.util.List;
import java.util.Map;
import com.logicommerce.sdk.models.PluginEndpointRequest;

/**
 * <p>PluginEndpointRequestImpl class.</p>
 *
 * @author LogiCommerce
 * @since 2.7.1
 */
public class PluginEndpointRequestImpl implements PluginEndpointRequest {

	private String httpMethod;

	private String path;

	private String body;

	private Map<String, List<String>> queryParams;

	private Map<String, List<String>> headers;
	
	public PluginEndpointRequestImpl() {}

	public PluginEndpointRequestImpl(
		String httpMethod,
		String path,
		String body,
		Map<String, List<String>> queryParams,
		Map<String, List<String>> headers
	) {
		this.httpMethod = httpMethod;
		this.path = path;
		this.body = body;
		this.queryParams = queryParams;
		this.headers = headers;
	}

	/** {@inheritDoc} */
	@Override
	public String getHttpMethod() {
		return httpMethod;
	}

	/** {@inheritDoc} */
	@Override
	public String getEndpointPath() {
		return path;
	}

	/** {@inheritDoc} */
	@Override
	public String getBody() {
		return body;
	}

	/** {@inheritDoc} */
	@Override
	public Map<String, List<String>> getQueryParams() {
		return queryParams;
	}

	/** {@inheritDoc} */
	@Override
	public Map<String, List<String>> getHeaders() {
		return headers;
	}

}
