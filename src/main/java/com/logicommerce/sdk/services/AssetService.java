package com.logicommerce.sdk.services;

import com.logicommerce.sdk.models.AssetResponse;
import java.util.List;
import com.logicommerce.sdk.enums.WidgetPageType;

public interface AssetService extends PluginService {

	List<AssetResponse> getAssets(WidgetPageType pageType) throws PluginServiceException;

}
