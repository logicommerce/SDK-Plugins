package com.logicommerce.sdk.services.implementations;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import com.logicommerce.sdk.lib.router.RestRouter;
import com.logicommerce.sdk.lib.router.RouterClientException;
import com.logicommerce.sdk.models.PluginEndpointRequest;
import com.logicommerce.sdk.models.PluginEndpointResponse;
import com.logicommerce.sdk.models.implementations.PluginEndpointResponseImpl;
import com.logicommerce.sdk.services.ApiPluginsService;
import com.logicommerce.sdk.services.PluginServiceException;

/**
 * <p>RestPluginBase class implements ApiPluginsService.</p>
 *
 * @author LogiCommerce
 * @since 2.7.2
 */
public abstract class RestPluginBase implements ApiPluginsService {

	private PluginEndpointRequest currentRequest;

	/** {@inheritDoc} */
	@Override
	public PluginEndpointResponse invokeEndpoint(PluginEndpointRequest request) throws PluginServiceException {
		this.currentRequest = request;
		RestRouter<PluginEndpointResponse> router = new RestRouter<>(this);

		try {
			return router.route(request.getHttpMethod(), request.getEndpointPath(), request.getBody());
		} catch (RouterClientException e) {
			return response().statusCode(e.getStatusCode()).body(e.getMessage());
		} catch (InvocationTargetException e) {
			Throwable cause = e.getCause();
			if (cause instanceof PluginServiceException exception) {
				throw exception;
			} else if (cause instanceof Exception exception) {
				throw new PluginServiceException(exception.getMessage(), exception);
			} else {
				throw new PluginServiceException(new Exception(cause));
			}
		}
	}

	/** 
	 * Get the values of a header from the current request.
	 * @param name a {@link java.lang.String} object 
	 * @return a list of values for the specified header, or null if the header is not present
	 */
	protected List<String> getHeaderMulti(String name) {
		return currentRequest.getHeaders().get(name);
	}

	/**
	 * Get the first value of a header from the current request.
	 * @param name a {@link java.lang.String} object the name of the header to retrieve
	 * @return the first value for the specified header, or null if the header is not present
	 */
	protected String getHeaderSingle(String name) {
		List<String> values = getHeaderMulti(name);
		if (values == null) {
			return null;
		}
		return values.stream().findFirst().orElse(null);
	}

	/** 
	 * Get all headers from the current request.
	 * @return a map of header names to their list of values
	 */
	protected Map<String, List<String>> getHeaders() {
		return currentRequest.getHeaders();
	}

	/** 
	 * Get the values of a query parameter from the current request.
	 * @param name a {@link java.lang.String} object name of the query parameter to retrieve
	 * @return a list of values for the specified query parameter, or null if the parameter is not present
	 */
	protected List<String> getQueryParamMulti(String name) {
		Map<String, List<String>> params = currentRequest.getQueryParams();
		return params.get(name);
	}

	/**
	 * Get the first value of a query parameter from the current request.
	 * 
	 * @param name a {@link java.lang.String} object name of the query parameter to retrieve
	 * @return the first value for the specified query parameter, or null if the parameter is not present
	 */
	protected String getQueryParamSingle(String name) {
		List<String> values = getQueryParamMulti(name);
		if (values == null) {
			return null;
		}
		return values.stream().findFirst().orElse(null);
	}

	/**
	 * Get all query parameters from the current request.
	 * 
	 * @return a map of query parameter names to their list of values
	 */
	protected Map<String, List<String>> getQueryParams() {
		return currentRequest.getQueryParams();
	}

	/**
	 * Get the endpoint path from the current request.
	 * 
	 * @return the endpoint path as a string
	 */
	protected String getPath() {
		return currentRequest.getEndpointPath();
	}

	/**
	 * Get the body from the current request.
	 * 
	 * @return String representing the body of the request, or null if there is no body
	 */
	protected String getBody() {
		return currentRequest.getBody();
	}

	/**
	 * Create a new PluginEndpointResponseImpl instance to build the response.
	 * 
	 * @return a new instance of PluginEndpointResponseImpl
	 */
	protected PluginEndpointResponseImpl response() {
		return new PluginEndpointResponseImpl();
	}

}
