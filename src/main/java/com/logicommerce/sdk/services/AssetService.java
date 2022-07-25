package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.AssetResponse;
import java.util.List;
import com.logicommerce.sdk.enums.WidgetPageType;

/**
 * Interface to be able to implement the assets service.<br>
 * Once implemented, it allows assets to be returned.<br><br>
 * These assets will be loaded on the necessary pages.
 *
 * @author	Logicommerce
 * @since	1.0.16
 */
public interface AssetService extends PluginService {

	/**
	 * Return list of assets. {@link com.logicommerce.sdk.models.AssetResponse}
	 *
	 * @param	pageType	Indicates the type of page where the asset will be loaded.
	 * @return	List of {@link com.logicommerce.sdk.models.AssetResponse}
	 * @see		AssetResponse
	 * @see		WidgetPageType
	 * @since	1.0.16
	 * @throws 	com.logicommerce.sdk.services.PluginServiceException if any.
	 */
	List<AssetResponse> getAssets(WidgetPageType pageType) throws PluginServiceException;


}
