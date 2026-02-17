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

public abstract class RestPluginBase implements ApiPluginsService {

	private PluginEndpointRequest currentRequest;

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

	protected List<String> getHeaderMulti(String name) {
		return currentRequest.getHeaders().get(name);
	}

	protected String getHeaderSingle(String name) {
		List<String> values = getHeaderMulti(name);
		if (values == null) {
			return null;
		}
		return values.stream().findFirst().orElse(null);
	}

	protected Map<String, List<String>> getHeaders() {
		return currentRequest.getHeaders();
	}

	protected List<String> getQueryParamMulti(String name) {
		Map<String, List<String>> params = currentRequest.getQueryParams();
		return params.get(name);
	}

	protected String getQueryParamSingle(String name) {
		List<String> values = getQueryParamMulti(name);
		if (values == null) {
			return null;
		}
		return values.stream().findFirst().orElse(null);
	}

	protected Map<String, List<String>> getQueryParams() {
		return currentRequest.getQueryParams();
	}

	protected String getPath() {
		return currentRequest.getEndpointPath();
	}

	protected String getBody() {
		return currentRequest.getBody();
	}

	protected PluginEndpointResponseImpl response() {
		return new PluginEndpointResponseImpl();
	}

}
